/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package smartbianco2.pkg0.Chefe;

import javax.swing.plaf.basic.BasicInternalFrameUI;
import Mysql.ConexaoSB;

public class Funcionarios extends javax.swing.JInternalFrame {

    /**
     * arrumar salario/ senha
     */
    public Funcionarios() {
        initComponents();
        
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI ui = (BasicInternalFrameUI)this.getUI();
        ui.setNorthPane(null);
        atualizarTotalFuncionarios();
        carregarTabela();
    }

    private void atualizarTotalFuncionarios() {
    // Conta quantas linhas existem na tabela atualmente
    int total = TabelaFuncionarios.getRowCount();
    
    // Atualiza o texto da sua Label com o novo valor
    lblTotalFuncionarios.setText("Total de Funcionario: " + total);
}
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnNovoFuncionario = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        lbNome = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelaFuncionarios = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txtBuscarFuncionario = new javax.swing.JTextField();
        lblTotalFuncionarios = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(800, 600));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        btnNovoFuncionario.setBackground(new java.awt.Color(0, 102, 51));
        btnNovoFuncionario.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btnNovoFuncionario.setForeground(new java.awt.Color(255, 255, 255));
        btnNovoFuncionario.setText("Novo Funcionario");
        btnNovoFuncionario.setFocusPainted(false);
        btnNovoFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoFuncionarioActionPerformed(evt);
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

        lbNome.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbNome.setForeground(new java.awt.Color(0, 0, 0));
        lbNome.setText("Olá, Lucas Silva!");

        jLabel1.setBackground(new java.awt.Color(51, 51, 51));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Gerenciar Funcionarios.");

        TabelaFuncionarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id_funcionario", "Nome", "CPF", "Cargo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
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
        jScrollPane1.setViewportView(TabelaFuncionarios);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Buscar nome:");

        txtBuscarFuncionario.setBackground(new java.awt.Color(255, 255, 255));
        txtBuscarFuncionario.setForeground(new java.awt.Color(0, 0, 0));
        txtBuscarFuncionario.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtBuscarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarFuncionarioActionPerformed(evt);
            }
        });
        txtBuscarFuncionario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarFuncionarioKeyReleased(evt);
            }
        });

        lblTotalFuncionarios.setForeground(new java.awt.Color(0, 0, 0));
        lblTotalFuncionarios.setText("Total de Funcionarios:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnNovoFuncionario)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(lbNome, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(96, 96, 96)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txtBuscarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 571, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(203, 203, 203)
                        .addComponent(lblTotalFuncionarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(lbNome, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovoFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txtBuscarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTotalFuncionarios))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNovoFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoFuncionarioActionPerformed
    GerenciarFuncionarios form = new GerenciarFuncionarios(null, true);
    form.setLocationRelativeTo(this);
    form.setVisible(true);

    if (form.isSalvou()) {
        try {
            Mysql.ConexaoSB con = new Mysql.ConexaoSB();
            java.sql.Connection conn = con.conectar();
            String sql = "INSERT INTO funcionarios (nome, cpf, telefone, genero, data_nasc, salario, cargo, senha) VALUES (?,?,?,?,?,?,?,?)";
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            
            pst.setString(1, form.getNomeFuncionario());
            pst.setString(2, form.getCPFFuncionario());
            pst.setString(3, form.getTelefoneFuncionario());
            pst.setString(4, form.getGeneroFuncionario());
            pst.setString(5, form.getDataFuncionario());
            pst.setString(6, form.getSalarioFuncionario());
            pst.setString(7, form.getCargoFuncionario());
            pst.setString(8, form.getSenhaFuncionario());// Certifique-se de ter este método
            
            pst.executeUpdate();
            conn.close();
            
            carregarTabela(); // Recarrega a tabela com os novos dados
            javax.swing.JOptionPane.showMessageDialog(this, "Salvo com sucesso!");
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Erro ao salvar: " + e.getMessage());
        }
    }
    }//GEN-LAST:event_btnNovoFuncionarioActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
    int linhaSelecionada = TabelaFuncionarios.getSelectedRow();
        if (linhaSelecionada == -1) {
            javax.swing.JOptionPane.showMessageDialog(this, "Selecione um funcionario para editar.");
            return;
        }

        int linhaModel = TabelaFuncionarios.convertRowIndexToModel(linhaSelecionada);
        // CONVERSÃO SEGURA: Evita o ClassCastException caso o ID venha como String do banco
        int id = Integer.parseInt(TabelaFuncionarios.getModel().getValueAt(linhaModel, 0).toString()); 

        ConexaoSB conexao = new ConexaoSB();
        try (java.sql.Connection conn = conexao.conectar()) {
            String sqlSelect = "SELECT * FROM funcionarios WHERE id = ?";
            java.sql.PreparedStatement pst = conn.prepareStatement(sqlSelect);
            pst.setInt(1, id);
            java.sql.ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                GerenciarFuncionarios form = new GerenciarFuncionarios(null, true);
                form.preencherCampos(
                    rs.getString("nome"), rs.getString("cpf"), 
                    rs.getString("telefone"), rs.getString("data_nasc"), 
                    rs.getString("genero"), rs.getString("senha"), 
                    rs.getString("salario"), rs.getString ("cargo") 
                );
                form.setVisible(true);

            if (form.isSalvou()) {
             // 1. Nome da tabela corrigido para 'funcionarios'
                String sqlUpdate = "UPDATE funcionarios SET nome=?, cpf=?, telefone=?,genero=?,data_nasc=?, salario=?, cargo=?,senha=? WHERE id=?";
                java.sql.PreparedStatement pstUp = conn.prepareStatement(sqlUpdate);
    
                pstUp.setString(1, form.getNomeFuncionario());
                pstUp.setString(2, form.getCPFFuncionario());
                pstUp.setString(3, form.getTelefoneFuncionario());
                pstUp.setString(4, form.getGeneroFuncionario());
                pstUp.setString(5, form.getDataFuncionario());
                pstUp.setString(6, form.getSalarioFuncionario());
                pstUp.setString(7, form.getCargoFuncionario());
                pstUp.setString(8, form.getSenhaFuncionario());
                pstUp.setInt(9, id);

                pstUp.executeUpdate();
                javax.swing.JOptionPane.showMessageDialog(this, "Atualizado com sucesso!");
                carregarTabela();
                }
            }
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Erro2: " + e.getMessage());
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        int linhaSelecionada = TabelaFuncionarios.getSelectedRow();

        if (linhaSelecionada == -1) {
            javax.swing.JOptionPane.showMessageDialog(this, "Selecione um cliente para excluir.");
            return;
        }

        int linhaModel = TabelaFuncionarios.convertRowIndexToModel(linhaSelecionada);
        int id = Integer.parseInt(TabelaFuncionarios.getModel().getValueAt(linhaModel, 0).toString()); 

        int certeza = javax.swing.JOptionPane.showConfirmDialog(this, "Tem certeza que deseja excluir este funcionario?", "Confirmar", javax.swing.JOptionPane.YES_NO_OPTION);

        if (certeza == javax.swing.JOptionPane.YES_OPTION) {
            ConexaoSB conexao = new ConexaoSB();
            try (java.sql.Connection conn = conexao.conectar()) {
                String sql = "DELETE FROM funcionarios WHERE id = ?"; 
                java.sql.PreparedStatement pst = conn.prepareStatement(sql);
                pst.setInt(1, id);
                pst.executeUpdate();
            
                javax.swing.JOptionPane.showMessageDialog(this, "Funcionario excluído!");
                carregarTabela();
            } catch (Exception e) {
                javax.swing.JOptionPane.showMessageDialog(this, "Erro ao excluir: " + e.getMessage());
            }
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void txtBuscarFuncionarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarFuncionarioKeyReleased
        
        String textoBusca = txtBuscarFuncionario.getText();
    
        javax.swing.table.DefaultTableModel modelo = (javax.swing.table.DefaultTableModel) TabelaFuncionarios.getModel();
    
        javax.swing.table.TableRowSorter<javax.swing.table.DefaultTableModel> sorter = new javax.swing.table.TableRowSorter<>(modelo);
        TabelaFuncionarios.setRowSorter(sorter);
    
        if (textoBusca.trim().length() == 0) {
            sorter.setRowFilter(null); 
            
        } else {
            sorter.setRowFilter(javax.swing.RowFilter.regexFilter("(?i)" + textoBusca, 1));
        }
    }//GEN-LAST:event_txtBuscarFuncionarioKeyReleased

    private void txtBuscarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarFuncionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarFuncionarioActionPerformed

    private void carregarTabela() {
    javax.swing.table.DefaultTableModel modelo = (javax.swing.table.DefaultTableModel) TabelaFuncionarios.getModel();
    modelo.setRowCount(0);

    try {
        Mysql.ConexaoSB con = new Mysql.ConexaoSB();
        java.sql.Connection conn = con.conectar();
        String sql = "SELECT * FROM funcionarios";
        java.sql.PreparedStatement pst = conn.prepareStatement(sql);
        java.sql.ResultSet rs = pst.executeQuery();

        while (rs.next()) {
            modelo.addRow(new Object[]{
                rs.getInt("id"),
                rs.getString("nome"),
                rs.getString("cpf"),
                rs.getString("cargo") // Adicione as outras colunas se desejar exibir
            });
        }
        conn.close();
        atualizarTotalFuncionarios(); // Atualiza o rótulo de contagem
    } catch (Exception e) {
        javax.swing.JOptionPane.showMessageDialog(this, "Erro ao carregar tabela: " + e.getMessage());
    }
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TabelaFuncionarios;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovoFuncionario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbNome;
    private javax.swing.JLabel lblTotalFuncionarios;
    private javax.swing.JTextField txtBuscarFuncionario;
    // End of variables declaration//GEN-END:variables
}
