<%@page import="java.util.List"%>
<%@page import="com.mycompany.ejerciciosclase10dia11votaciones.logica.Voto"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>Votación</title>
        <!-- Agregar estilos de Bootstrap -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    </head>
    <body>
        <div class="container mt-4">
            <h2>Votación</h2>
            <p>Elija su voto</p>
            <form action="VotoSv" method="post">

                <input type="radio"  id="partidoA" name="voto" value="Partido A">
                <label for="partidoA">Partido A</label>
                <br>

                <input type="radio"  id="partidoB" name="voto" value="Partido B">
                <label for="partidoB">Partido B</label>
                <br>

                <input type="radio"  id="partidoC" name="voto" value="Partido C">
                <label for="partidoC">Partido C</label>
                <br>
                <br>

                <button type="submit" class="btn btn-primary">Enviar</button>
            </form>
            <br>

            <h2></h2>
            <form action="VotoSv" method="get">
                <button type="submit" class="btn btn-success" id="mostrarResultados" name="mostrarResultados">Mostrar resultados</button>
            </form>

            <br>
            <br>
            <!-- Resultados en tabla -->
            <div class="results-table">
                <% if (request.getAttribute("resultados") != null) {
                        List<Voto> resultados = (List<Voto>) request.getAttribute("resultados");
                %>
                <h3>Resultados:</h3>
                <table class="table">
                    <thead>
                        <tr>
                            <th>Nombre Partido</th>
                            <th>Cantidad Votos</th>
                        </tr>
                    </thead>
                    <tbody>
                        <% for (Voto voto : resultados) {%>
                        <tr>
                            <td><%= voto.getPartido()%></td>
                            <td><%= voto.getCantidadVotos()%></td>
                        </tr>


                        <% } %>
                    </tbody>
                </table>
                <% }%>
            </div>
        </div>
        <!-- Scripts de Bootstrap -->
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    </body>
</html>