
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class ScreenPlayers extends javax.swing.JFrame {

    private Clip clip;
    private Long clipTime;

    public ScreenPlayers(Clip clip) {
        HyperVisor.verificarArchivos();
        initComponents();
        this.clip = clip;
    }

    public ScreenPlayers() {
        HyperVisor.verificarArchivos();
        initComponents();
        playSound();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BackButton = new javax.swing.JButton();
        OnePlayer = new javax.swing.JButton();
        TwoPlayer = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();

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
        getContentPane().add(BackButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 640, 150, -1));

        OnePlayer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets.Buttons/1Player.png"))); // NOI18N
        OnePlayer.setBorderPainted(false);
        OnePlayer.setContentAreaFilled(false);
        OnePlayer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OnePlayerActionPerformed(evt);
            }
        });
        getContentPane().add(OnePlayer, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 250, 290, 140));

        TwoPlayer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets.Buttons/2Players.png"))); // NOI18N
        TwoPlayer.setBorderPainted(false);
        TwoPlayer.setContentAreaFilled(false);
        TwoPlayer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TwoPlayerActionPerformed(evt);
            }
        });
        getContentPane().add(TwoPlayer, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 400, 290, 140));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets.Animations/Clouds.gif"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets.Animations/FondoMainMenu.png"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private SoundPlayer soundPlayer = new SoundPlayer();

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


    private void TwoPlayerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TwoPlayerActionPerformed
        playButtonSound();
        pauseSound();
        Select s = new Select();
        s.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_TwoPlayerActionPerformed

    private void OnePlayerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OnePlayerActionPerformed
        playButtonSound();
        pauseSound();
        TrainerSelect ts = new TrainerSelect();
        ts.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_OnePlayerActionPerformed

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        playButtonSound();
        MainMenu mns = new MainMenu(clip);
        mns.setVisible(true);
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
            java.util.logging.Logger.getLogger(ScreenPlayers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ScreenPlayers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ScreenPlayers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ScreenPlayers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ScreenPlayers().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JLabel Fondo;
    private javax.swing.JButton OnePlayer;
    private javax.swing.JButton TwoPlayer;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
