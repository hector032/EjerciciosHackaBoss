package com.mycompany.baloncestoejerciciointegradorjspyjpa.logica;

import com.mycompany.baloncestoejerciciointegradorjspyjpa.persistencia.ControladoraPersistencia;
import java.util.List;

public class Controladora {

    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public void crearEquipo(Equipo equipo) {
        controlPersis.crearEquipo(equipo);
    }

    public List<Equipo> traerEquipos() {
        return controlPersis.traerEquipos();

    }

    public Equipo buscarEquipoPorId(int id) {
        return controlPersis.buscarEquipoPorId(id);
    }
    
    public void crearPartido(Partido partido){
        controlPersis.crearPartido(partido);
    }
    
    public List<Partido> traerPartidos(){
        return controlPersis.traerPartidos();
    }

}
