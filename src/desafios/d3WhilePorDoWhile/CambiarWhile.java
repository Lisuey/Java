package desafios.d3WhilePorDoWhile;

import java.util.Scanner;

public class CambiarWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        int i = 0;
//        while (i < 50) {
//            i+=1;
//            System.out.printf("Iteración %d\n", i);
//        }

        int i = 1;

        do {
            System.out.printf("Iteración %d\n", i);
            i+=1;
            }while (i <= 50);
    }
}
