/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clase8dia9ejerciciojpa.persistencia;

import com.mycompany.clase8dia9ejerciciojpa.logica.Restaurante;
import com.mycompany.clase8dia9ejerciciojpa.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Hector
 */
public class ControladorPersistencia {

    RestauranteJpaController restaJPA = new RestauranteJpaController();

    public void crearPlatillo(Restaurante rest) {
        restaJPA.create(rest);
    }

    public void borrarPlatillo(Long id) {
        try {
            restaJPA.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladorPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }    
    }       
           
    public List<Restaurante> traerRestaurantes() {
        return restaJPA.findRestauranteEntities();
    }

    public void modificarPlatillo(Restaurante rest) {

        try {
            restaJPA.edit(rest);
        } catch (Exception ex) {
            Logger.getLogger(ControladorPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
