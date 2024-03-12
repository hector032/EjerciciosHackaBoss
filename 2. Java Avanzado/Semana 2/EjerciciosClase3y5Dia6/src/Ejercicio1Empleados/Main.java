package Ejercicio1Empleados;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

 /*
Crea una aplicación que maneje información sobre empleados.
Cada empleado tiene un nombre, un salario y una categoría
(por ejemplo, "Desarrollador", "Analista", "Gerente").
Implementa las siguientes operaciones utilizando Streams y Optionals:

Filtra los empleados cuyo salario sea mayor a cierto valor específico.

Agrupa los empleados por categoría y calcula el salario promedio para cada categoría.

Encuentra al empleado con el salario más alto utilizando Optionals.

*/

        List<Empleado> empleados = List.of(
                new Empleado("Hector",800.00,"Desarrollador"),
                new Empleado("Marta",700.00,"Desarrollador"),
                new Empleado("Jose",750,"Desarrollador"),
                new Empleado("lucia",850,"Desarrollador"),
                new Empleado("Lidia",1500,"Analista"),
                new Empleado("Ivan",1550,"Analista"),
                new Empleado("Maria",1600,"Analista"),
                new Empleado("Pedro",1900,"Analista"),
                new Empleado("Emilio",1570,"Analista"),
                new Empleado("Victor",5000,"Gerente")
        );

        //1. Filtra los empleados cuyo salario sea mayor a cierto valor específico.
        List<Empleado> salarioMayorQue1000 = empleados.stream()
                .filter(x->x.getSalario()>1000)
                .toList();
        salarioMayorQue1000.forEach(p-> System.out.println("Empleados con el salario mayor que 1000: "
                +p.getNombre()+" con un salario de: "+p.getSalario() + "€"));

        //2. Agrupa los empleados por categoría y calcula el salario promedio para cada categoría.
        Map<String, Double> salarioMedioPorCategoria= empleados.stream()
                .collect(Collectors.groupingBy(Empleado::getCategoria,
                        Collectors.averagingDouble(Empleado::getSalario)));
        salarioMedioPorCategoria.forEach((x, p)->
        System.out.println("Categoria: "+x +", Salario medio: "+p+"€"));

        //3. Encuentra al empleado con el salario más alto utilizando Optionals.
        Optional<Empleado> empleadoConSalarioMasAlto = empleados.stream()
                .max(Comparator.comparing(Empleado::getSalario));

        empleadoConSalarioMasAlto.ifPresent(x -> System.out.println("El empleado con el salario mas alto es: " +
                x.getNombre()+" con un salario de: "+x.getSalario()+"€"));

    }
}
