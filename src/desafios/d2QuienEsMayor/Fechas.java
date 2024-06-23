package desafios.d2QuienEsMayor;

import java.util.Scanner;

public class Fechas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre1;
        String nombre2;
        String fecha1;
        String fecha2;

        System.out.println("Inserte nombre de la primera persona");
        nombre1 = sc.nextLine();
        System.out.println("Inserte fecha de nacimiento de la primera persona (Formato DD/MM/AAAA)");
        fecha1 = sc.nextLine();
        System.out.println("Inserte nombre de la segunda persona");
        nombre2 = sc.nextLine();
        System.out.println("Inserte fecha de nacimiento de la segunda persona (Formato DD/MM/AAAA)");
        fecha2 = sc.nextLine();

        String y1 = fecha1.substring(6, 10);
        int year1 = Integer.parseInt(y1);

        String m1 = fecha1.substring(3, 5);
        int month1 = Integer.parseInt(m1);

        String d1 = fecha1.substring(0, 2);
        int day1 = Integer.parseInt(d1);

        String y2 = fecha2.substring(6, 10);
        int year2 = Integer.parseInt(y2);

        String m2 = fecha2.substring(3, 5);
        int month2 = Integer.parseInt(m2);

        String d2 = fecha2.substring(0, 2);
        int day2 = Integer.parseInt(d2);

        if (year1 > year2) {
            System.out.println(nombre2 + " es mayor que " + nombre1);
        } else if (year2 > year1) {
            System.out.println(nombre1 + " es mayor que " + nombre2);
        } else if (month1 > month2) {
            System.out.println(nombre2 + " es mayor que " + nombre1);
        } else if (month2 > month1) {
            System.out.println(nombre1 + " es mayor que " + nombre2);
        } else if (day1 > day2) {
            System.out.println(nombre2 + " es mayor que " + nombre1);
        } else if (day2 > day1) {
            System.out.println(nombre1 + " es mayor que " + nombre2);
        } else {
            System.out.println(nombre1 + " y " + nombre2 + " tienen la misma edad");
        }
    }
}
