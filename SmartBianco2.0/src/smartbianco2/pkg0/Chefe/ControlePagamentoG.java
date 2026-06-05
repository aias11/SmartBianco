/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package smartbianco2.pkg0.Chefe;

import Mysql.ConexaoSB;

import javax.swing.plaf.basic.BasicInternalFrameUI;

public class ControlePagamentoG extends javax.swing.JInternalFrame {

private javax.swing.table.TableRowSorter<javax.swing.table.DefaultTableModel> sorter;

    public ControlePagamentoG() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI ui = (BasicInternalFrameUI)this.getUI();
        ui.setNorthPane(null);
        javax.swing.table.DefaultTableModel modelo = (javax.swing.table.DefaultTableModel) tblPagamentos.getModel();
        sorter = new javax.swing.table.TableRowSorter<>(modelo);
        tblPagamentos.setRowSorter(sorter);
    
        carregarTabelaPagamentos();
    }
    
    private void aplicarFiltros() {
    String buscaNome = txtBuscaNome.getText();
    String status = cbStatus.getSelectedItem().toString();
    String cargo = cbCargo.getSelectedItem().toString();

    java.util.List<javax.swing.RowFilter<Object, Object>> filtros = new java.util.ArrayList<>();

    // Filtro de Nome
    if (!buscaNome.trim().isEmpty()) {
        filtros.add(javax.swing.RowFilter.regexFilter("(?i)" + buscaNome, 0));
    }
    // Filtro de Status
    if (!status.equals("Todos")) {
        filtros.add(javax.swing.RowFilter.regexFilter("^" + status + "$", 3));
    }
    // Filtro de Cargo
    if (!cargo.equals("Todos") && !cargo.trim().isEmpty()) {
        filtros.add(javax.swing.RowFilter.regexFilter("^" + cargo + "$", 1));
    }

    // Aplica a combinação de filtros (AND)
    if (filtros.isEmpty()) {
        sorter.setRowFilter(null);
    } else {
        sorter.setRowFilter(javax.swing.RowFilter.andFilter(filtros));
    }
    
    // Recalcula os totais com base no que sobrou na tela
    atualizarCardsResumo();
    }
    
public void carregarTabelaPagamentos() {
// 1. Pega o modelo da tabela para podermos manipular as linhas
    javax.swing.table.DefaultTableModel modelo = (javax.swing.table.DefaultTableModel) tblPagamentos.getModel();
    modelo.setNumRows(0); // Limpa a tabela antes de trazer os dados novos

    // 2. Instancia a sua classe de conexão e abre a porta do banco
    ConexaoSB conexao = new ConexaoSB();
    java.sql.Connection conn = conexao.conectar();
    
    java.sql.PreparedStatement pst = null;
    java.sql.ResultSet rs = null;

    // 3. Comando SQL que vai buscar os dados no banco de dados do VS Code
    String sql = "SELECT nome, cargo, salario, status FROM funcionarios";

    try {
        // Prepara e executa a busca
        pst = conn.prepareStatement(sql);
        rs = pst.executeQuery();

        // 4. Enquanto houver linhas no banco de dados, ele adiciona na tabela do Java
        while (rs.next()) {
            String nome = rs.getString("nome");
            String cargo = rs.getString("cargo");
            double salario = rs.getDouble("salario");
            String status = rs.getString("status");

        if (status == null || status.trim().isEmpty()) {
            status = "Pendente";
        }
            modelo.addRow(new Object[]{nome, cargo, salario, status});
        }

        // 5. Atualiza os cards (Total Pago, Pendente e Quantidade) com os dados reais
        atualizarCardsResumo();

    } catch (java.sql.SQLException erro) {
        javax.swing.JOptionPane.showMessageDialog(null, "Erro ao carregar dados do banco: " + erro.getMessage());
    } finally {
        // Boa prática: Fecha as conexões com o banco para não travar o MySQL
        try {
            if (rs != null) rs.close();
            if (pst != null) pst.close();
            if (conn != null) conn.close();
        } catch (java.sql.SQLException e) {
            System.out.println("Erro ao fechar conexões: " + e.getMessage());
        }
    }
}

