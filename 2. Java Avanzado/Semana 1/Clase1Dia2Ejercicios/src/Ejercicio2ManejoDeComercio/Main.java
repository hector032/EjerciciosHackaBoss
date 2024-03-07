package Ejercicio2ManejoDeComercio;

import Ejercicio1ReservaDeVuelos.GestorReservas;

public class Main {
    public static void main(String[] args) throws InventarioInvalidoException {
        /*
 Ejercicio Nº 2 - Manejo de Inventarios en un Comercio - Individual

Imagina que estás desarrollando un sistema de gestión de inventarios para un comercio minorista.
Los usuarios pueden agregar productos al inventario proporcionando información como el nombre del producto,
el precio y la cantidad disponible. Tu tarea es implementar una función que maneje la gestión de inventarios,
validando los datos ingresados y manejando excepciones en caso de errores o datos inválidos.

Trata de ser lo más descriptivo posible en cada mensaje de excepción (en caso de que ésta sea opersonalizada)
o de utilizar los tipos correctos de excepción en cada caso.  */

        GestorInventario arroz = new GestorInventario();
        GestorInventario pasta = new GestorInventario();
        GestorInventario mayonesa = new GestorInventario();

        arroz.agregarPoducto("Arroz 1kg", 2, 20);
        pasta.agregarPoducto("Paste 1kg", 3, 20);
        mayonesa.agregarPoducto("Mayonesa 500g", 5, 25);

        System.out.println();

        arroz.agregarPoducto("", 2, 20);
        arroz.agregarPoducto("Arroz 1kg", -1, 20);
        arroz.agregarPoducto("Arroz 1kg", 2, -1);
    }

}

