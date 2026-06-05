/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package smartbianco2.pkg0.Chefe;

import javax.swing.plaf.basic.BasicInternalFrameUI;
import Mysql.ConexaoSB;

public class Assinatura extends javax.swing.JInternalFrame {

    /**
     * Creates new form Assinatura
     */
    public Assinatura() {
        initComponents();
        carregarTabela();
        
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI ui = (BasicInternalFrameUI)this.getUI();
        ui.setNorthPane(null);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaPlanos = new javax.swing.JTable();
        btnEditar = new javax.swing.JButton();
        javax.swing.JButton btnDelete = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Plano de Assinaturas");

        jButton1.setBackground(new java.awt.Color(0, 102, 51));
        jButton1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("+Novo Plano");
        jButton1.setFocusPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tabelaPlanos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id_assinatura", "Nome", "Valor", "Duração"
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
        jScrollPane1.setViewportView(tabelaPlanos);

        btnEditar.setBackground(new java.awt.Color(0, 102, 204));
        btnEditar.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(255, 255, 255));
        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/editar.png"))); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.setMaximumSize(new java.awt.Dimension(105, 35));
        btnEditar.setMinimumSize(new java.awt.Dimension(105, 35));
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(204, 0, 51));
        btnDelete.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/excluir.png"))); // NOI18N
        btnDelete.setText("Excluir");
        btnDelete.setPreferredSize(new java.awt.Dimension(100, 35));
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/pagamento-em-dinheiro (1).png"))); // NOI18N

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Observações:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jButton1)
                                    .addGap(77, 77, 77)
                                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 554, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 554, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(87, 87, 87)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel1))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel3)))
                .addGap(0, 97, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    FormularioAssinatura form = new FormularioAssinatura(null, true);
    form.setLocationRelativeTo(this);
    form.setVisible(true);

    if (form.isSalvou()) {
        try {
            Mysql.ConexaoSB con = new Mysql.ConexaoSB();
            java.sql.Connection conn = con.conectar();
            // SQL de INSERT
        // CORRETO: Não inclua o ID no INSERT
            String sql = "INSERT INTO Assinaturas (nome_assinatura, valor, duracao) VALUES (?, ?, ?)";
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);

            pst.setString(1, form.getNome());
            pst.setDouble(2, Double.parseDouble(form.getValor().replace(",", "."))); // Converte para double
            pst.setString(3, form.getDuracao());

            pst.executeUpdate();
            
            carregarTabela(); // Recarrega a tabela para mostrar o novo item
            javax.swing.JOptionPane.showMessageDialog(this, "Plano cadastrado com sucesso!");
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Erro: " + e.getMessage());
        }
    }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
int linhaSelecionada = tabelaPlanos.getSelectedRow();
    if (linhaSelecionada == -1) {
        javax.swing.JOptionPane.showMessageDialog(this, "Selecione um plano.");
        return;
    }

    try {
        // 1. Conversão segura do ID
        Object objId = tabelaPlanos.getValueAt(linhaSelecionada, 0);
        int id = Integer.parseInt(objId.toString());

        String nome = tabelaPlanos.getValueAt(linhaSelecionada, 1).toString();
        String valor = tabelaPlanos.getValueAt(linhaSelecionada, 2).toString();
        String duracao = tabelaPlanos.getValueAt(linhaSelecionada, 3).toString();

        FormularioAssinatura form = new FormularioAssinatura(null, true);
        form.preencherCampos(id, nome, valor, duracao);
        form.setVisible(true);

        if (form.isSalvou()) {
            // 2. Abrir a conexão localmente (essencial!)
            Mysql.ConexaoSB con = new Mysql.ConexaoSB();
            java.sql.Connection conn = con.conectar(); 
            
            String sql = "UPDATE Assinaturas SET nome_assinatura=?, valor=?, duracao=? WHERE id=?";
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);

            pst.setString(1, form.getNome());
            
            // Tratamento do valor decimal
            double valorDouble = Double.parseDouble(form.getValor().replace(",", "."));
            pst.setDouble(2, valorDouble); 

            pst.setString(3, form.getDuracao());
            pst.setInt(4, form.getId()); 
            
            pst.executeUpdate();
            pst.close();
            conn.close();

            carregarTabela();
            javax.swing.JOptionPane.showMessageDialog(this, "Plano atualizado com sucesso!");
        }
    } catch (Exception e) {
        // 3. Isso te mostrará o erro real no console do NetBeans
        e.printStackTrace(); 
        javax.swing.JOptionPane.showMessageDialog(this, "Erro ao editar: " + e.getMessage());
    }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int linhaSelecionada = tabelaPlanos.getSelectedRow();

        // Se for -1, significa que o usuário não clicou em nenhuma linha
        if (linhaSelecionada == -1) {
            javax.swing.JOptionPane.showMessageDialog(this, "Por favor, selecione um plano na tabela para excluir.");
            return;
        }

        // Pede uma confirmação antes de apagar
        int certeza = javax.swing.JOptionPane.showConfirmDialog(this, "Tem certeza que deseja excluir este plano?", "Confirmar Exclusão", javax.swing.JOptionPane.YES_NO_OPTION);
        int id = (int) tabelaPlanos.getValueAt(linhaSelecionada, 0);

        if (certeza == javax.swing.JOptionPane.YES_OPTION) {
        try {
        Mysql.ConexaoSB con = new Mysql.ConexaoSB();
        java.sql.Connection conn = con.conectar();
        String sql = "DELETE FROM Assinaturas WHERE id = ?";
        java.sql.PreparedStatement pst = conn.prepareStatement(sql);
        pst.setInt(1, id);
        pst.executeUpdate();
        pst.close();
        conn.close();
        
        carregarTabela(); // Recarrega a tabela
        javax.swing.JOptionPane.showMessageDialog(this, "Excluído com sucesso!");
        } catch (Exception e) {
        javax.swing.JOptionPane.showMessageDialog(this, "Erro ao excluir: " + e.getMessage());
        }
}
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void carregarTabela() {
    javax.swing.table.DefaultTableModel modelo = (javax.swing.table.DefaultTableModel) tabelaPlanos.getModel();
    modelo.setNumRows(0);

    Mysql.ConexaoSB conexao = new Mysql.ConexaoSB();
    java.sql.Connection conn = conexao.conectar();
    String sql = "SELECT * FROM Assinaturas";

    try {
        java.sql.PreparedStatement pst = conn.prepareStatement(sql);
        java.sql.ResultSet rs = pst.executeQuery();
        while (rs.next()) {
            modelo.addRow(new Object[]{
                rs.getInt("id"),
                rs.getString("nome_assinatura"),
                rs.getString("valor"),
                rs.getString("duracao")
            });
        }
        pst.close();
        conn.close();
    } catch (java.sql.SQLException e) {
        javax.swing.JOptionPane.showMessageDialog(this, "Erro ao carregar planos: " + e.getMessage());
    }
}
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTable tabelaPlanos;
    // End of variables declaration//GEN-END:variables
}