public void atualizarCardsResumo() {
    double totalPago = 0;
    double totalPendente = 0;
    
    // Pegamos o modelo da tabela para acessar os dados reais
    javax.swing.table.DefaultTableModel modelo = (javax.swing.table.DefaultTableModel) tblPagamentos.getModel();
    int totalLinhasVisiveis = tblPagamentos.getRowCount(); 

    for (int i = 0; i < totalLinhasVisiveis; i++) {
        // Converte o índice da linha da tela para o índice da linha real no banco
        int modelRow = tblPagamentos.convertRowIndexToModel(i);
        
        Object valorObj = modelo.getValueAt(modelRow, 2);
        Object statusObj = modelo.getValueAt(modelRow, 3);

        if (valorObj != null && statusObj != null) {
            String status = statusObj.toString();
            
            // Tratamento do valor:
            // Removemos espaços e garantimos que pontos E vírgulas sejam tratados corretamente
            // Substituímos tudo que não é número ou vírgula por nada, depois trocamos vírgula por ponto
            String s = valorObj.toString().replace(",", ".");
            
            // Remove qualquer caractere que ainda não seja número ou ponto (como R$)
            s = s.replaceAll("[^0-9.]", "");
            
            if (!s.isEmpty()) {
                try {
                    double valorSalario = Double.parseDouble(s);

                    if (status.equals("Pago")) {
                        totalPago += valorSalario; 
                    } else if (status.equals("Pendente")) {
                        totalPendente += valorSalario; 
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Erro ao converter valor na linha " + i + ": " + s);
                }
            }
        }
    }
    
    // Atualiza os Labels
    lblTotalPago.setText(String.format("R$ %.2f", totalPago));
    lblTotalPendente.setText(String.format("R$ %.2f", totalPendente));
    lblTotalFuncionarios.setText(String.valueOf(totalLinhasVisiveis));
}

    private void atualizarStatusNoBanco(String nome, String novoStatus) {
    ConexaoSB conexao = new ConexaoSB();
    java.sql.Connection conn = conexao.conectar();
    java.sql.PreparedStatement pst = null;

    // Comando SQL para atualizar o status do cliente pelo nome
    String sql = "UPDATE funcionarios SET status = ? WHERE nome = ?";

    try {
        pst = conn.prepareStatement(sql);
        pst.setString(1, novoStatus);
        pst.setString(2, nome);

        int linhasAfetadas = pst.executeUpdate();

        if (linhasAfetadas > 0) {
            javax.swing.JOptionPane.showMessageDialog(this, "Status atualizado para '" + novoStatus + "' no Banco de Dados!");
            
            // A MÁGICA: Recarrega a tabela direto do banco. Isso já corrige a tela e os cards!
            carregarTabelaPagamentos(); 
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "Erro: Nenhum funcionario com o nome '" + nome + "' foi encontrado no banco.");
        }
    } catch (java.sql.SQLException erro) {
        javax.swing.JOptionPane.showMessageDialog(this, "Erro ao salvar no banco: " + erro.getMessage());
    } finally {
        try {
            if (pst != null) pst.close();
            if (conn != null) conn.close();
        } catch (java.sql.SQLException e) {
            System.out.println("Erro ao fechar conexões: " + e.getMessage());
        }
    }
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPagamentos = new javax.swing.JTable();
        btnEstornarSalario = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblTotalPago = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        lblTotalPendente = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        lblTotalFuncionarios = new javax.swing.JLabel();
        cbStatus = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cbCargo = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        txtBuscaNome = new javax.swing.JTextField();
        btnDarBaixa = new javax.swing.JButton() {
            {
                // Estas 3 linhas desligam o formato quadrado padrão do Java
                setContentAreaFilled(false);
                setFocusPainted(false);
                setBorderPainted(false);
            }

            @Override
            protected void paintComponent(java.awt.Graphics g) {
                java.awt.Graphics2D g2 = (java.awt.Graphics2D) g.create();
                g2.setRenderingHint(java.awt.RenderingHints.KEY_ANTIALIASING, java.awt.RenderingHints.VALUE_ANTIALIAS_ON);

                // Se o botão for clicado, ele fica um pouco mais escuro (efeito de clique)
                if (getModel().isPressed()) {
                    g2.setColor(getBackground().darker());
                } else {
                    g2.setColor(getBackground());
                }

                // Desenha o fundo arredondado (o 20, 20 é a curvatura)
                g2.fillRoundRect(0, 0, getWidth(), getHeight(), 20, 20); 
                g2.dispose();

                super.paintComponent(g); // Desenha o texto por cima de tudo
            }
        };

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        tblPagamentos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Cargo", "Salario", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblPagamentos);

        btnEstornarSalario.setText("Estornar");
        btnEstornarSalario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstornarSalarioActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Total Pago mês");

        lblTotalPago.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTotalPago.setText("R$ 15.000,00");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
            .addComponent(lblTotalPago, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(lblTotalPago)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Total Pendente");

        lblTotalPendente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTotalPendente.setText("R$ 3.00,00");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
            .addComponent(lblTotalPendente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(lblTotalPendente)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Colaboradores");

        lblTotalFuncionarios.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTotalFuncionarios.setText("12");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
            .addComponent(lblTotalFuncionarios, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(lblTotalFuncionarios)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        cbStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Pago", "Pendente" }));
        cbStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbStatusActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Status:");

        jLabel8.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Cargo:");

        cbCargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Treinador", "Gerente", " " }));
        cbCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCargoActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Nome:");

        txtBuscaNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscaNomeActionPerformed(evt);
            }
        });
        txtBuscaNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscaNomeKeyReleased(evt);
            }
        });

        btnDarBaixa.setText("Dar baixa");
        btnDarBaixa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDarBaixaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 563, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel9))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(80, 80, 80)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtBuscaNome, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnEstornarSalario)
                        .addGap(18, 18, 18)
                        .addComponent(btnDarBaixa)))
                .addContainerGap(88, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(cbCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(txtBuscaNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEstornarSalario)
                    .addComponent(btnDarBaixa))
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCargoActionPerformed
    aplicarFiltros();
    }//GEN-LAST:event_cbCargoActionPerformed

    private void btnDarBaixaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDarBaixaActionPerformed
    int linhaSelecionada = tblPagamentos.getSelectedRow();
    
        if (linhaSelecionada != -1) {
            // Pega o nome do cliente que está na coluna 0 da linha selecionada
            String nome = tblPagamentos.getValueAt(linhaSelecionada, 0).toString();
            
            // Envia para o banco salvar como "Pago"
            atualizarStatusNoBanco(nome, "Pago");
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "Selecione um funcionario na tabela para dar baixa.");
        }
    }//GEN-LAST:event_btnDarBaixaActionPerformed

    private void btnEstornarSalarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstornarSalarioActionPerformed
    int linhaSelecionada = tblPagamentos.getSelectedRow();
    
        if (linhaSelecionada != -1) {
            // Pega o nome do cliente que está na coluna 0 da linha selecionada
            String nome = tblPagamentos.getValueAt(linhaSelecionada, 0).toString();
            
            // Envia para o banco salvar como "Pendente"
            atualizarStatusNoBanco(nome, "Pendente");
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "Selecione um funcionario na tabela para estornar.");
        }
    }//GEN-LAST:event_btnEstornarSalarioActionPerformed

    private void cbStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbStatusActionPerformed
        aplicarFiltros();
    }//GEN-LAST:event_cbStatusActionPerformed

    private void txtBuscaNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscaNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscaNomeActionPerformed

    private void txtBuscaNomeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscaNomeKeyReleased
    aplicarFiltros();
    }//GEN-LAST:event_txtBuscaNomeKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDarBaixa;
    private javax.swing.JButton btnEstornarSalario;
    private javax.swing.JComboBox<String> cbCargo;
    private javax.swing.JComboBox<String> cbStatus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTotalFuncionarios;
    private javax.swing.JLabel lblTotalPago;
    private javax.swing.JLabel lblTotalPendente;
    private javax.swing.JTable tblPagamentos;
    private javax.swing.JTextField txtBuscaNome;
    // End of variables declaration//GEN-END:variables
}
