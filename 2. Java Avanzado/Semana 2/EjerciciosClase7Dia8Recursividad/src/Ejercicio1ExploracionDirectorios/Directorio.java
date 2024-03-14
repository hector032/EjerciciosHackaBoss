package Ejercicio1ExploracionDirectorios;

import java.util.ArrayList;
import java.util.List;

public class Directorio {
    private int id;
    private String nombre;
    private List<Directorio> subdirectorios;
    private List<String> archivos;

    public Directorio(int id,String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.subdirectorios = new ArrayList<>();
        this.archivos = new ArrayList<>();
    }

    public void agregarSubdirectorio(Directorio subdirectorio){
        this.subdirectorios.add(subdirectorio);
    }

    public void agregarArchivo(String archivo){
        this.archivos.add(archivo);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Directorio> getSubdirectorios() {
        return subdirectorios;
    }

    public void setSubdirectorios(List<Directorio> subdirectorios) {
        this.subdirectorios = subdirectorios;
    }

    public List<String> getArchivos() {
        return archivos;
    }

    public void setArchivos(List<String> archivos) {
        this.archivos = archivos;
    }
}
