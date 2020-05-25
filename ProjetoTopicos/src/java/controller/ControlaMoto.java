/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.MotoDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Moto;

/**
 *
 * @author kaiof
 */
@WebServlet(name = "ControlaMoto", urlPatterns = {"/ControlaMoto"})
public class ControlaMoto extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
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
     
            String marca = request.getParameter("txtMarca");
            String cor   = request.getParameter("txtCor");
            
            Moto moto = new Moto();
            moto.setMarca(marca);
            moto.setCor(cor);
            
            try{
                MotoDAO dao = new MotoDAO();
                dao.cadastrar(moto);
                
                response.sendRedirect("index.html");
            }catch(Exception e){
                System.out.println("Erro ao criar objeto da classe MotoDAO");
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
