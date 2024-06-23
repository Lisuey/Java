package desafios.d3WhilePorDoWhile;

import java.util.Scanner;

public class SumaImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite un número: ");
        int n = sc.nextInt();


        int suma = 0;

        for (int i = 1; i <= n; i+=2) {

            suma+=i;
        }
        System.out.println("La suma total es: " + suma);
    }
}