package org.example;

public class Persona {
    private int id;
    private String nombre;
    private int edad;
    private String direccion;
    private int numeroTelefono;

    public Persona(String nombre, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.direccion = direccion;
        this.numeroTelefono = numeroTelefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void mostrarPersona(){
        System.out.println("Nombre: "+ nombre);
        System.out.println("Edad: "+ edad);
    }
}
