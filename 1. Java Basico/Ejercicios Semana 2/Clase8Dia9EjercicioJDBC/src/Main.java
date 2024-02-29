import java.util.List;

public class Main {
    public static void main(String[] args) {

        GestorEstudiante gestor = new GestorEstudiante();

        gestor.agregarEstudiante(new Estudiante("Hector",25,7));
        gestor.agregarEstudiante(new Estudiante("Lucia",28,6));

        List<Estudiante> estudiantes = gestor.obtenerEstudiantes();
        for (Estudiante estudiante: estudiantes){
            System.out.println(estudiante);
        }
        gestor.cerrarConexion();
    }
}
