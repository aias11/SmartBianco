/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package smartbianco2.pkg0.Funcionario;

import Mysql.ConexaoSB;
import javax.swing.table.DefaultTableModel;
import javax.swing.plaf.basic.BasicInternalFrameUI;

public class Treinos extends javax.swing.JInternalFrame {

    public Treinos() {
        initComponents();
        
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI ui = (BasicInternalFrameUI)this.getUI();
        ui.setNorthPane(null);  
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtExercicioSegunda = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtSeriesSegunda = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtRepsSegunda = new javax.swing.JTextField();
        btnAdicionarSegunda = new javax.swing.JButton();
        btnRemoverSegunda = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTreinoSegunda = new javax.swing.JTable();
        btnSalvarSegunda = new javax.swing.JButton();
        btnAtualizarSegunda = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtExercicioTerca = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtSeriesTerca = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtRepsTerca = new javax.swing.JTextField();
        btnAdicionarTerca = new javax.swing.JButton();
        btnRemoverTerca = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblTreinoTerca = new javax.swing.JTable();
        btnSalvarTerca = new javax.swing.JButton();
        btnAtualizarTerca = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        txtExercicioQuarta = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtSeriesQuarta = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtRepsQuarta = new javax.swing.JTextField();
        btnAdicionarQuarta = new javax.swing.JButton();
        btnRemoverQuarta = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblTreinoQuarta = new javax.swing.JTable();
        btnSalvarQuarta = new javax.swing.JButton();
        btnAtualizarQuarta = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        txtExercicioQuinta = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtSeriesQuinta = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtRepsQuinta = new javax.swing.JTextField();
        btnAdicionarQuinta = new javax.swing.JButton();
        btnRemoverQuinta = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblTreinoQuinta = new javax.swing.JTable();
        btnSalvarQuinta = new javax.swing.JButton();
        btnAtualizarQuinta = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        txtExercicioSexta = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtSeriesSexta = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtRepsSexta = new javax.swing.JTextField();
        btnAdicionarSexta = new javax.swing.JButton();
        btnRemoverSexta = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblTreinoSexta = new javax.swing.JTable();
        btnSalvarSexta = new javax.swing.JButton();
        btnAtualizarSexta = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        txtExercicioSabado = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtSeriesSabado = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txtRepsSabado = new javax.swing.JTextField();
        btnAdicionarSabado = new javax.swing.JButton();
        btnRemoverSabado = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        tblTreinoSabado = new javax.swing.JTable();
        btnSalvarSabado = new javax.swing.JButton();
        btnAtualizarSabado = new javax.swing.JButton();
        jPanel14 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        txtExercicioDomingo = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        txtSeriesDomingo = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        txtRepsDomingo = new javax.swing.JTextField();
        btnAdicionarDomingo = new javax.swing.JButton();
        btnRemoverDomingo = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        tblTreinoDomingo = new javax.swing.JTable();
        btnSalvarDomingo = new javax.swing.JButton();
        btnAtualizarDomingo = new javax.swing.JButton();
        lblAlunoSelecionado = new javax.swing.JLabel();
        txtBuscaRapida = new javax.swing.JTextField();
        jScrollPane8 = new javax.swing.JScrollPane();
        tabelaResultados = new javax.swing.JTable();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jTabbedPane1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 17)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Exercicio:");

        txtExercicioSegunda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtExercicioSegundaActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Series:");

        txtSeriesSegunda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSeriesSegundaActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Repetições");

