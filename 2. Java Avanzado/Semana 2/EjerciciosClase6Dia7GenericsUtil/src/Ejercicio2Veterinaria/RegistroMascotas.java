package Ejercicio2Veterinaria;

import java.util.*;

public class RegistroMascotas<T extends Mascota> {
    private List<Mascota> mascotas;

    public RegistroMascotas() {
        mascotas = new ArrayList<>();
    }

    //agregar mascota
    public void agregarMascota(Mascota mascota){
        mascotas.add(mascota);
        System.out.println("Mascota registrada: "+mascota.getNombre());
    }

    //buscar por nombre
    public List <Mascota> buscarMascotaPorNombre (String nombre){
        List<Mascota> mascotasPorNombre = new ArrayList<>();
        for (Mascota mascota: mascotas){
            if (mascota.getNombre().equalsIgnoreCase(nombre)){
                mascotasPorNombre.add(mascota);
            }
        }
        return mascotasPorNombre;

    }
    //buscar mascota por especie
    public List <Mascota> buscarMascotaPorEspecie (String especie){
        List<Mascota> mascotasPorEspecie = new ArrayList<>();
        for (Mascota mascota: mascotas){
            if (mascota.getEspecie().equals(especie)){
                mascotasPorEspecie.add(mascota);
            }
        }
        return mascotasPorEspecie;
    }

    public int contarTotalMascotasRegistradas(){
        return mascotas.size();
    }

    public void generarMascotasAleatorias(int cantidad){
        Random random = new Random();
        String [] nombres = {"Atila", "Berto", "Pucho", "Bobi", "Firulais", "Zeus", "Cuqui", "Ñoño", "Tanque", "Hercules"};
        String[] especies = {"Perro", "Gato", "Reptil", "Ave"};

        for (int i = 1; i <= cantidad; i++) {
            int id = i;
            String nombre = nombres[random.nextInt(nombres.length)];
            int edad = random.nextInt(18)+1;
            String especie = especies[random.nextInt(especies.length)];
            Mascota mascota = new Mascota(id, nombre, edad, especie);
            mascotas.add(mascota);
            System.out.println("Mascota aleatoria registrada: "+mascota.getNombre()+ ", Especie: " +mascota.getEspecie());
        }
    }


}