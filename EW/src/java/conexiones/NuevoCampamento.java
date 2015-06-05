/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexiones;

import cliente_webservice.ClienteCampamento;
import cliente_webservice.ClienteRecursosMinas;
import clientes_WS.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Sergio
 */
public class NuevoCampamento extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet NuevoCampamento</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet NuevoCampamento at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
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
        //processRequest(request, response);
        request.setCharacterEncoding("UTF-8");

        HttpSession miSession = request.getSession();
        Usuario usuario = (Usuario) miSession.getAttribute("usuario");
        String email = usuario.getEmail();
        
        ClienteRecursosMinas crm = new ClienteRecursosMinas();

        String resultado = crm.restarRecursos(2500, email);
        switch (resultado) {
            case "INSUFICIENTES_RECURSOS":
                String mensaje = "No hay recursos suficientes. Se requieren: 2500";
                request.setAttribute("mensaje", mensaje);
                request.getRequestDispatcher("campamentos.jsp").forward(request, response);
                break;
            case "OK":
                ClienteCampamento cc = new ClienteCampamento();
                cc.nuevoCampamento(email);
                //Falta thread... si hace falta
//                Mina nuevaMina = crm.asignarMina(email);
//                GestorThreads g = GestorThreads.getInstance();
//                g.crearThreadRecursosMina(nuevaMina);

                response.sendRedirect("campamentos.jsp");
                break;
        }
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
