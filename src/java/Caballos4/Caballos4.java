
package Caballos4;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Caballos4", urlPatterns = {"/Caballos4"})
public class Caballos4 extends HttpServlet {

   
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
            
            String nom3 = request.getParameter("txtNombre3");
            int    Cab3 = Integer.parseInt(request.getParameter("cmbCaballo3"));
            double apu3 = Double.parseDouble(request.getParameter("txtApuesta3"));
            double mon3 = Double.parseDouble(request.getParameter("txtSaldo3"));
            
            String nom4 = request.getParameter("txtNombre4");
            int    Cab4 = Integer.parseInt(request.getParameter("cmbCaballo4"));
            double apu4 = Double.parseDouble(request.getParameter("txtApuesta4"));
            double mon4 = Double.parseDouble(request.getParameter("txtSaldo4"));
            
            int cabG = (int) (Math.random() * 4) + 1;
            
            Metodos m = new Metodos();
            
            m.setNom1(nom1);
            m.setNum1(Cab1);
            m.setM1(mon1);
            m.setA1(apu1);
            
            m.setNom2(nom2);
            m.setNum2(Cab2);
            m.setM2(mon2);
            m.setA2(apu2);
            
            m.setNom3(nom3);
            m.setM3(mon3);
            m.setA3(apu3);
            
            m.setNom4(nom4);
            m.setM4(mon4);
            m.setA4(apu4);
            
            m.setNumG(cabG);
            
