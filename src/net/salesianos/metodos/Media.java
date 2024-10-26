package net.salesianos.metodos;

public class Media {
    public static void main(String[] args) {

        String num = args[0];
        String[] media = num.split(",");
        double suma = 0;

        for (String strNum : media) {
            double fornum = Double.parseDouble(strNum);
            suma += fornum;
        }

        double resultado = suma / media.length;
        System.out.println("La media es: " + resultado);
    }
}
