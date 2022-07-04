<%-- 
    Document   : index
    Created on : 17/06/2022, 03:16:34 PM
    Author     : jesus.hernandez
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="shortcut icon" href="#">
        <link rel="stylesheet" href="assets/css/bootstrap-select.min.css" type="text/css"/>
        <link rel="stylesheet" href="assets/css/bootstrap.min.css">
        <link href="assets/css/estilos.css" rel="stylesheet" type="text/css"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sistema de Prueba de Eisei</title>
    </head>
    <body>
        <div id="contenedor">       
            <div class="align-items-center">
                <div class="row justify-content-md-center">
                    <div class="card" style="width: 20rem" >   
                        <div class="form-group text-center">
                            <img src="assets/img/perfil-del-usuario.png" height="100" width="100" />   
                        </div>                     
                        <div class="form-group text-center">
                            <label for="usuario" class="form-label">Usuario</label>
                            <input type="text" class="form-control" name="txtusuario" id="txtusuario">
                        </div>
                        <div class="form-group text-center">
                            <label for="contraseña" class="form-label">Contraseña</label>
                            <input type="password" class="form-control" name="txtpass" id="txtpass" >
                        </div>
                        <div class="mb-3 form-check">
                            <input type="checkbox" class="form-check-input" id="recordarPass">
                            <label class="form-check-label" for="exampleCheck1">Recordar contraseña</label>
                        </div>
                        <button type="submit" class="btn btn-primary" onclick="buscar()">Ingresar</button>
                    </div>
                </div>
            </div>
        </div>

        <script type="text/javascript" src="assets/js/jquery-3.3.1.js"></script>
        <script type="text/javascript" src="assets/js/bootstrap.min.js"></script>
        <script type="text/javascript" src="assets/js/bootstrap-select.min.js"></script>
        <script src="assets/js/login.js" type="text/javascript"></script>
    </body>
</html>
