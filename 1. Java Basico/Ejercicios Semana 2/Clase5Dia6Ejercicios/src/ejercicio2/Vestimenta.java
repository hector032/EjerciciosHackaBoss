package ejercicio2;

public class Vestimenta {

    private int codigo;
    private String nombre;
    private double precio;
    String marca;
    private String talla;
    private String color;

    public Vestimenta(int codigo, String nombre, double precio, String marca, String talla, String color) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.marca = marca;
        this.talla = talla;
        this.color = color;
    }

    public void mostrar(){
        System.out.println("Estos ropa es de marca");
    }
}
