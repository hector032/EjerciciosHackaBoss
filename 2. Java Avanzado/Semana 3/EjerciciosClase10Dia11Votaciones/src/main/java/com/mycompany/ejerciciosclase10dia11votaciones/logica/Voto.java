package com.mycompany.ejerciciosclase10dia11votaciones.logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Voto implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String partido;
    private int cantidadVotos;

    public Voto(String partido, int cantidadVotos) {
        this.partido = partido;
        this.cantidadVotos = cantidadVotos;
    }

    public Voto() {
    }

    public Voto(Long id, int cantidadVotos) {
        this.id = id;
        this.cantidadVotos = cantidadVotos;
    }

    public Voto(Long id, String partido, int cantidadVotos) {
        this.id = id;
        this.partido = partido;
        this.cantidadVotos = cantidadVotos;
    }

    public void incrementarVoto() {
        this.cantidadVotos++;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPartido() {
        return partido;
    }

    public void setPartido(String partido) {
        this.partido = partido;
    }

    public int getCantidadVotos() {
        return cantidadVotos;
    }

    public void setCantidadVotos(int cantidadVotos) {
        this.cantidadVotos = cantidadVotos;
    }

}
