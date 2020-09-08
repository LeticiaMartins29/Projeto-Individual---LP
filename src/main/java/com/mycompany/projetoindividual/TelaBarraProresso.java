package com.mycompany.projetoindividual;

import java.util.concurrent.ThreadLocalRandom;

public class TelaBarraProresso extends javax.swing.JFrame {
//    OBJETOS CPU, DISCO E MEMORIA
    NumerosGlobais cpu = new NumerosGlobais();
    NumerosGlobais disco = new NumerosGlobais();
    NumerosGlobais memoria = new NumerosGlobais();
    
//    MÉTODO QUE ATUALIZA TODOS AS INFORMAÇÕES
    void Atualizar(){
        //CPU
        barraC.setValue(cpu.random.intValue());
        barraC.setString(String.format("%.2f", cpu.random)+"%");
        lblUsoC.setText(String.valueOf(String.format("%.2f", cpu.random)+"%"));
        lblMedC.setText(String.valueOf(String.format("%.2f", cpu.media)+"%"));
        lblMinC.setText(String.valueOf(String.format("%.2f", cpu.min)+"%"));
        lblMaxC.setText(String.valueOf(String.format("%.2f", cpu.max)+"%"));
        
        //DISCO
        barraD.setValue(disco.random.intValue());
        //DIVIDI POR 5 PARA A PORCENTAGEM DA BARRA CHEGAR A 100 E NÃO 500
        barraD.setString(String.format("%.2f", disco.random / 5)+"%");
        lblUsoD.setText(String.valueOf(String.format("%.2f", disco.random)+" GB"));
        lblMedD.setText(String.valueOf(String.format("%.2f", disco.media)+" GB"));
        lblMinD.setText(String.valueOf(String.format("%.2f", disco.min)+" GB"));
        lblMaxD.setText(String.valueOf(String.format("%.2f", disco.max)+" GB"));
        
        //MEMÓRIA
        barraM.setValue(memoria.random.intValue());
        //DIVIDI POR 8 PARA A PORCENTAGEM DA BARRA CHEGAR A 100 E NÃO 800
        barraM.setString(String.format("%.2f", memoria.random / 8)+"%");
        //DIVIDI POR 100 PARA CHEGAR A 8GB E NÃO 800GB
        lblUsoM.setText(String.valueOf(String.format("%.2f", memoria.random / 100)+" GB"));
        lblMedM.setText(String.valueOf(String.format("%.2f", memoria.media / 100)+" GB"));
        lblMinM.setText(String.valueOf(String.format("%.2f", memoria.min / 100)+" GB"));
        lblMaxM.setText(String.valueOf(String.format("%.2f", memoria.max / 100)+" GB"));
    }
    
    
// CDM = CPU-DISCO-MEMORIA 
//(vai ser substituido pelos objetos cpu, disco e memoria quando for chamado pelo botão)
    
//MÉTODO QUE GERA NÚMEROS ALEATÓRIOS/CHAMA O MÉTODO DAS CONTAS PARA SEU RESPECTIVO OBJETO
    
    void Aleatorio1(NumerosGlobais cdm){
        cdm.random = ThreadLocalRandom.current().nextDouble(0, 100);
        ContaGeral(cpu);        
    }
    
    void Aleatorio2(NumerosGlobais cdm){
        cdm.random = ThreadLocalRandom.current().nextDouble(0, 500);
        ContaGeral(disco);        
    }
    
