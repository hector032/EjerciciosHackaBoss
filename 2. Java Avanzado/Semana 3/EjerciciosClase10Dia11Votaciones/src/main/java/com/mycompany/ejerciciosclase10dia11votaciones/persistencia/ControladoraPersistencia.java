package com.mycompany.ejerciciosclase10dia11votaciones.persistencia;

import com.mycompany.ejerciciosclase10dia11votaciones.logica.Voto;
import com.mycompany.ejerciciosclase10dia11votaciones.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladoraPersistencia {

    VotoJpaController votoJPA = new VotoJpaController();

    public List<Voto> traerVotos() {
        return votoJPA.findVotoEntities();
    }

    public void votar(String partido) throws Exception {
        try {
            Voto votoHecho = votoJPA.findVotoPorPartido(partido);

            if (votoHecho == null) {
                votoHecho = new Voto(partido, 1);
                votoJPA.create(votoHecho);
            } else {
                votoHecho.incrementarVoto();
                votoJPA.edit(votoHecho);
            }
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
