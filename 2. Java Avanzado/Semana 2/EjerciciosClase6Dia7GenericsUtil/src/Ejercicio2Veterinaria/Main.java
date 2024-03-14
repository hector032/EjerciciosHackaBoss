package Ejercicio2Veterinaria;

public class Main {
    public static void main(String[] args) {

/*
Ejercicio 2: Veterinaria
Una clínica veterinaria necesita un sistema para administrar su registro de mascotas, para ello, se solicita la definición de una clase genérica Mascota<T> con atributos como nombre, edad, y especie (no olvides el código o id de mascota para identificar a cada una). Crea una clase utilitaria propia llamada RegistroMascotas que cuente con métodos genéricos para:
Agregar Mascotas al Registro: Utiliza métodos de la clase java.util junto con genéricos para manipular colecciones como ArrayList o LinkedList y agregar mascotas de distinto tipo al registro de la veterinaria (puedes tomar como ejemplos de tipos: perros, gatos, reptiles y aves).
Buscar Mascotas por Nombre o Especie: Emplea métodos de las clases utilitarias como Collections o Arrays junto con genéricos para realizar búsquedas eficientes por nombre o especie dentro del registro de mascotas.
Contar la Cantidad Total de Mascotas Registradas: Utiliza métodos de java.util  para obtener el tamaño de la colección y contar la cantidad total de mascotas registradas en la veterinaria.
Generar Datos Aleatorios para Mascotas: Utiliza la clase Random de java.util  para generar datos aleatorios, como nombres, edades o especies, para agregar mascotas al registro.
*/

        RegistroMascotas<Mascota<String>> registro = new RegistroMascotas<>();

        // Agregar una mascota manualmente
        Mascota<String> gato = new Mascota<>(1, "Fufi", 3, "Gato");
        registro.agregarMascota(gato);

        //Generar mascotas aleatorias
        registro.generarMascotasAleatorias(10);

        //buscar mascota por nombre
        String nombreBuscado = "Fufi";
        System.out.println("\nMascotas con el nombre " + nombreBuscado + ":");
        for (Mascota mascota : registro.buscarMascotaPorNombre(nombreBuscado)) {
            System.out.println(mascota.getNombre() + " - " + mascota.getEdad() + " años"+" - especie: "
                    + mascota.getEspecie());
        }

        //buscar mascota por especie
        String especieBuscada = "Perro";
        System.out.println("\nMascotas de especie " + especieBuscada + ":");
        for (Mascota mascota : registro.buscarMascotaPorEspecie(especieBuscada)) {
            System.out.println(mascota.getNombre() + " - " + mascota.getEdad() + " años"+" - especie: "
                    + mascota.getEspecie());
        }

        // Contar la cantidad total de mascotas registradas
        System.out.println("\nCantidad total de mascotas registradas: " + registro.contarTotalMascotasRegistradas());



    }
}
