package ejercicio2;

public class Sombrero extends Vestimenta{

    private String tipo;
    private String tamanio;

    public Sombrero(int codigo, String nombre, double precio, String marca, String talla, String color, String tipo, String tamanio) {
        super(codigo, nombre, precio, marca, talla, color);
        this.tipo = tipo;
        this.tamanio = tamanio;
    }

    public void mostrar(){
        System.out.println("Estos sombrero es de marca: "+ tipo);
    }
}
