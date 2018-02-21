<%-- 
    Document   : Ruleta
    Created on : 14/04/2017, 07:59:13 PM
    Author     : joseb
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="Css/Ruleta.css" rel="stylesheet" type="text/css"/>
        <title>JSP Page</title>
    </head>
    <body background="r.jpg" style="color: white">
        
        <ul>
          <li><a class="active" href="index.jsp">Inicio</a></li>
        </ul>
            <div class="tab">
              <button class="tablinks" onclick="opc(event, 'maquina')" id="defaultOpen">Contra la maquina</button>
              <button class="tablinks" onclick="opc(event, '2Jugadores')">2 Jugadores</button>
              <button class="tablinks" onclick="opc(event, '3Jugadores')">3 Jugadores</button>
              <button class="tablinks" onclick="opc(event, '4Jugadores')">4 Jugadores</button>
            </div>

            <div id="maquina" class="tabcontent">
              <h3>Contra la maquina</h3>
              <form action="Servlet" method="post">
                    <h3>Jugardor</h3>
                        <br>
                        <table>
                            <tr><td>Nombre:</td><td><input type="text" name="txtNombre"> </td></tr>
                            <tr><td>Vr.Apuesta: </td><td><input type="text" name="txtApuesta" placeholder="Saldo"> </td></tr>
                            <tr><td>Numero de apuesta: </td><td><input type="text" name="txtNumApuesta"> </td></tr>
                        </table>
                        <br>
                        <input type="submit" name="btnCalcular" value="Jugar" class="bnt">
              </form>
            </div>

            <div id="2Jugadores" class="tabcontent">
              <form action="Servlet2" method="post">
                  <center><table>
                      <tr><td><table>
                            <h3>1 Jugador </h3>
                            <tr><td>Nombre:</td><td><input type="text" name="txtNombre"> </td></tr>
                            <tr><td>Saldo: </td><td><input type="text" name="txtApuesta"> </td></tr>
                            <tr><td>Numero de apuesta: </td><td><input type="text" name="txtNumApuesta"> </td></tr>
                        </table></td><td> <table>
                         <h3>2 Jugador </h3>
                            <tr><td>Nombre:</td><td><input type="text" name="txtNombre2"> </td></tr>
                            <tr><td>Saldo: </td><td><input type="text" name="txtApuesta2"> </td></tr>
                            <tr><td>Numero de apuesta: </td><td><input type="text" name="txtNumApuesta2"> </td></tr>
                     </table></td></tr>
                  </center></table>
                     <br>
                        <input type="submit" name="btnCalcular" value="Jugar" class="bnt">
              </form>
            </div>

            <div id="3Jugadores" class="tabcontent">
              <h3>3 Jugadores</h3>
              <form action="Servlet3" method="post">
                  <center><table>
                      <tr><td><table>
                            <h3>1 Jugador </h3>
                            <tr><td>Nombre:</td><td><input type="text" name="txtNombre"> </td></tr>
                            <tr><td>Vr.Apuesta: </td><td><input type="text" name="txtApuesta"> </td></tr>
                            <tr><td>Numero de apuesta: </td><td><input type="text" name="txtNumApuesta"> </td></tr>
                        </table></td><td> <table>
                         <h3>2 Jugador </h3>
                            <tr><td>Nombre:</td><td><input type="text" name="txtNombre2"> </td></tr>
                            <tr><td>Vr.Apuesta: </td><td><input type="text" name="txtApuesta2"> </td></tr>
                            <tr><td>Numero de apuesta: </td><td><input type="text" name="txtNumApuesta2"> </td></tr>
                            </table></td><td><table>
                         <h3>3 Jugador </h3>
                            <tr><td>Nombre:</td><td><input type="text" name="txtNombre3"> </td></tr>
                            <tr><td>Vr.Apuesta: </td><td><input type="text" name="txtApuesta3"> </td></tr>
                            <tr><td>Numero de apuesta: </td><td><input type="text" name="txtNumApuesta3"> </td></tr>
                     </table></td></tr>
                      </table></center>
                  <br>
                        <input type="submit" name="btnCalcular" value="Jugar" class="bnt">
              </form>
            </div>
        
            <div id="4Jugadores" class="tabcontent">
                    <form action="Servlet4" method="post">
                        <center><table>
                            <tr><td><table>
                                <h3>1 Jugador </h3>
                                <tr><td>Nombre:</td><td><input type="text" name="txtNombre"> </td></tr>
                                <tr><td>Vr.Apuesta: </td><td><input type="text" name="txtApuesta"> </td></tr>
                                <tr><td>Numero de apuesta: </td><td><input type="text" name="txtNumApuesta"> </td></tr>
                            </table></td><td> <table>
                             <h3>2 Jugador </h3>
                                <tr><td>Nombre:</td><td><input type="text" name="txtNombre2"> </td></tr>
                                <tr><td>Vr.Apuesta: </td><td><input type="text" name="txtApuesta2"> </td></tr>
                                <tr><td>Numero de apuesta: </td><td><input type="text" name="txtNumApuesta2"> </td></tr>
                                </table></td><td><table>
                             <h3>3 Jugador </h3>
                                <tr><td>Nombre:</td><td><input type="text" name="txtNombre3"> </td></tr>
                                <tr><td>Vr.Apuesta: </td><td><input type="text" name="txtApuesta3"> </td></tr>
                                <tr><td>Numero de apuesta: </td><td><input type="text" name="txtNumApuesta3"> </td></tr>
                                    </table></td><td> <table>
                             <h3>4 Jugador </h3>
                                <tr><td>Nombre:</td><td><input type="text" name="txtNombre4"> </td></tr>
                                <tr><td>Vr.Apuesta: </td><td><input type="text" name="txtApuesta4"> </td></tr>
                                <tr><td>Numero de apuesta: </td><td><input type="text" name="txtNumApuesta4"> </td></tr>
                         </table></td></tr>
                            </table></center>
                        <br>
                            <input type="submit" name="btnCalcular" value="Jugar" class="bnt">
                    </form>
            </div>

            <script>
            function opc(evt, opc) {
                var i, tabcontent, tablinks;
                tabcontent = document.getElementsByClassName("tabcontent");
                for (i = 0; i < tabcontent.length; i++) {
                    tabcontent[i].style.display = "none";
                }
                tablinks = document.getElementsByClassName("tablinks");
                for (i = 0; i < tablinks.length; i++) {
                    tablinks[i].className = tablinks[i].className.replace(" active", "");
                }
                document.getElementById(opc).style.display = "block";
                evt.currentTarget.className += " active";
            }

            // Get the element with id="defaultOpen" and click on it
            document.getElementById("defaultOpen").click();
            </script>
    </body>
</html>
