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
import threadsTiempo.GestorThreads;

/**
 *
 * @author Sergio
 */
public class MejorarDefensa extends HttpServlet {
    
    private final int PRECIO_FABRICA_DEFENSA = 500;

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
            System.out.println("- - - ENTRA A POST ME_DEF");
            int nivel = Integer.valueOf(request.getParameter("nivelFabrica"));

            HttpSession miSession = request.getSession();
            Usuario usuario = (Usuario) miSession.getAttribute("usuario");
            String email = usuario.getEmail();
            
            ClienteRecursosMinas crm = new ClienteRecursosMinas();
            String resultadoRecursos = crm.restarRecursos(nivel*PRECIO_FABRICA_DEFENSA, email); //OBTENER NIVEL FABRICAR PARA UNIDADES.
            
            if (resultadoRecursos.equals("INSUFICIENTES_RECURSOS")) {
                //NO TIENES RECURSOS... HACER ALGO...
                System.out.println("NO TIENES RECURSOS GAÑAN!!!!1");
            } else if (resultadoRecursos.equals("OK")) {
                GestorThreads.getInstance().crearThreadMejorarDefensa(email);
            
                response.sendRedirect("defensa.jsp");
            
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
