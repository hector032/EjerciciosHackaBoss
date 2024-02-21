package org.example;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        /*
           Ejercicio Nº 2 - Estructuras Repetitivas - Individual

           a) Imagina que eres un cajero en un supermercado. Crea un programa en Java
           que permita ingresar el precio de varios productos comprados por un cliente.

           Utiliza una estructura repetitiva (la que quieras) para continuar pidiendo precios
           hasta que el usuario decida finalizar. Luego, muestra el total de la compra que debe abonar.
        */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Escanea el producto para agregarlo a la compra " +
                           "\nCuando haya terminado ingrese -1");

        boolean parar = false;
        double total = 0;

        while (parar !=true){
            double precio = scanner.nextDouble();
            total += precio;

            if (precio==-1){
                // Agregamos 1, para que no haga la  resta del -1 que utilizamos para parar el while
                total +=1;
                parar = true;
            }

        }

        System.out.println("El total de su compra es de: " + total + " €.");

    }
}
