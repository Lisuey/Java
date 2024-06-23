package clases.numeromayor;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero1;
        int numero2;
        int numero3;
//        String texto;
//
//        System.out.println("ingresa un namber wan");
//        numero1 = sc.nextInt();
//        if (numero1 == 1) {
//        texto = "ingresaste el namber 1";
//        } else {
//            texto = "ingresaste otro, gil ql";
//        }
//        System.out.println(texto);

        System.out.println("Ingrese primer valor:");
        numero1 = sc.nextInt();
        System.out.println("Ingrese segundo valor:");
        numero2 = sc.nextInt();
        System.out.println("Ingrese tercer valor:");
        numero3 = sc.nextInt();

        if(numero1 >= numero2 && numero1 >= numero3) {
            System.out.println("El mayor de los números es " + numero1);
        } else if (numero2 >= numero3 && numero2 >= numero1) {
            System.out.println("El mayor de los números es " + numero2);
        } else if (numero3 > numero1 && numero3 > numero2) {
            System.out.println("El mayor de los números es " + numero3);
        } else {
            System.out.println("No hay número mayor");
        }
        

    }
}