package net.salesianos.metodos;

import java.util.ArrayList;

public class Media {
    public static void main(String[] args) {

        String num = args[0];
        String[] media = num.split(",");
        double suma = 0;
        for (double fornum : num) {
            suma += fornum;
        }
        double resultado = suma / num.length();
    }
}

