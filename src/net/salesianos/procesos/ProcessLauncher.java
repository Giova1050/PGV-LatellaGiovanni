package net.salesianos.procesos;

import java.io.File;
import java.io.IOException;

public class ProcessLauncher {
    private static final String MEDIA_CALCULATE_ROUTE = "./src/net/salesianos/metodos/Media.java";
    private static final String MEDIANA_CALCULATE_ROUTE = "./src/net/salesianos/metodos/Mediana.java";

    public static Process initMedia(String nums, String outputFileName) throws IOException {
        ProcessBuilder builder = new ProcessBuilder("java", MEDIA_CALCULATE_ROUTE, nums); 
        builder.redirectOutput(new File("./files/outputs/" + outputFileName));
        builder.redirectError(new File("./files/outputs/errors/numberCalculator.txt"));
        return builder.start();
    }

    public static Process initMediana(String nums, String outputFileName) throws IOException {
        ProcessBuilder builder = new ProcessBuilder("java", MEDIANA_CALCULATE_ROUTE, nums); 
        builder.redirectOutput(new File("./files/outputs/" + outputFileName));
        builder.redirectError(new File("./files/outputs/errors/numberCalculator.txt"));
        return builder.start();
    }
}
