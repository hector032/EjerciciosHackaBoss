package org.example;

public class Main {
    public static void main(String[] args) {


        /*
         Ejercicio Nº 1 - Repaso POO - Grupal

         Trabajando en equipos de 3 o 4 integrantes, deberán crear una clase llamada Verdura,
         que tenga los siguientes atributos: id, nombre, color, calorías, debeCocinarse
         (tener en cuenta todos sus atributos, constructores, métodos getters y setters).

         Luego, realiza las siguientes acciones:

         a) Crear un vector (array) de tipo Verdura que pueda almacenar 5 verduras.
            Crear 5 verduras y guardarlas en el vector.

         b) Recorrer el vector creado y mostrar por pantalla el nombre
            y las calorías de las verduras almacenadas.

         c) Cambiar todos los datos de dos verduras. Mostrar por pantalla los datos
            de todas las verduras luego del cambio.

         d) Recorrer el vector y mostrar por pantalla únicamente a las verduras
            que sean de color verde.
         */



        //EJERCICIO1

        Verdura [] vectorVerdura = new Verdura[5];

        vectorVerdura[0] = new Verdura (1,"Zanahoria","naranja",25,false);
        vectorVerdura[1] = new Verdura (2,"Espinacas","verde",20,false);
        vectorVerdura[2] = new Verdura (3,"Guisantes","verde",17,false);
        vectorVerdura[3] = new Verdura (4,"Brocoli","verde",38,false);
        vectorVerdura[4] = new Verdura (5,"Remolacha","morado",50,false);

        System.out.println("b)");
        for (int i = 0; i < vectorVerdura.length; i++) {
            System.out.println("\nNombre: "+ vectorVerdura[i].getNombre());
            System.out.println("Calorias: "+ vectorVerdura[i].getCalorias());
        }
        System.out.println();



        vectorVerdura[0].setId(6);
        vectorVerdura[0].setNombre("Ajo");
        vectorVerdura[0].setColor("blanco");
        vectorVerdura[0].setCalorias(60);
        vectorVerdura[0].setDebeCocinarse(true);

        vectorVerdura[1].setId(7);
        vectorVerdura[1].setNombre("Cebolla");
        vectorVerdura[1].setColor("blanco");
        vectorVerdura[1].setCalorias(32);
        vectorVerdura[1].setDebeCocinarse(true);

        System.out.println("c)");
        vectorVerdura[0].mostrarVerdura();
        vectorVerdura[1].mostrarVerdura();

        System.out.println();
        System.out.println("d)");
        for (int i = 0; i < vectorVerdura.length ; i++) {
            if (vectorVerdura[i].getColor().equalsIgnoreCase("verde")){
                System.out.println("\nNombre: "+ vectorVerdura[i].getNombre());
                System.out.println("Color: "+ vectorVerdura[i].getColor());
                System.out.println("Calorias: "+ vectorVerdura[i].getCalorias());



            }
        }







    }
}