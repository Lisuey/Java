package desafios.d3WhilePorDoWhile;

import java.util.Scanner;

public class SoloPares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;

        System.out.println("Ingrese la cantidad de pares que desea consultar");
        n = sc.nextInt();

        for(int i = 0;i<=n*2-2;i+=2) {
            System.out.println("Par:" + i);
        }

    }
}
