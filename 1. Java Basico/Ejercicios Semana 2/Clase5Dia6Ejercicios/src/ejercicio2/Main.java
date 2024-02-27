package ejercicio2;

public class Main {
    public static void main(String[] args) {

        Vestimenta[] vectorVestimenta = new Vestimenta[9];

        vectorVestimenta[0] = new Zapato(1, "Zapato deportivo", 49.99, "Nike", "42", "Negro", "Cuero", "Cordones");
        vectorVestimenta[1] = new Zapato(2, "Zapato casual", 39.99, "Adidas", "41", "Azul", "Tela", "Velcro");
        vectorVestimenta[2] = new Zapato(3, "Zapatilla de vestir", 59.99, "Puma", "40", "Blanco", "Cuero", "Cordones");

        vectorVestimenta[3] = new Pantalon(4, "Pantalon vaquero", 59.99, "Levis", "M", "Azul", "Ajustado", "Denim");
        vectorVestimenta[4] = new Pantalon(5, "Pantalon deportivo", 29.99, "Nike", "L", "Negro", "Holgado", "Polyester");
        vectorVestimenta[5] = new Pantalon(6, "Pantalon chino", 39.99, "Zara", "S", "Beige", "Recto", "Algodon");

        vectorVestimenta[6] = new Camiseta(7, "Camiseta basica", 14.99, "H&M", "L", "Blanco", "Corta", "Cuello redondo");
        vectorVestimenta[7] = new Camiseta(8, "Camiseta estampada", 19.99, "Pull&Bear", "M", "Negro", "Larga", "Cuello pico");

        vectorVestimenta[8] = new Sombrero(9, "Sombrero de vaquero", 24.99, "Zara", "Unica", "Marron", "Paja", "XL");

        for (int i = 0; i < vectorVestimenta.length; i++) {
            vectorVestimenta[i].mostrar();
        }

    }
}
