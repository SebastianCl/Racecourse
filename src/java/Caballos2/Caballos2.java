
package Caballos2;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "Caballos2", urlPatterns = {"/Caballos2"})
public class Caballos2 extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        PrintWriter out = response.getWriter();
        
        try{           
                    
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Final de la carrera</title>");            
            out.println("</head>");
            out.println("<style>");
            
            out.println("ul{");
                out.println("list-style-type: none;");
                out.println(" margin: 0;");
                out.println("padding: 0;");
                out.println("overflow: hidden;");
                out.println("border: 1px solid #e7e7e7;");
                out.println("background-color: #f3f3f3;");
                out.println("border-radius:  20px 20px 20px 20px;");                  
            out.println("}");
            
            out.println("li{");          
                out.println("float: left;");
            out.println("}");
            
            out.println("li a{");
                out.println("display: block;");
                out.println(" color: #666;");
                out.println("text-align: center;");
                out.println("padding: 14px 16px;");
                out.println("text-decoration: none;");
            out.println("}");
            
            out.println("li a:hover:not(.active) {");          
                out.println("background-color: #ddd;");
            out.println("}");
            
            out.println("li a.active{");          
                out.println("color: black;");
                out.println("background-color: #4CAF50;");
            out.println("}");
            
            out.println("</style>");
            out.println("<body background=\"fondo.jpg\">");
            
            out.println("<ul>");
            out.println("<li><a href=\"Caballos.jsp\">Caballos</a></li>");
            out.println("</ul>");
            String nom1 = request.getParameter("txtNombre");
            int    Cab1 = Integer.parseInt(request.getParameter("cmbCaballo"));
            double apu1 = Double.parseDouble(request.getParameter("txtApuesta"));
            double mon1 = Double.parseDouble(request.getParameter("txtSaldo"));
            
            String nom2 = request.getParameter("txtNombre2");
            int    Cab2 = Integer.parseInt(request.getParameter("cmbCaballo2"));
            double apu2 = Double.parseDouble(request.getParameter("txtApuesta2"));
            double mon2 = Double.parseDouble(request.getParameter("txtSaldo2"));
            
            int cabG = (int) (Math.random() * 4) + 1;
            Metodos m = new Metodos();
            
            m.setN1(nom1);
            m.setC1(Cab1);
            m.setM1(mon1);
            m.setA1(apu1);
            
            m.setN2(nom2);
            m.setC2(Cab2);
            m.setM2(mon2);
            m.setA2(apu2);
            
            m.setcG(cabG);
            
            if (m.validar() == true) {
                m.jugar();
                out.println("<h1>Jugador 1: " + nom1 + "</h1>");
                out.println("<h1>Saldo: " + m.getM1() + "</h1>");
                out.println("<h1>Valor apostado: " + m.getA1() + "</h1>");
                out.println("<h1>Numero del caballo: " + Cab1 + "</h1>");
                out.println("<br>");        
                out.println("<h1>Jugador 2: "+ nom2+"</h1>");
                out.println("<h1>Saldo: " + m.getM2() + "</h1>");
                out.println("<h1>Valor apostado: " + m.getA2() + "</h1>");
                out.println("<h1>Numero del caballo: " + Cab2 + "</h1>");
                out.println("<br>");
                out.println("<br>"); 
                out.println("<h1>Caballo ganador: " + m.getcG() + "</h1>");
                
                if (m.validar2() == true) {
                     out.println("<center><form action=Caballos2 method=post>");
                        out.println("<br>");
                        out.println("<h2>Jugar de nuevo </h2>");
                        out.println("<br>");
                        out.println("<table>"); 
                            out.println("<h2>Jugador 1 </h2>");
                            out.println("<tr><td>Nombre:</td><td><input type=text name=txtNombre value="+nom1+"> </td></tr>");
                            out.println("<tr><td>Saldo:</td><td><input type=\"text\" name=\"txtSaldo\" value="+m.getM1()+" readonly=\"\"> </td></tr>");
                            out.println("<tr><td>Vr.Apuesta: </td><td><input type=text name=txtApuesta value="+m.getA1()+"> </td></tr>");
                            
                            out.println("<tr><td>Caballos: </td><td><select name=\"cmbCaballo\" class=\"cmb\">\n" +
    "                                <option value=\"1\">Zeus</option>\n" +
    "                                <option value=\"2\">Bucéfalos</option>\n" +
    "                                <option value=\"3\">Millonario</option>\n" +
    "                                <option value=\"4\">Relámpago</option>\n" +
    "                            </select></td></tr></td></tr>");
                            out.println("<br>");                   
                            out.println("</table>");
                            
                            out.println("<table>"); 
                            out.println("<h2>Jugador 2 </h2>");
                            out.println("<tr><td>Nombre:</td><td><input type=text name=txtNombre2 value="+nom2+"> </td></tr>");
                            out.println("<tr><td>Saldo:</td><td><input type=\"text\" name=\"txtSaldo2\" value="+m.getM2()+" readonly=\"\"> </td></tr>");
                            out.println("<tr><td>Vr.Apuesta: </td><td><input type=text name=txtApuesta2 value="+m.getA2()+"> </td></tr>");
                            out.println("<tr><td>Caballos: </td><td><select name=\"cmbCaballo2\" class=\"cmb\">\n" +
    "                                <option value=\"1\">Zeus</option>\n" +
    "                                <option value=\"2\">Bucéfalos</option>\n" +
    "                                <option value=\"3\">Millonario</option>\n" +
    "                                <option value=\"4\">Relámpago</option>\n" +
    "                            </select></td></tr></td></tr>");
                            out.println("<br>");                   
                            out.println("</table>");
                            out.println("<input type=submit name=btnCalcular value=Jugar>");
                      out.println("</form></center>");
                }
                else{
                    out.println("<br>");
                    out.println("<h1>Alerta ----> " + m.getError()+ "</h1>");
                }
                              
            }else{
                out.println("<h1>Error ----> " + m.getError()+ "</h1>");
            }
            
        }catch(NumberFormatException ex){
            out.println("<h1>Error -----> " + ex.getMessage() + "</h1>");
            out.println("</body>");
            out.println("</html>");            
        }
        out.println("</body>");
        out.println("</html>");
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
