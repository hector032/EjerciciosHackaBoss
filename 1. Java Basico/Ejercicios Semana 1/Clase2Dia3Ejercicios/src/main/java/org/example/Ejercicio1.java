package org.example;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        /*
        Ejercicio Nº 1 - Estructuras Condicionales - Individual
        a) Una recital permite únicamente el ingreso de mayores de 18 años.
        Para ello necesita un programa que, a partir de que un usuario ingrese su edad,
        determine mediante un mensaje en pantalla si la persona puede o no ingresar al evento.
        El programa debe mostrar (según cada caso) un mensaje informando la situación.
        */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hola. \nPorfavor ingrese su edad");
        int edad = scanner.nextInt();

        if (edad>=18){
            System.out.println("Bienvenido, tome asiento porfavor");
        }else {
            System.out.println("Lo siento, este recital es solo para mayores de 18 años");
        }


    }
}
