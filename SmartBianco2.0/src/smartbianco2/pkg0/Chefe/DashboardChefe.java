/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package smartbianco2.pkg0.Chefe;

import java.awt.Color;
import smartbianco2.pkg0.Login;

public class DashboardChefe extends javax.swing.JFrame {
    
    Color DefaultColor, ClickedColor;
    
    public DashboardChefe() {
        initComponents();
    
        DefaultColor = new Color(0,0,102);
        ClickedColor = new Color(14,14,123);
        
        Clientes.setBackground (DefaultColor);
        Funcionarios.setBackground (DefaultColor);
        Assinaturas.setBackground (DefaultColor);
        Pagamento.setBackground(DefaultColor);
        PagamentoCliente.setBackground(DefaultColor);
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        Clientes = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Funcionarios = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Assinaturas = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        Pagamento = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        PagamentoCliente = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jDesktopPane1 = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(0, 0, 102));

        jButton1.setBackground(new java.awt.Color(153, 0, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Sair");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Clientes.setBackground(new java.awt.Color(0, 51, 102));
        Clientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClientesMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ClientesMousePressed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Clientes");

        javax.swing.GroupLayout ClientesLayout = new javax.swing.GroupLayout(Clientes);
        Clientes.setLayout(ClientesLayout);
        ClientesLayout.setHorizontalGroup(
            ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        ClientesLayout.setVerticalGroup(
            ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        Funcionarios.setBackground(new java.awt.Color(0, 51, 102));
        Funcionarios.setPreferredSize(new java.awt.Dimension(134, 43));
        Funcionarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FuncionariosMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                FuncionariosMousePressed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Funcionarios");

        javax.swing.GroupLayout FuncionariosLayout = new javax.swing.GroupLayout(Funcionarios);
        Funcionarios.setLayout(FuncionariosLayout);
        FuncionariosLayout.setHorizontalGroup(
            FuncionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        FuncionariosLayout.setVerticalGroup(
            FuncionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        Assinaturas.setBackground(new java.awt.Color(0, 51, 102));
        Assinaturas.setPreferredSize(new java.awt.Dimension(134, 43));
        Assinaturas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AssinaturasMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                AssinaturasMousePressed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Assinaturas");

        javax.swing.GroupLayout AssinaturasLayout = new javax.swing.GroupLayout(Assinaturas);
        Assinaturas.setLayout(AssinaturasLayout);
        AssinaturasLayout.setHorizontalGroup(
            AssinaturasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
        );
        AssinaturasLayout.setVerticalGroup(
            AssinaturasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
        );

        Pagamento.setBackground(new java.awt.Color(0, 51, 102));
        Pagamento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PagamentoMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                PagamentoMousePressed(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Pagamento Func");

        javax.swing.GroupLayout PagamentoLayout = new javax.swing.GroupLayout(Pagamento);
        Pagamento.setLayout(PagamentoLayout);
        PagamentoLayout.setHorizontalGroup(
            PagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PagamentoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        PagamentoLayout.setVerticalGroup(
            PagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
        );

        PagamentoCliente.setBackground(new java.awt.Color(0, 51, 102));
        PagamentoCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PagamentoClienteMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                PagamentoClienteMousePressed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Pagamento Cliente");

        javax.swing.GroupLayout PagamentoClienteLayout = new javax.swing.GroupLayout(PagamentoCliente);
        PagamentoCliente.setLayout(PagamentoClienteLayout);
        PagamentoClienteLayout.setHorizontalGroup(
            PagamentoClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PagamentoClienteLayout.setVerticalGroup(
            PagamentoClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Clientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Funcionarios, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
            .addComponent(Assinaturas, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
            .addComponent(Pagamento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(PagamentoCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addComponent(Clientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Funcionarios, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Assinaturas, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Pagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(PagamentoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(38, 38, 38))
        );

        jDesktopPane1.setBackground(new java.awt.Color(255, 255, 255));
        jDesktopPane1.setPreferredSize(new java.awt.Dimension(580, 213));

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 669, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 669, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
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

    private void AssinaturasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AssinaturasMousePressed
        Clientes.setBackground (DefaultColor);
        Funcionarios.setBackground (DefaultColor);
        Assinaturas.setBackground (ClickedColor);
        Pagamento.setBackground(DefaultColor);
        PagamentoCliente.setBackground(DefaultColor);        
    }//GEN-LAST:event_AssinaturasMousePressed

    private void AssinaturasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AssinaturasMouseClicked
        Assinatura ass = new Assinatura();
        jDesktopPane1.removeAll();
        jDesktopPane1.add(ass).setVisible(true);
    }//GEN-LAST:event_AssinaturasMouseClicked

    private void FuncionariosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FuncionariosMousePressed
        Clientes.setBackground (DefaultColor);
        Funcionarios.setBackground (ClickedColor);
        Assinaturas.setBackground (DefaultColor);
        Pagamento.setBackground(DefaultColor);
        PagamentoCliente.setBackground(DefaultColor);        
    }//GEN-LAST:event_FuncionariosMousePressed

    private void FuncionariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FuncionariosMouseClicked
        Funcionarios func = new Funcionarios();
        jDesktopPane1.removeAll();
        jDesktopPane1.add(func).setVisible(true);
    }//GEN-LAST:event_FuncionariosMouseClicked

    private void ClientesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClientesMousePressed
        Clientes.setBackground (ClickedColor);
        Funcionarios.setBackground (DefaultColor);
        Assinaturas.setBackground (DefaultColor);
        Pagamento.setBackground(DefaultColor);
        PagamentoCliente.setBackground(DefaultColor);
    }//GEN-LAST:event_ClientesMousePressed

    private void ClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClientesMouseClicked
        Clientes cliente = new Clientes();
        jDesktopPane1.removeAll();
        jDesktopPane1.add(cliente).setVisible(true);
    }//GEN-LAST:event_ClientesMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Login LoginFrame = new Login ();
        LoginFrame.setVisible(true);
        LoginFrame.pack();
        LoginFrame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void PagamentoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PagamentoMousePressed
        Clientes.setBackground (DefaultColor);
        Funcionarios.setBackground (DefaultColor);
        Assinaturas.setBackground (DefaultColor);
        Pagamento.setBackground(ClickedColor);
        PagamentoCliente.setBackground(DefaultColor);
    }//GEN-LAST:event_PagamentoMousePressed

    private void PagamentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PagamentoMouseClicked
        ControlePagamentoG func = new ControlePagamentoG();
        jDesktopPane1.removeAll();
        jDesktopPane1.add(func).setVisible(true);
    }//GEN-LAST:event_PagamentoMouseClicked

    private void PagamentoClienteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PagamentoClienteMousePressed
        Clientes.setBackground (DefaultColor);
        Funcionarios.setBackground (DefaultColor);
        Assinaturas.setBackground (DefaultColor);
        Pagamento.setBackground(DefaultColor);
        PagamentoCliente.setBackground(ClickedColor);
    }//GEN-LAST:event_PagamentoClienteMousePressed

    private void PagamentoClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PagamentoClienteMouseClicked
        ControlePagamentoCliente func = new ControlePagamentoCliente();
        jDesktopPane1.removeAll();
        jDesktopPane1.add(func).setVisible(true);
    }//GEN-LAST:event_PagamentoClienteMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Assinaturas;
    private javax.swing.JPanel Clientes;
    private javax.swing.JPanel Funcionarios;
    private javax.swing.JPanel Pagamento;
    private javax.swing.JPanel PagamentoCliente;
    private javax.swing.JButton jButton1;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
