package net.salesianos.metodos;

import java.util.ArrayList;
import java.util.Collections;

public class Mediana {
    public static void main(String[] args) {

        String num = args[0];
        String[] mediana = num.split(",");
        Collections.sort(num);
        double formediana;
        int cantidad = num.length();
        if (cantidad % 2 == 0) {
            mediana = (num[cantidad / 2 - 1] + num[cantidad / 2]) / 2;
        } else {
            mediana = num[cantidad / 2];
        }

    }
}

