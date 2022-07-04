var usuario = '';
var contraseña = '';

function buscar() {
    usuario = $('#txtusuario').val();
    contraseña = $('#txtpass').val();
    
    if (usuario === "") {
        alert("Complete el campo de usuario");
    } else if (contraseña === "") {
        alert("Complete el campo de contraseña");
    } else {
        sendRequestPOSTloggin({Usuario: usuario, Contrasena: contraseña}, "../SystemEiseiApp/Userlogin", usuario);
        
    }
}

function sendRequestPOSTloggin(fobj, actionURL, user) {
    $.ajax({
        type: "POST",
        url: actionURL,
        data: fobj,
        async: true,
        success: function (data) {
            console.log(fobj);
            if (data == 'usuario') {
                    window.open("welcome.jsp", "_self");
                } else {
                alert("Credenciales incorrectas")
                }
        },
        error: function (jqxhr, settings, thrownError) {
            console.log("jqxhr.responseText=" + jqxhr.responseText);
        },
        fail: function (jqXHR, textStatus) {
            console.log(">>sendRequestJQ(): thrownError:" + thrownError);
            console.log(">>sendRequestJQ(): jqXHR:" + jqXHR);
        }
    });
}

function validar() {
    if (usuario === "root" && contraseña === "123") {
        window.open("welcome.jsp", "_self");
    } else {
        alert("Usuario incorrecto");
    }
}
function showPopupMessageGeneric(tipo, menssage) {
    $(".proyecto-popup-message").removeClass("not-showing");
    $(".proyecto-popup-message").addClass("showing");
    $("#autodespacho").addClass("not-showing");
    $('#tipo').text(tipo);
    $('#mensajeError').text(menssage);
}





