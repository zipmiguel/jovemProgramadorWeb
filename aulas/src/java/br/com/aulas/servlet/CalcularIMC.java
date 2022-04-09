/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.aulas.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author miguel.philippi
 */
@WebServlet(name = "CalcularIMC", urlPatterns = {"/CalcularIMC"})
public class CalcularIMC extends HttpServlet {

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
            Double peso = Double.parseDouble(request.getParameter("peso").replaceAll(",", "."));
            Double altura = Double.parseDouble(request.getParameter("altura").replaceAll(",", "."));
            
            String mensagem = new String();
            
            String classe = new String();
            
            Double imc = peso / (altura * altura);
            
            DecimalFormat df = new DecimalFormat("#.##");
            
            if(imc <= 18.5){
                mensagem = "Abaixo do peso";
                classe = "abaixo";
            }else if(imc < 25){
                mensagem = "Peso adequado";
                classe = "normal";
            }else if(imc < 30){
                mensagem = "Sobre peso";
                classe = "acima";
            }else{
                mensagem = "Obesidade";
                classe = "MuitoAcima";
            }
            
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet CalcularIMC</title>");
            out.println("<style>");
            
            out.println(".abaixo{color:red}");
            out.println(".normal{color:SpringGreen}");
            out.println(".acima{color:Goldenrod}");
            out.println(".MuitoAcima{color:DarkMagenta}");
            
            
            out.println("</style>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>IMC = Índice de Massa Corporal</h1>");
            out.println(df.format(imc));
            out.println("<br />");
            out.println("<br />");
            out.println("<h3> <span class=" + classe + ">" + mensagem + "</h3>");
            out.println("<br />");
            out.println("<br />");
            out.println("<a href=IMC.html><input type=submit value=Voltar></a>");
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
