package com.mycompany.baloncestoejerciciointegradorjspyjpa.persistencia;

import com.mycompany.baloncestoejerciciointegradorjspyjpa.logica.Equipo;
import com.mycompany.baloncestoejerciciointegradorjspyjpa.logica.Partido;
import java.util.List;

public class ControladoraPersistencia {

    EquipoJpaController equipoJPA = new EquipoJpaController();
    PartidoJpaController partidoJPA = new PartidoJpaController();

    public void crearEquipo(Equipo equipo) {
        equipoJPA.create(equipo);
    }

    public List<Equipo> traerEquipos() {
        return equipoJPA.findEquipoEntities();
    }

    public Equipo buscarEquipoPorId(int id) {
        return equipoJPA.findEquipo(id);
    }

    public void crearPartido(Partido partido) {
        partidoJPA.create(partido);
    }

    public List<Partido> traerPartidos() {
        return partidoJPA.findPartidoEntities();
    }

}
