/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexiones;

import cliente_webservice.ClienteRecursosMinas;
import clientes_WS.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import operacionesminas_client.Mina;
import threadsTiempo.GestorThreads;

/**
 *
 * @author Sergio
 */
public class MejorarMina extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        try (PrintWriter out = response.getWriter()) {
            System.err.println("- - - ENTRA A POST MEJORAR MINA - - -");
            int idmina = Integer.valueOf(request.getParameter("IdMina"));

            HttpSession miSession = request.getSession();
            Usuario usuario = (Usuario) miSession.getAttribute("usuario");
            String email = usuario.getEmail();

            ClienteRecursosMinas crm = new ClienteRecursosMinas();

            int nivelActualizar = crm.getMina(idmina).getNivelMina() + 1;

            if (nivelActualizar > 5) {
                String mensaje = "La mina no puede ser mejorada";
                request.setAttribute("mensaje", mensaje);
                request.getRequestDispatcher("minas.jsp").forward(request, response);
            }

            String resultado = crm.restarRecursos(crm.obtenerNivelMina(nivelActualizar).getPrecio(), email);
            switch (resultado) {
                case "INSUFICIENTES_RECURSOS":
                    String mensaje = "No hay recursos suficientes. Se requieren: " + crm.obtenerNivelMina(nivelActualizar).getPrecio();
                    request.setAttribute("mensaje", mensaje);
                    request.getRequestDispatcher("minas.jsp").forward(request, response);
                    break;
                case "OK":
                    System.err.println("LA mina a mejorar es: " + idmina);
                    GestorThreads.getInstance().crearThreadMejoraMina(idmina);
      
                    response.sendRedirect("minas.jsp");
                    break;
            }

        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
