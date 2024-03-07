package Ejercicio2ManejoDeComercio;

public class GestorInventario {
    private String nombreProducto;
    private double precio;
    private int cantidadDisponible;

    public GestorInventario() {

    }

    public void agregarPoducto(String nombreProducto, double precio, int cantidadDisponible) throws InventarioInvalidoException {
        try {
            if (nombreProducto == null || nombreProducto.isEmpty()) {
                throw new InventarioInvalidoException("Nombre invalido.");
            }
            if (precio < 0) {
                throw new InventarioInvalidoException("El precio tiene que ser un numero positivo");
            }
            if (cantidadDisponible < 0) {
                throw new InventarioInvalidoException("La cantidad disponible tiene que ser positiva");
            }

            // Si todas las condiciones son satisfactorias, se agrega el producto al inventario
            this.nombreProducto = nombreProducto;
            this.precio = precio;
            this.cantidadDisponible = cantidadDisponible;

            System.out.println("Has agregado " + cantidadDisponible + " unidades de " + nombreProducto + " al inventario correctamente ");

        } catch (InventarioInvalidoException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
}




