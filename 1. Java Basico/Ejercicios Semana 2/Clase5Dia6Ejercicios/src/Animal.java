public class Animal {
     private int id;
     private String nombre;
     private int edad;
     private String tipoPiel;
     private String tipoAlimentacion;

    public Animal(int id, String nombre, int edad, String tipoPiel, String tipoAlimentacion) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.tipoPiel = tipoPiel;
        this.tipoAlimentacion = tipoAlimentacion;
    }

    public void saludar(){
        System.out.println("Hola, soy un animal.");
    }
}
