/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package smartbianco2.pkg0.Chefe;

import Mysql.ConexaoSB;

import javax.swing.plaf.basic.BasicInternalFrameUI;

public class ControlePagamentoCliente extends javax.swing.JInternalFrame {

    /**
     * Creates new form ControlePagamento
     */
    public ControlePagamentoCliente() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI ui = (BasicInternalFrameUI)this.getUI();
        ui.setNorthPane(null);
        carregarTabelaTreinador();
    }

public void carregarTabelaTreinador() {
    javax.swing.table.DefaultTableModel modelo = (javax.swing.table.DefaultTableModel) tblPagamentosTreinador.getModel();
    modelo.setNumRows(0); // Limpa a tabela antes de trazer os dados novos

    ConexaoSB conexao = new ConexaoSB();
    java.sql.Connection conn = conexao.conectar();
    
    java.sql.PreparedStatement pst = null;
    java.sql.ResultSet rs = null;

    // A MÁGICA AQUI: O LEFT JOIN une as duas tabelas. 
    // Ele pega os dados do cliente e busca o valor atualizado lá na tabela de assinaturas!
    String sql = "SELECT c.nome, c.assinatura, a.valor, c.status " +
                 "FROM clientes c " +
                 "LEFT JOIN assinaturas a ON c.assinatura = a.nome_assinatura";

    try {
        pst = conn.prepareStatement(sql);
        rs = pst.executeQuery();

        while (rs.next()) {
            String nome = rs.getString("nome");
            String assinatura = rs.getString("assinatura");
            String status = rs.getString("status");
            
            // Tratamento do valor que vem da tabela assinaturas (String para Double)
            String valorString = rs.getString("valor");
            double valor = 0.0;

            if (valorString != null && !valorString.isEmpty()) {
                try {
                    // Remove R$ e troca vírgula por ponto para evitar erros matemáticos no Java
                    valorString = valorString.replace("R$", "").replace(",", ".").trim();
                    valor = Double.parseDouble(valorString);
                } catch (NumberFormatException e) {
                    valor = 0.0; // Se algo der muito errado no texto do banco, assume 0
                }
            }

            // Adiciona a linha na tabela da tela
            modelo.addRow(new Object[]{nome, assinatura, valor, status});
        }

        atualizarCardsResumo();

    } catch (java.sql.SQLException erro) {
        javax.swing.JOptionPane.showMessageDialog(this, "Erro ao carregar dados do banco: " + erro.getMessage());
    } finally {
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
    double totalPago = 0.0;
    double totalPendente = 0.0;
    
    // 1. Agora conta o total de CLIENTES na tabela
    int totalClientes = tblPagamentosTreinador.getRowCount(); 
    
    for (int i = 0; i < totalClientes; i++) {
        
        // Pega o Valor (Coluna 2) e o Status (Coluna 3)
        double valor = Double.parseDouble(tblPagamentosTreinador.getValueAt(i, 2).toString());
        String status = tblPagamentosTreinador.getValueAt(i, 3).toString();
        
        if (status.equals("Pago")) {
            totalPago += valor; 
        } else if (status.equals("Pendente")) {
            totalPendente += valor; 
        }
    }

    
    // 2. Atualiza os valores na tela
    lblTotalPago.setText(String.format("R$ %.2f", totalPago));
    lblTotalPendente.setText(String.format("R$ %.2f", totalPendente));
    
    // 3. Atualiza o novo card com o total de clientes
    lblTotalClientes.setText(String.valueOf(totalClientes));
    }

private void atualizarStatusNoBanco(String nome, String novoStatus) {
    ConexaoSB conexao = new ConexaoSB();
    java.sql.Connection conn = conexao.conectar();
    java.sql.PreparedStatement pst = null;

    // Comando SQL para atualizar o status do cliente pelo nome
    String sql = "UPDATE clientes SET status = ? WHERE nome = ?";

    try {
        pst = conn.prepareStatement(sql);
        pst.setString(1, novoStatus);
        pst.setString(2, nome);

        int linhasAfetadas = pst.executeUpdate();

        if (linhasAfetadas > 0) {
            javax.swing.JOptionPane.showMessageDialog(this, "Status atualizado para '" + novoStatus + "' no Banco de Dados!");
            
            // A MÁGICA: Recarrega a tabela direto do banco. Isso já corrige a tela e os cards!
            carregarTabelaTreinador(); 
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "Erro: Nenhum cliente com o nome '" + nome + "' foi encontrado no banco.");
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
        tblPagamentosTreinador = new javax.swing.JTable();
        btnEstornarSalario = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblTotalPago = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        lblTotalPendente = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        lblTotalClientes = new javax.swing.JLabel();
        cbStatus = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
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

        tblPagamentosTreinador.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Assinatura", "Valor", "Status"
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
        jScrollPane1.setViewportView(tblPagamentosTreinador);

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
        jLabel5.setText("Clientes");

        lblTotalClientes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTotalClientes.setText("12");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
            .addComponent(lblTotalClientes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(lblTotalClientes)
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

        jLabel9.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Nome:");

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
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(196, 196, 196)
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
                        .addComponent(btnDarBaixa))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 556, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(78, Short.MAX_VALUE))
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

    private void btnDarBaixaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDarBaixaActionPerformed
    int linhaSelecionada = tblPagamentosTreinador.getSelectedRow();
    
        if (linhaSelecionada != -1) {
            // Pega o nome do cliente que está na coluna 0 da linha selecionada
            String nome = tblPagamentosTreinador.getValueAt(linhaSelecionada, 0).toString();
            
            // Envia para o banco salvar como "Pago"
            atualizarStatusNoBanco(nome, "Pago");
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "Selecione um cliente na tabela para dar baixa.");
        }
    }//GEN-LAST:event_btnDarBaixaActionPerformed

    private void btnEstornarSalarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstornarSalarioActionPerformed
    int linhaSelecionada = tblPagamentosTreinador.getSelectedRow();
    
        if (linhaSelecionada != -1) {
            // Pega o nome do cliente que está na coluna 0 da linha selecionada
            String nome = tblPagamentosTreinador.getValueAt(linhaSelecionada, 0).toString();
            
            // Envia para o banco salvar como "Pendente"
            atualizarStatusNoBanco(nome, "Pendente");
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "Selecione um cliente na tabela para estornar.");
        }
    }//GEN-LAST:event_btnEstornarSalarioActionPerformed

    private void cbStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbStatusActionPerformed
    // 1. Pega o status que o usuário selecionou (Todos, Pago ou Pendente)
    String statusSelecionado = cbStatus.getSelectedItem().toString();
    
    // 2. Pega o modelo da sua tabela
    javax.swing.table.DefaultTableModel modelo = (javax.swing.table.DefaultTableModel) tblPagamentosTreinador.getModel();
    javax.swing.table.TableRowSorter<javax.swing.table.DefaultTableModel> sorter = new javax.swing.table.TableRowSorter<>(modelo);
    tblPagamentosTreinador.setRowSorter(sorter);
    
    // 3. Aplica a lógica do filtro
    if (statusSelecionado.equals("Todos")) {
        sorter.setRowFilter(null); // Limpa o filtro e mostra todo mundo
    } else {
        // Filtra na coluna 3 (Status) buscando a palavra exata (^ significa início, $ significa fim da palavra)
        sorter.setRowFilter(javax.swing.RowFilter.regexFilter("^" + statusSelecionado + "$", 3));
    }
    
    // 4. A MÁGICA: Recalcula os cards na hora com base no que sobrou na tela!
    atualizarCardsResumo();
    }//GEN-LAST:event_cbStatusActionPerformed

    private void txtBuscaNomeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscaNomeKeyReleased
        String textoBusca = txtBuscaNome.getText();
    
        javax.swing.table.DefaultTableModel modelo = (javax.swing.table.DefaultTableModel) tblPagamentosTreinador.getModel();
    
        javax.swing.table.TableRowSorter<javax.swing.table.DefaultTableModel> sorter = new javax.swing.table.TableRowSorter<>(modelo);
        tblPagamentosTreinador.setRowSorter(sorter);
    
        if (textoBusca.trim().length() == 0) {
            sorter.setRowFilter(null); 
            
        } else {
            sorter.setRowFilter(javax.swing.RowFilter.regexFilter("(?i)" + textoBusca, 0));
        }
    }//GEN-LAST:event_txtBuscaNomeKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDarBaixa;
    private javax.swing.JButton btnEstornarSalario;
    private javax.swing.JComboBox<String> cbStatus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTotalClientes;
    private javax.swing.JLabel lblTotalPago;
    private javax.swing.JLabel lblTotalPendente;
    private javax.swing.JTable tblPagamentosTreinador;
    private javax.swing.JTextField txtBuscaNome;
    // End of variables declaration//GEN-END:variables
}
