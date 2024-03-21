package com.mycompany.baloncestoejerciciointegradorjspyjpa.servlets;

import com.mycompany.baloncestoejerciciointegradorjspyjpa.logica.Controladora;
import com.mycompany.baloncestoejerciciointegradorjspyjpa.logica.Equipo;
import com.mycompany.baloncestoejerciciointegradorjspyjpa.logica.Partido;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "PartidoSv", urlPatterns = {"/PartidoSv"})
public class PartidosSv extends HttpServlet {
    private Controladora control = new Controladora();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet PartidosSv</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet PartidosSv at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List<Partido> partidos = control.traerPartidos();
        
        request.setAttribute("resultadosPartidos", partidos);
        
        request.getRequestDispatcher("index.jsp").forward(request, response);
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String fecha = request.getParameter("fecha");
        int idLocal = Integer.parseInt(request.getParameter("idLocal"));
        int idVisitante = Integer.parseInt(request.getParameter("idVisitante"));
        String resultado = request.getParameter("resultado");
        
        Equipo equipoLocal = control.buscarEquipoPorId(idLocal);
        Equipo equipoVisitante = control.buscarEquipoPorId(idVisitante);
        
        Partido partido = new Partido();

        partido.setFecha(fecha);
        partido.setEquipoLocal(equipoLocal);
        partido.setEquipoVisitante(equipoVisitante);
        partido.setResultado(resultado);
        
        control.crearPartido(partido);
        
        response.sendRedirect("index.jsp");

        //processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
