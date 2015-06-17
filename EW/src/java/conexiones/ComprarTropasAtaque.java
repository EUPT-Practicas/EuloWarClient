/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexiones;

import cliente_webservice.ClienteCampamento;
import cliente_webservice.ClienteRecursosMinas;
import cliente_webservice.ClienteTropas;
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
public class ComprarTropasAtaque extends HttpServlet {

    private final String A_TANQUE = "TANQUE";
    private final String A_PELOTON = "PELOTON";
    private final String A_AVION_COMBATE = "AVION_COMBATE";
    private final String A_VEHICULO_BLINDADO = "VEHICULO_BLINDADO";
    private final String A_HELICOPTERO = "HELICOPTERO";
    private final String A_CHUCK_NORRIS = "CHUCK_NORRIS";

    private final int OCUPACION_PELOTON = 5;
    private final int OCUPACION_VEHICULO_BLINDADO = 10;
    private final int OCUPACION_TANQUE = 20;
    private final int OCUPACION_HELICOPTERO = 40;
    private final int OCUPACION_AVION_COMBATE = 80;
    private final int OCUPACION_CHUCK_NORRIS = 160;

    private final int PRECIO_PELOTON_1 = 50;
    private final int PRECIO_VEHICULO_BLINDADO = 100;
    private final int PRECIO_TANQUE = 200;
    private final int PRECIO_HELICOPTERO = 400;
    private final int PRECIO_AVION_COMBATE = 800;
    private final int PRECIO_CHUCK_NORRIS = 1600;

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
            String tipoTropa = request.getParameter("tipoTropa");
            int numTropas = Integer.valueOf(request.getParameter("numTropas"));

            HttpSession miSession = request.getSession();
            Usuario usuario = (Usuario) miSession.getAttribute("usuario");
            String email = usuario.getEmail();

            //CALCULAR PRECIO, CAPACIDAD Y COMPROBAR
            int precioTropas = 0;
            int capacidadTotal = 0;
            switch (tipoTropa) {
                case A_AVION_COMBATE:
                    precioTropas = numTropas * PRECIO_AVION_COMBATE;
                    capacidadTotal = numTropas * OCUPACION_AVION_COMBATE;
                    break;
                case A_CHUCK_NORRIS:
                    precioTropas = numTropas * PRECIO_CHUCK_NORRIS;
                    capacidadTotal = numTropas * OCUPACION_CHUCK_NORRIS;
                    break;
                case A_HELICOPTERO:
                    precioTropas = numTropas * PRECIO_HELICOPTERO;
                    capacidadTotal = numTropas * OCUPACION_HELICOPTERO;
                    break;
                case A_PELOTON:
                    precioTropas = numTropas * PRECIO_PELOTON_1;
                    capacidadTotal = numTropas * OCUPACION_PELOTON;
                    break;
                case A_TANQUE:
                    precioTropas = numTropas * PRECIO_TANQUE;
                    capacidadTotal = numTropas * OCUPACION_TANQUE;
                    break;
                case A_VEHICULO_BLINDADO:
                    precioTropas = numTropas * PRECIO_VEHICULO_BLINDADO;
                    capacidadTotal = numTropas * OCUPACION_VEHICULO_BLINDADO;
                    break;
            }

            ClienteCampamento ccampamentos = new ClienteCampamento();
            String respuestaCampamentos = ccampamentos.agregarTropasCampamento(capacidadTotal, email);
            if (respuestaCampamentos.equals("NO_ESPACIO")) {
                //NO HAY ESPACIO
                System.out.println("NO TIENES ESPACIO, CABEZON!!!");
                String mensaje = "No tienes espacio en tus campamentos.";
                request.setAttribute("mensaje", mensaje);
                request.getRequestDispatcher("ataque.jsp").forward(request, response);
            } else if (respuestaCampamentos.equals("OK")) {

                ClienteRecursosMinas crm = new ClienteRecursosMinas();
                String respuestaPrecio = crm.restarRecursos(precioTropas, email);
                if (respuestaPrecio.equals("INSUFICIENTES_RECURSOS")) {
                    //NO TIENES RECURSOS... HACER ALGO...
                    System.out.println("NO TIENES RECURSOS GAÑAN!!!!1");
                    String mensaje = "No hay recursos suficientes.";
                    request.setAttribute("mensaje", mensaje);
                    request.getRequestDispatcher("ataque.jsp").forward(request, response);

                } else if (respuestaPrecio.equals("OK")) {

                    ClienteTropas ct = new ClienteTropas();
                    ct.agregarTropasOfensivas(email, tipoTropa, numTropas);

                    response.sendRedirect("ataque.jsp");
                    
                    /////////////////////////////////////////////
                    //PONER UN MENSAJE DE QUE SE CREAN LAS TROPAS
                    /////////////////////////////////////////////

                    System.out.println("Comprando tropas ataque: " + numTropas + "  .  " + tipoTropa);

                }

            } else {
                System.out.println("PROBLEMOOOOOOOOOOOOOOOOOOOOOOOOOOOON");
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
