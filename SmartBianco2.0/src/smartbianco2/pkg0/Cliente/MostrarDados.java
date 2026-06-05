/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package smartbianco2.pkg0.cliente;

import javax.swing.plaf.basic.BasicInternalFrameUI;
import Mysql.ConexaoSB;

public class MostrarDados extends javax.swing.JInternalFrame {

    /**
     * Creates new form Assinatura
     */
    public MostrarDados(int idCliente) {
    initComponents();
            this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI ui = (BasicInternalFrameUI)this.getUI();
        ui.setNorthPane(null); 
    carregarDadosDoBanco(idCliente);
    }

private void carregarDadosDoBanco(int id) {
    // Substitua 'SeuPacote.ConexaoSB' pelo caminho correto da sua classe de conexão
    Mysql.ConexaoSB conexao = new Mysql.ConexaoSB();
    
    String sql = "SELECT * FROM clientes WHERE id = ?";
    
    try (java.sql.Connection conn = conexao.conectar();
         java.sql.PreparedStatement pst = conn.prepareStatement(sql)) {
        
        pst.setInt(1, id);
        java.sql.ResultSet rs = pst.executeQuery();
        
        if (rs.next()) {
            // Preenchendo os JLabels com os dados do banco
            NomeCliente.setText(rs.getString("nome"));
            CpfCliente.setText(rs.getString("cpf"));
            TelefoneCliente.setText(rs.getString("telefone"));
            DataNascCliente.setText(rs.getString("data_nascimento"));
            GeneroCliente.setText(rs.getString("genero"));
            AssinaturaCliente.setText(rs.getString("assinatura"));
            ValorAssinatura.setText(rs.getString("valor"));
            txtStatusAssinatura.setText(rs.getString("status"));
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "Cliente não encontrado!");
        }
        
    } catch (Exception e) {
        javax.swing.JOptionPane.showMessageDialog(this, "Erro ao carregar dados: " + e.getMessage());
    }
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtStatusAssinatura = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        NomeCliente = new javax.swing.JLabel();
        AssinaturaCliente = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        CpfCliente = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        TelefoneCliente = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        DataNascCliente = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        GeneroCliente = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ValorAssinatura = new javax.swing.JLabel();

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Nome:");

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Status:");

        txtStatusAssinatura.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        txtStatusAssinatura.setForeground(new java.awt.Color(0, 0, 0));
        txtStatusAssinatura.setText("TesteStatus");

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Assinatura:");

        NomeCliente.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        NomeCliente.setForeground(new java.awt.Color(0, 0, 0));
        NomeCliente.setText("TesteNome");

        AssinaturaCliente.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        AssinaturaCliente.setForeground(new java.awt.Color(0, 0, 0));
        AssinaturaCliente.setText("TesteAssinatura");

        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("CPF:");

        CpfCliente.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        CpfCliente.setForeground(new java.awt.Color(0, 0, 0));
        CpfCliente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CpfCliente.setText("TesteCPF");

        jLabel6.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Telefone:");

        TelefoneCliente.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        TelefoneCliente.setForeground(new java.awt.Color(0, 0, 0));
        TelefoneCliente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TelefoneCliente.setText("TesteTelefone");

        jLabel7.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Data de nascimento:");

        DataNascCliente.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        DataNascCliente.setForeground(new java.awt.Color(0, 0, 0));
        DataNascCliente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DataNascCliente.setText("TesteData");

        jLabel8.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Genero:");

        GeneroCliente.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        GeneroCliente.setForeground(new java.awt.Color(0, 0, 0));
        GeneroCliente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        GeneroCliente.setText("TesteGenero");

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Valor assinatura");

        ValorAssinatura.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        ValorAssinatura.setForeground(new java.awt.Color(0, 0, 0));
        ValorAssinatura.setText("TesteValor");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtStatusAssinatura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(NomeCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CpfCliente)
                            .addComponent(AssinaturaCliente))
                        .addGap(33, 33, 33)
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(DataNascCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(117, 117, 117)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(58, 58, 58)
                                        .addComponent(ValorAssinatura))
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(GeneroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TelefoneCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(122, 122, 122))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(NomeCliente)
                    .addComponent(jLabel5)
                    .addComponent(CpfCliente)
                    .addComponent(jLabel6)
                    .addComponent(TelefoneCliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtStatusAssinatura)
                    .addComponent(jLabel3)
                    .addComponent(AssinaturaCliente))
                .addGap(29, 29, 29)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(DataNascCliente))
                .addGap(108, 108, 108)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(ValorAssinatura))
                .addGap(51, 51, 51)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(GeneroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(173, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AssinaturaCliente;
    private javax.swing.JLabel CpfCliente;
    private javax.swing.JLabel DataNascCliente;
    private javax.swing.JLabel GeneroCliente;
    private javax.swing.JLabel NomeCliente;
    private javax.swing.JLabel TelefoneCliente;
    private javax.swing.JLabel ValorAssinatura;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel txtStatusAssinatura;
    // End of variables declaration//GEN-END:variables
}
