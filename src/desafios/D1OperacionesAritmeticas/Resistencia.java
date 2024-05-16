package desafios.D1OperacionesAritmeticas;

import java.util.Scanner;

public class Resistencia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float r1;
        float r2;
        float r3;

        System.out.print("Ingrese resistencia 1:");
        r1 = sc.nextFloat();
        System.out.print("Ingrese resistencia 2:");
        r2 = sc.nextFloat();
        System.out.print("Ingrese resistencia 3:");
        r3 = sc.nextFloat();

        float rt = 1/((1/r1)+(1/r2)+(1/r3));

        System.out.println("La resistencia total es " + rt);



    }
}