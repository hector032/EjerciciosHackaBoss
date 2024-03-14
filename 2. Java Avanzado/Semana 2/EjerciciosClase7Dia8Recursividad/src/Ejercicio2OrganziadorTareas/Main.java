package Ejercicio2OrganziadorTareas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
/*
Ejercicio 2: Organizador de Tareas

Desarrolla una aplicación para organizar tareas en un proyecto. Utiliza la recursividad para crear
una estructura jerárquica de tareas. Cada tarea puede tener subtareas asociadas, y estas subtareas
también pueden tener sus propias subtareas, creando así una estructura de "árbol de tareas".

El programa debe permitir al usuario agregar tareas principales y subtareas de manera recursiva.
Además, debe ofrecer la capacidad de visualizar la estructura completa de tareas con sus respectivas subtareas.

📝**Extra Point (OPCIONAL):** En caso que quieras agregar un poco de "arte" al ejercicio,
puedes proponer que las estructuras que se muestren por pantalla sean dibujadas mediante ascii.
*/

        Scanner scanner = new Scanner(System.in);
        List<Tarea> listaTareas = new ArrayList<>();

        String nombreTareaPrincipal;
        do {
            System.out.println("Ingrese una tarea principal (o escriba 'fin' para terminar):");
            nombreTareaPrincipal = scanner.nextLine();
            if (!nombreTareaPrincipal.equalsIgnoreCase("fin")) {
                Tarea tareaPrincipal = new Tarea(nombreTareaPrincipal);
                agregarSubtareas(scanner, tareaPrincipal);
                listaTareas.add(tareaPrincipal);
            }
        } while (!nombreTareaPrincipal.equalsIgnoreCase("fin"));

        System.out.println("Lista de tareas");
        imprimirTareas(listaTareas, 1);
    }

    private static void agregarSubtareas(Scanner scanner, Tarea tareaPadre) {
        String respuesta;
        do {
            System.out.println("Desea añadir una tarea a '" + tareaPadre.getNombre() + "'? Si/no");
            respuesta = scanner.nextLine();
            if (respuesta.equalsIgnoreCase("si")) {
                System.out.println("Añada una tarea para '" + tareaPadre.getNombre() + " :");
                String nombreSubtarea = scanner.nextLine();
                if (!nombreSubtarea.equalsIgnoreCase("fin")) {
                    Tarea nuevaSubtarea = new Tarea(nombreSubtarea);
                    tareaPadre.agregarSubtarea(nuevaSubtarea);
                    agregarSubtareas(scanner, nuevaSubtarea);
                }
            }
        } while (respuesta.equalsIgnoreCase("si"));
    }

    private static void imprimirTareas(List<Tarea> tareas, int nivel) {
        for (Tarea tarea : tareas) {
            StringBuilder prefijo = new StringBuilder();
            for (int i = 0; i < nivel; i++) {
                prefijo.append("│   ");
            }
            System.out.println(prefijo + "└─ " + tarea.getNombre());
            imprimirTareas(tarea.getSubtareas(), nivel + 1);
        }
    }
}







