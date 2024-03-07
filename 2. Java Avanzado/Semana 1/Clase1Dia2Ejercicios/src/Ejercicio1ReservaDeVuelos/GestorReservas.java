package Ejercicio1ReservaDeVuelos;

import java.util.Date;

public class GestorReservas {


    private String nombre;
    private String destino;
    private Date fecha;
    private int asientosDisponibles;

    public GestorReservas(String nombre, String destino, Date fecha) {
        this.nombre = nombre;
        this.destino = destino;
        this.fecha = fecha;
        this.asientosDisponibles= 20;
    }

    public void reservarVuelo(int asientosDeseados) throws ReservaInvalidaException {
        try {
            if (nombre == null || fecha == null) {
                throw new ReservaInvalidaException("Falta informacio para realizar la reserva");
            } else if (asientosDeseados > asientosDisponibles) {
                throw new ReservaInvalidaException("No hay tantos asientos disponibles.");
            }else if(asientosDeseados<=0){
                throw new ReservaInvalidaException("Error: Numero de asiento ingresado invalido.");
            }else {
                System.out.println("Reserva a " + destino + " a nombre de " + nombre + " para " + asientosDeseados + " personas, realizada con exito.");
            } }catch (ReservaInvalidaException ex){
            System.out.println("Error al realizar la reserva: "+ex.getMessage());
        }
    }

}
