package Controller;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.registry.infomodel.User;
import pweb.business.Alumno;
import pweb.data.AlumnoDB;

/**
 *
 * @author alumno
 */
public class RegistrarAlumnoServlet extends HttpServlet {
  

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
    String url = "/index.html";

        // reuperar accion actual 
        String action = request.getParameter("action");
        if (action == null) {
            action = "join";  // accion por defecto 
        }

        // realizar accion y establecer la URL a una pagina apropiada
        if (action.equals("join")) {
            url = "/index.html";     
        }
        else if (action.equals("add")) {                
            // obtener parametros de la peticion
            String Codigo = request.getParameter("Codigo");
            String Nombre = request.getParameter("Nombre");
            String Apellidos = request.getParameter("Apellidos");
            String Email = request.getParameter("Email");
           
            
            // almacenar datos en el objeto User y guardar el objeto User en la base de datos
            Alumno Alumno = new Alumno(Codigo, Nombre, Apellidos,Email);
            AlumnoDB.insert(Alumno);
         
            
           
            // establecer objeto Usuario en el objeto request y establecer la URL
            request.setAttribute("Alumno", Alumno);
            url = "/Confirmacion.jsp";   // the "thanks" page
        }
        
        // forward request and response objects to specified URL
        getServletContext()
            .getRequestDispatcher(url)
            .forward(request, response);
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
