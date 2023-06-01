
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Select extends javax.swing.JFrame {

    private Player player1 = new Playable();
    private Player player2 = new Playable();

    public Select(Clip clip) {
        HyperVisor.verificarArchivos();
        initComponents();
        this.clip = clip;

        Locker5.setVisible(false);
        Locker6.setVisible(false);
        Locker7.setVisible(false);
        Locker8.setVisible(false);
        PlayerArquiL.setVisible(false);
        PlayerDiegoL.setVisible(false);
        PlayerProfeL.setVisible(false);
        PlayerSistemasL.setVisible(false);
        text5.setVisible(false);
        text6.setVisible(false);
        text7.setVisible(false);
        text8.setVisible(false);

        FightButton.setVisible(false);
    }

    public Select() {
        HyperVisor.verificarArchivos();
        initComponents();
        playSound();
        Locker5.setVisible(false);
        Locker6.setVisible(false);
        Locker7.setVisible(false);
        Locker8.setVisible(false);
        PlayerArquiL.setVisible(false);
        PlayerDiegoL.setVisible(false);
        PlayerProfeL.setVisible(false);
        PlayerSistemasL.setVisible(false);
        text5.setVisible(false);
        text6.setVisible(false);
        text7.setVisible(false);
        text8.setVisible(false);

        FightButton.setVisible(false);
    }

    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BackButton = new javax.swing.JButton();
        text1 = new javax.swing.JLabel();
        text2 = new javax.swing.JLabel();
        text3 = new javax.swing.JLabel();
        text4 = new javax.swing.JLabel();
        text5 = new javax.swing.JLabel();
        text6 = new javax.swing.JLabel();
        text7 = new javax.swing.JLabel();
        text8 = new javax.swing.JLabel();
        Player2Text = new javax.swing.JLabel();
        Player1Text = new javax.swing.JLabel();
        FightButton = new javax.swing.JButton();
        PlayerSistemasR = new javax.swing.JButton();
        PlayerProfeR = new javax.swing.JButton();
        PlayerDiegoR = new javax.swing.JButton();
        PlayerArquiR = new javax.swing.JButton();
        PlayerSistemasL = new javax.swing.JButton();
        PlayerArquiL = new javax.swing.JButton();
        PlayerProfeL = new javax.swing.JButton();
        PlayerDiegoL = new javax.swing.JButton();
        Locker1 = new javax.swing.JLabel();
        Locker2 = new javax.swing.JLabel();
        Locker3 = new javax.swing.JLabel();
        Locker4 = new javax.swing.JLabel();
        Locker5 = new javax.swing.JLabel();
        Locker6 = new javax.swing.JLabel();
        Locker7 = new javax.swing.JLabel();
        Locker8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Funny Fight");
        setLocation(new java.awt.Point(0, 0));
        setMaximumSize(new java.awt.Dimension(1280, 720));
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
        getContentPane().add(BackButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 640, 150, 70));

        text1.setFont(new java.awt.Font("ArcadeClassic", 0, 48)); // NOI18N
        text1.setForeground(new java.awt.Color(255, 255, 255));
        text1.setText("OTAKU");
        getContentPane().add(text1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, -1, -1));

        text2.setFont(new java.awt.Font("ArcadeClassic", 0, 48)); // NOI18N
        text2.setForeground(new java.awt.Color(255, 255, 255));
        text2.setText("ARQUI");
        getContentPane().add(text2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 130, -1, -1));

        text3.setFont(new java.awt.Font("ArcadeClassic", 0, 48)); // NOI18N
        text3.setForeground(new java.awt.Color(255, 255, 255));
        text3.setText("PROFE");
        getContentPane().add(text3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 390, -1, -1));

        text4.setFont(new java.awt.Font("ArcadeClassic", 0, 48)); // NOI18N
        text4.setForeground(new java.awt.Color(255, 255, 255));
        text4.setText("INGE");
        getContentPane().add(text4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 390, -1, -1));

        text5.setFont(new java.awt.Font("ArcadeClassic", 0, 48)); // NOI18N
        text5.setForeground(new java.awt.Color(255, 255, 255));
        text5.setText("OTAKU");
        getContentPane().add(text5, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 130, -1, -1));

        text6.setFont(new java.awt.Font("ArcadeClassic", 0, 48)); // NOI18N
        text6.setForeground(new java.awt.Color(255, 255, 255));
        text6.setText("ARQUI");
        getContentPane().add(text6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 130, -1, -1));

        text7.setFont(new java.awt.Font("ArcadeClassic", 0, 48)); // NOI18N
        text7.setForeground(new java.awt.Color(255, 255, 255));
        text7.setText("PROFE");
        getContentPane().add(text7, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 390, -1, -1));

        text8.setFont(new java.awt.Font("ArcadeClassic", 0, 48)); // NOI18N
        text8.setForeground(new java.awt.Color(255, 255, 255));
        text8.setText("INGE");
        getContentPane().add(text8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 390, -1, -1));

        Player2Text.setFont(new java.awt.Font("Super Mario Bros. 2", 0, 36)); // NOI18N
        Player2Text.setForeground(new java.awt.Color(255, 255, 255));
        Player2Text.setText("PLAYER 2");
        getContentPane().add(Player2Text, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 70, 290, -1));

        Player1Text.setFont(new java.awt.Font("Super Mario Bros. 2", 0, 36)); // NOI18N
        Player1Text.setForeground(new java.awt.Color(255, 255, 255));
        Player1Text.setText("PLAYER 1");
        getContentPane().add(Player1Text, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 70, 290, -1));

        FightButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets.Buttons/FighterButton3.png"))); // NOI18N
        FightButton.setContentAreaFilled(false);
        FightButton.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Sprites/Nothing.png"))); // NOI18N
        FightButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FightButtonActionPerformed(evt);
            }
        });
        getContentPane().add(FightButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 580, 250, 120));

        PlayerSistemasR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sprites/Trainer1R.png"))); // NOI18N
        PlayerSistemasR.setBorderPainted(false);
        PlayerSistemasR.setContentAreaFilled(false);
        PlayerSistemasR.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Sprites/Nothing.png"))); // NOI18N
        PlayerSistemasR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlayerSistemasRActionPerformed(evt);
            }
        });
        getContentPane().add(PlayerSistemasR, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 200, 180));

        PlayerProfeR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sprites/Trainer3R.png"))); // NOI18N
        PlayerProfeR.setContentAreaFilled(false);
        PlayerProfeR.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Sprites/Nothing.png"))); // NOI18N
        PlayerProfeR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlayerProfeRActionPerformed(evt);
            }
        });
        getContentPane().add(PlayerProfeR, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, 200, 180));

        PlayerDiegoR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sprites/Trainer5R.png"))); // NOI18N
        PlayerDiegoR.setContentAreaFilled(false);
        PlayerDiegoR.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Sprites/Nothing.png"))); // NOI18N
        PlayerDiegoR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlayerDiegoRActionPerformed(evt);
            }
        });
        getContentPane().add(PlayerDiegoR, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 440, 200, 180));

        PlayerArquiR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sprites/Trainer2R.png"))); // NOI18N
        PlayerArquiR.setContentAreaFilled(false);
        PlayerArquiR.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Sprites/Nothing.png"))); // NOI18N
        PlayerArquiR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlayerArquiRActionPerformed(evt);
            }
        });
        getContentPane().add(PlayerArquiR, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 180, 180, 180));

        PlayerSistemasL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sprites/Trainer1L.png"))); // NOI18N
        PlayerSistemasL.setToolTipText("");
        PlayerSistemasL.setContentAreaFilled(false);
        PlayerSistemasL.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Sprites/Nothing.png"))); // NOI18N
        PlayerSistemasL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlayerSistemasLActionPerformed(evt);
            }
        });
        getContentPane().add(PlayerSistemasL, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 180, 200, 180));

        PlayerArquiL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sprites/Trainer2L.png"))); // NOI18N
        PlayerArquiL.setContentAreaFilled(false);
        PlayerArquiL.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Sprites/Nothing.png"))); // NOI18N
        PlayerArquiL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlayerArquiLActionPerformed(evt);
            }
        });
        getContentPane().add(PlayerArquiL, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 180, 200, 180));

        PlayerProfeL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sprites/Trainer3L.png"))); // NOI18N
        PlayerProfeL.setContentAreaFilled(false);
        PlayerProfeL.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Sprites/Nothing.png"))); // NOI18N
        PlayerProfeL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlayerProfeLActionPerformed(evt);
            }
        });
        getContentPane().add(PlayerProfeL, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 440, 200, 180));

        PlayerDiegoL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sprites/Trainer5L.png"))); // NOI18N
        PlayerDiegoL.setContentAreaFilled(false);
        PlayerDiegoL.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Sprites/Nothing.png"))); // NOI18N
        PlayerDiegoL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlayerDiegoLActionPerformed(evt);
            }
        });
        getContentPane().add(PlayerDiegoL, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 440, 190, 180));

        Locker1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets.Buttons/SelectorBack.png"))); // NOI18N
        Locker1.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Sprites/Nothing.png"))); // NOI18N
        getContentPane().add(Locker1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        Locker2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets.Buttons/SelectorBack.png"))); // NOI18N
        Locker2.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Sprites/Nothing.png"))); // NOI18N
        getContentPane().add(Locker2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 170, 210, 200));

        Locker3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets.Buttons/SelectorBack.png"))); // NOI18N
        Locker3.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Sprites/Nothing.png"))); // NOI18N
        getContentPane().add(Locker3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, -1, -1));

        Locker4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets.Buttons/SelectorBack.png"))); // NOI18N
        Locker4.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Sprites/Nothing.png"))); // NOI18N
        getContentPane().add(Locker4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 430, -1, -1));

        Locker5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets.Buttons/SelectorBack.png"))); // NOI18N
        Locker5.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Sprites/Nothing.png"))); // NOI18N
        getContentPane().add(Locker5, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 170, -1, -1));

        Locker6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets.Buttons/SelectorBack.png"))); // NOI18N
        Locker6.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Sprites/Nothing.png"))); // NOI18N
        getContentPane().add(Locker6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 170, -1, 200));

        Locker7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets.Buttons/SelectorBack.png"))); // NOI18N
        Locker7.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Sprites/Nothing.png"))); // NOI18N
        getContentPane().add(Locker7, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 430, -1, -1));

        Locker8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets.Buttons/SelectorBack.png"))); // NOI18N
        Locker8.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Sprites/Nothing.png"))); // NOI18N
        getContentPane().add(Locker8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 430, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets.Animations/Clouds.gif"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets.Animations/Clouds.gif"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, -1, -1));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets.Animations/BackSeelectWB.png"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    //Zona de botones    
    private void PlayerSistemasRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlayerSistemasRActionPerformed
        playButtonSound();

        Locker2.setVisible(false);
        Locker3.setVisible(false);
        Locker4.setVisible(false);
        PlayerArquiR.setVisible(false);
        PlayerDiegoR.setVisible(false);
        PlayerProfeR.setVisible(false);
        text2.setVisible(false);
        text3.setVisible(false);
        text4.setVisible(false);

        Locker5.setVisible(true);
        Locker6.setVisible(true);
        Locker7.setVisible(true);
        Locker8.setVisible(true);
        PlayerArquiL.setVisible(true);
        PlayerDiegoL.setVisible(true);
        PlayerProfeL.setVisible(true);
        PlayerSistemasL.setVisible(true);
        text5.setVisible(true);
        text6.setVisible(true);
        text7.setVisible(true);
        text8.setVisible(true);

        player1.setPersonaje("Sistemas");
        player1.setPotenciador(1.5);
    }//GEN-LAST:event_PlayerSistemasRActionPerformed

    private void PlayerProfeRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlayerProfeRActionPerformed
        playButtonSound();

        Locker1.setVisible(false);
        Locker2.setVisible(false);
        Locker4.setVisible(false);
        PlayerArquiR.setVisible(false);
        PlayerDiegoR.setVisible(false);
        PlayerSistemasR.setVisible(false);
        text2.setVisible(false);
        text1.setVisible(false);
        text4.setVisible(false);

        Locker5.setVisible(true);
        Locker6.setVisible(true);
        Locker7.setVisible(true);
        Locker8.setVisible(true);
        PlayerArquiL.setVisible(true);
        PlayerDiegoL.setVisible(true);
        PlayerProfeL.setVisible(true);
        PlayerSistemasL.setVisible(true);
        text5.setVisible(true);
        text6.setVisible(true);
        text7.setVisible(true);
        text8.setVisible(true);

        player1.setPersonaje("Profe");
        player1.setPotenciador(2.5);
    }//GEN-LAST:event_PlayerProfeRActionPerformed

    private void PlayerDiegoRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlayerDiegoRActionPerformed
        playButtonSound();

        Locker1.setVisible(false);
        Locker2.setVisible(false);
        Locker3.setVisible(false);
        PlayerArquiR.setVisible(false);
        PlayerSistemasR.setVisible(false);
        PlayerProfeR.setVisible(false);
        text2.setVisible(false);
        text1.setVisible(false);
        text3.setVisible(false);

        Locker5.setVisible(true);
        Locker6.setVisible(true);
        Locker7.setVisible(true);
        Locker8.setVisible(true);
        PlayerArquiL.setVisible(true);
        PlayerDiegoL.setVisible(true);
        PlayerProfeL.setVisible(true);
        PlayerSistemasL.setVisible(true);
        text5.setVisible(true);
        text6.setVisible(true);
        text7.setVisible(true);
        text8.setVisible(true);

        player1.setPersonaje("Rosa");
        player1.setPotenciador(1.3);
    }//GEN-LAST:event_PlayerDiegoRActionPerformed

    private void PlayerArquiRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlayerArquiRActionPerformed
        playButtonSound();

        Locker1.setVisible(false);
        Locker3.setVisible(false);
        Locker4.setVisible(false);
        PlayerSistemasR.setVisible(false);
        PlayerDiegoR.setVisible(false);
        PlayerProfeR.setVisible(false);
        text1.setVisible(false);
        text3.setVisible(false);
        text4.setVisible(false);

        Locker5.setVisible(true);
        Locker6.setVisible(true);
        Locker7.setVisible(true);
        Locker8.setVisible(true);
        PlayerArquiL.setVisible(true);
        PlayerDiegoL.setVisible(true);
        PlayerProfeL.setVisible(true);
        PlayerSistemasL.setVisible(true);
        text5.setVisible(true);
        text6.setVisible(true);
        text7.setVisible(true);
        text8.setVisible(true);

        player1.setPersonaje("Arqui");
        player1.setPotenciador(1.2);
    }//GEN-LAST:event_PlayerArquiRActionPerformed

    private void PlayerSistemasLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlayerSistemasLActionPerformed
        playButtonSound();

        Locker6.setVisible(false);
        Locker7.setVisible(false);
        Locker8.setVisible(false);
        PlayerArquiL.setVisible(false);
        PlayerDiegoL.setVisible(false);
        PlayerProfeL.setVisible(false);
        text6.setVisible(false);
        text7.setVisible(false);
        text8.setVisible(false);

        FightButton.setVisible(true);

        player2.setPersonaje("Sistemas");
        player2.setPotenciador(1.5);
    }//GEN-LAST:event_PlayerSistemasLActionPerformed

    private void PlayerArquiLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlayerArquiLActionPerformed
        playButtonSound();

        Locker5.setVisible(false);
        Locker7.setVisible(false);
        Locker8.setVisible(false);
        PlayerSistemasL.setVisible(false);
        PlayerDiegoL.setVisible(false);
        PlayerProfeL.setVisible(false);
        text5.setVisible(false);
        text7.setVisible(false);
        text8.setVisible(false);

        FightButton.setVisible(true);

        player2.setPersonaje("Arqui");
        player2.setPotenciador(1.2);
    }//GEN-LAST:event_PlayerArquiLActionPerformed

    private void PlayerProfeLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlayerProfeLActionPerformed
        playButtonSound();

        Locker5.setVisible(false);
        Locker6.setVisible(false);
        Locker8.setVisible(false);
        PlayerArquiL.setVisible(false);
        PlayerDiegoL.setVisible(false);
        PlayerSistemasL.setVisible(false);
        text6.setVisible(false);
        text5.setVisible(false);
        text8.setVisible(false);

        FightButton.setVisible(true);

        player2.setPersonaje("Profe");
        player2.setPotenciador(2.5);
    }//GEN-LAST:event_PlayerProfeLActionPerformed

    private void PlayerDiegoLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlayerDiegoLActionPerformed
        playButtonSound();

        Locker5.setVisible(false);
        Locker6.setVisible(false);
        Locker7.setVisible(false);
        PlayerArquiL.setVisible(false);
        PlayerSistemasL.setVisible(false);
        PlayerProfeL.setVisible(false);
        text6.setVisible(false);
        text7.setVisible(false);
        text5.setVisible(false);

        FightButton.setVisible(true);

        player2.setPersonaje("Rosa");
        player2.setPotenciador(1.3);
    }//GEN-LAST:event_PlayerDiegoLActionPerformed

    private void FightButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FightButtonActionPerformed
        SelectPoke selectP = new SelectPoke(player1, player2, clip);
        playButtonSound();
        selectP.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_FightButtonActionPerformed

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        playButtonSound();

        pauseSound();
        ScreenPlayers sp = new ScreenPlayers();
        sp.setVisible(true);
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
            java.util.logging.Logger.getLogger(Select.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Select.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Select.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Select.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Select().setVisible(true);

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
    private javax.swing.JLabel Locker7;
    private javax.swing.JLabel Locker8;
    private javax.swing.JLabel Player1Text;
    private javax.swing.JLabel Player2Text;
    private javax.swing.JButton PlayerArquiL;
    private javax.swing.JButton PlayerArquiR;
    private javax.swing.JButton PlayerDiegoL;
    private javax.swing.JButton PlayerDiegoR;
    private javax.swing.JButton PlayerProfeL;
    private javax.swing.JButton PlayerProfeR;
    private javax.swing.JButton PlayerSistemasL;
    private javax.swing.JButton PlayerSistemasR;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel text1;
    private javax.swing.JLabel text2;
    private javax.swing.JLabel text3;
    private javax.swing.JLabel text4;
    private javax.swing.JLabel text5;
    private javax.swing.JLabel text6;
    private javax.swing.JLabel text7;
    private javax.swing.JLabel text8;
    // End of variables declaration//GEN-END:variables

}
