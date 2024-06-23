package reforzamiento;

import java.util.Arrays;

public class Arreglos {
    public static void main(String[] args) {

        String [] arreglo = new String[10];
        arreglo[0] = "a";
        arreglo[1] = "b";
        arreglo[2] = "c";
        arreglo[3] = "d";
        arreglo[4] = "e";
        arreglo[5] = "f";

        metodoToString(arreglo);

        System.out.println(Arrays.toString(arreglo));

        for (int i = 0; i < arreglo.length; i++) {
            System.out.println(arreglo[i]);
        }

        System.out.println("for each");
        for(String letra : arreglo){
            System.out.println(letra);
        }

    }

    public static void metodoToString(String[] arregloRecibido){
        System.out.println("toString by Java Util");
        System.out.println(Arrays.toString(arregloRecibido));
    }

    public static void minMax(int[] arregloRecibido) {
        int min = arregloRecibido[0];
        int max = arregloRecibido[0];
    }
}
