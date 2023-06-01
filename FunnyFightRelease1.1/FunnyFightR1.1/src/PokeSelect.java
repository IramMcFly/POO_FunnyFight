
import javax.security.auth.Destroyable;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class PokeSelect extends javax.swing.JFrame {

    private Player player1 = new Playable();
    private Pokemon pokemon1 = new Pokemon();

    private Clip clip;
    private Long clipTime;

    public PokeSelect(Player player1, Clip clip) {
        HyperVisor.verificarArchivos();
        initComponents();
        this.clip = clip;
        this.player1 = player1;
    }

    public PokeSelect() {
        System.out.println("Esto no es real, todo es una ilusion");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BackButton = new javax.swing.JButton();
        Inge = new javax.swing.JButton();
        Lic = new javax.swing.JButton();
        Bis = new javax.swing.JButton();
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
        getContentPane().add(BackButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 630, -1, -1));

        Inge.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sprites/IngeR.png"))); // NOI18N
        Inge.setBorderPainted(false);
        Inge.setContentAreaFilled(false);
        Inge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngeActionPerformed(evt);
            }
        });
        getContentPane().add(Inge, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 97, 280, 280));

        Lic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sprites/LirR.png"))); // NOI18N
        Lic.setBorderPainted(false);
        Lic.setContentAreaFilled(false);
        Lic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LicActionPerformed(evt);
            }
        });
        getContentPane().add(Lic, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 417, 290, 290));

        Bis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sprites/BisR.png"))); // NOI18N
        Bis.setContentAreaFilled(false);
        Bis.setDefaultCapable(false);
        Bis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BisActionPerformed(evt);
            }
        });
        getContentPane().add(Bis, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 407, 290, 300));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets.Animations/Clouds.gif"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets.Animations/Clouds.gif"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, -1, -1));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sprites/FighterSelect.png"))); // NOI18N
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


    private void IngeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngeActionPerformed
        playButtonSound();
        pokemon1.setNombre("Inge");
        pokemon1.setVida(120);
        player1.setPokemon(pokemon1);
        DifficultySet Ds = new DifficultySet(player1, clip);
        Ds.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_IngeActionPerformed

    private void LicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LicActionPerformed
        playButtonSound();
        pokemon1.setNombre("Licenciada");
        pokemon1.setVida(100);
        player1.setPokemon(pokemon1);
        DifficultySet Ds = new DifficultySet(player1, clip);
        Ds.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_LicActionPerformed

    private void BisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BisActionPerformed
        playButtonSound();
        pokemon1.setNombre("Bisonte");
        pokemon1.setVida(150);
        player1.setPokemon(pokemon1);
        DifficultySet Ds = new DifficultySet(player1, clip);
        Ds.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BisActionPerformed

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        playButtonSound();
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
            java.util.logging.Logger.getLogger(PokeSelect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PokeSelect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PokeSelect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PokeSelect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PokeSelect().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JButton Bis;
    private javax.swing.JLabel Fondo;
    private javax.swing.JButton Inge;
    private javax.swing.JButton Lic;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
