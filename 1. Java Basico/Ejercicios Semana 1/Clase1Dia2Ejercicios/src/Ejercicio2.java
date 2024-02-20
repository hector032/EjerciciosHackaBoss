public class Ejercicio2 {
    public static void main(String[] args) {
    /*
        a) Crea un programa que declare una variable para cada uno de los siguientes tipos
           de datos: int, double, boolean y String. Asigna un valor a cada variable y
           muestra su contenido en la consola.

        b) Ahora, asigna valores que no correspondan al tipo de dato. Por ejemplo,
           un int en un String o un String en un double… ¿Qué sucede con el programa?
           ¿Se produce algún error? ¿En qué situaciones se genera error y en cuáles no?
           Justificar el por qué de cada caso. Debatir con otros compañeros.
    */
        System.out.println("Ejercicio 2 A:");
        int edad = 25;
        double altura = 1.70;
        boolean mayorDeEdad = true;
        String nombre = "Hector";

        System.out.println("Edad: " + edad);
        System.out.println("Altura: " + altura);
        System.out.println("¿Es mayor de edad?: " + mayorDeEdad);
        System.out.println("Nombre: " + nombre);

        System.out.println("\nEjercicio 2 B:");
        System.out.println("Todos los casos dan error de compilación debido a que estamos intentando\n" +
                "asignar datos incorrectos a variables que esperan un tipo de dato específico.");

    /*

        edad = "veinticinco"; // Intentamos asignar un String a una variable int
        altura = true; // Intentamos asignar un boolean a una variable double
        mayorDeEdad = "true"; // Intentamos asignar un String a una variable boolean
        nombre = 30; // Intentamos asignar un int a una variable String


        System.out.println("Edad: " + edad);
        System.out.println("Altura: " + altura);
        System.out.println("¿Es mayor de edad?: " + mayorDeEdad);
        System.out.println("Nombre: " + nombre);


            Todos los casos dan error de compilación debido a que estamos intentando
            asignar datos incorrectos a variables que esperan un tipo de dato específico.
        */
    }
}
