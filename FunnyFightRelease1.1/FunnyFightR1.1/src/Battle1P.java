
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Battle1P extends javax.swing.JFrame {

    private int Izquierda = 0; // Contador para los botónes de la izquierda
    private int Derecha = 0; // Contador para los botónes de la derecha

    private int maxLifeL = 0;
    private int maxLifeR = 0;

    private Playable player1 = new Playable();
    private IA player2 = new IA();
    private Pokemon pok1 = new Pokemon();
    private Pokemon pok2 = new Pokemon();
    private Clip clip;
    private Long clipTime;

    public Battle1P(Player player1, Player ia) { //e = entrenador p=pokemon
        
        HyperVisor.verificarArchivos();
        initComponents();
        playSound();
        this.pok2 = ia.getPokemon();
        this.pok1 = player1.getPokemon();

        BombaL.setVisible(false);
        BombaR.setVisible(false);
        FuegoL.setVisible(false);
        FuegoR.setVisible(false);

        this.player1 = (Playable)player1;
        this.player2 = (IA)ia;

        HealtingEffectL.setVisible(false);
        HealtingEffectR.setVisible(false);

        E1.setVisible(false);
        E2.setVisible(false);
        E3.setVisible(false);
        E4.setVisible(false);
        P1.setVisible(false);
        P2.setVisible(false);
        P3.setVisible(false);

        E5.setVisible(false);
        E6.setVisible(false);
        E7.setVisible(false);
        E8.setVisible(false);
        P4.setVisible(false);
        P5.setVisible(false);
        P6.setVisible(false);

        Barra1.setMaximum(pok1.getVida());
        Barra1.setMinimum(0);
        Barra1.setValue(pok1.getVida());
        HealPercent1.setText((Barra1.getPercentComplete()) * 100 + "%");

        Barra1.setMaximum(pok1.getVida());
        Barra1.setMinimum(0);
        Barra1.setValue(pok1.getVida());
        HealPercent1.setText((Barra1.getPercentComplete()) * 100 + "%");

        Barra1.setMaximum(pok1.getVida());
        Barra1.setMinimum(0);
        Barra1.setValue(pok1.getVida());
        HealPercent1.setText((Barra1.getPercentComplete()) * 100 + "%");

        Barra2.setMaximum(pok2.getVida());
        Barra2.setMinimum(0);
        Barra2.setValue(pok2.getVida());
        HealPercent2.setText((Barra2.getPercentComplete()) * 100 + "%");

        Barra2.setMaximum(pok2.getVida());
        Barra2.setMinimum(0);
        Barra2.setValue(pok2.getVida());
        HealPercent2.setText((Barra2.getPercentComplete()) * 100 + "%");

        Barra2.setMaximum(pok2.getVida());
        Barra2.setMinimum(0);
        Barra2.setValue(pok2.getVida());
        HealPercent2.setText((Barra2.getPercentComplete()) * 100 + "%");

        Barra2.setMaximum(pok2.getVida());
        Barra2.setMinimum(0);
        Barra2.setValue(pok2.getVida());
        HealPercent2.setText((Barra2.getPercentComplete()) * 100 + "%");

        switch (player1.getPersonaje()) {
            case "Sistemas" ->
                E1.setVisible(true);

            case "Arqui" ->
                E2.setVisible(true);

            case "Profe" ->
                E3.setVisible(true);

            case "Rosa" ->
                E4.setVisible(true);

        }

        switch (player2.getPersonaje()) {
            case "Sistemas" ->
                E5.setVisible(true);

            case "Arqui" ->
                E6.setVisible(true);

            case "Profe" ->
                E7.setVisible(true);

            case "Rosa" ->
                E8.setVisible(true);

        }

        switch (pok1.getNombre()) {
            case "Inge" ->
                P1.setVisible(true);

            case "Licenciada" ->
                P2.setVisible(true);

            case "Bisonte" ->
                P3.setVisible(true);
        }

        switch (pok2.getNombre()) {
            case "Inge" ->
                P4.setVisible(true);

            case "Licenciada" ->
                P5.setVisible(true);

            case "Bisonte" ->
                P6.setVisible(true);
        }

    }

    private void playSound() {
        try {
            String soundFile = "/sounds/song4.wav";
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

    private void playCharSoundL() {
        if (pok1.getNombre().equals("Inge") || pok1.getNombre().equals("Licenciada")) {
            try {
                String soundFile = "/sounds/perro.wav";
                AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(getClass().getResource(soundFile));
                Clip clip3 = AudioSystem.getClip();
                clip3.open(audioInputStream);
                clip3.start();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            try {
                String soundFile = "/sounds/bisonte.wav";
                AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(getClass().getResource(soundFile));
                Clip clip3 = AudioSystem.getClip();
                clip3.open(audioInputStream);
                clip3.start();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

    private void playCharSoundR() {
        if (pok2.getNombre().equals("Inge") || pok2.getNombre().equals("Licenciada")) {
            try {
                String soundFile = "/sounds/perro.wav";
                AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(getClass().getResource(soundFile));
                Clip clip3 = AudioSystem.getClip();
                clip3.open(audioInputStream);
                clip3.start();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            try {
                String soundFile = "/sounds/bisonte.wav";
                AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(getClass().getResource(soundFile));
                Clip clip3 = AudioSystem.getClip();
                clip3.open(audioInputStream);
                clip3.start();
            } catch (Exception e) {
                e.printStackTrace();
            }
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

    public int bar1Status() {
        double bar = Barra1.getPercentComplete();
        bar *= 100;

        System.out.println("Barra 1: " + bar);

        return (int) bar;
    }

    public int bar2Status() {
        double bar = Barra2.getPercentComplete();
        bar = (bar * 100);

        System.out.println("Barra 2: " + bar);

        return (int) bar;
    }

    private void playHealSound() {
        try {
            String soundFile = "/sounds/HealSound.wav";
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(getClass().getResource(soundFile));
            Clip clip4 = AudioSystem.getClip();
            clip4.open(audioInputStream);
            clip4.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Battle1P() {
        initComponents();
    }

    void getWinner() {
        int winner = 0;
        if (pok1.getVida() > pok2.getVida()) {
            winner = 1;
            WinnerScreen win = new WinnerScreen(player1, player2, winner, clip);
            win.setVisible(true);
            this.dispose();
        }
        if (pok2.getVida() > pok1.getVida()) {
            winner = 2;
            WinnerScreen win = new WinnerScreen(player1, player2, winner, clip);
            win.setVisible(true);
            this.dispose();
        }
    }

    private void RandomAnimationL() {
        int action = (int) (Math.random() * 2) + 1;
        if (action == 1) {
            FuegoL.setVisible(true);
        } else {
            BombaL.setVisible(true);
        }
    }

    private void RandomAnimationR() {
        int action = (int) (Math.random() * 2) + 1;
        if (action == 1) {
            FuegoR.setVisible(true);
        } else {
            BombaR.setVisible(true);
        }
    }

    private void callAI() {
        // Seleccione aleatoriamente una acción
        int action = (int) (Math.random() * 2) + 1;

        // Verificar si la acción seleccionada es posible en el turno actual
        if (action == 1 && Derecha < 10 && pok2.getVida() >= 0) {
            //cosas de debug
            System.out.println("Atacando");
            AIAtack();
        } else if (action == 2 && Derecha < 10 && pok2.getVida() >= 0) {
            System.out.println("Curando");
            AIHeal();
        }
    }

    private void AIAtack() {
        if (Derecha < 10 && pok1.getVida() >= 0) {
            Derecha++;
            playCharSoundR();

            BombaR.setVisible(false);
            FuegoR.setVisible(false);
            RandomAnimationL();
            pok1.setVida(-1 * player2.atacar());
            Barra1.setValue(pok1.getVida());
            HealPercent1.setText(bar1Status() + "%");
            HealtingEffectR.setVisible(false);

            if (pok1.getVida() <= 0) {
                getWinner();
            }

            AtackL.setVisible(true);
            HealL.setVisible(true);

            Turno.setText("Player 1 Turn!");
        } else {
            getWinner();
        }
    }

    private void AIHeal() {
        if (Derecha < 10 && pok2.getVida() >= 0) {
            Derecha++;
            BombaR.setVisible(false);
            FuegoR.setVisible(false);
            if ((pok2.getVida() + 15) <= maxLifeR) {
                playHealSound();
                pok2.setVida(player2.curar());
                Barra2.setValue(pok2.getVida());
                HealPercent2.setText(bar2Status() + "%");
                HealtingEffectR.setVisible(true);
            }
            AtackL.setVisible(true);
            HealL.setVisible(true);
            Turno.setText("Player 1 Turn!");
        } else {
            getWinner();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FuegoR = new javax.swing.JLabel();
        BombaR = new javax.swing.JLabel();
        FuegoL = new javax.swing.JLabel();
        BombaL = new javax.swing.JLabel();
        HealtingEffectL = new javax.swing.JLabel();
        HealtingEffectR = new javax.swing.JLabel();
        Play1Txt = new javax.swing.JLabel();
        Play2Txt = new javax.swing.JLabel();
        HealPercent1 = new javax.swing.JLabel();
        HealPercent2 = new javax.swing.JLabel();
        Barra1 = new javax.swing.JProgressBar();
        Barra2 = new javax.swing.JProgressBar();
        E1 = new javax.swing.JLabel();
        E2 = new javax.swing.JLabel();
        E3 = new javax.swing.JLabel();
        E4 = new javax.swing.JLabel();
        E5 = new javax.swing.JLabel();
        E6 = new javax.swing.JLabel();
        E7 = new javax.swing.JLabel();
        E8 = new javax.swing.JLabel();
        P1 = new javax.swing.JLabel();
        P2 = new javax.swing.JLabel();
        P3 = new javax.swing.JLabel();
        P4 = new javax.swing.JLabel();
        P5 = new javax.swing.JLabel();
        P6 = new javax.swing.JLabel();
        HealL = new javax.swing.JButton();
        AtackL = new javax.swing.JButton();
        Turno = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Funny Fight");
        setLocation(new java.awt.Point(0, 0));
        setResizable(false);
        setSize(new java.awt.Dimension(1280, 720));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        FuegoR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets.Animations/FireAnimation.gif"))); // NOI18N
        getContentPane().add(FuegoR, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 300, -1, -1));

        BombaR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets.Animations/RayoR.gif"))); // NOI18N
        getContentPane().add(BombaR, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 240, -1, -1));

        FuegoL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets.Animations/FireAnimation.gif"))); // NOI18N
        getContentPane().add(FuegoL, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 300, -1, -1));

        BombaL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets.Animations/RayoL.gif"))); // NOI18N
        getContentPane().add(BombaL, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 230, -1, -1));

        HealtingEffectL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sprites/HealtingAnimation.gif"))); // NOI18N
        HealtingEffectL.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Sprites/Nothing.png"))); // NOI18N
        getContentPane().add(HealtingEffectL, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, 320, 330));

        HealtingEffectR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sprites/HealtingAnimation.gif"))); // NOI18N
        HealtingEffectR.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Sprites/Nothing.png"))); // NOI18N
        getContentPane().add(HealtingEffectR, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 230, 320, 330));

        Play1Txt.setFont(new java.awt.Font("ArcadeClassic", 0, 48)); // NOI18N
        Play1Txt.setForeground(new java.awt.Color(255, 255, 255));
        Play1Txt.setText("PLAYER 1");
        getContentPane().add(Play1Txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 200, -1));

        Play2Txt.setFont(new java.awt.Font("ArcadeClassic", 0, 48)); // NOI18N
        Play2Txt.setForeground(new java.awt.Color(255, 255, 255));
        Play2Txt.setText("PLAYER 2");
        getContentPane().add(Play2Txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 0, 200, -1));

        HealPercent1.setFont(new java.awt.Font("Super Mario Bros. 2", 0, 36)); // NOI18N
        HealPercent1.setForeground(new java.awt.Color(255, 255, 255));
        HealPercent1.setText("0%");
        getContentPane().add(HealPercent1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 40, -1, -1));

        HealPercent2.setFont(new java.awt.Font("Super Mario Bros. 2", 0, 36)); // NOI18N
        HealPercent2.setForeground(new java.awt.Color(255, 255, 255));
        HealPercent2.setText("0%");
        getContentPane().add(HealPercent2, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 40, -1, -1));

        Barra1.setBackground(new java.awt.Color(255, 102, 102));
        Barra1.setForeground(new java.awt.Color(255, 0, 0));
        Barra1.setMaximum(150);
        getContentPane().add(Barra1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 290, 20));

        Barra2.setBackground(new java.awt.Color(255, 255, 255));
        Barra2.setForeground(new java.awt.Color(0, 0, 204));
        getContentPane().add(Barra2, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 50, 290, 20));

        E1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sprites/Trainer1R.png"))); // NOI18N
        E1.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Sprites/Nothing.png"))); // NOI18N
        getContentPane().add(E1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-80, 250, -1, -1));

        E2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sprites/Trainer2R.png"))); // NOI18N
        E2.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Sprites/Nothing.png"))); // NOI18N
        getContentPane().add(E2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-50, 240, -1, -1));

        E3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sprites/Trainer3R.png"))); // NOI18N
        E3.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Sprites/Nothing.png"))); // NOI18N
        getContentPane().add(E3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-80, 250, -1, -1));

        E4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sprites/Trainer5R.png"))); // NOI18N
        E4.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Sprites/Nothing.png"))); // NOI18N
        getContentPane().add(E4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-70, 250, -1, -1));

        E5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sprites/Trainer1L.png"))); // NOI18N
        E5.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Sprites/Nothing.png"))); // NOI18N
        getContentPane().add(E5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 260, 240, -1));

        E6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sprites/Trainer2L.png"))); // NOI18N
        E6.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Sprites/Nothing.png"))); // NOI18N
        getContentPane().add(E6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 260, 260, -1));

        E7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sprites/Trainer3L.png"))); // NOI18N
        E7.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Sprites/Nothing.png"))); // NOI18N
        getContentPane().add(E7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 250, 240, -1));

        E8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sprites/Trainer5L.png"))); // NOI18N
        E8.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Sprites/Nothing.png"))); // NOI18N
        getContentPane().add(E8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 260, 260, -1));

        P1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sprites/IngeR.png"))); // NOI18N
        P1.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Sprites/Nothing.png"))); // NOI18N
        getContentPane().add(P1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 270, -1, -1));

        P2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sprites/LirR.png"))); // NOI18N
        P2.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Sprites/Nothing.png"))); // NOI18N
        getContentPane().add(P2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, -1, -1));

        P3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sprites/BisR.png"))); // NOI18N
        getContentPane().add(P3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, -1, -1));

        P4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sprites/IngeL.png"))); // NOI18N
        P4.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Sprites/Nothing.png"))); // NOI18N
        getContentPane().add(P4, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 280, -1, -1));

        P5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sprites/LirL.png"))); // NOI18N
        P5.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Sprites/Nothing.png"))); // NOI18N
        getContentPane().add(P5, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 260, -1, -1));

        P6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sprites/BisL.png"))); // NOI18N
        P6.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Sprites/Nothing.png"))); // NOI18N
        getContentPane().add(P6, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 270, -1, -1));

        HealL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sprites/Heal2.png"))); // NOI18N
        HealL.setContentAreaFilled(false);
        HealL.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Sprites/Nothing.png"))); // NOI18N
        HealL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                HealLMouseReleased(evt);
            }
        });
        getContentPane().add(HealL, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 610, 150, 80));

        AtackL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sprites/Atack2.png"))); // NOI18N
        AtackL.setContentAreaFilled(false);
        AtackL.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Sprites/Nothing.png"))); // NOI18N
        AtackL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                AtackLMouseReleased(evt);
            }
        });
        getContentPane().add(AtackL, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 610, -1, 80));

        Turno.setFont(new java.awt.Font("ArcadeClassic", 0, 48)); // NOI18N
        Turno.setForeground(new java.awt.Color(255, 255, 255));
        Turno.setText("PLAYER 1 TURN!");
        getContentPane().add(Turno, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 640, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets.Animations/Clouds.gif"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets.Animations/FondoMainMenu.png"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //botonsinis
    private void AtackLMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AtackLMouseReleased
        playButtonSound();
        playCharSoundL();
        if (Izquierda < 10 && pok2.getVida() >= 0) {
            Izquierda++;
            BombaL.setVisible(false);
            FuegoL.setVisible(false);
            RandomAnimationR();
            pok2.setVida(-1 * player1.atacar());
            Barra2.setValue(pok2.getVida());
            HealPercent2.setText(bar2Status() + "%");
            HealtingEffectL.setVisible(false);
            if (pok2.getVida() <= 0) {
                getWinner();
            }
            AtackL.setVisible(false);
            HealL.setVisible(false);
            callAI();
        } else {
            getWinner();
        }
    }//GEN-LAST:event_AtackLMouseReleased

    private void HealLMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HealLMouseReleased
        playButtonSound();
        if (Izquierda < 10 && pok1.getVida() >= 0) {
            Izquierda++;
            BombaL.setVisible(false);
            FuegoL.setVisible(false);
            if ((pok1.getVida() + 15) <= maxLifeL) {
                playHealSound();
                pok1.setVida(player1.curar());
                Barra1.setValue(pok1.getVida());
                HealPercent1.setText(bar1Status() + "%");
                HealtingEffectL.setVisible(true);
            }
            AtackL.setVisible(false);
            HealL.setVisible(false);
            callAI();
        } else {
            getWinner();
        }
    }//GEN-LAST:event_HealLMouseReleased

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
            java.util.logging.Logger.getLogger(Battle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Battle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Battle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Battle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Battle().setVisible(true);
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AtackL;
    private javax.swing.JProgressBar Barra1;
    private javax.swing.JProgressBar Barra2;
    private javax.swing.JLabel BombaL;
    private javax.swing.JLabel BombaR;
    private javax.swing.JLabel E1;
    private javax.swing.JLabel E2;
    private javax.swing.JLabel E3;
    private javax.swing.JLabel E4;
    private javax.swing.JLabel E5;
    private javax.swing.JLabel E6;
    private javax.swing.JLabel E7;
    private javax.swing.JLabel E8;
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel FuegoL;
    private javax.swing.JLabel FuegoR;
    private javax.swing.JButton HealL;
    private javax.swing.JLabel HealPercent1;
    private javax.swing.JLabel HealPercent2;
    private javax.swing.JLabel HealtingEffectL;
    private javax.swing.JLabel HealtingEffectR;
    private javax.swing.JLabel P1;
    private javax.swing.JLabel P2;
    private javax.swing.JLabel P3;
    private javax.swing.JLabel P4;
    private javax.swing.JLabel P5;
    private javax.swing.JLabel P6;
    private javax.swing.JLabel Play1Txt;
    private javax.swing.JLabel Play2Txt;
    private javax.swing.JLabel Turno;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
