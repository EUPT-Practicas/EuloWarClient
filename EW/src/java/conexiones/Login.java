/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexiones;

import Utilidades.EncriptaMD5;
import cliente_webservice.ClienteRegistroAuth;
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
 * @author Ricardo
 */
public class Login extends HttpServlet {

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
            request.setCharacterEncoding("UTF-8");
            ClienteRegistroAuth cra = new ClienteRegistroAuth();
            Usuario usuario;
            boolean exitoLogin = false;

            //Recoger los datos del formulario.
            String nombreUsuario = request.getParameter("nombre");
            String password = request.getParameter("password");

            System.out.println("nom: " + nombreUsuario);
            System.out.println("pass: " + password);
            System.out.println("el nombre es " + nombreUsuario + " con passs " + password);
//        
//        System.out.println("¿El usuario entra?: " + comprobarLogin(nombre, password) );

            if (!nombreUsuario.isEmpty() && nombreUsuario != null
                    && !password.isEmpty() && password != null) {
                System.out.println("el nombre en donde encripta es " + nombreUsuario);
                String encriptada = EncriptaMD5.encriptarClave(password, nombreUsuario);
                System.out.println("encriptada: " + encriptada);
                exitoLogin = cra.comprobarLogin(nombreUsuario, encriptada);
            }
            String resultado;
            if (exitoLogin) {
                System.err.println("EL USUARIO EXISTE");
                resultado = "EXISTE red";
                usuario = (Usuario) cra.findUser(nombreUsuario);

                HttpSession nuevaSesion = request.getSession();
                nuevaSesion.setAttribute("auth", "OK");
                nuevaSesion.setAttribute("usuario", usuario);

                response.sendRedirect("./general.jsp");
                //CUANDO TENGA EXITO TENGO QUE PASAR EL EMAIL A WEBSOCKET.JS
            } else {
                String mensaje = "Usuario y/o contraseña incorrectos.";
                request.setAttribute("mensaje", mensaje);
                request.setAttribute("tipo", "log");
                request.getRequestDispatcher("index.jsp").forward(request, response);

                resultado = "NO EXISTE";
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
        //processRequest(request, response);
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
