
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="Css/Caballos.css" rel="stylesheet" type="text/css"/>
        <title>Carrera de  Caballos</title>
    </head>
    <body background="fondo.jpg" style="color: whitesmoke">
        <ul>
          <li><a class="active" href="index.jsp">Inicio</a></li>
        </ul>
        <br>
        <div class="centrar">
            <br>
            <strong><h1>Caballos disponibles</h1></strong>
            <br>
            <div class="gallery">
                <a target="_blank" href="caballo1.jpg">
                  <img src="caballo1.jpg" alt="Trolltunga Norway" width="300" height="200">
                </a>
                <div class="desc"> <strong>1) Zeus</strong></div>
            </div>
            
            <div class="gallery">
                <a target="_blank" href="caballo2.jpg">
                  <img src="caballo2.jpg" alt="Forest" width="600" height="400">
                </a>
                <div class="desc"><strong>2) Bucéfalos</strong></div>
             </div>
            
            <div class="gallery">
                <a target="_blank" href="caballo3.jpg">
                  <img src="caballo3.jpg" alt="Forest" width="600" height="400">
                </a>
                <div class="desc"><strong>3) Millonario</strong></div>
            </div>
            
            <div class="gallery">
                <a target="_blank" href="caballo4.jpg">
                  <img src="caballo4.jpg" alt="Forest" width="600" height="400">
                </a>
                <div class="desc"><strong>4) Relámpago</strong></div>
            </div>
        </div>
            <div class="centrar2">
                <div class="tab">
                  <button class="tablinks" onclick="openCity(event, 'Maquina')" id="defaultOpen">Contra maquina</button>
                  <button class="tablinks" onclick="openCity(event, '2Jugador')">2 Jugadores</button>
                  <button class="tablinks" onclick="openCity(event, '3Jugador')">3 Jugadores</button>
                  <button class="tablinks" onclick="openCity(event, '4Jugador')">4 Jugadores</button>
                </div>

                <div id="Maquina" class="tabcontent">
                    <center><form action="Caballos" method="post">
                        <table>
                            <tr><td>Nombre:</td><td><input type="text" name="txtNombre"> </td></tr>
                            <tr><td>Saldo:</td><td><input type="text" name="txtSaldo" value="10000" readonly=""> </td></tr>
                            <tr><td>Vr.Apuesta: </td><td><input type="text" name="txtApuesta" placeholder="Monto especifico"> </td></tr>
                            <tr><td>Caballos: </td><td><select name="cmbCaballo" class="cmb">
                                <option value="1">Zeus</option>
                                <option value="2">Bucéfalos</option>
                                <option value="3">Millonario</option>
                                <option value="4">Relámpago</option>
                            </select></td></tr>                          
                        </table>
                        <br>
                        <input type="submit" name="btnCalcular" value="Jugar" class="bnt">
                    </center></form>
                </div>

                <div id="2Jugador" class="tabcontent">
                        <form action="Caballos2" method="post">
                            <center><table>
                                <tr><td><table>
                                            <h2>Jugador 1</h2>
                                    <tr><td>Nombre:</td><td><input type="text" name="txtNombre"> </td></tr>
                                    <tr><td>Saldo:</td><td><input type="text" name="txtSaldo" value="10000" readonly=""> </td></tr>
                                    <tr><td>Vr.Apuesta: </td><td><input type="text" name="txtApuesta" placeholder="Monto especifico"> </td></tr>
                                    <tr><td>Caballos: </td><td><select name="cmbCaballo" class="cmb">
                                        <option value="1">Zeus</option>
                                        <option value="2">Bucéfalos</option>
                                        <option value="3">Millonario</option>
                                        <option value="4">Relámpago</option>
                                    </select></td></tr>                          
                                </table></td><td><table>
                                        <h2>Jugador 2</h2>
                                    <tr><td>Nombre:</td><td><input type="text" name="txtNombre2"> </td></tr>
                                    <tr><td>Saldo:</td><td><input type="text" name="txtSaldo2" value="10000" readonly=""> </td></tr>
                                    <tr><td>Vr.Apuesta: </td><td><input type="text" name="txtApuesta2" placeholder="Monto especifico"> </td></tr>
                                    <tr><td>Caballos: </td><td><select name="cmbCaballo2" class="cmb">
                                        <option value="1">Zeus</option>
                                        <option value="2">Bucéfalos</option>
                                        <option value="3">Millonario</option>
                                        <option value="4">Relámpago</option>
                                    </select></td></tr>                          
                            </table></td></tr>
                            </center></table>
                            <center><input type="submit" name="btnCalcular" value="Jugar" class="bnt"></center>
                        </form>
                </div>

                <div id="3Jugador" class="tabcontent">
                        <form action="Caballos3" method="post">
                            <center><table>
                                <tr><td><table>
                                            <h2>Jugador 1</h2>
                                    <tr><td>Nombre:</td><td><input type="text" name="txtNombre"> </td></tr>
                                    <tr><td>Saldo:</td><td><input type="text" name="txtSaldo" value="10000" readonly=""> </td></tr>
                                    <tr><td>Vr.Apuesta: </td><td><input type="text" name="txtApuesta" placeholder="Monto especifico"> </td></tr>
                                    <tr><td>Caballos: </td><td><select name="cmbCaballo" class="cmb">
                                        <option value="1">Zeus</option>
                                        <option value="2">Bucéfalos</option>
                                        <option value="3">Millonario</option>
                                        <option value="4">Relámpago</option>
                                    </select></td></tr>                          
                                </table></td><td><table>
                                        <h2>Jugador 2</h2>
                                    <tr><td>Nombre:</td><td><input type="text" name="txtNombre2"> </td></tr>
                                    <tr><td>Saldo:</td><td><input type="text" name="txtSaldo2" value="10000" readonly=""> </td></tr>
                                    <tr><td>Vr.Apuesta: </td><td><input type="text" name="txtApuesta2" placeholder="Monto especifico"> </td></tr>
                                    <tr><td>Caballos: </td><td><select name="cmbCaballo2" class="cmb">
                                        <option value="1">Zeus</option>
                                        <option value="2">Bucéfalos</option>
                                        <option value="3">Millonario</option>
                                        <option value="4">Relámpago</option>
                                    </select></td></tr>                          
                                    </table></td><td><table>
                                            <h2>Jugador 3</h2>
                                    <tr><td>Nombre:</td><td><input type="text" name="txtNombre3"> </td></tr>
                                    <tr><td>Saldo:</td><td><input type="text" name="txtSaldo3" value="10000" readonly=""> </td></tr>
                                    <tr><td>Vr.Apuesta: </td><td><input type="text" name="txtApuesta3" placeholder="Monto especifico"> </td></tr>
                                    <tr><td>Caballos: </td><td><select name="cmbCaballo3" class="cmb">
                                        <option value="1">Zeus</option>
                                        <option value="2">Bucéfalos</option>
                                        <option value="3">Millonario</option>
                                        <option value="4">Relámpago</option>
                                    </select></td></tr>                          
                            </table></td></tr>
                            </center></table>
                                <br>
                            <input type="submit" name="btnCalcular" value="Jugar" class="bnt">
                        </form>
                </div>
                
                <div id="4Jugador" class="tabcontent">
                    <form action="Caballos4" method="post">
                        <center><table>
                            <tr><td><table>
                                        <h2>Jugador 1</h2>
                                    <tr><td>Nombre:</td><td><input type="text" name="txtNombre"> </td></tr>
                                    <tr><td>Saldo:</td><td><input type="text" name="txtSaldo" value="10000" readonly=""> </td></tr>
                                    <tr><td>Vr.Apuesta: </td><td><input type="text" name="txtApuesta" placeholder="Monto especifico"> </td></tr>
                                    <tr><td>Caballos: </td><td><select name="cmbCaballo" class="cmb">
                                        <option value="1">Zeus</option>
                                        <option value="2">Bucéfalos</option>
                                        <option value="3">Millonario</option>
                                        <option value="4">Relámpago</option>
                                    </select></td></tr>                          
                                </table></td><td><table>
                                        <h2>Jugador 2</h2>
                                    <tr><td>Nombre:</td><td><input type="text" name="txtNombre2"> </td></tr>
                                    <tr><td>Saldo:</td><td><input type="text" name="txtSaldo2" value="10000" readonly=""> </td></tr>
                                    <tr><td>Vr.Apuesta: </td><td><input type="text" name="txtApuesta2" placeholder="Monto especifico"> </td></tr>
                                    <tr><td>Caballos: </td><td><select name="cmbCaballo2" class="cmb">
                                        <option value="1">Zeus</option>
                                        <option value="2">Bucéfalos</option>
                                        <option value="3">Millonario</option>
                                        <option value="4">Relámpago</option>
                                    </select></td></tr>                          
                                    </table></td><td> <table>
                                            <h2>Jugador 3</h2>
                                    <tr><td>Nombre:</td><td><input type="text" name="txtNombre3"> </td></tr>
                                    <tr><td>Saldo:</td><td><input type="text" name="txtSaldo3" value="10000" readonly=""> </td></tr>
                                    <tr><td>Vr.Apuesta: </td><td><input type="text" name="txtApuesta3" placeholder="Monto especifico"> </td></tr>
                                    <tr><td>Caballos: </td><td><select name="cmbCaballo3" class="cmb">
                                        <option value="1">Zeus</option>
                                        <option value="2">Bucéfalos</option>
                                        <option value="3">Millonario</option>
                                        <option value="4">Relámpago</option>
                                    </select></td></tr>                          
                                        </table></td><td><table>
                                                <h2>Jugador 4</h2>
                                    <tr><td>Nombre:</td><td><input type="text" name="txtNombre4"> </td></tr>
                                    <tr><td>Saldo:</td><td><input type="text" name="txtSaldo4" value="10000" readonly=""> </td></tr>
                                    <tr><td>Vr.Apuesta: </td><td><input type="text" name="txtApuesta4" placeholder="Monto especifico"> </td></tr>
                                    <tr><td>Caballos: </td><td><select name="cmbCaballo4" class="cmb">
                                        <option value="1">Zeus</option>
                                        <option value="2">Bucéfalos</option>
                                        <option value="3">Millonario</option>
                                        <option value="4">Relámpago</option>
                                    </select></td></tr>                          
                            </table></td></tr>
                        </center></table>                           
                           <br>
                            <input type="submit" name="btnCalcular" value="Jugar" class="bnt">
                        </form>
                </div>

            <script>
                
                
            function openCity(evt, cityName) {
                var i, tabcontent, tablinks;
                tabcontent = document.getElementsByClassName("tabcontent");
                for (i = 0; i < tabcontent.length; i++) {
                    tabcontent[i].style.display = "none";
                }
                tablinks = document.getElementsByClassName("tablinks");
                for (i = 0; i < tablinks.length; i++) {
                    tablinks[i].className = tablinks[i].className.replace(" active", "");
                }
                document.getElementById(cityName).style.display = "block";
                evt.currentTarget.className += " active";
            }

            // Get the element with id="defaultOpen" and click on it
            document.getElementById("defaultOpen").click();
            </script>
        </div>
    </body>
</html>
