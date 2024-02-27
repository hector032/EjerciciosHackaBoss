public class Ave extends Animal {

    private String evergaduraAlas;
    private String tipoVuelo;
    private String colorPlumaje;
    private String tipoPico;

    public Ave(int id, String nombre, int edad, String tipoPiel, String tipoAlimentacion, String evergaduraAlas, String tipoVuelo, String colorPlumaje, String tipoPico) {
        super(id, nombre, edad, tipoPiel, tipoAlimentacion);
        this.evergaduraAlas = evergaduraAlas;
        this.tipoVuelo = tipoVuelo;
        this.colorPlumaje = colorPlumaje;
        this.tipoPico = tipoPico;
    }
    public void saludar(){
        System.out.println("Hola, soy un ave.");
    }
}
