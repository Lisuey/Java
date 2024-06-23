package clases.Clase9;

import java.util.Scanner;

public class SoloPuntos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // método mega-básico
//        int n = sc.nextInt();
//        if (n==1){
//            System.out.printf("*\n");
//        } else if (n==2) {
//            System.out.printf("**\n");
//        } else if (n==3) {
//            System.out.printf("***\n");
//        } else if (n==4) {
//            System.out.printf("****\n");
//        } else if (n==5) {
//            System.out.printf("*****\n");
//        }



        System.out.println("Ingresa un número para dibujar puntitos: ");
        int numero = sc.nextInt();
        for(int i = 0; i < numero; i++){
            System.out.printf("*");
        }
        System.out.printf("\n");
    }
}
