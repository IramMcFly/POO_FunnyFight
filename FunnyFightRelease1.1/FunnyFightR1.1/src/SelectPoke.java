
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class SelectPoke extends javax.swing.JFrame {

    private Player player1 = new Playable();
    private Player player2 = new Playable();
    private Pokemon pokemon1 = new Pokemon();
    private Pokemon pokemon2 = new Pokemon();

    public SelectPoke(Player player1, Player player2, Clip clip) {
        HyperVisor.verificarArchivos();
        initComponents();
        this.clip = clip;
        this.player1 = player1;
        this.player2 = player2;

        Locker4.setVisible(false);
        Locker5.setVisible(false);
        Locker6.setVisible(false);
        PokeBis2.setVisible(false);
        PokeInge2.setVisible(false);
        PokeLic2.setVisible(false);
        text4.setVisible(false);
        text5.setVisible(false);
        text6.setVisible(false);

        FightButton.setVisible(false);
    }

    public SelectPoke() {
        System.out.println("Esto no existe");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BackButton = new javax.swing.JButton();
        text1 = new javax.swing.JLabel();
        text2 = new javax.swing.JLabel();
        text3 = new javax.swing.JLabel();
        text6 = new javax.swing.JLabel();
        text5 = new javax.swing.JLabel();
        text4 = new javax.swing.JLabel();
        FightButton = new javax.swing.JButton();
        PokeInge1 = new javax.swing.JButton();
        PokeLic1 = new javax.swing.JButton();
        PokeBis1 = new javax.swing.JButton();
        PokeInge2 = new javax.swing.JButton();
        PokeLic2 = new javax.swing.JButton();
        PokeBis2 = new javax.swing.JButton();
        Locker1 = new javax.swing.JLabel();
        Locker2 = new javax.swing.JLabel();
        Locker3 = new javax.swing.JLabel();
        Locker4 = new javax.swing.JLabel();
        Locker5 = new javax.swing.JLabel();
        Locker6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Funny Fight");
        setLocation(new java.awt.Point(0, 0));
        setMaximumSize(new java.awt.Dimension(1280, 720));
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BackButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets.Buttons/backButton.png"))); // NOI18N
        BackButton.setBorderPainted(false);
        BackButton.setContentAreaFilled(false);
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });
        getContentPane().add(BackButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        text1.setFont(new java.awt.Font("ArcadeClassic", 0, 48)); // NOI18N
        text1.setForeground(new java.awt.Color(255, 255, 255));
        text1.setText("INGE");
        getContentPane().add(text1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, -1, -1));

        text2.setFont(new java.awt.Font("ArcadeClassic", 0, 48)); // NOI18N
        text2.setForeground(new java.awt.Color(255, 255, 255));
        text2.setText("lic");
        getContentPane().add(text2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 450, -1, -1));

        text3.setFont(new java.awt.Font("ArcadeClassic", 0, 48)); // NOI18N
        text3.setForeground(new java.awt.Color(255, 255, 255));
        text3.setText("BISONTE");
        getContentPane().add(text3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 450, -1, -1));

        text6.setFont(new java.awt.Font("ArcadeClassic", 0, 48)); // NOI18N
        text6.setForeground(new java.awt.Color(255, 255, 255));
        text6.setText("BISONTE");
        getContentPane().add(text6, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 450, -1, -1));

        text5.setFont(new java.awt.Font("ArcadeClassic", 0, 48)); // NOI18N
        text5.setForeground(new java.awt.Color(255, 255, 255));
        text5.setText("lic");
        getContentPane().add(text5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 450, -1, -1));

        text4.setFont(new java.awt.Font("ArcadeClassic", 0, 48)); // NOI18N
        text4.setForeground(new java.awt.Color(255, 255, 255));
        text4.setText("INGE");
        getContentPane().add(text4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 160, -1, -1));

        FightButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets.Buttons/FighterButton3.png"))); // NOI18N
        FightButton.setContentAreaFilled(false);
        FightButton.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Sprites/Nothing.png"))); // NOI18N
        FightButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FightButtonActionPerformed(evt);
            }
        });
        getContentPane().add(FightButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 570, 250, 120));

        PokeInge1.setBackground(new java.awt.Color(0, 0, 0));
        PokeInge1.setForeground(new java.awt.Color(1, 1, 1));
        PokeInge1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sprites/IngeR.png"))); // NOI18N
        PokeInge1.setAlignmentY(0.0F);
        PokeInge1.setContentAreaFilled(false);
        PokeInge1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        PokeInge1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        PokeInge1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PokeInge1ActionPerformed(evt);
            }
        });
        getContentPane().add(PokeInge1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 170, 170));

        PokeLic1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sprites/LirR.png"))); // NOI18N
        PokeLic1.setContentAreaFilled(false);
        PokeLic1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        PokeLic1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        PokeLic1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PokeLic1ActionPerformed(evt);
            }
        });
        getContentPane().add(PokeLic1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 510, 160, 170));

        PokeBis1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sprites/BisR.png"))); // NOI18N
        PokeBis1.setContentAreaFilled(false);
        PokeBis1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        PokeBis1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PokeBis1ActionPerformed(evt);
            }
        });
        getContentPane().add(PokeBis1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 510, 180, 170));

        PokeInge2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sprites/IngeL.png"))); // NOI18N
        PokeInge2.setContentAreaFilled(false);
        PokeInge2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        PokeInge2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PokeInge2ActionPerformed(evt);
            }
        });
        getContentPane().add(PokeInge2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 230, 180, 170));

        PokeLic2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sprites/LirL.png"))); // NOI18N
        PokeLic2.setContentAreaFilled(false);
        PokeLic2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        PokeLic2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PokeLic2ActionPerformed(evt);
            }
        });
        getContentPane().add(PokeLic2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 510, 180, 170));

        PokeBis2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sprites/BisL.png"))); // NOI18N
        PokeBis2.setContentAreaFilled(false);
        PokeBis2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        PokeBis2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PokeBis2ActionPerformed(evt);
            }
        });
        getContentPane().add(PokeBis2, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 510, 180, 170));

        Locker1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets.Buttons/SelectorBack.png"))); // NOI18N
        Locker1.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Sprites/Nothing.png"))); // NOI18N
        getContentPane().add(Locker1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        Locker2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets.Buttons/SelectorBack.png"))); // NOI18N
        Locker2.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Sprites/Nothing.png"))); // NOI18N
        getContentPane().add(Locker2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, -1, -1));

        Locker3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets.Buttons/SelectorBack.png"))); // NOI18N
        Locker3.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Sprites/Nothing.png"))); // NOI18N
        getContentPane().add(Locker3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 490, -1, -1));

        Locker4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets.Buttons/SelectorBack.png"))); // NOI18N
        Locker4.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Sprites/Nothing.png"))); // NOI18N
        getContentPane().add(Locker4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 210, -1, -1));

        Locker5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets.Buttons/SelectorBack.png"))); // NOI18N
        Locker5.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Sprites/Nothing.png"))); // NOI18N
        getContentPane().add(Locker5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 490, -1, -1));

        Locker6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets.Buttons/SelectorBack.png"))); // NOI18N
        Locker6.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Sprites/Nothing.png"))); // NOI18N
        getContentPane().add(Locker6, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 490, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets.Animations/Clouds.gif"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets.Animations/Clouds.gif"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 450, -1, -1));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets.Animations/BackSeelectWB.png"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //seccion de audio
    private Clip clip;
    private Long clipTime;

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

    //sona de botones
    private void PokeInge1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PokeInge1ActionPerformed
        playButtonSound();

        Locker2.setVisible(false);
        Locker3.setVisible(false);
        PokeBis1.setVisible(false);
        PokeLic1.setVisible(false);

        text2.setVisible(false);
        text3.setVisible(false);

        text4.setVisible(true);
        text5.setVisible(true);
        text6.setVisible(true);

        Locker4.setVisible(true);
        Locker5.setVisible(true);
        Locker6.setVisible(true);
        PokeBis2.setVisible(true);
        PokeInge2.setVisible(true);
        PokeLic2.setVisible(true);

        pokemon1.setNombre("Inge");
        pokemon1.setVida(120);

        player1.setPokemon(pokemon1);
    }//GEN-LAST:event_PokeInge1ActionPerformed

    private void PokeLic1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PokeLic1ActionPerformed
        playButtonSound();

        Locker1.setVisible(false);
        Locker3.setVisible(false);
        PokeInge1.setVisible(false);
        PokeBis1.setVisible(false);

        text1.setVisible(false);
        text3.setVisible(false);

        text4.setVisible(true);
        text5.setVisible(true);
        text6.setVisible(true);

        Locker4.setVisible(true);
        Locker5.setVisible(true);
        Locker6.setVisible(true);
        PokeBis2.setVisible(true);
        PokeInge2.setVisible(true);
        PokeLic2.setVisible(true);

        pokemon1.setNombre("Licenciada");
        pokemon1.setVida(100);
        player1.setPokemon(pokemon1);
    }//GEN-LAST:event_PokeLic1ActionPerformed

    private void PokeBis1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PokeBis1ActionPerformed
        playButtonSound();

        Locker1.setVisible(false);
        Locker2.setVisible(false);
        PokeInge1.setVisible(false);
        PokeLic1.setVisible(false);

        text2.setVisible(false);
        text1.setVisible(false);

        Locker4.setVisible(true);
        Locker5.setVisible(true);
        Locker6.setVisible(true);
        PokeBis2.setVisible(true);
        PokeInge2.setVisible(true);
        PokeLic2.setVisible(true);

        text4.setVisible(true);
        text5.setVisible(true);
        text6.setVisible(true);

        pokemon1.setNombre("Bisonte");
        pokemon1.setVida(150);
        player1.setPokemon(pokemon1);
    }//GEN-LAST:event_PokeBis1ActionPerformed

    private void PokeBis2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PokeBis2ActionPerformed
        playButtonSound();

        Locker4.setVisible(false);
        Locker5.setVisible(false);
        PokeInge2.setVisible(false);
        PokeLic2.setVisible(false);

        text4.setVisible(false);
        text5.setVisible(false);

        pokemon2.setNombre("Bisonte");
        pokemon2.setVida(150);

        FightButton.setVisible(true);
        player2.setPokemon(pokemon2);
    }//GEN-LAST:event_PokeBis2ActionPerformed

    private void PokeLic2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PokeLic2ActionPerformed
        playButtonSound();

        Locker4.setVisible(false);
        Locker6.setVisible(false);
        PokeInge2.setVisible(false);
        PokeBis2.setVisible(false);
        text4.setVisible(false);
        text6.setVisible(false);

        pokemon2.setNombre("Licenciada");
        pokemon2.setVida(100);
        player2.setPokemon(pokemon2);
        FightButton.setVisible(true);

    }//GEN-LAST:event_PokeLic2ActionPerformed

    private void PokeInge2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PokeInge2ActionPerformed
        playButtonSound();

        Locker5.setVisible(false);
        Locker6.setVisible(false);
        PokeLic2.setVisible(false);
        PokeBis2.setVisible(false);
        text6.setVisible(false);
        text5.setVisible(false);

        pokemon2.setNombre("Inge");
        pokemon2.setVida(120);
        player2.setPokemon(pokemon2);
        FightButton.setVisible(true);

    }//GEN-LAST:event_PokeInge2ActionPerformed

    private void FightButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FightButtonActionPerformed

        Battle bat = new Battle(player1, player2);
        pauseSound();
        bat.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_FightButtonActionPerformed

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        playButtonSound();
        Select scr = new Select(clip);
        scr.setVisible(true);
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
            java.util.logging.Logger.getLogger(SelectPoke.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SelectPoke.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SelectPoke.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SelectPoke.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SelectPoke().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JButton FightButton;
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel Locker1;
    private javax.swing.JLabel Locker2;
    private javax.swing.JLabel Locker3;
    private javax.swing.JLabel Locker4;
    private javax.swing.JLabel Locker5;
    private javax.swing.JLabel Locker6;
    private javax.swing.JButton PokeBis1;
    private javax.swing.JButton PokeBis2;
    private javax.swing.JButton PokeInge1;
    private javax.swing.JButton PokeInge2;
    private javax.swing.JButton PokeLic1;
    private javax.swing.JButton PokeLic2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel text1;
    private javax.swing.JLabel text2;
    private javax.swing.JLabel text3;
    private javax.swing.JLabel text4;
    private javax.swing.JLabel text5;
    private javax.swing.JLabel text6;
    // End of variables declaration//GEN-END:variables
}
