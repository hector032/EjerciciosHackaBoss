package Ejercicio1ExploracionDirectorios;

import static Ejercicio1ExploracionDirectorios.ExploradorDirectorios.explorarDirectorio;

public class Main {
    public static void main(String[] args) {

        //Directorio principal
        Directorio directorioPrincipal = new Directorio(1, "Principal");
        directorioPrincipal.agregarArchivo("Archivo1");

        //Subdirectorios A, B y C
        Directorio subdirectorioA = new Directorio(2, "Subdirectorio A");
        Directorio subdirectorioB = new Directorio(3, "Subdirectorio B");
        Directorio subdirectorioC = new Directorio(4, "Subdirectorio C");
        //Asignacion de archivos a cada subdirectorio
        subdirectorioA.agregarArchivo("Archivo 2");
        subdirectorioB.agregarArchivo("Archivo 3");
        subdirectorioC.agregarArchivo("Archivo 4");

        //Agregamos subdirectorios A, B y C al directorio principal
        directorioPrincipal.agregarSubdirectorio(subdirectorioA);
        directorioPrincipal.agregarSubdirectorio(subdirectorioB);
        directorioPrincipal.agregarSubdirectorio(subdirectorioC);

        //Subdirectorios C1 Y C2 dentro del subdirectorio C
        Directorio subdirectorioC1 = new Directorio(5, "Subdirectorio C1");
        Directorio subdirectorioC2 = new Directorio(6, "Subdirectorio C2");
        subdirectorioC1.agregarArchivo("Archivo 5");
        subdirectorioC2.agregarArchivo("Archivo 6");
        subdirectorioC.agregarSubdirectorio(subdirectorioC1);
        subdirectorioC.agregarSubdirectorio(subdirectorioC2);

        //Llamada al metodo explorar directorios
        explorarDirectorio(directorioPrincipal, 0);


    }
}
