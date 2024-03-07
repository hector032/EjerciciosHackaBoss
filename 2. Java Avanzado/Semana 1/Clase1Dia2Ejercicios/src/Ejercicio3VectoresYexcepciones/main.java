package Ejercicio3VectoresYexcepciones;

public class main {
    public static void main(String[] args) {
/*Ejercicio Nº 3 - Vectores y excepciones - Individual

Estás desarrollando una aplicación de gestión de datos en la que puedes almacenar información en un vector y acceder a ella posteriormente. Tu tarea es implementar una función que te permita almacenar datos en un vector y manejar excepciones estándar de Java teniendo en cuenta lo siguiente:

Desarrolla una función que te permita almacenar datos en un vector. Puedes utilizar un vector de tamaño fijo para simplificar el ejercicio.

Luego, implementa un mecanismo que te permita acceder a los datos almacenados en el vector proporcionando un índice.

Utiliza una excepción estándar de Java que, al intentar acceder a una posición que no existe en el vector, por ejemplo, un índice que esté fuera del rango del vector se pueda capturar.

Captura la excepción y proporciona un mensaje de error descriptivo que indique que estás intentando acceder a una posición inválida en el vector.*/

        GestorDatos gestion = new GestorDatos(5);

        gestion.almacenarDato(0, "Dato 1");
        gestion.almacenarDato(1, "Dato 2");
        gestion.almacenarDato(2, "Dato 3");

        //Intentamos crear en un indice fuera del maximo rango que seria 4
        gestion.almacenarDato(6, "Dato 4");


        System.out.println(gestion.obtenerDato(0));
        System.out.println(gestion.obtenerDato(1));
        System.out.println(gestion.obtenerDato(2));

        //Pasamos un indice fuera de rango(sin el print para que no devuelva null)
        gestion.obtenerDato(6);




    }
}
