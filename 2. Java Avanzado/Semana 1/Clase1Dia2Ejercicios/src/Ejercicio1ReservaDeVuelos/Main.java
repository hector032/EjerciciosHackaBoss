package Ejercicio1ReservaDeVuelos;

import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ReservaInvalidaException {

        Date fecha = new Date();//fecha de hoy
        GestorReservas reserva = new GestorReservas("Hector","Mar de plata",fecha);
        System.out.println();
        reserva.reservarVuelo(21);//Intentamos reservar un vuelo a mar de plata para 5 personas

        reserva.reservarVuelo(0);//Probamos a reservar con un numero erroneo

        System.out.println("\n-------------------------\n");
        System.out.println("Segunda Intento de reserva\n");

        GestorReservas reserva2 = new GestorReservas("Lucia","Rio de janeiro",fecha);

        reserva2.reservarVuelo(19);


        }
    }

