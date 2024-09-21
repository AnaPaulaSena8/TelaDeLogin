
package br.edu.telas;


public class TelaDeEscolha extends javax.swing.JFrame {

    public TelaDeEscolha() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CalcIMC = new javax.swing.JButton();
        JOGO = new javax.swing.JButton();
        Sair = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CalcIMC.setBorder(null);
        CalcIMC.setContentAreaFilled(false);
        CalcIMC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CalcIMC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalcIMCActionPerformed(evt);
            }
        });
        getContentPane().add(CalcIMC, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, 330, 330));

        JOGO.setBorder(null);
        JOGO.setContentAreaFilled(false);
        JOGO.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(JOGO, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 240, 330, 330));

        Sair.setBorder(null);
        Sair.setContentAreaFilled(false);
        Sair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SairActionPerformed(evt);
            }
        });
        getContentPane().add(Sair, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 90, 70));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/icons/TeladeEscolha.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        jLabel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairActionPerformed
       TelaDeEscolha.this.dispose();
    }//GEN-LAST:event_SairActionPerformed

    private void CalcIMCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalcIMCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CalcIMCActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaDeEscolha().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CalcIMC;
    private javax.swing.JButton JOGO;
    private javax.swing.JButton Sair;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
