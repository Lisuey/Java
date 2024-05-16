package desafios.D3WhilePorDoWhile;

import java.util.Scanner;

public class SecuenciaDeFibonacci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = 0;
        int b = 1;
        int suma = 0;
        int cantidad;

        System.out.println("Inserte la cantidad de números a calcular:");
        cantidad = sc.nextInt();

        for(int i = 1; i <= cantidad; i++) {
            System.out.println(a);
            suma = a + b;
            a = b;
            b = suma;
        }


    }

}
