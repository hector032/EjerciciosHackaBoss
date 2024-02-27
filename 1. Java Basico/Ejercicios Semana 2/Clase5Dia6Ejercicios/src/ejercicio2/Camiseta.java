package ejercicio2;

public class Camiseta extends Vestimenta{
    private String manga;
    private String cuello;

    public Camiseta(int codigo, String nombre, double precio, String marca, String talla, String color, String manga, String cuello) {
        super(codigo, nombre, precio, marca, talla, color);
        this.manga = manga;
        this.cuello = cuello;
    }
    public void mostrar(){
        System.out.println("Estos camiseta es de marca: "+ manga);
    }
}
