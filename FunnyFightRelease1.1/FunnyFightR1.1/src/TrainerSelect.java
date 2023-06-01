
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class TrainerSelect extends javax.swing.JFrame {

    private Player player1 = new Playable();

    private Clip clip;
    private Long clipTime;

    public TrainerSelect() {
        HyperVisor.verificarArchivos();
        initComponents();
        playSound();
    }

    public TrainerSelect(Clip clip) {
        HyperVisor.verificarArchivos();
        initComponents();
        this.clip = clip;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BackButton = new javax.swing.JButton();
        Sistemas = new javax.swing.JButton();
        Arqui = new javax.swing.JButton();
        Profe = new javax.swing.JButton();
        Rosa = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Funny Fight");
        setLocation(new java.awt.Point(0, 0));
        setMaximumSize(new java.awt.Dimension(1280, 720));
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setResizable(false);
        setSize(new java.awt.Dimension(1280, 720));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BackButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets.Buttons/backButton.png"))); // NOI18N
        BackButton.setBorderPainted(false);
        BackButton.setContentAreaFilled(false);
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });
        getContentPane().add(BackButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 640, -1, -1));

        Sistemas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sprites/Trainer1R.png"))); // NOI18N
        Sistemas.setBorderPainted(false);
        Sistemas.setContentAreaFilled(false);
        Sistemas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SistemasActionPerformed(evt);
            }
        });
        getContentPane().add(Sistemas, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 110, 300, 300));

        Arqui.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sprites/Trainer2R.png"))); // NOI18N
        Arqui.setBorderPainted(false);
        Arqui.setContentAreaFilled(false);
        Arqui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ArquiActionPerformed(evt);
            }
        });
        getContentPane().add(Arqui, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 110, 300, 300));

        Profe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sprites/Trainer3R.png"))); // NOI18N
        Profe.setBorderPainted(false);
        Profe.setContentAreaFilled(false);
        Profe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProfeActionPerformed(evt);
            }
        });
        getContentPane().add(Profe, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 420, 300, 300));

        Rosa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sprites/Trainer5R.png"))); // NOI18N
        Rosa.setToolTipText("");
        Rosa.setBorderPainted(false);
        Rosa.setContentAreaFilled(false);
        Rosa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RosaActionPerformed(evt);
            }
        });
        getContentPane().add(Rosa, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 420, 300, 300));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets.Buttons/ButtonSelector.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets.Buttons/ButtonSelector.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 100, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets.Buttons/ButtonSelector.png"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 410, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets.Buttons/ButtonSelector.png"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 410, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets.Animations/Clouds.gif"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets.Animations/Clouds.gif"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 500, -1, -1));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets.Animations/BackSeelectWB.png"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void playSound() {
        try {
            String soundFile = "/sounds/song2.wav";
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(getClass().getResource(soundFile));
            clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void playButtonSound() {
        try {
            String soundFile = "/sounds/button1.wav";
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(getClass().getResource(soundFile));
            Clip clip2 = AudioSystem.getClip();
            clip2.open(audioInputStream);
            clip2.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void pauseSound() {
        if (clip != null && clip.isRunning()) {
            clipTime = clip.getMicrosecondPosition();
            clip.stop();
        }
    }

    private void resumeSound() {
        if (clip != null && !clip.isRunning()) {
            clip.setMicrosecondPosition(clipTime);
            clip.start();
        }
    }

    private void SistemasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SistemasActionPerformed
        player1.setPersonaje("Sistemas");
        player1.setPotenciador(1.5);
        PokeSelect ps = new PokeSelect(player1, clip);

        playButtonSound();

        ps.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_SistemasActionPerformed

    private void ArquiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ArquiActionPerformed

        player1.setPersonaje("Arqui");
        player1.setPotenciador(1.2);
        PokeSelect ps = new PokeSelect(player1, clip);

        playButtonSound();

        ps.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ArquiActionPerformed

    private void ProfeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProfeActionPerformed

        player1.setPersonaje("Profe");
        player1.setPotenciador(2.5);

        PokeSelect ps = new PokeSelect(player1, clip);

        playButtonSound();

        ps.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ProfeActionPerformed

    private void RosaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RosaActionPerformed
        player1.setPersonaje("Rosa");
        player1.setPotenciador(1.3);

        PokeSelect ps = new PokeSelect(player1, clip);

        playButtonSound();

        ps.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_RosaActionPerformed

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        playButtonSound();
        pauseSound();
        ScreenPlayers spS = new ScreenPlayers();
        spS.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BackButtonActionPerformed

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
            java.util.logging.Logger.getLogger(TrainerSelect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TrainerSelect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TrainerSelect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TrainerSelect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TrainerSelect().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Arqui;
    private javax.swing.JButton BackButton;
    private javax.swing.JButton Profe;
    private javax.swing.JButton Rosa;
    private javax.swing.JButton Sistemas;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables
}