             if (m.validar() == true) {
                out.println("<h1>Resultados</h1>");
                m.jugar();
                out.println("<h1>Jugador 1: " + nom1 +"</h1>");
                out.println("<h3>Numero: " + Cab1 +"</h3>");
                out.println("<h3>Saldo: " + m.getM1() +"</h3>");
                out.println("<h3>Valor apuesta: " + m.getA1() +"</h3>");
                out.println("<br>");
                out.println("<br>");
                
                out.println("<h1>Jugador 2: " + nom2 +"</h1>");
                out.println("<h3>Numero: " + Cab2 +"</h3>");
                out.println("<h3>Saldo: " + m.getM2() +"</h3>");
                out.println("<h3>Valor apuesta: " + m.getA2() +"</h3>");
                out.println("<br>");
                out.println("<br>");
                
                out.println("<h1>Jugador 3: " + nom3 +"</h1>");
                out.println("<h3>Numero: " + Cab3 +"</h3>");
                out.println("<h3>Saldo: " + m.getM3() +"</h3>");
                out.println("<h3>Valor apuesta: " + m.getA3() +"</h3>");
                out.println("<br>");
                out.println("<br>");
                
                out.println("<h1>Jugador 3: " + nom4 +"</h1>");
                out.println("<h3>Numero: " + Cab4 +"</h3>");
                out.println("<h3>Saldo: " + m.getM4() +"</h3>");
                out.println("<h3>Valor apuesta: " + m.getA4() +"</h3>");
                out.println("<br>");
                out.println("<br>");
                
                out.println("<h1>Caballo ganador es: " + m.getNumG() + "</h1>");
                
                switch (m.cont) {
                    case 4:
                        out.println("<form action=Caballos4 method=post>");
                        out.println("<br>");
                        out.println("<h3>Jugar de nuevo</h3>");
                        out.println("<br>");
                        out.println("<table>");
                        out.println("<tr><td>Nombre:</td><td><input type=text name=txtNombre value="+m.n2[0]+"> </td></tr>");
                        out.println("<tr><td>Saldo:</td><td><input type=\"text\" name=\"txtSaldo\" value="+m.montos2[0]+" readonly=\"\"> </td></tr>");
                        out.println("<tr><td>Vr.Apuesta: </td><td><input type=text name=txtApuesta value="+m.apuestas2[0]+"> </td></tr>");
                        out.println("<tr><td>caballo : </td><td><select name=\"cmbCaballo\" class=\"cmb\">\n" +
                                "                                        <option value=\"1\">Zeus</option>\n" +
                                "                                        <option value=\"2\">Bucéfalos</option>\n" +
                                "                                        <option value=\"3\">Millonario</option>\n" +
                                "                                        <option value=\"4\">Relámpago</option>\n" +
                                "                                    </select></td></tr>");
                        out.println("<br>");                   
                        out.println("</table>");
                        out.println("<table>");
                        out.println("<tr><td>Nombre:</td><td><input type=text name=txtNombre2 value="+m.n2[1]+"> </td></tr>");
                        out.println("<tr><td>Saldo:</td><td><input type=\"text\" name=\"txtSaldo2\" value="+m.montos2[1]+" readonly=\"\"> </td></tr>");
                        out.println("<tr><td>Vr.Apuesta: </td><td><input type=text name=txtApuesta2 value="+m.apuestas2[1]+"> </td></tr>");
                        out.println("<tr><td>Caballo:</td><td><select name=\"cmbCaballo2\" class=\"cmb\">\n" +
                                "                                        <option value=\"1\">Zeus</option>\n" +
                                "                                        <option value=\"2\">Bucéfalos</option>\n" +
                                "                                        <option value=\"3\">Millonario</option>\n" +
                                "                                        <option value=\"4\">Relámpago</option>\n" +
                                "                                    </select></td></tr>");
                        out.println("<br>");                   
                        out.println("</table>");
                        out.println("<table>");
                        out.println("<tr><td>Nombre:</td><td><input type=text name=txtNombre3 value="+m.n2[2]+"> </td></tr>");
                        out.println("<tr><td>Saldo:</td><td><input type=\"text\" name=\"txtSaldo3\" value="+m.montos2[2]+" readonly=\"\"> </td></tr>");
                        out.println("<tr><td>Vr.Apuesta: </td><td><input type=text name=txtApuesta3 value="+m.apuestas2[2]+"> </td></tr>");
                        out.println("<tr><td>Caballo:</td><td><select name=\"cmbCaballo3\" class=\"cmb\">\n" +
                                "                                        <option value=\"1\">Zeus</option>\n" +
                                "                                        <option value=\"2\">Bucéfalos</option>\n" +
                                "                                        <option value=\"3\">Millonario</option>\n" +
                                "                                        <option value=\"4\">Relámpago</option>\n" +
                                "                                    </select></td></tr>");
                        out.println("<br>");                   
                        out.println("</table>");
                        out.println("<table>");
                        out.println("<tr><td>Nombre:</td><td><input type=text name=txtNombre4 value="+m.n2[3]+"> </td></tr>");
                        out.println("<tr><td>Saldo:</td><td><input type=\"text\" name=\"txtSaldo4\" value="+m.montos2[3]+" readonly=\"\"> </td></tr>");
                        out.println("<tr><td>Vr.Apuesta: </td><td><input type=text name=txtApuesta4 value="+m.apuestas2[3]+"> </td></tr>");
                        out.println("<tr><td>Caballo:</td><td><select name=\"cmbCaballo4\" class=\"cmb\">\n" +
                                "                                        <option value=\"1\">Zeus</option>\n" +
                                "                                        <option value=\"2\">Bucéfalos</option>\n" +
                                "                                        <option value=\"3\">Millonario</option>\n" +
                                "                                        <option value=\"4\">Relámpago</option>\n" +
                                "                                    </select></td></tr>");
                        out.println("<br>");                   
                        out.println("</table>");
                        out.println("<input type=submit name=btnCalcular value=Jugar>");
                        out.println("</form>");
                        break;
                    case 3:
                        out.println("<form action=Caballos3 method=post>");
                        out.println("<br>");
                        out.println("<h3>Jugar de nuevo</h3>");
                        out.println("<br>");
                        out.println("<table>");
                        out.println("<tr><td>Nombre:</td><td><input type=text name=txtNombre value="+m.n2[0]+"> </td></tr>");
                        out.println("<tr><td>Saldo:</td><td><input type=\"text\" name=\"txtSaldo\" value="+m.montos2[0]+" readonly=\"\"> </td></tr>");
                        out.println("<tr><td>Vr.Apuesta: </td><td><input type=text name=txtApuesta value="+m.apuestas2[0]+"> </td></tr>");
                        out.println("<tr><td>caballo : </td><td><select name=\"cmbCaballo\" class=\"cmb\">\n" +
                                "                                        <option value=\"1\">Zeus</option>\n" +
                                "                                        <option value=\"2\">Bucéfalos</option>\n" +
                                "                                        <option value=\"3\">Millonario</option>\n" +
                                "                                        <option value=\"4\">Relámpago</option>\n" +
                                "                                    </select></td></tr>");
                        out.println("<br>");                   
                        out.println("</table>");
                        out.println("<table>");
                        out.println("<tr><td>Nombre:</td><td><input type=text name=txtNombre2 value="+m.n2[1]+"> </td></tr>");
                        out.println("<tr><td>Saldo:</td><td><input type=\"text\" name=\"txtSaldo2\" value="+m.montos2[1]+" readonly=\"\"> </td></tr>");
                        out.println("<tr><td>Vr.Apuesta: </td><td><input type=text name=txtApuesta2 value="+m.apuestas2[1]+"> </td></tr>");
                        out.println("<tr><td>Caballo:</td><td><select name=\"cmbCaballo2\" class=\"cmb\">\n" +
                                "                                        <option value=\"1\">Zeus</option>\n" +
                                "                                        <option value=\"2\">Bucéfalos</option>\n" +
                                "                                        <option value=\"3\">Millonario</option>\n" +
                                "                                        <option value=\"4\">Relámpago</option>\n" +
                                "                                    </select></td></tr>");
                        out.println("<br>");                   
                        out.println("</table>");
                        out.println("<table>");
                        out.println("<tr><td>Nombre:</td><td><input type=text name=txtNombre3 value="+m.n2[2]+"> </td></tr>");
                        out.println("<tr><td>Saldo:</td><td><input type=\"text\" name=\"txtSaldo3\" value="+m.montos2[2]+" readonly=\"\"> </td></tr>");
                        out.println("<tr><td>Vr.Apuesta: </td><td><input type=text name=txtApuesta3 value="+m.apuestas2[2]+"> </td></tr>");
                        out.println("<tr><td>Caballo:</td><td><select name=\"cmbCaballo3\" class=\"cmb\">\n" +
                                "                                        <option value=\"1\">Zeus</option>\n" +
                                "                                        <option value=\"2\">Bucéfalos</option>\n" +
                                "                                        <option value=\"3\">Millonario</option>\n" +
                                "                                        <option value=\"4\">Relámpago</option>\n" +
                                "                                    </select></td></tr>");
                        out.println("<br>");                   
                        out.println("</table>");
                        out.println("<input type=submit name=btnCalcular value=Jugar>");
                        out.println("</form>");
                        break;
                    case 2:
                        out.println("<form action=Caballos2 method=post>");
                        out.println("<br>");
                        out.println("<h3>Jugar de nuevo</h3>");
                        out.println("<br>");
                        out.println("<table>");
                        out.println("<tr><td>Nombre:</td><td><input type=text name=txtNombre value="+m.n2[0]+"> </td></tr>");
                        out.println("<tr><td>Saldo:</td><td><input type=\"text\" name=\"txtSaldo\" value="+m.montos2[0]+" readonly=\"\"> </td></tr>");
                        out.println("<tr><td>Vr.Apuesta: </td><td><input type=text name=txtApuesta value="+m.apuestas2[0]+"> </td></tr>");
                        out.println("<tr><td>caballo : </td><td><select name=\"cmbCaballo\" class=\"cmb\">\n" +
                                "                                        <option value=\"1\">Zeus</option>\n" +
                                "                                        <option value=\"2\">Bucéfalos</option>\n" +
                                "                                        <option value=\"3\">Millonario</option>\n" +
                                "                                        <option value=\"4\">Relámpago</option>\n" +
                                "                                    </select></td></tr>");
                        out.println("<br>");                   
                        out.println("</table>");
                        out.println("<table>");
                        out.println("<tr><td>Nombre:</td><td><input type=text name=txtNombre2 value="+m.n2[1]+"> </td></tr>");
                        out.println("<tr><td>Saldo:</td><td><input type=\"text\" name=\"txtSaldo2\" value="+m.montos2[1]+" readonly=\"\"> </td></tr>");
                        out.println("<tr><td>Vr.Apuesta: </td><td><input type=text name=txtApuesta2 value="+m.apuestas2[1]+"> </td></tr>");
                        out.println("<tr><td>Caballo:</td><td><select name=\"cmbCaballo2\" class=\"cmb\">\n" +
                                "                                        <option value=\"1\">Zeus</option>\n" +
                                "                                        <option value=\"2\">Bucéfalos</option>\n" +
                                "                                        <option value=\"3\">Millonario</option>\n" +
                                "                                        <option value=\"4\">Relámpago</option>\n" +
                                "                                    </select></td></tr>");
                        out.println("<br>");                   
                        out.println("</table>");
                        out.println("<input type=submit name=btnCalcular value=Jugar>");
                        out.println("</form>");
                        break;
                    case 1:
                        out.println("<h1>El unico con saldo suficiente para jugar es:  " + m.n2[0] +"</h1>");
                        break;                        
                }
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
