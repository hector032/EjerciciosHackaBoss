public class Main {
    public static void main(String[] args) {


        Ave loro= new Ave(1,"loro",3,"plumas","pipas","pequeñas","bajo","verde","corto");
        Mamifero perro = new Mamifero(2,"Perro",6,"pelo","granos",4,"viviparo","marron","domestico");
        Reptil cocodrilo = new Reptil(3,"cocodrilo",4,"escamas","carnivoro",2.30,"duras","no veneno","Salvaje");

        loro.saludar();
        perro.saludar();
        cocodrilo.saludar();


        Animal animal = new Mamifero(4,"animal",6,"plumas","carnivoro",2,"viviparo","marron","salvaje");
        animal.saludar();

        // Parte E) causa un error de compilacion, por lo cual no se puede acceder al metodo saludad desde fuera de la clase.
        System.out.println("\nParte E) causa un error de compilacion, por lo cual no se puede acceder al metodo saludad desde fuera de la clase.");
    }
}