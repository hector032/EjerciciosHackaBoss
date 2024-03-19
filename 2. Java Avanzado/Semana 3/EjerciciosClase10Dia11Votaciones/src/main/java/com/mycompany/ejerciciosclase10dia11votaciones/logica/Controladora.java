package com.mycompany.ejerciciosclase10dia11votaciones.logica;

import com.mycompany.ejerciciosclase10dia11votaciones.persistencia.ControladoraPersistencia;
import java.util.List;

public class Controladora {

    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public List<Voto> traerVotos() {
        return controlPersis.traerVotos();
    }
    
    public void votar(String partido) throws Exception{
        controlPersis.votar(partido);
    }
    
}
