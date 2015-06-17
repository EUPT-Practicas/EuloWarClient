/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexiones;

import cliente_webservice.ClienteCampamento;
import cliente_webservice.ClienteCombates;
import cliente_webservice.ClienteRecursosMinas;
import cliente_webservice.ClienteTropas;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import operacionescombates_WS.Usuario;

/**
 *
 * @author FranciscoJavier
 */
@WebServlet(name = "Combate", urlPatterns = {"/Combate"})
public class Combate extends HttpServlet {

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
            /* TODO output your page here. You may use following sample code. */
            HttpSession miSession = request.getSession();
            clientes_WS.Usuario usuario = (clientes_WS.Usuario) miSession.getAttribute("usuario");
            String emailUsuario = usuario.getEmail();

            System.out.println("GRIJANDOR");
            ClienteCombates cc = new ClienteCombates();
            Usuario rival = cc.elegirRival(emailUsuario);
            String emailRival = rival.getEmail();
            Usuario ganador = cc.simularCombate(emailUsuario, emailRival);
            String emailGanador = ganador.getEmail();
            System.out.println("RIVALVALVAL: " + emailRival);

            ClienteTropas ct = new ClienteTropas();
            ct.eliminarTropasOfensivas(emailUsuario);
            ClienteCampamento ccampamentos = new ClienteCampamento();
            ccampamentos.reiniciarCampamentos(emailUsuario);

            ClienteRecursosMinas crm = new ClienteRecursosMinas();
            int recursosRival = crm.obtenerRecursos(emailRival);
            System.out.println("Y SU GANADOR EEEEEEEEES: " + emailGanador);

            if (emailGanador.equals(emailUsuario)) {
                System.out.println("HAS GANADO!!");
                //MOSTRAR MENSAJE DE VICTORIA ... SUMAR RECURSOS... RESTAR TROPAS
                String mensaje = "¡¡EXITO!! Has ganado el combate, tus recursos se doblaran.";
                request.setAttribute("mensaje", mensaje);
                request.getRequestDispatcher("atacar.jsp").forward(request, response);

                int recursosASumar = (int) ((int) recursosRival * 0.5);
                System.out.println("RECURSOS RIVAL: " + recursosRival + " ----- RECURSOS A SUMAR: " + recursosASumar);
                crm.sumarRecursos(recursosASumar, emailUsuario);
                crm.restarRecursos(recursosASumar, emailRival);
            } else {
                System.out.println("HAS PERDIDO");
                //MOSTRAR MENSAJE DE DERROTA... RESTAR TROPAS
                String mensaje = "¡¡OHH, PERDISTE!! Has perdido el combate.";
                request.setAttribute("mensaje", mensaje);
                request.getRequestDispatcher("atacar.jsp").forward(request, response);
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