        txtRepsSegunda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRepsSegundaActionPerformed(evt);
            }
        });

        btnAdicionarSegunda.setBackground(new java.awt.Color(0, 102, 204));
        btnAdicionarSegunda.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btnAdicionarSegunda.setForeground(new java.awt.Color(255, 255, 255));
        btnAdicionarSegunda.setText("Adicionar");
        btnAdicionarSegunda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarSegundaActionPerformed(evt);
            }
        });

        btnRemoverSegunda.setBackground(new java.awt.Color(204, 0, 51));
        btnRemoverSegunda.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btnRemoverSegunda.setForeground(new java.awt.Color(255, 255, 255));
        btnRemoverSegunda.setText("Remover");
        btnRemoverSegunda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverSegundaActionPerformed(evt);
            }
        });

        tblTreinoSegunda.setForeground(new java.awt.Color(0, 0, 0));
        tblTreinoSegunda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Exercicio", "Series", "Repetiçoes"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblTreinoSegunda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblTreinoSegundaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblTreinoSegunda);

        btnSalvarSegunda.setBackground(new java.awt.Color(102, 102, 102));
        btnSalvarSegunda.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btnSalvarSegunda.setForeground(new java.awt.Color(255, 255, 255));
        btnSalvarSegunda.setText("Salvar treino");
        btnSalvarSegunda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarSegundaActionPerformed(evt);
            }
        });

        btnAtualizarSegunda.setBackground(new java.awt.Color(51, 102, 0));
        btnAtualizarSegunda.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btnAtualizarSegunda.setForeground(new java.awt.Color(255, 255, 255));
        btnAtualizarSegunda.setText("Atualizar");
        btnAtualizarSegunda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarSegundaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtExercicioSegunda, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtSeriesSegunda, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtRepsSegunda, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 568, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnAdicionarSegunda)
                        .addGap(18, 18, 18)
                        .addComponent(btnRemoverSegunda)
                        .addGap(18, 18, 18)
                        .addComponent(btnAtualizarSegunda))
                    .addComponent(btnSalvarSegunda))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtExercicioSegunda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtSeriesSegunda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtRepsSegunda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdicionarSegunda)
                    .addComponent(btnRemoverSegunda)
                    .addComponent(btnAtualizarSegunda))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSalvarSegunda)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Segunda", jPanel2);

        jLabel6.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel6.setText("Exercicio:");

        jLabel7.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel7.setText("Series:");

        txtSeriesTerca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSeriesTercaActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel8.setText("Repetições");

        txtRepsTerca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRepsTercaActionPerformed(evt);
            }
        });

        btnAdicionarTerca.setBackground(new java.awt.Color(0, 102, 204));
        btnAdicionarTerca.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btnAdicionarTerca.setText("Adicionar");
        btnAdicionarTerca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarTercaActionPerformed(evt);
            }
        });

        btnRemoverTerca.setBackground(new java.awt.Color(204, 0, 51));
        btnRemoverTerca.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btnRemoverTerca.setText("Remover");
        btnRemoverTerca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverTercaActionPerformed(evt);
            }
        });

        tblTreinoTerca.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Exercicio", "Series", "Repetiçoes"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblTreinoTerca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblTreinoTercaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblTreinoTerca);

        btnSalvarTerca.setBackground(new java.awt.Color(102, 102, 102));
        btnSalvarTerca.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btnSalvarTerca.setText("Salvar treino");
        btnSalvarTerca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarTercaActionPerformed(evt);
            }
        });

        btnAtualizarTerca.setBackground(new java.awt.Color(51, 102, 0));
        btnAtualizarTerca.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btnAtualizarTerca.setText("Atualizar");
        btnAtualizarTerca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarTercaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtExercicioTerca, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtSeriesTerca, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtRepsTerca, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 568, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(btnAdicionarTerca)
                        .addGap(18, 18, 18)
                        .addComponent(btnRemoverTerca)
                        .addGap(18, 18, 18)
                        .addComponent(btnAtualizarTerca))
                    .addComponent(btnSalvarTerca))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtExercicioTerca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtSeriesTerca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txtRepsTerca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdicionarTerca)
                    .addComponent(btnRemoverTerca)
                    .addComponent(btnAtualizarTerca))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSalvarTerca)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Terça", jPanel9);

        jLabel9.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel9.setText("Exercicio:");

        jLabel10.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel10.setText("Series:");

        jLabel11.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel11.setText("Repetições");

        txtRepsQuarta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRepsQuartaActionPerformed(evt);
            }
        });

        btnAdicionarQuarta.setBackground(new java.awt.Color(0, 102, 204));
        btnAdicionarQuarta.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btnAdicionarQuarta.setText("Adicionar");
        btnAdicionarQuarta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarQuartaActionPerformed(evt);
            }
        });

        btnRemoverQuarta.setBackground(new java.awt.Color(204, 0, 51));
        btnRemoverQuarta.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btnRemoverQuarta.setText("Remover");
        btnRemoverQuarta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverQuartaActionPerformed(evt);
            }
        });

        tblTreinoQuarta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Exercicio", "Series", "Repetiçoes"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblTreinoQuarta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblTreinoQuartaMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblTreinoQuarta);

        btnSalvarQuarta.setBackground(new java.awt.Color(102, 102, 102));
        btnSalvarQuarta.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btnSalvarQuarta.setText("Salvar treino");
        btnSalvarQuarta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarQuartaActionPerformed(evt);
            }
        });

        btnAtualizarQuarta.setBackground(new java.awt.Color(51, 102, 0));
        btnAtualizarQuarta.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btnAtualizarQuarta.setText("Atualizar");
        btnAtualizarQuarta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarQuartaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtExercicioQuarta, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtSeriesQuarta, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtRepsQuarta, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 568, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(btnAdicionarQuarta)
                        .addGap(18, 18, 18)
                        .addComponent(btnRemoverQuarta)
                        .addGap(18, 18, 18)
                        .addComponent(btnAtualizarQuarta))
                    .addComponent(btnSalvarQuarta))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtExercicioQuarta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(txtSeriesQuarta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(txtRepsQuarta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdicionarQuarta)
                    .addComponent(btnRemoverQuarta)
                    .addComponent(btnAtualizarQuarta))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSalvarQuarta)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Quarta", jPanel10);

        jLabel12.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel12.setText("Exercicio:");

        jLabel13.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel13.setText("Series:");

        jLabel14.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel14.setText("Repetições");

        txtRepsQuinta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRepsQuintaActionPerformed(evt);
            }
        });

        btnAdicionarQuinta.setBackground(new java.awt.Color(0, 102, 204));
        btnAdicionarQuinta.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btnAdicionarQuinta.setText("Adicionar");
        btnAdicionarQuinta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarQuintaActionPerformed(evt);
            }
        });

        btnRemoverQuinta.setBackground(new java.awt.Color(204, 0, 51));
        btnRemoverQuinta.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btnRemoverQuinta.setText("Remover");
        btnRemoverQuinta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverQuintaActionPerformed(evt);
            }
        });

        tblTreinoQuinta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Exercicio", "Series", "Repetiçoes"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblTreinoQuinta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblTreinoQuintaMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tblTreinoQuinta);

        btnSalvarQuinta.setBackground(new java.awt.Color(102, 102, 102));
        btnSalvarQuinta.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btnSalvarQuinta.setText("Salvar treino");
        btnSalvarQuinta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarQuintaActionPerformed(evt);
            }
        });

        btnAtualizarQuinta.setBackground(new java.awt.Color(51, 102, 0));
        btnAtualizarQuinta.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btnAtualizarQuinta.setText("Atualizar");
        btnAtualizarQuinta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarQuintaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtExercicioQuinta, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtSeriesQuinta, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtRepsQuinta, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 568, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(btnAdicionarQuinta)
                        .addGap(18, 18, 18)
                        .addComponent(btnRemoverQuinta)
                        .addGap(18, 18, 18)
                        .addComponent(btnAtualizarQuinta))
                    .addComponent(btnSalvarQuinta))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtExercicioQuinta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(txtSeriesQuinta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(txtRepsQuinta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdicionarQuinta)
                    .addComponent(btnRemoverQuinta)
                    .addComponent(btnAtualizarQuinta))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSalvarQuinta)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Quinta", jPanel11);

        jLabel15.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel15.setText("Exercicio:");

        jLabel16.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel16.setText("Series:");

        jLabel17.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel17.setText("Repetições");

        txtRepsSexta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRepsSextaActionPerformed(evt);
            }
        });

        btnAdicionarSexta.setBackground(new java.awt.Color(0, 102, 204));
        btnAdicionarSexta.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btnAdicionarSexta.setText("Adicionar");
        btnAdicionarSexta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarSextaActionPerformed(evt);
            }
        });

        btnRemoverSexta.setBackground(new java.awt.Color(204, 0, 51));
        btnRemoverSexta.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btnRemoverSexta.setText("Remover");
        btnRemoverSexta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverSextaActionPerformed(evt);
            }
        });

        tblTreinoSexta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Exercicio", "Series", "Repetiçoes"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblTreinoSexta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblTreinoSextaMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(tblTreinoSexta);

        btnSalvarSexta.setBackground(new java.awt.Color(102, 102, 102));
        btnSalvarSexta.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btnSalvarSexta.setText("Salvar treino");
        btnSalvarSexta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarSextaActionPerformed(evt);
            }
        });

        btnAtualizarSexta.setBackground(new java.awt.Color(51, 102, 0));
        btnAtualizarSexta.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btnAtualizarSexta.setText("Atualizar");
        btnAtualizarSexta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarSextaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtExercicioSexta, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtSeriesSexta, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtRepsSexta, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 568, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(btnAdicionarSexta)
                        .addGap(18, 18, 18)
                        .addComponent(btnRemoverSexta)
                        .addGap(18, 18, 18)
                        .addComponent(btnAtualizarSexta))
                    .addComponent(btnSalvarSexta))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txtExercicioSexta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(txtSeriesSexta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(txtRepsSexta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdicionarSexta)
                    .addComponent(btnRemoverSexta)
                    .addComponent(btnAtualizarSexta))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSalvarSexta)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Sexta", jPanel12);

        jLabel18.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel18.setText("Exercicio:");

        jLabel19.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel19.setText("Series:");

        jLabel20.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel20.setText("Repetições");

        txtRepsSabado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRepsSabadoActionPerformed(evt);
            }
        });

        btnAdicionarSabado.setBackground(new java.awt.Color(0, 102, 204));
        btnAdicionarSabado.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btnAdicionarSabado.setText("Adicionar");
        btnAdicionarSabado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarSabadoActionPerformed(evt);
            }
        });

        btnRemoverSabado.setBackground(new java.awt.Color(204, 0, 51));
        btnRemoverSabado.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btnRemoverSabado.setText("Remover");
        btnRemoverSabado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverSabadoActionPerformed(evt);
            }
        });

        tblTreinoSabado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Exercicio", "Series", "Repetiçoes"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblTreinoSabado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblTreinoSabadoMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(tblTreinoSabado);

        btnSalvarSabado.setBackground(new java.awt.Color(102, 102, 102));
        btnSalvarSabado.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btnSalvarSabado.setText("Salvar treino");
        btnSalvarSabado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarSabadoActionPerformed(evt);
            }
        });

        btnAtualizarSabado.setBackground(new java.awt.Color(51, 102, 0));
        btnAtualizarSabado.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btnAtualizarSabado.setText("Atualizar");
        btnAtualizarSabado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarSabadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtExercicioSabado, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtSeriesSabado, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel20)
                        .addGap(12, 12, 12)
                        .addComponent(txtRepsSabado, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 568, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(btnAdicionarSabado)
                        .addGap(18, 18, 18)
                        .addComponent(btnRemoverSabado)
                        .addGap(18, 18, 18)
                        .addComponent(btnAtualizarSabado))
                    .addComponent(btnSalvarSabado))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(txtExercicioSabado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19)
                    .addComponent(txtSeriesSabado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20)
                    .addComponent(txtRepsSabado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdicionarSabado)
                    .addComponent(btnRemoverSabado)
                    .addComponent(btnAtualizarSabado))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSalvarSabado)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Sábado", jPanel13);

        jLabel21.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel21.setText("Exercicio:");

        jLabel22.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel22.setText("Series:");

        jLabel23.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel23.setText("Repetições");

        txtRepsDomingo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRepsDomingoActionPerformed(evt);
            }
        });

        btnAdicionarDomingo.setBackground(new java.awt.Color(0, 102, 204));
        btnAdicionarDomingo.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btnAdicionarDomingo.setText("Adicionar");
        btnAdicionarDomingo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarDomingoActionPerformed(evt);
            }
        });

        btnRemoverDomingo.setBackground(new java.awt.Color(204, 0, 51));
        btnRemoverDomingo.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btnRemoverDomingo.setText("Remover");
        btnRemoverDomingo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverDomingoActionPerformed(evt);
            }
        });

        tblTreinoDomingo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Exercicios", "Series", "Repetições"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblTreinoDomingo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblTreinoDomingoMouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(tblTreinoDomingo);

        btnSalvarDomingo.setBackground(new java.awt.Color(102, 102, 102));
        btnSalvarDomingo.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btnSalvarDomingo.setText("Salvar treino");
        btnSalvarDomingo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarDomingoActionPerformed(evt);
            }
        });

        btnAtualizarDomingo.setBackground(new java.awt.Color(51, 102, 0));
        btnAtualizarDomingo.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btnAtualizarDomingo.setText("Atualizar");
        btnAtualizarDomingo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarDomingoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtExercicioDomingo, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtSeriesDomingo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtRepsDomingo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 568, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(btnAdicionarDomingo)
                        .addGap(18, 18, 18)
                        .addComponent(btnRemoverDomingo)
                        .addGap(18, 18, 18)
                        .addComponent(btnAtualizarDomingo))
                    .addComponent(btnSalvarDomingo))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(txtExercicioDomingo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22)
                    .addComponent(txtSeriesDomingo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23)
                    .addComponent(txtRepsDomingo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdicionarDomingo)
                    .addComponent(btnRemoverDomingo)
                    .addComponent(btnAtualizarDomingo))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSalvarDomingo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Domingo", jPanel14);

        lblAlunoSelecionado.setForeground(new java.awt.Color(0, 0, 0));
        lblAlunoSelecionado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAlunoSelecionado.setText("Digite o nome do aluno:");

        txtBuscaRapida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscaRapidaActionPerformed(evt);
            }
        });
        txtBuscaRapida.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscaRapidaKeyReleased(evt);
            }
        });

        tabelaResultados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id_cliente", "Nome", "CPF"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tabelaResultados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaResultadosMouseClicked(evt);
            }
        });
        jScrollPane8.setViewportView(tabelaResultados);
        if (tabelaResultados.getColumnModel().getColumnCount() > 0) {
            tabelaResultados.getColumnModel().getColumn(0).setMinWidth(0);
            tabelaResultados.getColumnModel().getColumn(0).setPreferredWidth(0);
            tabelaResultados.getColumnModel().getColumn(0).setMaxWidth(0);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTabbedPane1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(lblAlunoSelecionado, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addComponent(txtBuscaRapida, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblAlunoSelecionado)
                        .addGap(18, 18, 18)
                        .addComponent(txtBuscaRapida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private int idClienteSelecionado = -1;
    
    private void txtBuscaRapidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscaRapidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscaRapidaActionPerformed

    private void btnAtualizarSegundaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarSegundaActionPerformed
        
        int linha = tblTreinoSegunda.getSelectedRow();
        if (linha != -1) {
            tblTreinoSegunda.setValueAt(txtExercicioSegunda.getText(), linha, 0);
            tblTreinoSegunda.setValueAt(txtSeriesSegunda.getText(), linha, 1);
            tblTreinoSegunda.setValueAt(txtRepsSegunda.getText(), linha, 2);
        }
    }//GEN-LAST:event_btnAtualizarSegundaActionPerformed

    private void tblTreinoSegundaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblTreinoSegundaMouseClicked
        int linhaSelecionada = tblTreinoSegunda.getSelectedRow();

        if (linhaSelecionada != -1) {

            String exercicio = tblTreinoSegunda.getValueAt(linhaSelecionada, 0).toString();
            String series = tblTreinoSegunda.getValueAt(linhaSelecionada, 1).toString();
            String repeticoes = tblTreinoSegunda.getValueAt(linhaSelecionada, 2).toString();

            txtExercicioSegunda.setText(exercicio);
            txtSeriesSegunda.setText(series);
            txtRepsSegunda.setText(repeticoes);
        }
    }//GEN-LAST:event_tblTreinoSegundaMouseClicked

    private void btnRemoverSegundaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverSegundaActionPerformed
        int linhaSelecionada = tblTreinoSegunda.getSelectedRow();

        if (linhaSelecionada != -1) {

            javax.swing.table.DefaultTableModel modelo = (javax.swing.table.DefaultTableModel) tblTreinoSegunda.getModel();

            modelo.removeRow(linhaSelecionada);

            txtExercicioSegunda.setText("");
            txtSeriesSegunda.setText("");
            txtRepsSegunda.setText("");

        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "Selecione um exercício na tabela para remover.");
        }
    }//GEN-LAST:event_btnRemoverSegundaActionPerformed

    private void btnAdicionarSegundaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarSegundaActionPerformed
        // 1. Pegar os textos que o instrutor digitou nos campos da segunda-feira
        String exercicio = txtExercicioSegunda.getText(); // ou .getSelectedItem().toString() se for ComboBox
        String series = txtSeriesSegunda.getText();
        String reps = txtRepsSegunda.getText();

        // Validação simples: Não deixa adicionar se o nome do exercício estiver vazio
        if (exercicio.trim().isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Por favor, digite o nome do exercício!");
            return; // Para a execução aqui
        }

        // 2. Capturar o modelo de dados da tabela de Segunda-feira
        javax.swing.table.DefaultTableModel modelo = (javax.swing.table.DefaultTableModel) tblTreinoSegunda.getModel();

        // 3. Adicionar a nova linha com as informações capturadas
        modelo.addRow(new Object[]{exercicio, series, reps});
        
        tblTreinoSegunda.revalidate(); // Força o Java a recalcular o layout da tabela
        tblTreinoSegunda.repaint();

        // 4. Limpar os campos de texto para o instrutor digitar o próximo exercício
        txtExercicioSegunda.setText("");
        txtSeriesSegunda.setText("");
        txtRepsSegunda.setText("");

        // Coloca o cursor do teclado de volta no campo do exercício automaticamente
        txtExercicioSegunda.requestFocus();
    }//GEN-LAST:event_btnAdicionarSegundaActionPerformed

    private void txtRepsSegundaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRepsSegundaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRepsSegundaActionPerformed

    private void txtRepsTercaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRepsTercaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRepsTercaActionPerformed

    private void btnAdicionarTercaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarTercaActionPerformed
        // 1. Pegar os textos que o instrutor digitou nos campos da segunda-feira
        String exercicio = txtExercicioTerca.getText(); // ou .getSelectedItem().toString() se for ComboBox
        String series = txtSeriesTerca.getText();
        String reps = txtRepsTerca.getText();

        // Validação simples: Não deixa adicionar se o nome do exercício estiver vazio
        if (exercicio.trim().isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Por favor, digite o nome do exercício!");
            return; // Para a execução aqui
        }

        // 2. Capturar o modelo de dados da tabela de Segunda-feira
        javax.swing.table.DefaultTableModel modelo = (javax.swing.table.DefaultTableModel) tblTreinoTerca.getModel();

        // 3. Adicionar a nova linha com as informações capturadas
        modelo.addRow(new Object[]{exercicio, series, reps});

        // 4. Limpar os campos de texto para o instrutor digitar o próximo exercício
        txtExercicioTerca.setText("");
        txtSeriesTerca.setText("");
        txtRepsTerca.setText("");

        // Coloca o cursor do teclado de volta no campo do exercício automaticamente
        txtExercicioTerca.requestFocus();
    }//GEN-LAST:event_btnAdicionarTercaActionPerformed

    private void btnRemoverTercaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverTercaActionPerformed
        int linhaSelecionada = tblTreinoTerca.getSelectedRow();

        if (linhaSelecionada != -1) {

            javax.swing.table.DefaultTableModel modelo = (javax.swing.table.DefaultTableModel) tblTreinoTerca.getModel();

            modelo.removeRow(linhaSelecionada);

            txtExercicioTerca.setText("");
            txtSeriesTerca.setText("");
            txtRepsTerca.setText("");

        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "Selecione um exercício na tabela para remover.");
        }
    }//GEN-LAST:event_btnRemoverTercaActionPerformed

    private void tblTreinoTercaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblTreinoTercaMouseClicked
        int linhaSelecionada = tblTreinoTerca.getSelectedRow();

        if (linhaSelecionada != -1) {

            String exercicio = tblTreinoTerca.getValueAt(linhaSelecionada, 0).toString();
            String series = tblTreinoTerca.getValueAt(linhaSelecionada, 1).toString();
            String repeticoes = tblTreinoTerca.getValueAt(linhaSelecionada, 2).toString();

            txtExercicioTerca.setText(exercicio);
            txtSeriesTerca.setText(series);
            txtRepsTerca.setText(repeticoes);
        }
    }//GEN-LAST:event_tblTreinoTercaMouseClicked

    private void btnAtualizarTercaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarTercaActionPerformed
        
        int linha = tblTreinoTerca.getSelectedRow();
        if (linha != -1) {
            tblTreinoTerca.setValueAt(txtExercicioTerca.getText(), linha, 0);
            tblTreinoTerca.setValueAt(txtSeriesTerca.getText(), linha, 1);
            tblTreinoTerca.setValueAt(txtRepsTerca.getText(), linha, 2);
        }
    }//GEN-LAST:event_btnAtualizarTercaActionPerformed

    private void txtRepsQuartaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRepsQuartaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRepsQuartaActionPerformed

    private void btnAdicionarQuartaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarQuartaActionPerformed
        // 1. Pegar os textos que o instrutor digitou nos campos da segunda-feira
        String exercicio = txtExercicioQuarta.getText(); // ou .getSelectedItem().toString() se for ComboBox
        String series = txtSeriesQuarta.getText();
        String reps = txtRepsQuarta.getText();

        // Validação simples: Não deixa adicionar se o nome do exercício estiver vazio
        if (exercicio.trim().isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Por favor, digite o nome do exercício!");
            return; // Para a execução aqui
        }

        // 2. Capturar o modelo de dados da tabela de Segunda-feira
        javax.swing.table.DefaultTableModel modelo = (javax.swing.table.DefaultTableModel) tblTreinoQuarta.getModel();

        // 3. Adicionar a nova linha com as informações capturadas
        modelo.addRow(new Object[]{exercicio, series, reps});

        // 4. Limpar os campos de texto para o instrutor digitar o próximo exercício
        txtExercicioQuarta.setText("");
        txtSeriesQuarta.setText("");
        txtRepsQuarta.setText("");

        // Coloca o cursor do teclado de volta no campo do exercício automaticamente
        txtExercicioQuarta.requestFocus();
    }//GEN-LAST:event_btnAdicionarQuartaActionPerformed

    private void btnRemoverQuartaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverQuartaActionPerformed
        int linhaSelecionada = tblTreinoQuarta.getSelectedRow();

        if (linhaSelecionada != -1) {

            javax.swing.table.DefaultTableModel modelo = (javax.swing.table.DefaultTableModel) tblTreinoQuarta.getModel();

            modelo.removeRow(linhaSelecionada);

            txtExercicioQuarta.setText("");
            txtSeriesQuarta.setText("");
            txtRepsQuarta.setText("");

        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "Selecione um exercício na tabela para remover.");
        }
    }//GEN-LAST:event_btnRemoverQuartaActionPerformed

    private void tblTreinoQuartaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblTreinoQuartaMouseClicked
        int linhaSelecionada = tblTreinoQuarta.getSelectedRow();

        if (linhaSelecionada != -1) {

            String exercicio = tblTreinoQuarta.getValueAt(linhaSelecionada, 0).toString();
            String series = tblTreinoQuarta.getValueAt(linhaSelecionada, 1).toString();
            String repeticoes = tblTreinoQuarta.getValueAt(linhaSelecionada, 2).toString();

            txtExercicioQuarta.setText(exercicio);
            txtSeriesQuarta.setText(series);
            txtRepsQuarta.setText(repeticoes);
        }
    }//GEN-LAST:event_tblTreinoQuartaMouseClicked

    private void btnAtualizarQuartaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarQuartaActionPerformed
        
        int linha = tblTreinoQuarta.getSelectedRow();
        if (linha != -1) {
            tblTreinoQuarta.setValueAt(txtExercicioQuarta.getText(), linha, 0);
            tblTreinoQuarta.setValueAt(txtSeriesQuarta.getText(), linha, 1);
            tblTreinoQuarta.setValueAt(txtRepsQuarta.getText(), linha, 2);
        }
    }//GEN-LAST:event_btnAtualizarQuartaActionPerformed

    private void txtRepsQuintaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRepsQuintaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRepsQuintaActionPerformed

    private void btnAdicionarQuintaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarQuintaActionPerformed

        String exercicio = txtExercicioQuinta.getText(); 
        String series = txtSeriesQuinta.getText();
        String reps = txtRepsQuinta.getText();

        if (exercicio.trim().isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Por favor, digite o nome do exercício!");
            return; // Para a execução aqui
        }

        javax.swing.table.DefaultTableModel modelo = (javax.swing.table.DefaultTableModel) tblTreinoQuinta.getModel();

        modelo.addRow(new Object[]{exercicio, series, reps});

        txtExercicioQuinta.setText("");
        txtSeriesQuinta.setText("");
        txtRepsQuinta.setText("");
    
        txtExercicioQuinta.requestFocus();
    }//GEN-LAST:event_btnAdicionarQuintaActionPerformed

    private void btnRemoverQuintaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverQuintaActionPerformed
        int linhaSelecionada = tblTreinoQuinta.getSelectedRow();

        if (linhaSelecionada != -1) {

            javax.swing.table.DefaultTableModel modelo = (javax.swing.table.DefaultTableModel) tblTreinoQuinta.getModel();

            modelo.removeRow(linhaSelecionada);

            txtExercicioQuinta.setText("");
            txtSeriesQuinta.setText("");
            txtRepsQuinta.setText("");

        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "Selecione um exercício na tabela para remover.");
        }
    }//GEN-LAST:event_btnRemoverQuintaActionPerformed

    private void tblTreinoQuintaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblTreinoQuintaMouseClicked
        int linhaSelecionada = tblTreinoQuinta.getSelectedRow();

        if (linhaSelecionada != -1) {

            String exercicio = tblTreinoQuinta.getValueAt(linhaSelecionada, 0).toString();
            String series = tblTreinoQuinta.getValueAt(linhaSelecionada, 1).toString();
            String repeticoes = tblTreinoQuinta.getValueAt(linhaSelecionada, 2).toString();

            txtExercicioQuinta.setText(exercicio);
            txtSeriesQuinta.setText(series);
            txtRepsQuinta.setText(repeticoes);
        }
    }//GEN-LAST:event_tblTreinoQuintaMouseClicked

    private void btnAtualizarQuintaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarQuintaActionPerformed
        
        int linha = tblTreinoQuinta.getSelectedRow();
        if (linha != -1) {
            tblTreinoQuinta.setValueAt(txtExercicioQuinta.getText(), linha, 0);
            tblTreinoQuinta.setValueAt(txtSeriesQuinta.getText(), linha, 1);
            tblTreinoQuinta.setValueAt(txtRepsQuinta.getText(), linha, 2);
        }
    }//GEN-LAST:event_btnAtualizarQuintaActionPerformed

    private void txtRepsSextaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRepsSextaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRepsSextaActionPerformed

    private void btnAdicionarSextaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarSextaActionPerformed
        String exercicio = txtExercicioSexta.getText(); 
        String series = txtSeriesSexta.getText();
        String reps = txtRepsSexta.getText();

        if (exercicio.trim().isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Por favor, digite o nome do exercício!");
            return;
        }

        javax.swing.table.DefaultTableModel modelo = (javax.swing.table.DefaultTableModel) tblTreinoSexta.getModel();

        modelo.addRow(new Object[]{exercicio, series, reps});

        txtExercicioSexta.setText("");
        txtSeriesSexta.setText("");
        txtRepsSexta.setText("");
    
        txtExercicioSexta.requestFocus();
    }//GEN-LAST:event_btnAdicionarSextaActionPerformed

    private void btnRemoverSextaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverSextaActionPerformed
        int linhaSelecionada = tblTreinoSexta.getSelectedRow();

        if (linhaSelecionada != -1) {

            javax.swing.table.DefaultTableModel modelo = (javax.swing.table.DefaultTableModel) tblTreinoSexta.getModel();

            modelo.removeRow(linhaSelecionada);

            txtExercicioSexta.setText("");
            txtSeriesSexta.setText("");
            txtRepsSexta.setText("");

        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "Selecione um exercício na tabela para remover.");
        }
    }//GEN-LAST:event_btnRemoverSextaActionPerformed

    private void tblTreinoSextaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblTreinoSextaMouseClicked
        int linhaSelecionada = tblTreinoSexta.getSelectedRow();

        if (linhaSelecionada != -1) {

            String exercicio = tblTreinoSexta.getValueAt(linhaSelecionada, 0).toString();
            String series = tblTreinoSexta.getValueAt(linhaSelecionada, 1).toString();
            String repeticoes = tblTreinoSexta.getValueAt(linhaSelecionada, 2).toString();

            txtExercicioSexta.setText(exercicio);
            txtSeriesSexta.setText(series);
            txtRepsSexta.setText(repeticoes);
        }
    }//GEN-LAST:event_tblTreinoSextaMouseClicked

    private void btnAtualizarSextaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarSextaActionPerformed
        
        int linha = tblTreinoSexta.getSelectedRow();
        if (linha != -1) {
            tblTreinoSexta.setValueAt(txtExercicioSexta.getText(), linha, 0);
            tblTreinoSexta.setValueAt(txtSeriesSexta.getText(), linha, 1);
            tblTreinoSexta.setValueAt(txtRepsSexta.getText(), linha, 2);
        }
    }//GEN-LAST:event_btnAtualizarSextaActionPerformed

    private void txtRepsSabadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRepsSabadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRepsSabadoActionPerformed

    private void btnAdicionarSabadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarSabadoActionPerformed
        String exercicio = txtExercicioSabado.getText(); 
        String series = txtSeriesSabado.getText();
        String reps = txtRepsSabado.getText();

        if (exercicio.trim().isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Por favor, digite o nome do exercício!");
            return; // Para a execução aqui
        }

        javax.swing.table.DefaultTableModel modelo = (javax.swing.table.DefaultTableModel) tblTreinoSabado.getModel();

        modelo.addRow(new Object[]{exercicio, series, reps});

        txtExercicioSabado.setText("");
        txtSeriesSabado.setText("");
        txtRepsSabado.setText("");
    
        txtExercicioSabado.requestFocus();
    }//GEN-LAST:event_btnAdicionarSabadoActionPerformed

    private void btnRemoverSabadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverSabadoActionPerformed
        int linhaSelecionada = tblTreinoSabado.getSelectedRow();

        if (linhaSelecionada != -1) {

            javax.swing.table.DefaultTableModel modelo = (javax.swing.table.DefaultTableModel) tblTreinoSabado.getModel();

            modelo.removeRow(linhaSelecionada);

            txtExercicioSabado.setText("");
            txtSeriesSabado.setText("");
            txtRepsSabado.setText("");

        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "Selecione um exercício na tabela para remover.");
        }
    }//GEN-LAST:event_btnRemoverSabadoActionPerformed

    private void tblTreinoSabadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblTreinoSabadoMouseClicked
        int linhaSelecionada = tblTreinoSabado.getSelectedRow();

        if (linhaSelecionada != -1) {

            String exercicio = tblTreinoSabado.getValueAt(linhaSelecionada, 0).toString();
            String series = tblTreinoSabado.getValueAt(linhaSelecionada, 1).toString();
            String repeticoes = tblTreinoSabado.getValueAt(linhaSelecionada, 2).toString();

            txtExercicioSabado.setText(exercicio);
            txtSeriesSabado.setText(series);
            txtRepsSabado.setText(repeticoes);
        }
    }//GEN-LAST:event_tblTreinoSabadoMouseClicked

    private void btnAtualizarSabadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarSabadoActionPerformed

        int linha = tblTreinoSabado.getSelectedRow();
        if (linha != -1) {
            tblTreinoSabado.setValueAt(txtExercicioSabado.getText(), linha, 0);
            tblTreinoSabado.setValueAt(txtSeriesSabado.getText(), linha, 1);
            tblTreinoSabado.setValueAt(txtRepsSabado.getText(), linha, 2);
        }
    }//GEN-LAST:event_btnAtualizarSabadoActionPerformed

    private void txtRepsDomingoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRepsDomingoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRepsDomingoActionPerformed

    private void btnAdicionarDomingoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarDomingoActionPerformed
        String exercicio = txtExercicioDomingo.getText(); 
        String series = txtSeriesDomingo.getText();
        String reps = txtRepsDomingo.getText();

        if (exercicio.trim().isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Por favor, digite o nome do exercício!");
            return; // Para a execução aqui
        }

        javax.swing.table.DefaultTableModel modelo = (javax.swing.table.DefaultTableModel) tblTreinoDomingo.getModel();

        modelo.addRow(new Object[]{exercicio, series, reps});

        txtExercicioDomingo.setText("");
        txtSeriesDomingo.setText("");
        txtRepsDomingo.setText("");
    
        txtExercicioDomingo.requestFocus();
    }//GEN-LAST:event_btnAdicionarDomingoActionPerformed

    private void btnRemoverDomingoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverDomingoActionPerformed
        int linhaSelecionada = tblTreinoDomingo.getSelectedRow();

        if (linhaSelecionada != -1) {

            javax.swing.table.DefaultTableModel modelo = (javax.swing.table.DefaultTableModel) tblTreinoDomingo.getModel();

            modelo.removeRow(linhaSelecionada);

            txtExercicioDomingo.setText("");
            txtSeriesDomingo.setText("");
            txtRepsDomingo.setText("");

        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "Selecione um exercício na tabela para remover.");
        }
    }//GEN-LAST:event_btnRemoverDomingoActionPerformed

    private void tblTreinoDomingoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblTreinoDomingoMouseClicked
        int linhaSelecionada = tblTreinoDomingo.getSelectedRow();

        if (linhaSelecionada != -1) {

            String exercicio = tblTreinoDomingo.getValueAt(linhaSelecionada, 0).toString();
            String series = tblTreinoDomingo.getValueAt(linhaSelecionada, 1).toString();
            String repeticoes = tblTreinoDomingo.getValueAt(linhaSelecionada, 2).toString();

            txtExercicioDomingo.setText(exercicio);
            txtSeriesDomingo.setText(series);
            txtRepsDomingo.setText(repeticoes);
        }
    }//GEN-LAST:event_tblTreinoDomingoMouseClicked

    private void btnAtualizarDomingoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarDomingoActionPerformed

        int linha = tblTreinoDomingo.getSelectedRow();
        if (linha != -1) {
            tblTreinoDomingo.setValueAt(txtExercicioDomingo.getText(), linha, 0);
            tblTreinoDomingo.setValueAt(txtSeriesDomingo.getText(), linha, 1);
            tblTreinoDomingo.setValueAt(txtRepsDomingo.getText(), linha, 2);
        }
    }//GEN-LAST:event_btnAtualizarDomingoActionPerformed

    private void txtSeriesTercaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSeriesTercaActionPerformed
    }//GEN-LAST:event_txtSeriesTercaActionPerformed

    private void txtExercicioSegundaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtExercicioSegundaActionPerformed
    }//GEN-LAST:event_txtExercicioSegundaActionPerformed

    private void txtSeriesSegundaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSeriesSegundaActionPerformed
    }//GEN-LAST:event_txtSeriesSegundaActionPerformed

    private void txtBuscaRapidaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscaRapidaKeyReleased
        buscarAlunoFiltro(txtBuscaRapida.getText().trim());
    }//GEN-LAST:event_txtBuscaRapidaKeyReleased

    private void tabelaResultadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaResultadosMouseClicked
        int linha = tabelaResultados.getSelectedRow();
            if (linha != -1) {
            idClienteSelecionado = Integer.parseInt(tabelaResultados.getValueAt(linha, 0).toString());
            String nomeAluno = tabelaResultados.getValueAt(linha, 1).toString();

            lblAlunoSelecionado.setText("Aluno Selecionado");
            lblAlunoSelecionado.setForeground(new java.awt.Color(0, 102, 51)); 
        
            // AGORA SIM! Carrega os treinos do aluno clicado para todas as abas:
            carregarTreinos("Segunda", tblTreinoSegunda);
            carregarTreinos("Terca", tblTreinoTerca);
            carregarTreinos("Quarta", tblTreinoQuarta);
            carregarTreinos("Quinta", tblTreinoQuinta);
            carregarTreinos("Sexta", tblTreinoSexta);
            carregarTreinos("Sabado", tblTreinoSabado);
            carregarTreinos("Domingo", tblTreinoDomingo); 
            }
    }//GEN-LAST:event_tabelaResultadosMouseClicked

    private void btnSalvarSegundaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarSegundaActionPerformed
    salvarTreinoDoDia("Segunda", tblTreinoSegunda);
    }//GEN-LAST:event_btnSalvarSegundaActionPerformed

    private void btnSalvarTercaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarTercaActionPerformed
    salvarTreinoDoDia("Terça", tblTreinoTerca);
    }//GEN-LAST:event_btnSalvarTercaActionPerformed

    private void btnSalvarQuartaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarQuartaActionPerformed
    salvarTreinoDoDia("Quarta", tblTreinoQuarta);
    }//GEN-LAST:event_btnSalvarQuartaActionPerformed

    private void btnSalvarQuintaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarQuintaActionPerformed
    salvarTreinoDoDia("Quinta", tblTreinoQuinta);
    }//GEN-LAST:event_btnSalvarQuintaActionPerformed

    private void btnSalvarSextaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarSextaActionPerformed
    salvarTreinoDoDia("Sexta", tblTreinoSexta);
    }//GEN-LAST:event_btnSalvarSextaActionPerformed

    private void btnSalvarSabadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarSabadoActionPerformed
    salvarTreinoDoDia("Sabado", tblTreinoSabado);
    }//GEN-LAST:event_btnSalvarSabadoActionPerformed

    private void btnSalvarDomingoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarDomingoActionPerformed
    salvarTreinoDoDia("Domingo", tblTreinoDomingo);
    }//GEN-LAST:event_btnSalvarDomingoActionPerformed

    private void buscarAlunoFiltro(String pesquisa) {
        DefaultTableModel modelo = (DefaultTableModel) tabelaResultados.getModel();
        modelo.setNumRows(0); // Limpa a tabela antes de buscar

        // Busca tanto por parte do nome quanto por parte do CPF
        String sql = "SELECT id, nome, cpf FROM clientes WHERE nome LIKE ? OR cpf LIKE ? LIMIT 10";

        try {
            Mysql.ConexaoSB conexao = new Mysql.ConexaoSB();
            java.sql.Connection conn = conexao.conectar();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
        
            pst.setString(1, "%" + pesquisa + "%");
            pst.setString(2, "%" + pesquisa + "%");
        
            java.sql.ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                modelo.addRow(new Object[]{
                    rs.getInt("id"),
                    rs.getString("nome"),
                    rs.getString("cpf")
                });
            }
        
         pst.close();
            conn.close();
        } catch (Exception e) {
            System.out.println("Erro ao filtrar aluno: " + e.getMessage());
        }
    }
      
    private void carregarTreinos(String dia, javax.swing.JTable tabela) {
    // 1. Limpa a tabela antes de carregar (evita duplicados)
    javax.swing.table.DefaultTableModel modelo = (javax.swing.table.DefaultTableModel) tabela.getModel();
    modelo.setRowCount(0);

    // 2. Conexão e Busca no Banco
    ConexaoSB conexao = new ConexaoSB();
    java.sql.Connection conn = conexao.conectar();
    
    // O SQL busca os exercícios daquele dia específico e daquele cliente específico
    String sql = "SELECT exercicio, series, repeticoes FROM fichas_treino WHERE cliente_id = ? AND dia_semana = ?";
    
    try {
        java.sql.PreparedStatement pst = conn.prepareStatement(sql);

        // Adicione o ID do cliente aqui (Parâmetro 1)
        pst.setInt(1, idClienteSelecionado); 
        // O dia da semana (Parâmetro 2)
        pst.setString(2, dia);

        java.sql.ResultSet rs = pst.executeQuery();
        // ... resto do código continua igual
        
        // 3. Preenche a tabela com os resultados
        while (rs.next()) {
            modelo.addRow(new Object[]{
                rs.getString("exercicio"), 
                rs.getString("series"), 
                rs.getString("repeticoes")
            });
        }
        
        pst.close();
        rs.close();
        
    } catch (java.sql.SQLException e) {
        javax.swing.JOptionPane.showMessageDialog(this, "Erro ao carregar dados: " + e.getMessage());
    } finally {
        try {
            if (conn != null) conn.close();
        } catch (java.sql.SQLException e) {
            System.out.println("Erro ao fechar conexão: " + e.getMessage());
        }
    }
}
    
    private void salvarTreinoDoDia(String diaDaSemana, javax.swing.JTable tabelaDoDia) {
    if (idClienteSelecionado == -1) {
        javax.swing.JOptionPane.showMessageDialog(this, "Por favor, selecione um aluno na busca antes de salvar o treino.");
        return;
    }

    ConexaoSB conexao = new ConexaoSB();
    java.sql.Connection conn = conexao.conectar();

    try {
        // 1. Limpa o treino antigo desse dia para este cliente específico
        String sqlDelete = "DELETE FROM fichas_treino WHERE cliente_id = ? AND dia_semana = ?";
        java.sql.PreparedStatement pstDel = conn.prepareStatement(sqlDelete);
        pstDel.setInt(1, idClienteSelecionado);
        pstDel.setString(2, diaDaSemana);
        pstDel.executeUpdate();
        pstDel.close();

        // 2. Se a tabela não estiver vazia, salva os exercícios novos
        int totalLinhas = tabelaDoDia.getRowCount();
        if (totalLinhas > 0) {
            String sqlInsert = "INSERT INTO fichas_treino (cliente_id, dia_semana, exercicio, series, repeticoes) VALUES (?, ?, ?, ?, ?)";
            java.sql.PreparedStatement pstIns = conn.prepareStatement(sqlInsert);

            // Roda um laço passando por cada linha da JTable e enviando pro banco
            for (int i = 0; i < totalLinhas; i++) {
                pstIns.setInt(1, idClienteSelecionado);
                pstIns.setString(2, diaDaSemana);
                pstIns.setString(3, tabelaDoDia.getValueAt(i, 0).toString()); // Coluna 0 = Exercicio
                pstIns.setString(4, tabelaDoDia.getValueAt(i, 1).toString()); // Coluna 1 = Series
                pstIns.setString(5, tabelaDoDia.getValueAt(i, 2).toString()); // Coluna 2 = Repetições
                pstIns.executeUpdate();
            }
            pstIns.close();
        }

        javax.swing.JOptionPane.showMessageDialog(this, "Treino de " + diaDaSemana + " salvo com sucesso!");

    } catch (java.sql.SQLException e) {
        javax.swing.JOptionPane.showMessageDialog(this, "Erro ao salvar treino: " + e.getMessage());
    } finally {
        try {
            if (conn != null) conn.close();
        } catch (java.sql.SQLException e) {
            System.out.println("Erro ao fechar conexão: " + e.getMessage());
        }
    }
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionarDomingo;
    private javax.swing.JButton btnAdicionarQuarta;
    private javax.swing.JButton btnAdicionarQuinta;
    private javax.swing.JButton btnAdicionarSabado;
    private javax.swing.JButton btnAdicionarSegunda;
    private javax.swing.JButton btnAdicionarSexta;
    private javax.swing.JButton btnAdicionarTerca;
    private javax.swing.JButton btnAtualizarDomingo;
    private javax.swing.JButton btnAtualizarQuarta;
    private javax.swing.JButton btnAtualizarQuinta;
    private javax.swing.JButton btnAtualizarSabado;
    private javax.swing.JButton btnAtualizarSegunda;
    private javax.swing.JButton btnAtualizarSexta;
    private javax.swing.JButton btnAtualizarTerca;
    private javax.swing.JButton btnRemoverDomingo;
    private javax.swing.JButton btnRemoverQuarta;
    private javax.swing.JButton btnRemoverQuinta;
    private javax.swing.JButton btnRemoverSabado;
    private javax.swing.JButton btnRemoverSegunda;
    private javax.swing.JButton btnRemoverSexta;
    private javax.swing.JButton btnRemoverTerca;
    private javax.swing.JButton btnSalvarDomingo;
    private javax.swing.JButton btnSalvarQuarta;
    private javax.swing.JButton btnSalvarQuinta;
    private javax.swing.JButton btnSalvarSabado;
    private javax.swing.JButton btnSalvarSegunda;
    private javax.swing.JButton btnSalvarSexta;
    private javax.swing.JButton btnSalvarTerca;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblAlunoSelecionado;
    private javax.swing.JTable tabelaResultados;
    private javax.swing.JTable tblTreinoDomingo;
    private javax.swing.JTable tblTreinoQuarta;
    private javax.swing.JTable tblTreinoQuinta;
    private javax.swing.JTable tblTreinoSabado;
    private javax.swing.JTable tblTreinoSegunda;
    private javax.swing.JTable tblTreinoSexta;
    private javax.swing.JTable tblTreinoTerca;
    private javax.swing.JTextField txtBuscaRapida;
    private javax.swing.JTextField txtExercicioDomingo;
    private javax.swing.JTextField txtExercicioQuarta;
    private javax.swing.JTextField txtExercicioQuinta;
    private javax.swing.JTextField txtExercicioSabado;
    private javax.swing.JTextField txtExercicioSegunda;
    private javax.swing.JTextField txtExercicioSexta;
    private javax.swing.JTextField txtExercicioTerca;
    private javax.swing.JTextField txtRepsDomingo;
    private javax.swing.JTextField txtRepsQuarta;
    private javax.swing.JTextField txtRepsQuinta;
    private javax.swing.JTextField txtRepsSabado;
    private javax.swing.JTextField txtRepsSegunda;
    private javax.swing.JTextField txtRepsSexta;
    private javax.swing.JTextField txtRepsTerca;
    private javax.swing.JTextField txtSeriesDomingo;
    private javax.swing.JTextField txtSeriesQuarta;
    private javax.swing.JTextField txtSeriesQuinta;
    private javax.swing.JTextField txtSeriesSabado;
    private javax.swing.JTextField txtSeriesSegunda;
    private javax.swing.JTextField txtSeriesSexta;
    private javax.swing.JTextField txtSeriesTerca;
    // End of variables declaration//GEN-END:variables
}
