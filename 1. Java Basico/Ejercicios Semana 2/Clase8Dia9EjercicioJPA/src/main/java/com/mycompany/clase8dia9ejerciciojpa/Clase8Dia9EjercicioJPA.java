/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.clase8dia9ejerciciojpa;

import com.mycompany.clase8dia9ejerciciojpa.logica.Restaurante;
import com.mycompany.clase8dia9ejerciciojpa.persistencia.ControladorPersistencia;
import java.util.List;

/**
 *
 * @author Hector
 */
public class Clase8Dia9EjercicioJPA {

    public static void main(String[] args) {
        
        ControladorPersistencia controlPersis = new ControladorPersistencia();
        
        Restaurante rest = new Restaurante(1L,"Lasagna","Tomate, Carne, Pasta",15);
        controlPersis.crearPlatillo(rest);
        
        controlPersis.crearPlatillo(new Restaurante(2L,"Pizza","Tomate, Carne, Pepperoni",20));
        
        controlPersis.crearPlatillo(new Restaurante(3L,"Hamburguesa","Carne, Pan, Queso",12));
        
        //borramos el platillo Pizza
        controlPersis.borrarPlatillo(2L);
        
        // Cambiamos el precio de la Lasagna de 15 a 18
        rest.setPrecio(18);
        
        controlPersis.modificarPlatillo(rest);
        
        
        List<Restaurante> listaPlatillos = controlPersis.traerRestaurantes();
        
        System.out.println("----Lista de Platillos----");
        
        for(Restaurante plat:listaPlatillos){
            System.out.println(plat.toString());
        }   
    }
}
