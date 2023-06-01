import javax.swing.JOptionPane;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

//version del McFly-HyperVisor: 3.03 - Log Update
//version del HyperVisor sobre la beta2: 1.1
//version del HyperVisor sobre release:  1.4

public class HyperVisor {

    public static void verificarArchivos() {
        String[] archivos = {
            "\\Assets.Animations\\BackSeelectWB.png",
            "\\Assets.Animations\\BombAnimation.gif",
            "\\Assets.Animations\\Clouds.gif",
            "\\Assets.Animations\\FireAnimation.gif",
            "\\Assets.Animations\\FondoMainMenu.png",
            "\\Assets.Animations\\InfoScreen.png",
            "\\Assets.Animations\\RayoL.gif",
            "\\Assets.Animations\\RayoR.gif",
            "\\Assets.Buttons\\1Player.png",
            "\\Assets.Buttons\\2Players.png",
            "\\Assets.Buttons\\backButton.png",
            "\\Assets.Buttons\\ButtonSelector.png",
            "\\Assets.Buttons\\creditsButton.png",
            "\\Assets.Buttons\\exitButton.png",
            "\\Assets.Buttons\\FighterButton3.png",
            "\\Assets.Buttons\\PlayButton.png",
            "\\Assets.Buttons\\SelectorBack.png",
            "\\Fonts\\ARCADECLASSIC.TTF",
            "\\Fonts\\Super Mario Bros. 2.ttf",
            "\\Sounds\\bisonte.wav",
            "\\Sounds\\button1.wav",
            "\\Sounds\\HealSound.wav",
            "\\Sounds\\perro.wav",
            "\\Sounds\\song2.wav",
            "\\Sounds\\song4.wav",
            "\\Sprites\\Atack2.png",
            "\\Sprites\\BackSeelectFinal.png",
            "\\Sprites\\BackSelectFi.png",
            "\\Sprites\\BackWinner.png",
            "\\Sprites\\BisL.png",
            "\\Sprites\\BisR.png",
            "\\Sprites\\Easy.png",
            "\\Sprites\\FighterSelect.png",
            "\\Sprites\\HArd.png",
            "\\Sprites\\Heal2.png",
            "\\Sprites\\HealtingAnimation.gif",
            "\\Sprites\\Impossible.png",
            "\\Sprites\\IngeL.png",
            "\\Sprites\\IngeR.png",
            "\\Sprites\\LirL.png",
            "\\Sprites\\LirR.png",
            "\\Sprites\\MainTittle.png",
            "\\Sprites\\Medium.png",
            "\\Sprites\\Nothing.png",
            "\\Sprites\\SelectDifficulty.png",
            "\\Sprites\\Trainer1L.png",
            "\\Sprites\\Trainer1R.png",
            "\\Sprites\\Trainer2L.png",
            "\\Sprites\\Trainer2R.png",
            "\\Sprites\\Trainer3L.png",
            "\\Sprites\\Trainer3R.png",
            "\\Sprites\\Trainer4L.png",
            "\\Sprites\\Trainer4R.png",
            "\\Sprites\\Trainer5L.png",
            "\\Sprites\\Trainer5R.png",
            "\\TrainerSelect.form",
            "\\TrainerSelect.java",
            "\\WinnerScreen.form",
            "\\WinnerScreen.java"
        };

        List<String> archivosFaltantes = new ArrayList<>();

        for (String archivo : archivos) {
            File file = new File("src/" + archivo);
            if (!file.exists()) {
                archivosFaltantes.add(archivo);
            }
        }

        if (!archivosFaltantes.isEmpty()) {
            escribirLog(archivosFaltantes);
            mostrarDialogoArchivosFaltantes(archivosFaltantes);
            
            System.exit(0);
        }
    }

    private static void mostrarDialogoArchivosFaltantes(List<String> archivosFaltantes) {
        StringBuilder mensaje = new StringBuilder();
        mensaje.append("Los siguientes archivos no se encuentran:\n");
        mensaje.append("Verifique su instalacion:\n");
        mensaje.append("Archivo Log guardado en C:\\archivos\\ArchivosFaltantes.hypevisor\n");
        for (String archivo : archivosFaltantes) {
            mensaje.append(archivo).append("\n");
        }
        JOptionPane.showMessageDialog(null, mensaje.toString(), "Error: Archivos faltantes", JOptionPane.ERROR_MESSAGE);
    }

    private static void escribirLog(List<String> archivosFaltantes) {
        String rutaArchivo = "C:\\archivos\\ArchivosFaltantes.hypevisor";

        try (FileWriter writer = new FileWriter(rutaArchivo)) {
            for (String archivo : archivosFaltantes) {
                writer.write(archivo + "\n");
            }
            System.out.println("Archivo de registro creado: " + rutaArchivo);
        } catch (IOException e) {
            System.out.println("Error al crear el archivo de registro: " + e.getMessage());
        }
    }
}
