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
        validar();
    }
}

function validar() {
    if (usuario === "root" && contraseña === "123") {
        window.open("prueba.jsp", "_self");
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



