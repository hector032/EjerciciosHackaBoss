public class Mamifero extends Animal{

    private int numeroPatas;
    private String tipoReproduccion;
    private String colorPelaje;
    private String habitad;

    public Mamifero(int id, String nombre, int edad, String tipoPiel, String tipoAlimentacion, int numeroPatas, String tipoReproduccion, String colorPelaje, String habitad) {
        super(id, nombre, edad, tipoPiel, tipoAlimentacion);
        this.numeroPatas = numeroPatas;
        this.tipoReproduccion = tipoReproduccion;
        this.colorPelaje = colorPelaje;
        this.habitad = habitad;
    }

    public void saludar(){
        System.out.println("Hola, soy un mamifero.");
    }
}
