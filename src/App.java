import java.io.File;
import java.util.ArrayList;
import net.salesianos.procesos.ProcessLauncher;

public class App {
    public static void main(String[] args) throws Exception {

        String lines = "input\\Datos.csv";

        ArrayList<Process> calculateProcesses = new ArrayList<>();

        for (int i = 0; i < lines.size(); i++) {
            Process process = ProcessLauncher.initMedia(lines.get(i), "calculus-" + i + ".txt");
            calculateProcesses.add(process);
        }

        for (Process process : calculateProcesses) {
            process.waitFor();
        }

        for (int i = 0; i < lines.size(); i++) {
            Process process = ProcessLauncher.initMediana(lines.get(i), "calculus-" + i + ".txt");
            calculateProcesses.add(process);
        }

        for (Process process : calculateProcesses) {
            process.waitFor();
        }

        
    }
}

