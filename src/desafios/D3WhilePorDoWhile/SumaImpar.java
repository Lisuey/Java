package desafios.D3WhilePorDoWhile;

import java.util.Scanner;

public class SumaImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i,n;

        System.out.print("Digite un numero: ");
        n = sc.nextInt();

        if (n %2 == 0) {

            n--;
        }

        int sumaImpar=0;

        for (i = 1; i <= n; i+=2) {

            sumaImpar+=i;
        }
        System.out.println("La suma total es: " + sumaImpar);
    }
}