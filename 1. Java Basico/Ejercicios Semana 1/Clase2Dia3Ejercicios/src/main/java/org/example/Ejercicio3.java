package org.example;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {

        /*
            Ejercicio Nº 3 - Arreglos: Vectores - Individual

            Una web de meteorología necesita de un programa que, al ingresar
            las 7 temperaturas máximas de la última semana, calcule la
            temperatura máxima promedio que hubo.

            Para ello, deberá manejar un vector donde en cada posición se
            almacene la correspondiente temperatura máxima de cada día.
            Una vez almacenadas las temperaturas, deberá calcular el promedio
            de las mismas recorriendo el vector y mostrando el resultado por pantalla.
        */
        double[] temperaturas = new double[7];

        Scanner scanner = new Scanner(System.in);
        System.out.println("Temperaturas maximas de la ultima semnada: ");

        double media = 0, suma = 0;

        for (int i = 0; i < 7; i++) {
            double entrada = scanner.nextDouble();
            temperaturas[i] = entrada;
            suma += entrada;

        }
        media = suma / 7;
        // utilizamos %.1fºC%n para que salga redondeado con solo 1 decimal
        System.out.printf("La temperatura maxima promedio de la semana pasada ha sido de %.1fºC%n ",  media);


    }
}
