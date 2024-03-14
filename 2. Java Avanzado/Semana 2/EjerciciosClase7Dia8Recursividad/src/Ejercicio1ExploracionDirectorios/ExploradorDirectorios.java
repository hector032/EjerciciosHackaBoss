package Ejercicio1ExploracionDirectorios;

public class ExploradorDirectorios {

    public static void explorarDirectorio(Directorio directorio, int nivel){
        System.out.println("  ".repeat(nivel*4)+ directorio.getNombre());
        for (String archivo: directorio.getArchivos()){
            System.out.println("  ".repeat(nivel*4+4)+"Archivo: "+archivo);
        }
        for (Directorio subdirectorio: directorio.getSubdirectorios()){
            explorarDirectorio(subdirectorio, nivel+1);
        }

    }
}
