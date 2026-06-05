/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package smartbianco2.pkg0.Chefe;

import javax.swing.plaf.basic.BasicInternalFrameUI;
import Mysql.ConexaoSB;

public class Clientes extends javax.swing.JInternalFrame {


    public Clientes() {
        initComponents();
        
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI ui = (BasicInternalFrameUI)this.getUI();
        ui.setNorthPane(null);  
        carregarTabelaT();
        atualizarTotalClientes();
    }
    

    private void atualizarTotalClientes() {
    int total = TabelaClienteT.getRowCount();
        lblTotalClientesT.setText("Total de clientes: " + total);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbNome = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelaClienteT = new javax.swing.JTable();
        btnNovoCliente = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        txtBuscarCPF = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        lblTotalClientesT = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 153, 102));
        setPreferredSize(new java.awt.Dimension(800, 600));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(604, 0));

        lbNome.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbNome.setForeground(new java.awt.Color(0, 0, 0));
        lbNome.setText("Olá, Lucas Silva!");

        jLabel1.setBackground(new java.awt.Color(51, 51, 51));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Gerenciar Clientes");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 99, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        TabelaClienteT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N° Identificação", "Nome", "CPF", "Assinatura"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        jScrollPane1.setViewportView(TabelaClienteT);

        btnNovoCliente.setBackground(new java.awt.Color(0, 102, 51));
        btnNovoCliente.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btnNovoCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnNovoCliente.setText("Novo Cliente");
        btnNovoCliente.setFocusPainted(false);
        btnNovoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoClienteActionPerformed(evt);
            }
        });

        btnEditar.setBackground(new java.awt.Color(0, 102, 204));
        btnEditar.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(255, 255, 255));
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnExcluir.setBackground(new java.awt.Color(204, 0, 51));
        btnExcluir.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btnExcluir.setForeground(new java.awt.Color(255, 255, 255));
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        txtBuscarCPF.setBackground(new java.awt.Color(255, 255, 255));
        txtBuscarCPF.setForeground(new java.awt.Color(0, 0, 0));
        txtBuscarCPF.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtBuscarCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarCPFActionPerformed(evt);
            }
        });
        txtBuscarCPF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarCPFKeyReleased(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Buscar CPF:");

        lblTotalClientesT.setBackground(new java.awt.Color(0, 0, 0));
        lblTotalClientesT.setForeground(new java.awt.Color(0, 0, 0));
        lblTotalClientesT.setText("Total de clientes:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(271, 271, 271)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(115, 115, 115)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(lbNome, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel1))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(btnNovoCliente)
                                    .addGap(135, 135, 135)
                                    .addComponent(jLabel2)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtBuscarCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(37, 37, 37)
                                    .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(175, 175, 175)
                                    .addComponent(lblTotalClientesT, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(16, 16, 16)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 571, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(lbNome, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txtBuscarCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTotalClientesT))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 788, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 564, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
                                     
int linhaSelecionada = TabelaClienteT.getSelectedRow();
        if (linhaSelecionada == -1) {
            javax.swing.JOptionPane.showMessageDialog(this, "Selecione um cliente para editar.");
            return;
        }

        int linhaModel = TabelaClienteT.convertRowIndexToModel(linhaSelecionada);
        // CONVERSÃO SEGURA: Evita o ClassCastException caso o ID venha como String do banco
        int id = Integer.parseInt(TabelaClienteT.getModel().getValueAt(linhaModel, 0).toString()); 

        ConexaoSB conexao = new ConexaoSB();
        try (java.sql.Connection conn = conexao.conectar()) {
            String sqlSelect = "SELECT * FROM clientes WHERE id = ?";
            java.sql.PreparedStatement pst = conn.prepareStatement(sqlSelect);
            pst.setInt(1, id);
            java.sql.ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                GerenciarClienteT form = new GerenciarClienteT(null, true);
                form.preencherCampos(
                    rs.getString("nome"), rs.getString("telefone"), 
                    rs.getString("data_nascimento"), rs.getString("cpf"), 
                    rs.getString("senha"), rs.getString("genero"), 
                    rs.getString("assinatura") 
                );
                form.setVisible(true);

                if (form.isSalvou()) {
                    String assinaturaEscolhida = form.getAssinaturaCliente();
                    String valorAtualizado = buscarValorDaAssinatura(assinaturaEscolhida);

                    String sqlUpdate = "UPDATE clientes SET nome=?, cpf=?, telefone=?, senha=?, data_nascimento=?, genero=?, assinatura=?, valor=? WHERE id=?";
                    java.sql.PreparedStatement pstUp = conn.prepareStatement(sqlUpdate);
                    pstUp.setString(1, form.getNomeCliente());
                    pstUp.setString(2, form.getCPFCliente());
                    pstUp.setString(3, form.getTelefoneCliente());
                    pstUp.setString(4, form.getSenhaCliente());
                    pstUp.setString(5, form.getDataCliente());
                    pstUp.setString(6, form.getGeneroCliente());
                    pstUp.setString(7, assinaturaEscolhida);
                    pstUp.setString(8, valorAtualizado); 
                    pstUp.setInt(9, id); 

                    pstUp.executeUpdate();
                    javax.swing.JOptionPane.showMessageDialog(this, "Atualizado com sucesso!");
                    carregarTabelaT();
                }
            }
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Erro: " + e.getMessage());
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
int linhaSelecionada = TabelaClienteT.getSelectedRow();

        if (linhaSelecionada == -1) {
            javax.swing.JOptionPane.showMessageDialog(this, "Selecione um cliente para excluir.");
            return;
        }

        int linhaModel = TabelaClienteT.convertRowIndexToModel(linhaSelecionada);
        // CONVERSÃO SEGURA:
        int id = Integer.parseInt(TabelaClienteT.getModel().getValueAt(linhaModel, 0).toString()); 

        int certeza = javax.swing.JOptionPane.showConfirmDialog(this, "Tem certeza que deseja excluir este cliente?", "Confirmar", javax.swing.JOptionPane.YES_NO_OPTION);

        if (certeza == javax.swing.JOptionPane.YES_OPTION) {
            ConexaoSB conexao = new ConexaoSB();
            try (java.sql.Connection conn = conexao.conectar()) {
                String sql = "DELETE FROM clientes WHERE id = ?"; 
                java.sql.PreparedStatement pst = conn.prepareStatement(sql);
                pst.setInt(1, id);
                pst.executeUpdate();
            
                javax.swing.JOptionPane.showMessageDialog(this, "Cliente excluído!");
                carregarTabelaT();
            } catch (Exception e) {
                javax.swing.JOptionPane.showMessageDialog(this, "Erro ao excluir: " + e.getMessage());
            }
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnNovoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoClienteActionPerformed
        GerenciarClienteT form = new GerenciarClienteT(null, true);
        form.setLocationRelativeTo(this);
        form.setVisible(true); 

        if (form.isSalvou()) {
            String assinaturaEscolhida = form.getAssinaturaCliente();
            
            if (assinaturaEscolhida.isEmpty()) {
                javax.swing.JOptionPane.showMessageDialog(this, "Erro: Selecione um plano de assinatura!");
                return;
            }

            String valorDoPlano = buscarValorDaAssinatura(assinaturaEscolhida);
            ConexaoSB conexao = new ConexaoSB();

            try (java.sql.Connection conn = conexao.conectar()) {
                String sql = "INSERT INTO clientes (nome, cpf, telefone, senha, data_nascimento, genero, assinatura, valor, status) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
                java.sql.PreparedStatement pst = conn.prepareStatement(sql);

                pst.setString(1, form.getNomeCliente());
                pst.setString(2, form.getCPFCliente());
                pst.setString(3, form.getTelefoneCliente());
                pst.setString(4, form.getSenhaCliente());
                pst.setString(5, form.getDataCliente());
                pst.setString(6, form.getGeneroCliente());
                pst.setString(7, assinaturaEscolhida); 
                pst.setString(8, valorDoPlano); 
                pst.setString(9, "Pendente");

                pst.executeUpdate(); 
                javax.swing.JOptionPane.showMessageDialog(this, "Novo cliente cadastrado com sucesso!");
                carregarTabelaT();
            } catch (Exception erro) {
                javax.swing.JOptionPane.showMessageDialog(this, "Erro ao salvar: " + erro.getMessage());
            }
        }
    }//GEN-LAST:event_btnNovoClienteActionPerformed

    private String buscarValorDaAssinatura(String nomeAssinatura) {
    String valor = "0.00";
        try {
            Mysql.ConexaoSB conexao = new Mysql.ConexaoSB();
            java.sql.Connection conn = conexao.conectar();
            String sql = "SELECT valor FROM assinaturas WHERE nome_assinatura = ?";
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, nomeAssinatura);
            java.sql.ResultSet rs = pst.executeQuery();
            
            if(rs.next()){
                valor = rs.getString("valor");
            }
            rs.close(); pst.close(); conn.close();
        } catch(Exception e) {
            System.out.println("Erro ao buscar valor: " + e.getMessage());
        }
        return valor;
}
    
    private void txtBuscarCPFKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarCPFKeyReleased
        String textoBusca = txtBuscarCPF.getText();
        javax.swing.table.DefaultTableModel modelo = (javax.swing.table.DefaultTableModel) TabelaClienteT.getModel();
        javax.swing.table.TableRowSorter<javax.swing.table.DefaultTableModel> sorter = new javax.swing.table.TableRowSorter<>(modelo);
        TabelaClienteT.setRowSorter(sorter);
    
        if (textoBusca.trim().length() == 0) {
            sorter.setRowFilter(null); 
        } else {
            sorter.setRowFilter(javax.swing.RowFilter.regexFilter("(?i)" + textoBusca, 2)); // O índice 1 agora é o Nome (já que o 0 é o ID)
        }
    }//GEN-LAST:event_txtBuscarCPFKeyReleased

    private void txtBuscarCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarCPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarCPFActionPerformed

    public void carregarTabelaT() {
   javax.swing.table.DefaultTableModel modelo = (javax.swing.table.DefaultTableModel) TabelaClienteT.getModel();
        modelo.setNumRows(0);

        ConexaoSB conexao = new ConexaoSB();
        java.sql.Connection conn = null;
        java.sql.PreparedStatement pst = null;
        java.sql.ResultSet rs = null;

        String sql = "SELECT id, nome, cpf, telefone, assinatura FROM clientes ORDER BY nome ASC";

        try {
            conn = conexao.conectar();
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();

            while (rs.next()) {
                modelo.addRow(new Object[]{
                    rs.getInt("id"), // Coluna 0
                    rs.getString("nome"), // Coluna 1
                    rs.getString("cpf"), // Coluna 2
                    rs.getString("assinatura") // Coluna 3
                });
            }
            atualizarTotalClientes();

        } catch (java.sql.SQLException erro) {
            javax.swing.JOptionPane.showMessageDialog(this, "Erro ao carregar tabela: " + erro.getMessage());
        } finally {
            // FECHAMENTO CORRETO DAS CONEXÕES:
            try {
                if (rs != null) rs.close();
                if (pst != null) pst.close();
                if (conn != null) conn.close();
            } catch (java.sql.SQLException e) {
                System.out.println("Erro ao fechar conexão: " + e.getMessage());
            }
        }
}


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TabelaClienteT;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovoCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbNome;
    private javax.swing.JLabel lblTotalClientesT;
    private javax.swing.JTextField txtBuscarCPF;
    // End of variables declaration//GEN-END:variables

}


