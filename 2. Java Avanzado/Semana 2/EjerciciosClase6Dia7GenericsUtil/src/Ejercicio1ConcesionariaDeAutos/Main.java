package Ejercicio1ConcesionariaDeAutos;

import java.util.List;

public class Main {
    public static void main(String[] args) {
          /*
Ejercicio 1: Concesionaria de Autos
Una concesionaria de vehículos necesita un sistema para administrar su inventario de autos.
Crea una clase Auto con atributos como marca, modelo, año, y precio. Implementa una
clase utilitaria InventarioAutos con métodos genéricos para realizar las siguientes operaciones:
1.Agregar Autos al Inventario: Utiliza un método genérico para agregar autos al inventario de la concesionaria.
2.Buscar Autos por Marca o Año: Implementa métodos genéricos que permitan buscar autos por marca o año dentro
del inventario.
3.Calcular el Valor Total del Inventario: Desarrolla un método genérico que calcule el valor total de todos
los autos en el inventario.
        */

        InventarioAutos<Auto> inventarioAutos = new InventarioAutos<>();
        inventarioAutos.agregarAuto(new Auto("BMW", "M3", 2020, 45000.0));
        inventarioAutos.agregarAuto(new Auto("BMW", "M4", 2022, 65000.0));
        inventarioAutos.agregarAuto(new Auto("Merecez Benz", "Benz clase G", 2018, 75000.0));
        inventarioAutos.agregarAuto(new Auto("Ford", "Mustang GT", 2024, 56000.0));


        //Buscar auto por marca
        System.out.println("\nAutos filtrado por la marca BMW\n");
        List<Auto> autosPorMarca = inventarioAutos.buscarPorMarca("bmw");
        for (Auto auto : autosPorMarca) {
            System.out.println("Marca: " + auto.getMarca() + ", Modelo: " + auto.getModelo() + ", Año: " +
                    auto.getAnio() + ", Precio: $" + auto.getPrecio());
        }
        //Valor total del inventario
        System.out.println("\nEl valor total del inventarios es de: "+inventarioAutos.valorTotalInventario()+"€");

    }


}