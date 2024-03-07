package Ejercicio3VectoresYexcepciones;

public class GestorDatos {
    private String[] datos;


    //Constructor con uan capacidad especifica
    public GestorDatos(int capacidad) {
        this.datos = new String[capacidad];
    }

    // hay que pasar en el metodo el indice y el valor
    public void almacenarDato(int indice, String dato) {
        try {
            if (indice >= 0 && indice < datos.length) {
                datos[indice] = dato;
                System.out.println("Dato almacenado correctamente");
            } else {
                //IndexOutOfBoundsException = indice fuera de rango
                throw new IndexOutOfBoundsException("Indice fuera del rango");
            }
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Error:" + ex.getMessage());

        }
    }

    //Pedimos sobre que indice desea obtener el dato
    public String obtenerDato(int indice) {

        try {
            if (indice >= 0 && indice < datos.length) {
                
                return datos[indice];
            } else {
                //IndexOutOfBoundsException = indice fuera de rango
                throw new IndexOutOfBoundsException("Indice fuera del rango");
            }
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Error:" + ex.getMessage());
            return null;
        }
    }
}

