package net.salesianos.metodos;

import java.util.Arrays;

public class Mediana {
    public static void main(String[] args) {

        String num = args[0];
        String[] elementos = num.split(",");
        double[] numeros = new double[elementos.length];

        for (int i = 0; i < elementos.length; i++) {
            numeros[i] = Double.parseDouble(elementos[i]);
        }

        Arrays.sort(numeros);
        double mediana;
        int cantidad = numeros.length;

        if (cantidad % 2 == 0) {
            mediana = (numeros[cantidad / 2 - 1] + numeros[cantidad / 2]) / 2;
        } else {
            mediana = numeros[cantidad / 2];
        }

        System.out.println("La mediana es: " + mediana);
    }
}
