import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        /*
            Crea un programa que pida al usuario que ingrese por teclado dos
            números enteros y realice las siguientes operaciones con ellos:
            suma, resta, multiplicación y división. Muestra por pantalla/consola
            los resultados de cada una de las operaciones con un mensaje amigable para el usuario.

            Extra: ¿Qué sucede si como segundo número de una división se ingresa 0?
            Con lo que sabes o aprendiste hasta ahora…
            ¿De qué manera tratarías de evitar ésta situación?
        */
        System.out.println("Ejercicio4");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un numero entero");
        int num1 = scanner.nextInt();

        System.out.println("Ingrese otro numero entero");
        int num2 = scanner.nextInt();

        int suma = num1 + num2;
        int resta = num1 - num2;
        int multiplicacion = num1 * num2;
        double division = 0;




        System.out.println("La suma de " + num1 + " mas " + num2 + " es: " + suma);
        System.out.println("La resta de " + num1 + " menos " + num2 + " es: " + resta);
        System.out.println("La multiplicación de " + num1 + " por " + num2 + " es: " + multiplicacion);

        if (num2 ==0){
            // si dividimos entre 0 daria el error: ArithmeticException
            System.out.println("No se puede dividir entre 0");
        } else {
            division = (double) num1 / num2;
            System.out.println("La división de " + num1 + " entre " + num2 + " es: " + division);
        }
    }
}
