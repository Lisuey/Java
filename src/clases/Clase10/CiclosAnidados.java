package clases.Clase10;

import java.util.Scanner;

public class CiclosAnidados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //tabla del 5
//        for(int i=0;i<=10;i++) {
//            System.out.printf("5 * %d = %d\n", i,5*i);
//        }
        
        // tablas del 0 al 10
        for(int j=0;j<=10;j++) {
            for(int i=0;i<=10;i++) {
                System.out.printf("%d * %d = %d\n",j, i,j*i);
            }
        }

        System.out.println("Ingrese un número:");
        int n = sc.nextInt();

        //Cuadrado
//        for(int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                System.out.printf("*");
//            }
//            System.out.printf("\n");
//        }


        //Triángulo

//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < i; j++) {
//                System.out.printf("*");
//            }
//            System.out.printf("*\n");
//        }

        // Triángulo inverso

//        for (int i = 1; i <= n; i++) {
//            for (int j = n - i; j > 0; j--){
//                System.out.printf("*");
//            }
//            System.out.printf("*\n");
//        }


    }
}