    void Aleatorio3(NumerosGlobais cdm){
        cdm.random = ThreadLocalRandom.current().nextDouble(0, 800);
        ContaGeral(memoria);
    }
    
//    MÉTODO QUE VAI CALCULAR TUDO (MIN, MAX E MÉDIA)
    void ContaGeral(NumerosGlobais cdm){
        if(cdm.min.equals(0.0)){
            cdm.min = cdm.random;
        }else if(cdm.min > cdm.random){
            cdm.min = cdm.random;
        }
        if (cdm.max < cdm.random) {
            cdm.max = cdm.random;
        }
        cdm.contador++;
        cdm.soma += cdm.random;
        cdm.media = cdm.soma / cdm.contador;
    }

    
    public TelaBarraProresso() {
        // CONFIGURAÇÃO DA BARRA
        
        initComponents(); //CÓDIGO QUE INICIA OS COMPONENTES COM SUAS CONF. DEFINIDAS

           //CPU 
        barraC.setStringPainted(true);
          //DISCO 
        barraD.setStringPainted(true);
        barraD.setMaximum(500); //VALOR MAX DEFINIDO DO DISCO
          //MEMÓRIA
        barraM.setStringPainted(true);
        barraM.setMaximum(800); // VALOR MAX DEFINIFO DA MEMÓRIA 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox1 = new javax.swing.JCheckBox();
        barraD = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        barraC = new javax.swing.JProgressBar();
        barraM = new javax.swing.JProgressBar();
        btnLeitura = new javax.swing.JButton();
        lblUsoC = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblUsoM = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lblUsoD = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        lblMaxC = new javax.swing.JLabel();
        lblMinC = new javax.swing.JLabel();
        lblMedC = new javax.swing.JLabel();
        lblMaxD = new javax.swing.JLabel();
        lblMinD = new javax.swing.JLabel();
        lblMedD = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        lblMaxM = new javax.swing.JLabel();
        lblMinM = new javax.swing.JLabel();
        lblMedM = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();

        jCheckBox1.setText("jCheckBox1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(139, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("INFORMAÇÕES DA MÁQUINA");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("CPU");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("DISCO");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("MEMÓRIA");

        btnLeitura.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnLeitura.setText("FAZER LEITURA DE DADOS");
        btnLeitura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLeituraActionPerformed(evt);
            }
        });

        lblUsoC.setText("0.0");

        jLabel6.setText("/");

        jLabel7.setText("100%");

        jLabel8.setText("/");

        jLabel9.setText("8 GB");

        lblUsoM.setText("0.0");

        jLabel11.setText("/");

        jLabel12.setText("500 GB");

        lblUsoD.setText("0.0");

        jLabel14.setText("Média:");

        jLabel15.setText("Máximo:");

        jLabel16.setText("Mínimo:");

        lblMaxC.setText("0.0");

        lblMinC.setText("0.0");

        lblMedC.setText("0.0");

        lblMaxD.setText("0.0");

        lblMinD.setText("0.0");

        lblMedD.setText("0.0");

        jLabel17.setText("Média:");

        jLabel18.setText("Máximo:");

        jLabel19.setText("Mínimo:");

        lblMaxM.setText("0.0");

        lblMinM.setText("0.0");

        lblMedM.setText("0.0");

        jLabel29.setText("Média:");

        jLabel30.setText("Máximo:");

        jLabel31.setText("Mínimo:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblUsoM)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)
                        .addGap(181, 181, 181))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel31)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lblMinM)
                                    .addGap(70, 70, 70)
                                    .addComponent(jLabel29)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lblMedM)
                                    .addGap(71, 71, 71)
                                    .addComponent(jLabel30)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lblMaxM)
                                    .addGap(149, 149, 149))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblUsoC)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel7))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblUsoD)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel12))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel16)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblMinC)
                                        .addGap(59, 59, 59)
                                        .addComponent(jLabel14)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblMedC)
                                        .addGap(87, 87, 87)
                                        .addComponent(jLabel15)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lblMaxC))))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(barraC, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 359, Short.MAX_VALUE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel19)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lblMinD)
                                    .addGap(67, 67, 67)
                                    .addComponent(jLabel17)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lblMedD)
                                    .addGap(75, 75, 75)
                                    .addComponent(jLabel18)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lblMaxD))
                                .addComponent(barraD, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(barraM, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnLeitura)
                        .addGap(19, 19, 19))))
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7)
                                    .addComponent(lblUsoC)
                                    .addComponent(jLabel6))
                                .addGap(45, 45, 45))
                            .addComponent(barraC, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(lblMinC)
                            .addComponent(jLabel15)
                            .addComponent(lblMaxC)
                            .addComponent(jLabel14)
                            .addComponent(lblMedC))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel12)
                                        .addComponent(lblUsoD)
                                        .addComponent(jLabel11)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(barraD, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel19)
                                        .addComponent(lblMinD))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel17)
                                        .addComponent(lblMedD)
                                        .addComponent(jLabel18)
                                        .addComponent(lblMaxD))))
                            .addComponent(btnLeitura, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(119, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(lblUsoM)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(barraM, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel30)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblMaxM)
                                .addComponent(jLabel29)
                                .addComponent(lblMedM)
                                .addComponent(jLabel31)
                                .addComponent(lblMinM)))
                        .addGap(54, 54, 54))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

//    AÇÃO DO BOTÃO (CHAMAR O MÉTODO DE GERAR ALEATÓRIOS E ATUALIZAR OS VALORES)
    
    private void btnLeituraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLeituraActionPerformed
        Aleatorio1(cpu);
        Aleatorio2(disco);
        Aleatorio3(memoria);
        
        Atualizar();
    }//GEN-LAST:event_btnLeituraActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaBarraProresso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaBarraProresso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaBarraProresso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaBarraProresso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaBarraProresso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar barraC;
    private javax.swing.JProgressBar barraD;
    private javax.swing.JProgressBar barraM;
    private javax.swing.JButton btnLeitura;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblMaxC;
    private javax.swing.JLabel lblMaxD;
    private javax.swing.JLabel lblMaxM;
    private javax.swing.JLabel lblMedC;
    private javax.swing.JLabel lblMedD;
    private javax.swing.JLabel lblMedM;
    private javax.swing.JLabel lblMinC;
    private javax.swing.JLabel lblMinD;
    private javax.swing.JLabel lblMinM;
    private javax.swing.JLabel lblUsoC;
    private javax.swing.JLabel lblUsoD;
    private javax.swing.JLabel lblUsoM;
    // End of variables declaration//GEN-END:variables
}
