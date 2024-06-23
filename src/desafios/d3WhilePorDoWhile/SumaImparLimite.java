package desafios.d3WhilePorDoWhile;

import java.util.Scanner;

public class SumaImparLimite {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite el número de partida: ");
        int limiteMenor = sc.nextInt();

        System.out.print("Digite el número de fin: ");
        int limiteMayor = sc.nextInt();

        if (limiteMayor % 2 == 0) {
            limiteMayor--;
        }

        if (limiteMenor % 2 == 0) {
            limiteMenor++;
        }

        int sumaImpar = 0;

        for (int i = limiteMenor; i <= limiteMayor; i += 2) {

            sumaImpar += i;
        }
        System.out.println("La suma total es: " + sumaImpar);
    }
}