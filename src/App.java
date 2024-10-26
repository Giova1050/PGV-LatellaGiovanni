import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import net.salesianos.procesos.ProcessLauncher;

public class App {
    public static void main(String[] args) throws Exception {

        String filePath = "files/input/Datos.csv";
        List<String> lines = Files.readAllLines(Paths.get(filePath));
        ArrayList<Process> calculateProcesses = new ArrayList<>();

        for (int i = 0; i < 1; i++) {
            for (String line : lines) {
                Process process = ProcessLauncher.initMedia(line, "media-output-" + i + ".txt");
                calculateProcesses.add(process);
            }
        }

        for (int i = 0; i < 1; i++) {
            for (String line : lines) {
                Process process = ProcessLauncher.initMediana(line, "mediana-output-" + i + ".txt");
                calculateProcesses.add(process);
            }
        }

        for (Process process : calculateProcesses) {
            process.waitFor();
        }

        System.out.println("Todos los procesos han finalizado.");
    }
}

