package com.mycompany.ejerciciosclase10dia11votaciones.servlets;

import com.mycompany.ejerciciosclase10dia11votaciones.logica.Controladora;
import com.mycompany.ejerciciosclase10dia11votaciones.logica.Voto;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "VotoSv", urlPatterns = {"/VotoSv"})
public class VotosSv extends HttpServlet {

    private Controladora control = new Controladora();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet VotosServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet VotosServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List<Voto> votos = control.traerVotos();

        request.setAttribute("resultados", votos);

        request.getRequestDispatcher("index.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String votoRealizado = request.getParameter("voto");

        //Evitamos que se creen Partidos null o vacios
        if (votoRealizado != null && !votoRealizado.isEmpty()) {
            control.votar(votoRealizado);
        }

        response.sendRedirect("index.jsp");

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
