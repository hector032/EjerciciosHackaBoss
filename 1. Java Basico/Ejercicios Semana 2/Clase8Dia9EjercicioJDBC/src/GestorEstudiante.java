import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class GestorEstudiante {
    private Connection conexion;


    public GestorEstudiante() {
        try {
            String url = "jdbc:mysql://localhost:3306/universidad";
            String usuario = "root";
            String contraseña = "";
            conexion = DriverManager.getConnection(url, usuario, contraseña);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void agregarEstudiante(Estudiante estudiante) {
        try {
            String sql = "INSERT INTO estudiantes (nombre, edad, calificacion) VALUES (?, ?, ?)";
            PreparedStatement statement = conexion.prepareStatement(sql);
            statement.setString(1, estudiante.getNombre());
            statement.setInt(2, estudiante.getEdad());
            statement.setDouble(3, estudiante.getCalificacion());
            statement.executeUpdate();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public List<Estudiante> obtenerEstudiantes() {
        List<Estudiante> estudiantes = new ArrayList<>();
        try {
            String sql = "SELECT * FROM estudiantes";
            Statement statement = conexion.createStatement();
            ResultSet resultado = statement.executeQuery(sql);
            while (resultado.next()) {
                int id = resultado.getInt("id");
                String nombre = resultado.getString("nombre");
                int edad = resultado.getInt("edad");
                double calificacion = resultado.getDouble("calificacion");
                estudiantes.add(new Estudiante(nombre, edad, calificacion));
            }
            resultado.close();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return estudiantes;
    }

    public void cerrarConexion() {
        try {
            if (conexion != null && !conexion.isClosed()) {
                conexion.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
