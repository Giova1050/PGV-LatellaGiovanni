package net.salesianos.procesos;

import java.io.File;
import java.io.IOException;

public class ProcessLauncher {
    private static final String NUMBER_CALCULATE_ROUTE = "./src/net/salesianos/metodos/Calculos.java";

    public static Process initMedia(String nums, String outputFileName) throws IOException {
        ProcessBuilder builder = new ProcessBuilder("java", NUMBER_CALCULATE_ROUTE, nums); 
        builder.redirectOutput(new File("./outputs/files/" + outputFileName));
        builder.redirectError(new File("./outputs/errors/numberCalculator.txt"));
        return builder.start();
    }

    public static Process initMediana(String nums, String outputFileName) throws IOException {
        ProcessBuilder builder = new ProcessBuilder("java", NUMBER_CALCULATE_ROUTE, nums); 
        builder.redirectOutput(new File("./outputs/files/" + outputFileName));
        builder.redirectError(new File("./outputs/errors/numberCalculator.txt"));
        return builder.start();
    }
}
