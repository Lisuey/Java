package clases.Clase9;

import java.util.Scanner;

public class AsteriscosYPuntos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de caracteres:");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                System.out.printf("*");
            }else
                System.out.printf(".");
        }
    }
}
