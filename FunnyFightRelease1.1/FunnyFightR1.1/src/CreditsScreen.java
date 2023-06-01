
public class CreditsScreen extends javax.swing.JFrame {

    public CreditsScreen() {
        HyperVisor.verificarArchivos();
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        versionInfo2 = new javax.swing.JLabel();
        versionInfo1 = new javax.swing.JLabel();
        versionInfo = new javax.swing.JLabel();
        info = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Funny Fight");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(0, 0));
        setMaximumSize(new java.awt.Dimension(1280, 720));
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setResizable(false);
        setSize(new java.awt.Dimension(1280, 720));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets.Buttons/backButton.png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        versionInfo2.setFont(new java.awt.Font("Super Mario Bros. 2", 0, 10)); // NOI18N
        versionInfo2.setForeground(new java.awt.Color(204, 65, 204));
        versionInfo2.setText("Graphic ENIGNE, sprites and hypervisor propety of the donut team");
        getContentPane().add(versionInfo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 640, 650, 30));

        versionInfo1.setFont(new java.awt.Font("Super Mario Bros. 2", 0, 12)); // NOI18N
        versionInfo1.setForeground(new java.awt.Color(204, 65, 204));
        versionInfo1.setText("working over java Ff2 graphic engine");
        getContentPane().add(versionInfo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 610, 480, 30));

        versionInfo.setFont(new java.awt.Font("Super Mario Bros. 2", 0, 24)); // NOI18N
        versionInfo.setForeground(new java.awt.Color(204, 65, 204));
        versionInfo.setText("release 1.09 comp 310523");
        getContentPane().add(versionInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 570, 580, 40));

        info.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets.Animations/InfoScreen.png"))); // NOI18N
        getContentPane().add(info, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets.Animations/Clouds.gif"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets.Animations/FondoMainMenu.png"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private SoundPlayer soundPlayer = new SoundPlayer();

    private void playButtonSound() {
        soundPlayer.playButtonSound();
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        playButtonSound();
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(CreditsScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreditsScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreditsScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreditsScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreditsScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel info;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel versionInfo;
    private javax.swing.JLabel versionInfo1;
    private javax.swing.JLabel versionInfo2;
    // End of variables declaration//GEN-END:variables
}
