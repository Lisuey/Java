package desafios.D3WhilePorDoWhile;

import java.util.Scanner;

public class SumaImparLimite {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner lim = new Scanner(System.in);
        int i;
        int limiteMayor;
        int limiteMenor;

        System.out.println("Digite el número de partida: ");
        limiteMenor = lim.nextInt();

        System.out.print("Digite el número de fin: ");
        limiteMayor = sc.nextInt();

        if (limiteMayor % 2 == 0 && limiteMenor % 2 == 0) {

            limiteMayor--;
            limiteMenor++;
        }

        int sumaImpar = 0;

        for (i = limiteMenor; i <= limiteMayor; i += 2) {

            sumaImpar += i;
        }
        System.out.println("La suma total es: " + sumaImpar);
    }
}