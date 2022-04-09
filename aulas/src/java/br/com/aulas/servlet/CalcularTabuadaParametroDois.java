/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.aulas.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author miguel.philippi
 */
@WebServlet(name = "CalcularTabuadaParametroDois", urlPatterns = {"/CalcularTabuadaParametroDois"})
public class CalcularTabuadaParametroDois extends HttpServlet {

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
            Integer tab1 = Integer.parseInt(request.getParameter("tab1"));
            Integer tab2 = Integer.parseInt(request.getParameter("tab2"));
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet CalcularTabuadaParametroDois</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Tabuada</h1>");
            
            int aux=0;
            if (tab1 > tab2) {
                aux = tab1;
                tab1 = tab2;
                tab2 = aux;
            }
            
            while (tab1<= tab2) {                
                out.println("=====================<br />");
                out.println("Tabuada" + tab1 + "<br />");
                out.println("=====================<br />");
                for (int i = 1; i <= 10; i++) {
                    out.println(tab1 + " x " + i + " = " + tab1*i + "<br />");
                }
                tab1++;
            }
            out.println("<a href=tabuadaDoisParametro.html><input type=submit value=Voltar></a>");
            out.println("<a href=index.html><input type=submit value=Home></a>");
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
