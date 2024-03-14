package Ejercicio1ConcesionariaDeAutos;

import java.util.ArrayList;
import java.util.List;

public class InventarioAutos <T extends Auto>{

    private List<T> autos;



    public InventarioAutos(){
        this.autos = new ArrayList<>();
    }

    public void agregarAuto(T auto){
        autos.add(auto);
        System.out.println("Auto agregado al inventario: "+ auto.getModelo());
    }

    public List<T> buscarPorMarca(String marca){
        List<T> autosPorMarca = new ArrayList<>();
        for (T auto: autos){
            if (auto.getMarca().equalsIgnoreCase(marca)){
                autosPorMarca.add(auto);
            }
        }
        return autosPorMarca;

    }

    public List<T> buscarPorAño(int anioValidar){
        List<T> autosPorAño = new ArrayList<>();
        for (T auto: autos){
            if (auto.getAnio()==anioValidar){
                autosPorAño.add(auto);
            }
        }
        return autosPorAño;
    }

    public double valorTotalInventario(){
        double valorTotal=0;
        for (T auto: autos){
            valorTotal += auto.getPrecio();
        }
        return valorTotal;
    }



}