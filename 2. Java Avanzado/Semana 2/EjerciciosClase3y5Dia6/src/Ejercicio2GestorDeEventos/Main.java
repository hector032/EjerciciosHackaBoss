package Ejercicio2GestorDeEventos;

import Ejercicio1Empleados.Empleado;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
/*
Ejercicio Nº 2 - Gestor de Eventos - Individual

Imagina que estás construyendo una aplicación para gestionar eventos en una agenda.
Cada evento tiene un nombre, una fecha y una categoría (por ejemplo, "Reunión", "Conferencia", "Taller").
Implementa las siguientes operaciones utilizando Streams y Optionals:

Filtra los eventos que están programados para una fecha específica.

Agrupa los eventos por categoría y cuenta cuántos eventos hay en cada categoría.

Encuentra el evento más próximo en el tiempo utilizando Optionals.
*/

        List<Evento> eventos = List.of(
                new Evento("Conferencia de trabajo", LocalDate.of(2024,06,30),"Conferencia"),
                new Evento("Reunion de trabajo",LocalDate.of(2024,04,15),"Reunion"),
                new Evento("Taller de programacion",LocalDate.of(2024,04,20),"Taller"),
                new Evento("Reunion de clase",LocalDate.of(2024,04,15),"Reunion"),
                new Evento("Conferencia de clase",LocalDate.of(2024,05,22),"Conferencia")

        );
        //1. Filtra los eventos que están programados para una fecha específica.
        LocalDate fechaEspecifica = LocalDate.of(2024,04,15);
        List<Evento> eventosFechaEspecifica = eventos.stream()
                .filter(p->p.getFecha().equals(fechaEspecifica))
                .toList();
        eventosFechaEspecifica.forEach(x -> System.out.println("Dia: "+x.getFecha()+" Evento: "+x.getNombre()));

        //2. Agrupa los eventos por categoría y cuenta cuántos eventos hay en cada categoría.

        Map<String, Long> numeroEventosPorCategoria= eventos.stream()
                .collect(Collectors.groupingBy(Evento::getCategoria, Collectors.counting()));
        numeroEventosPorCategoria.forEach((x,p) -> System.out.println("Categoria: " + x +"| Numero de eventos: "+p));

        //3. Encuentra el evento más próximo en el tiempo utilizando Optionals.
        Optional<Evento> eventoMasCercano = eventos.stream()
                .min(Comparator.comparing(evento -> Math.abs(evento.getFecha().until(LocalDate.now()).getDays())));
        eventoMasCercano.ifPresent(x -> System.out.println("El evento mas cercano a la fecha de hoy es: "+x.getNombre()+ "el dia "+x.getFecha()));

    }
}
