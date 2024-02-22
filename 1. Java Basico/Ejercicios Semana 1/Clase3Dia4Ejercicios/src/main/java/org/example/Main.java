package org.example;

public class Main {
    public static void main(String[] args) {

    /*
    Ejercicio Nº 1 - Clases y Objetos - Individual

    Crear una clase llamada Electrodomestico (sin tilde, recuerda que los nombres
    de clases y variables no llevan tilde) con los siguientes atributos: cod, marca
   , modelo, consumo y color.

    Luego, realiza las siguientes acciones:

    a) Crea 3 objetos de la clase Electrodomestico utilizando parámetros.

    b) Crea 1 objeto de la clase Electrodomestico sin parámetros.

    c) Muestra por pantalla la marca, modelo y consumo energético de los 3 electrodomésticos
    creados con parámetros.

    d) Intenta obtener la marca del electrodoméstico creado sin parámetros.
    ¿Se obtiene algún valor? De ser así… ¿Qué valor se obtiene?
    */

        //EJERCICIO 1 (Descomenntar lo de abajo para que funcione)

        Electrodomestico electrodomestico1 = new Electrodomestico(1,"LG","VX4300","100W","RED");
        Electrodomestico electrodomestico2 = new Electrodomestico(2,"SANSUNG","KM100","25W","BLUE");
        Electrodomestico electrodomestico3 = new Electrodomestico(3,"CECOTEC","VQ77","75W","YELLOW");
        Electrodomestico electrodomestico4 = new Electrodomestico();

/*      electrodomestico1.mostrar();
        electrodomestico2.mostrar();
        electrodomestico3.mostrar();

        System.out.println("\nIntentamos imprimir marca del objeto vacio  \nMarca: "+electrodomestico4.getMarca()+"\nDevuelve null porque el objeto no esta inicializado, esta vacio");
        //Devuelve null porque el objeto no esta inicializado, esta vacio.
*/

        /*
        Ejercicio Nº 2 - POO - Individual

        Crear una clase Persona, que tenga los siguientes atributos:
        id, nombre, edad, dirección y número de teléfono
        (tener en cuenta todos sus atributos, constructores y métodos getters y setters).

        a) Crear un vector de tipo Persona cinco posiciones.
           Crear cinco personas y guardarlas en él.

        b) Recorrer el vector creado y mostrar por pantalla
           el nombre y edad de cada persona almacenada.

        c) Cambiar el nombre de dos personas. Mostrar por pantalla el antes,
           realizar el cambio y luego mostrar el después de los datos de las
           dos personas cuyos nombres fueron cambiados.

        d) Recorrer el vector y mostrar por pantalla únicamente a las personas
          cuya edad sea mayor de 30 años.
        */

        //EJERCICIO 2

        Persona [] vectorPersona = new Persona[5];

        vectorPersona[0] = new Persona ("Hector",25);
        vectorPersona[1] = new Persona ("Juan",20);
        vectorPersona[2] = new Persona ("Maria",17);
        vectorPersona[3] = new Persona ("Pedro",38);
        vectorPersona[4] = new Persona ("Antonio",50);

        //Mostramos todos los datos de los vectores de tipo Persona.
        for (int i = 0; i < vectorPersona.length; i++) {
            System.out.println("Nombre: "+vectorPersona[i].getNombre());
            System.out.println("Edad: "+vectorPersona[i].getEdad());
            System.out.println();
        }

        //Mostramos el antes del cambio de nombre
        System.out.println("Mostramos el antes del cambio de nombre");
        vectorPersona[1].mostrarPersona();
        System.out.println();
        vectorPersona[2].mostrarPersona();
        System.out.println();

        //Cambiamos el nombre mediante sets
        vectorPersona[1].setNombre("Manuel");
        vectorPersona[2].setNombre("Veronica");

        //Mostramos el despues del cambio de nombre
        System.out.println("Mostramos el despues del cambio de nombre");
        vectorPersona[1].mostrarPersona();
        System.out.println();
        vectorPersona[2].mostrarPersona();

        // Personas mayores de 30 años
        System.out.println("\nPersonas mayores de 30 años.");
        for (int i = 0; i < vectorPersona.length ; i++) {
            if (vectorPersona[i].getEdad() > 30){

                System.out.println("Nombre: "+vectorPersona[i].getNombre());
                System.out.println("Edad: "+vectorPersona[i].getEdad());
                System.out.println();
            }
        }







    }
}