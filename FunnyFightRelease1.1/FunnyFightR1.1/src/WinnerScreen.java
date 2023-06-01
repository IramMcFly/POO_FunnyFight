
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class WinnerScreen extends javax.swing.JFrame {

    private Playable player1 = new Playable();
    private Playable player2 = new Playable();
    private IA ia = new IA();

    private Clip clip;
    private Long clipTime;

    private Pokemon pok1 = new Pokemon();
    private Pokemon pok2 = new Pokemon();

    public WinnerScreen() {
        System.out.println("Dios ayuda llevo 65 horas en este proyecto");
    }

    public WinnerScreen(Playable player1, IA ia, int winner, Clip clip) {
        HyperVisor.verificarArchivos();
        initComponents();
        this.clip = clip;
        this.player1 = player1;
        this.ia = ia;
        this.pok1 = player1.getPokemon();
        this.pok2 = ia.getPokemon();

        T1.setVisible(false);
        T2.setVisible(false);
        T3.setVisible(false);
        T4.setVisible(false);
        T5.setVisible(false);
        T6.setVisible(false);
        T7.setVisible(false);
        T8.setVisible(false);
        T9.setVisible(false);
        T10.setVisible(false);
        T11.setVisible(false);
        T12.setVisible(false);
        T13.setVisible(false);
        T14.setVisible(false);
        T15.setVisible(false);
        T16.setVisible(false);

        Inge1D.setVisible(false);
        Lic1D.setVisible(false);
        Bis1D.setVisible(false);
        Inge1I.setVisible(false);
        Lic1I.setVisible(false);
        Bis1I.setVisible(false);
        Inge2D.setVisible(false);
        Lic2D.setVisible(false);
        Bis2D.setVisible(false);
        Inge2I.setVisible(false);
        Lic2I.setVisible(false);
        Bis2I.setVisible(false);

        if (winner == 1) {
            WinText.setText("Player 1 Wins!!");

            switch (player1.getPersonaje()) {
                case "Sistemas":
                    T1.setVisible(true);
                    break;

                case "Arqui":
                    T2.setVisible(true);
                    break;

                case "Profe":
                    T3.setVisible(true);
                    break;

                case "Rosa":
                    T4.setVisible(true);
                    break;
            }

            switch (pok1.getNombre()) {
                case "Inge":
                    Inge1D.setVisible(true);
                    break;
                case "Licenciada":
                    Lic1D.setVisible(true);
                    break;
                case "Bisonte":
                    Bis1D.setVisible(true);
                    break;
            }

            switch (ia.getPersonaje()) {
                case "Sistemas":
                    T13.setVisible(true);
                    break;

                case "Arqui":
                    T14.setVisible(true);
                    break;

                case "Profe":
                    T15.setVisible(true);
                    break;

                case "Rosa":
                    T16.setVisible(true);
                    break;
            }

            switch (pok2.getNombre()) {
                case "Inge":
                    Inge2I.setVisible(true);
                    break;
                case "Licenciada":
                    Lic2I.setVisible(true);
                    break;
                case "Bisonte":
                    Bis2I.setVisible(true);
                    break;
            }

        } else {
            WinText.setText("Player 2 Wins!!");

            switch (ia.getPersonaje()) {
                case "Sistemas":
                    T5.setVisible(true);
                    break;

                case "Arqui":
                    T6.setVisible(true);
                    break;

                case "Profe":
                    T7.setVisible(true);
                    break;

                case "Rosa":
                    T8.setVisible(true);
                    break;
            }

            switch (pok2.getNombre()) {
                case "Inge":
                    Inge1D.setVisible(true);
                    break;
                case "Licenciada":
                    Lic1D.setVisible(true);
                    break;
                case "Bisonte":
                    Bis1D.setVisible(true);
                    break;
            }

            switch (player1.getPersonaje()) {
                case "Sistemas":
                    T9.setVisible(true);
                    break;

                case "Arqui":
                    T10.setVisible(true);
                    break;

                case "Profe":
                    T11.setVisible(true);
                    break;

                case "Rosa":
                    T12.setVisible(true);
                    break;
            }

            switch (pok1.getNombre()) {
                case "Inge":
                    Inge2D.setVisible(true);
                    break;
                case "Licenciada":
                    Lic2D.setVisible(true);
                    break;
                case "Bisonte":
                    Bis2D.setVisible(true);
                    break;
            }
        }

    }

    public WinnerScreen(Playable player1, Playable player2, int winner, Clip clip) {

        initComponents();
        this.clip = clip;
        this.player1 = player1;
        this.player2 = player2;
        this.pok1 = player1.getPokemon();
        this.pok2 = player2.getPokemon();

        T1.setVisible(false);
        T2.setVisible(false);
        T3.setVisible(false);
        T4.setVisible(false);
        T5.setVisible(false);
        T6.setVisible(false);
        T7.setVisible(false);
        T8.setVisible(false);
        T9.setVisible(false);
        T10.setVisible(false);
        T11.setVisible(false);
        T12.setVisible(false);
        T13.setVisible(false);
        T14.setVisible(false);
        T15.setVisible(false);
        T16.setVisible(false);

        Inge1D.setVisible(false);
        Lic1D.setVisible(false);
        Bis1D.setVisible(false);
        Inge1I.setVisible(false);
        Lic1I.setVisible(false);
        Bis1I.setVisible(false);
        Inge2D.setVisible(false);
        Lic2D.setVisible(false);
        Bis2D.setVisible(false);
        Inge2I.setVisible(false);
        Lic2I.setVisible(false);
        Bis2I.setVisible(false);

        if (winner == 1) {
            WinText.setText("Player 1 Wins!!");

            switch (player1.getPersonaje()) {
                case "Sistemas":
                    T1.setVisible(true);
                    break;

                case "Arqui":
                    T2.setVisible(true);
                    break;

                case "Profe":
                    T3.setVisible(true);
                    break;

                case "Rosa":
                    T4.setVisible(true);
                    break;
            }

            switch (pok1.getNombre()) {
                case "Inge":
                    Inge1D.setVisible(true);
                    break;
                case "Licenciada":
                    Lic1D.setVisible(true);
                    break;
                case "Bisonte":
                    Bis1D.setVisible(true);
                    break;
            }

            switch (player2.getPersonaje()) {
                case "Sistemas":
                    T13.setVisible(true);
                    break;

                case "Arqui":
                    T14.setVisible(true);
                    break;

                case "Profe":
                    T15.setVisible(true);
                    break;

                case "Rosa":
                    T16.setVisible(true);
                    break;
            }

            switch (pok2.getNombre()) {
                case "Inge":
                    Inge2I.setVisible(true);
                    break;
                case "Licenciada":
                    Lic2I.setVisible(true);
                    break;
                case "Bisonte":
                    Bis2I.setVisible(true);
                    break;
            }

        } else {
            WinText.setText("Player 2 Wins!!");

            switch (player2.getPersonaje()) {
                case "Sistemas":
                    T5.setVisible(true);
                    break;

                case "Arqui":
                    T6.setVisible(true);
                    break;

                case "Profe":
                    T7.setVisible(true);
                    break;

                case "Rosa":
                    T8.setVisible(true);
                    break;
            }

            switch (pok2.getNombre()) {
                case "Inge":
                    Inge1D.setVisible(true);
                    break;
                case "Licenciada":
                    Lic1D.setVisible(true);
                    break;
                case "Bisonte":
                    Bis1D.setVisible(true);
                    break;
            }

            switch (player1.getPersonaje()) {
                case "Sistemas":
                    T9.setVisible(true);
                    break;

                case "Arqui":
                    T10.setVisible(true);
                    break;

                case "Profe":
                    T11.setVisible(true);
                    break;

                case "Rosa":
                    T12.setVisible(true);
                    break;
            }

            switch (pok1.getNombre()) {
                case "Inge":
                    Inge2D.setVisible(true);
                    break;
                case "Licenciada":
                    Lic2D.setVisible(true);
                    break;
                case "Bisonte":
                    Bis2D.setVisible(true);
                    break;
            }
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BackButton = new javax.swing.JButton();
        WinText = new javax.swing.JLabel();
        T1 = new javax.swing.JLabel();
        T2 = new javax.swing.JLabel();
        T3 = new javax.swing.JLabel();
        T4 = new javax.swing.JLabel();
        T5 = new javax.swing.JLabel();
        T6 = new javax.swing.JLabel();
        T7 = new javax.swing.JLabel();
        T8 = new javax.swing.JLabel();
        T9 = new javax.swing.JLabel();
        T10 = new javax.swing.JLabel();
        T11 = new javax.swing.JLabel();
        T12 = new javax.swing.JLabel();
        T13 = new javax.swing.JLabel();
        T14 = new javax.swing.JLabel();
        T15 = new javax.swing.JLabel();
        T16 = new javax.swing.JLabel();
        Inge1D = new javax.swing.JLabel();
        Lic1D = new javax.swing.JLabel();
        Bis1D = new javax.swing.JLabel();
        Inge1I = new javax.swing.JLabel();
        Lic1I = new javax.swing.JLabel();
        Bis1I = new javax.swing.JLabel();
        Inge2D = new javax.swing.JLabel();
        Lic2D = new javax.swing.JLabel();
        Bis2D = new javax.swing.JLabel();
        Inge2I = new javax.swing.JLabel();
        Lic2I = new javax.swing.JLabel();
        Bis2I = new javax.swing.JLabel();
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
        getContentPane().add(BackButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 640, 160, 70));

        WinText.setFont(new java.awt.Font("ArcadeClassic", 0, 48)); // NOI18N
        WinText.setForeground(new java.awt.Color(255, 255, 255));
        WinText.setText("text   winner");
        getContentPane().add(WinText, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, -1, -1));

        T1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sprites/Trainer1R.png"))); // NOI18N
        T1.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Sprites/Nothing.png"))); // NOI18N
        getContentPane().add(T1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 120, -1, -1));

        T2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sprites/Trainer2R.png"))); // NOI18N
        T2.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Sprites/Nothing.png"))); // NOI18N
        getContentPane().add(T2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 120, -1, -1));

        T3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sprites/Trainer3R.png"))); // NOI18N
        T3.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Sprites/Nothing.png"))); // NOI18N
        getContentPane().add(T3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 120, -1, -1));

        T4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sprites/Trainer5R.png"))); // NOI18N
        T4.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Sprites/Nothing.png"))); // NOI18N
        getContentPane().add(T4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 120, -1, -1));

        T5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sprites/Trainer1L.png"))); // NOI18N
        T5.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Sprites/Nothing.png"))); // NOI18N
        getContentPane().add(T5, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 120, -1, -1));

        T6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sprites/Trainer2L.png"))); // NOI18N
        T6.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Sprites/Nothing.png"))); // NOI18N
        getContentPane().add(T6, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 120, -1, -1));

        T7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sprites/Trainer3L.png"))); // NOI18N
        T7.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Sprites/Nothing.png"))); // NOI18N
        getContentPane().add(T7, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 120, -1, -1));

        T8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sprites/Trainer5L.png"))); // NOI18N
        T8.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Sprites/Nothing.png"))); // NOI18N
        getContentPane().add(T8, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 130, -1, -1));

        T9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sprites/Trainer1R.png"))); // NOI18N
        T9.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Sprites/Nothing.png"))); // NOI18N
        getContentPane().add(T9, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 290, -1, -1));

        T10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sprites/Trainer2R.png"))); // NOI18N
        T10.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Sprites/Nothing.png"))); // NOI18N
        getContentPane().add(T10, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 290, -1, -1));

        T11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sprites/Trainer3R.png"))); // NOI18N
        T11.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Sprites/Nothing.png"))); // NOI18N
        getContentPane().add(T11, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 290, -1, -1));

        T12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sprites/Trainer5R.png"))); // NOI18N
        T12.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Sprites/Nothing.png"))); // NOI18N
        getContentPane().add(T12, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 290, -1, -1));

        T13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sprites/Trainer1L.png"))); // NOI18N
        T13.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Sprites/Nothing.png"))); // NOI18N
        getContentPane().add(T13, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 290, -1, -1));

        T14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sprites/Trainer2L.png"))); // NOI18N
        T14.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Sprites/Nothing.png"))); // NOI18N
        getContentPane().add(T14, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 290, -1, -1));

        T15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sprites/Trainer3L.png"))); // NOI18N
        T15.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Sprites/Nothing.png"))); // NOI18N
        getContentPane().add(T15, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 290, -1, -1));

        T16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sprites/Trainer5L.png"))); // NOI18N
        T16.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Sprites/Nothing.png"))); // NOI18N
        getContentPane().add(T16, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 300, -1, -1));

        Inge1D.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sprites/IngeR.png"))); // NOI18N
        Inge1D.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Sprites/Nothing.png"))); // NOI18N
        getContentPane().add(Inge1D, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, -1, -1));

        Lic1D.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sprites/LirR.png"))); // NOI18N
        Lic1D.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Sprites/Nothing.png"))); // NOI18N
        getContentPane().add(Lic1D, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, -1, -1));

        Bis1D.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sprites/BisR.png"))); // NOI18N
        getContentPane().add(Bis1D, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, -1, -1));

        Inge1I.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sprites/IngeL.png"))); // NOI18N
        Inge1I.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Sprites/Nothing.png"))); // NOI18N
        getContentPane().add(Inge1I, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, -1, -1));

        Lic1I.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sprites/LirL.png"))); // NOI18N
        Lic1I.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Sprites/Nothing.png"))); // NOI18N
        getContentPane().add(Lic1I, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, -1, -1));

        Bis1I.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sprites/BisL.png"))); // NOI18N
        Bis1I.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Sprites/Nothing.png"))); // NOI18N
        getContentPane().add(Bis1I, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, -1, -1));

        Inge2D.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sprites/IngeR.png"))); // NOI18N
        Inge2D.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Sprites/Nothing.png"))); // NOI18N
        getContentPane().add(Inge2D, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 320, -1, -1));

        Lic2D.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sprites/LirR.png"))); // NOI18N
        Lic2D.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Sprites/Nothing.png"))); // NOI18N
        getContentPane().add(Lic2D, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 300, -1, -1));

        Bis2D.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sprites/BisR.png"))); // NOI18N
        getContentPane().add(Bis2D, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 310, -1, -1));

        Inge2I.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sprites/IngeL.png"))); // NOI18N
        Inge2I.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Sprites/Nothing.png"))); // NOI18N
        getContentPane().add(Inge2I, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 320, -1, -1));

        Lic2I.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sprites/LirL.png"))); // NOI18N
        Lic2I.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Sprites/Nothing.png"))); // NOI18N
        getContentPane().add(Lic2I, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 300, -1, -1));

        Bis2I.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sprites/BisL.png"))); // NOI18N
        Bis2I.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Sprites/Nothing.png"))); // NOI18N
        getContentPane().add(Bis2I, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 310, -1, -1));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sprites/BackWinner.png"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void playSound() {
        try {
            String soundFile = "/sounds/song5.wav";
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


    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        playButtonSound();
        ScreenPlayers scp = new ScreenPlayers();
        scp.setVisible(true);
        pauseSound();

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
            java.util.logging.Logger.getLogger(WinnerScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WinnerScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WinnerScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WinnerScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WinnerScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JLabel Bis1D;
    private javax.swing.JLabel Bis1I;
    private javax.swing.JLabel Bis2D;
    private javax.swing.JLabel Bis2I;
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel Inge1D;
    private javax.swing.JLabel Inge1I;
    private javax.swing.JLabel Inge2D;
    private javax.swing.JLabel Inge2I;
    private javax.swing.JLabel Lic1D;
    private javax.swing.JLabel Lic1I;
    private javax.swing.JLabel Lic2D;
    private javax.swing.JLabel Lic2I;
    private javax.swing.JLabel T1;
    private javax.swing.JLabel T10;
    private javax.swing.JLabel T11;
    private javax.swing.JLabel T12;
    private javax.swing.JLabel T13;
    private javax.swing.JLabel T14;
    private javax.swing.JLabel T15;
    private javax.swing.JLabel T16;
    private javax.swing.JLabel T2;
    private javax.swing.JLabel T3;
    private javax.swing.JLabel T4;
    private javax.swing.JLabel T5;
    private javax.swing.JLabel T6;
    private javax.swing.JLabel T7;
    private javax.swing.JLabel T8;
    private javax.swing.JLabel T9;
    private javax.swing.JLabel WinText;
    // End of variables declaration//GEN-END:variables
}
