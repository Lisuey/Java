package desafios.d4Patrones;

import java.util.Scanner;

public class PatronesAnidados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número para el patrón Cuadrado: ");
        int n1 = sc.nextInt();
        imprimirPatronC(n1);

        System.out.println("Ingrese un número para el patrón Z: ");
        int n2 = sc.nextInt();
        imprimirPatronZ(n2);

        System.out.println("Ingrese un número para el patrón X: ");
        int n3 = sc.nextInt();
        imprimirPatronX(n3);

        System.out.println("Ingrese un número para el patrón Pergamino: ");
        int n4 = sc.nextInt();
        imprimirPatronP(n4);
    }

    public static void imprimirPatronC(int n1) {
        System.out.println("****** Patron Cuadrado *******");
        for (int i = 0; i < n1; i++) {
            for (int j = 1; j <= n1; j++) {
                if (i == 0 || i == n1 - 1 || j == 1 || j == n1) {
                    System.out.print("*");
                } else System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void imprimirPatronZ(int n2) {
        System.out.println("****** Patron Z *******");
        for (int i = 0; i < n2; i++) {
            for (int j = 0; j < n2; j++) {
                if (i == 0 || i == n2 - 1 || i + j == n2 - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }


    public static void imprimirPatronX(int n3) {
        System.out.println("****** Patron X *******");
        for (int i = 0; i < n3; i++) {
            for (int j = 0; j < n3; j++) {
                if ((i == 0 || i == n3 - 1) && (j == 0 || j == n3 - 1) || i + j == n3 - 1 || i == j)  {
                    System.out.print("*");
                } else System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void imprimirPatronP(int n4) {
        System.out.println("****** Patron Pergamino *******");
        for (int i = 0; i < n4; i++) {
            for (int j = 0; j < n4; j++) {
                if ((j == 0 && i != 0) || (j == n4 - 1 && i != n4 - 1)) {
                    System.out.print(" ");
                } else System.out.print("*");
            }
            System.out.println();
        }
    }
}

