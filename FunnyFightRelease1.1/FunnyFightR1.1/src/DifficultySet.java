
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class DifficultySet extends javax.swing.JFrame {

    private Player player1 = new Playable();
    private IA ia = new IA();
    private Pokemon iaPok = new Pokemon();
    private Clip clip;
    private Long clipTime;

    public DifficultySet(Player player1, Clip clip) {
        HyperVisor.verificarArchivos();
        initComponents();
        this.player1 = player1;
        this.clip = clip;
    }

    public DifficultySet() {
        System.out.println("Policia!!!, el usuario rompio el codigo...");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BackButton = new javax.swing.JButton();
        Easy = new javax.swing.JButton();
        Medium = new javax.swing.JButton();
        Hard = new javax.swing.JButton();
        Impossible = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
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
        getContentPane().add(BackButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 620, -1, -1));

        Easy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sprites/Easy.png"))); // NOI18N
        Easy.setBorderPainted(false);
        Easy.setContentAreaFilled(false);
        Easy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EasyActionPerformed(evt);
            }
        });
        getContentPane().add(Easy, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 80, 290, 140));

        Medium.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sprites/Medium.png"))); // NOI18N
        Medium.setBorderPainted(false);
        Medium.setContentAreaFilled(false);
        Medium.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MediumActionPerformed(evt);
            }
        });
        getContentPane().add(Medium, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 230, -1, 140));

        Hard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sprites/HArd.png"))); // NOI18N
        Hard.setBorderPainted(false);
        Hard.setContentAreaFilled(false);
        Hard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HardActionPerformed(evt);
            }
        });
        getContentPane().add(Hard, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 380, -1, -1));

        Impossible.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sprites/Impossible.png"))); // NOI18N
        Impossible.setBorderPainted(false);
        Impossible.setContentAreaFilled(false);
        Impossible.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImpossibleActionPerformed(evt);
            }
        });
        getContentPane().add(Impossible, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 540, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets.Animations/Clouds.gif"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 490, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets.Animations/Clouds.gif"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, -1, -1));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sprites/SelectDifficulty.png"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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


    private void EasyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EasyActionPerformed
        playButtonSound();
        pauseSound();
        
        ia.setPersonaje("Rosa");
        ia.setPotenciador(1.0);
        iaPok.setNombre("Licenciada");
        iaPok.setVida(100);
        ia.setPokemon(iaPok);

        Battle1P battle1p = new Battle1P(player1, ia);
        battle1p.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_EasyActionPerformed

    private void MediumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MediumActionPerformed
        playButtonSound();
        pauseSound();
        ia.setPersonaje("Arqui");
        ia.setPotenciador(1.3);
        iaPok.setNombre("Inge");
        iaPok.setVida(110);
        ia.setPokemon(iaPok);

        Battle1P battle1p = new Battle1P(player1, ia);
        battle1p.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_MediumActionPerformed

    private void HardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HardActionPerformed
        playButtonSound();
        pauseSound();
        ia.setPersonaje("Sistemas");
        ia.setPotenciador(1.9);
        iaPok.setNombre("Inge");
        iaPok.setVida(130);
        ia.setPokemon(iaPok);

        Battle1P battle1p = new Battle1P(player1, ia);
        battle1p.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_HardActionPerformed

    private void ImpossibleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImpossibleActionPerformed
        playButtonSound();
        pauseSound();
        ia.setPersonaje("Profe");
        ia.setPotenciador(3.0);
        iaPok.setNombre("Bisonte");
        iaPok.setVida(100);
        ia.setPokemon(iaPok);

        Battle1P battle1p = new Battle1P(player1, ia);
        battle1p.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ImpossibleActionPerformed

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        
        TrainerSelect ts = new TrainerSelect(clip);
        ts.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BackButtonActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(DifficultySet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DifficultySet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DifficultySet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DifficultySet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DifficultySet().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JButton Easy;
    private javax.swing.JLabel Fondo;
    private javax.swing.JButton Hard;
    private javax.swing.JButton Impossible;
    private javax.swing.JButton Medium;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
