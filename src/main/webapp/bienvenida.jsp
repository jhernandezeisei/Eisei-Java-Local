<%-- 
    Document   : index.jsp
    Created on : 17/06/2022, 03:15:31 PM
    Author     : jesus.hernandez
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">

    <!-- Tell the browser to be responsive to screen width -->
    <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.1.3/dist/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
    <title>Login</title>

        

</head>
<body >
    <body>
        <div class="container col-lg-3">
            <form action="Login" method="POST">
                <div class="form-group">
                    <h3>LOGIN</h3>
                    <!--<span class="glyphicon glyphicon-envelope form-control-feedback"></span>-->
                </div>
                <!-- <form action="srvUsuario?accion=verificar" method="POST">-->
                <div class="form-group">
                    <input class="form-control" type="text" name="usuario" placeholder="Usuario">
                    <!--<span class="glyphicon glyphicon-envelope form-control-feedback"></span>-->
                </div>
                <div class="form-group">
                    <input class="form-control" type="password" name="contrasena" placeholder="******">
                    <!--<span class="glyphicon glyphicon-lock form-control-feedback"></span>-->
                </div>
                <input type="submit" value="Ingresar" class="btn btn-danger btn-block"/>           
            </form>
        </div>
    </body>
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.14.3/dist/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.1.3/dist/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>

</body>
</html>
