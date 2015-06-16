/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexiones;

import cliente_webservice.ClienteRecursosMinas;
import cliente_webservice.ClienteTropas;
import clientes_WS.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author FranciscoJavier
 */
@WebServlet(name = "ComprarTropasDefensa", urlPatterns = {"/ComprarTropasDefensa"})
public class ComprarTropasDefensa extends HttpServlet {

    private final int PRECIO_CAMPO_MINAS = 50;
    private final int PRECIO_TRINCHERA_AMETRALLADORAS = 100;
    private final int PRECIO_CANYON_COMBATE = 200;
    private final int PRECIO_CANYON_ANTIAEREO = 400;
    private final int PRECIO_MISIL_ANTIAEREO = 800;
    private final int PRECIO_RAMBO = 1600;

    private final String D_MISIL_ANTIAEREO = "MISIL_ANTIAEREO";
    private final String D_TRINCHERA_AMETRALLADORAS = "TRINCHERA_AMETRALLADORAS";
    private final String D_RAMBO = "RAMBO";
    private final String D_CAMPO_MINAS = "CAMPO_MINAS";
    private final String D_CANYON_COMBATE = "CAÑON_COMBATE";
    private final String D_CANYON_ANTIAEREO = "CAÑON_ANTIAEREO";

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
            String tipoTropa = request.getParameter("tipoTropa");
            int numTropas = Integer.valueOf(request.getParameter("numTropas"));

            HttpSession miSession = request.getSession();
            Usuario usuario = (Usuario) miSession.getAttribute("usuario");
            String email = usuario.getEmail();

            //CALCULAR PRECIO Y COMPROBAR
            int precioTropas = 0;
            switch (tipoTropa) {
                case D_CAMPO_MINAS:
                    precioTropas = numTropas * PRECIO_CAMPO_MINAS;
                    break;
                case D_CANYON_ANTIAEREO:
                    precioTropas = numTropas * PRECIO_CANYON_ANTIAEREO;
                    break;
                case D_CANYON_COMBATE:
                    precioTropas = numTropas * PRECIO_CANYON_COMBATE;
                    break;
                case D_MISIL_ANTIAEREO:
                    precioTropas = numTropas * PRECIO_MISIL_ANTIAEREO;
                    break;
                case D_RAMBO:
                    precioTropas = numTropas * PRECIO_RAMBO;
                    break;
                case D_TRINCHERA_AMETRALLADORAS:
                    precioTropas = numTropas * PRECIO_TRINCHERA_AMETRALLADORAS;
                    break;
            }
            ClienteRecursosMinas crm = new ClienteRecursosMinas();
            String respuestaPrecio = crm.restarRecursos(precioTropas, email);
            if (respuestaPrecio.equals("INSUFICIENTES_RECURSOS")) {
                //NO TIENES RECURSOS... HACER ALGO...
                System.out.println("NO TIENES RECURSOS GAÑAN!!!!1");
                String mensaje = "No hay recursos suficientes.";
                request.setAttribute("mensaje", mensaje);
                request.getRequestDispatcher("defensa.jsp").forward(request, response);
            } else if (respuestaPrecio.equals("OK")) {

                System.out.println("Comprando tropas ataque: " + numTropas + "  .  " + tipoTropa);
                ClienteTropas ct = new ClienteTropas();
                ct.agregarTropasDefensivas(email, tipoTropa, numTropas);

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
