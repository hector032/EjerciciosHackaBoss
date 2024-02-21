package org.example;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {

        /*
         Ejercicio Nº 4 - Matrices

         Imagina que estás trabajando en un sistema de reservas de js para un teatro.
         Crea un programa en Java que represente un mapa de js en una matriz de 5x5
         y ten en cuenta lo siguiente:

         Los js pueden estar ocupados (representados por "X")
         o vacíos (representados por "O").

        Permite al usuario ingresar por teclado donde quiere sentarse,
        indicando su i y número de j (por ejemplo, "i 3, j 2").
        El programa debe marcar como ocupado ese j solo en caso de que esté vacío.

        Si el j elegido por el usuario está ocupado,
        el sistema debe informar que elija otro diferente.

        A medida que los js se ocupen, el programa debe actualizar el mapa de js
        y mostrarlo por pantalla luego de cada reserva.

        Intenta hacer pruebas con otros compañeros, imagina que ellos son los compradores
        y tú el encargado del teatro. ¿Funciona para todos los casos?
        ¿Encontraste errores que resolver? ¿Considera tu programa los js ya reservados?

        El sistema deberá seguir corriendo hasta que el encargado de cargar las reservas
        de los js determine que ha finalizado.
        */

        //Iniciamos la matriz de las is y js
        String[][] matriz = {
                {"O", "O", "O", "O", "O"},
                {"O", "O", "O", "O", "O"},
                {"O", "O", "O", "O", "O"},
                {"O", "O", "O", "O", "O"},
                {"O", "O", "O", "O", "O"}
        };
        /*
                +---+---+---+---+
                | O| O| O| O|| O|
                +---+---+---+---+
                | O| O| O| O|| O|
                +---+---+---+---+
                | O| O| O| O|| O|
                +---+---+---+---+
                | O| O| O| O|| O|
                +---+---+---+---+
                | O| O| O| O|| O|
                +---+---+---+---+
         */
        Scanner scanner = new Scanner(System.in);

        boolean parar = false;
        while (parar!=true) {

            System.out.println("Ingrese el numero de fila y numero de asiento donde quiera sentarse ");

            int fila = scanner.nextInt();
            int asiento = scanner.nextInt();
            scanner.nextLine(); //esto permite que pueda preguntar si desea parar de hacer reservas
                                // sin que choque con otro proceso


            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    if (i + 1 == fila && j + 1 == asiento) {
                        if (matriz[i][j].equalsIgnoreCase("O")) {
                            matriz[i][j] = "X";
                            System.out.println("Asiento reservado");


                            for (int ii = 0; ii < matriz.length; ii++) {
                                for (int kk = 0; kk < matriz[ii].length; kk++) {
                                    System.out.print(matriz[ii][kk] + " ");
                                }
                                System.out.println(); // salto de linea despues de cada fila
                            }
                            System.out.println("Desea parar de reservar?");
                            String pregunta = scanner.nextLine();
                            if (pregunta.equalsIgnoreCase("si")){
                                parar = true;
                                System.out.println("Reservas Finalizada");

                            }
                        } else {
                            System.out.println("el asiento seleccionado esta ocupado, porfavor elija oto asiento");
                        }
                    }
                }
            }


        }
    }
}
