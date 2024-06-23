package desafios.d4Patrones;

import java.util.Scanner;

public class Patrones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de caracteres: ");
        int n = sc.nextInt();

        //Patrón 1 "*.*.*.*.*.*.*"

//        for (int i = 0; i < n; i++) {
//            if (i % 2 == 0) {
//                System.out.printf("*");
//            } else System.out.printf(".");
//        }

        //Patrón 2 "12341234"

//        for (int i = 0; i < n; i++) {
//            if (i % 4 == 0) {
//                System.out.print("1");
//            } else if (i % 4 == 1) {
//                System.out.print("2");
//            } else if (i % 4 == 2) {
//                System.out.print("3");
//            } else
//                System.out.print("4");
//        }

        //Patrón 3 "||*||*||*||*|"

        for (int i = 0; i < n; i++) {
            if (i % 3 == 2) {
                System.out.printf("*");
            } else
                System.out.printf("|");
        }
    }
}
