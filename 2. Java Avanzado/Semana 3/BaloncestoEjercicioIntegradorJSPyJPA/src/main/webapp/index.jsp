<%@page import="com.mycompany.baloncestoejerciciointegradorjspyjpa.logica.Partido"%>
<%@page import="java.util.List"%>
<%@page import="com.mycompany.baloncestoejerciciointegradorjspyjpa.logica.Equipo"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>Partidos de baloncesto</title>
        <!-- Agregar estilos de Bootstrap -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    </head>
    <body>
        <div class="container mt-4">
            <h2>Registro de equipos</h2>
            <br>
            <form action="EquipoSv" method="post">
                <div class="form-group">
                    <label for="nombre">Nombre de equipo:</label>
                    <input type="text" class="form-control" id="nombre" name="nombre">
                </div>
                <div class="form-group">
                    <label for="ciudad">Ciudad:</label>
                    <input type="text" class="form-control" id="ciudad" name="ciudad">
                </div>
                <button type="submit" class="btn btn-primary">Registrar</button>
            </form>
            <br>
            <h2>Mostrar equipos</h2>
            <br>
            <form action="EquipoSv" method="GET">
                <button type="submit" class="btn btn-success" id="resultados" name="resultados">Mostrar equipos</button>
            </form>

            <br>
            <br>

            <div class="results-table">
                <% if (request.getAttribute("resultados") != null) { %>
                <h3>Equipos</h3>
                <table class="table">
                    <thead>
                        <tr>
                            <th>ID</th>
                            <th>Nombre</th>
                            <th>Ciudad</th>
                        </tr>
                    </thead>
                    <tbody>
                        <% for (Equipo equipo : (List<Equipo>) request.getAttribute("resultados")) {%>
                        <tr>
                            <td><%= equipo.getId()%></td>
                            <td><%= equipo.getNombre()%></td>
                            <td><%= equipo.getCiudad()%></td>
                        </tr>
                        <% } %>
                    </tbody>
                </table>
                <% }%>
            </div>
        </div>
        <hr>
        <div class="container mt-4">
            <h2>Registro de partidos</h2>
            <br>
            <form action="PartidoSv" method="post">
                <div class="form-group">
                    <label for="nombre">Fecha:</label>
                    <input type="text" class="form-control" id="fecha" name="fecha">
                </div>
                <div class="form-group">
                    <label for="nombre">Id de equipo local:</label>
                    <input type="text" class="form-control" id="idLocal" name="idLocal">
                </div>
                <div class="form-group">
                    <label for="ciudad">Id de equipo visitante</label>
                    <input type="text" class="form-control" id="idVisitante" name="idVisitante">
                </div>
                <div class="form-group">
                    <label for="ciudad">Resultado</label>
                    <input type="text" class="form-control" id="resultado" name="resultado">
                </div>
                <button type="submit" class="btn btn-primary">Registrar</button>
            </form> 

            <br>
            <h2>Mostrar Partidos</h2>
            <br>
            <form action="PartidoSv" method="GET">
                <button type="submit" class="btn btn-success" id="resultadosPartidos" name="resultadosPartidos">Mostrar partidos</button>
            </form>

            <br>
            <br>

            <div class="results-table">
                <% if (request.getAttribute("resultadosPartidos") != null) { %>
                <h3>Equipos</h3>
                <table class="table">
                    <thead>
                        <tr>
                            <th>Fecha</th>
                            <th>Equipo Local</th>
                            <th>Equipo visitante</th>
                            <th>Resultado</th>
                        </tr>
                    </thead>
                    <tbody>
                        <% for (Partido partido : (List<Partido>) request.getAttribute("resultadosPartidos")) {%>
                        <tr>
                            <td><%= partido.getFecha() %></td>
                            <td><%= partido.getEquipoLocal().getNombre() %></td>
                            <td><%= partido.getEquipoVisitante().getNombre() %></td>
                            <td><%= partido.getResultado() %></td>
                        </tr>
                        <% } %>
                    </tbody>
                </table>
                <% }%>
            </div>

            <!-- Scripts de Bootstrap -->
            <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
            <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    </body>
</html>