
package com.mycompany.clase8dia9ejerciciojpa.logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Restaurante implements Serializable {
                         
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String receta;
    private double precio;

    //Constructor vacio
    public Restaurante() {
    }
    
    //Constructor con parametros
    public Restaurante(Long id, String nombre, String receta, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.receta = receta;
        this.precio = precio;
    }
    
    //Getters y Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getReceta() {
        return receta;
    }

    public void setReceta(String receta) {
        this.receta = receta;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    //ToString

    @Override
    public String toString() {
        return "Restaurante{" + "id=" + id + ", nombre=" + nombre + ", receta=" + receta + ", precio=" + precio + '}';
    }
    
    
    
    
    
    
    
}
