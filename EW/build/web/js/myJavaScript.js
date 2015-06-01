/*
 * myJavaScript.js
 * Author: Sergio Sánchez Alvarez
 * 
 * Scripts para mostrar/ocultar secciones dentro de una misma pagina.
 */

function nuevaMina() {
    $.ajax({
        type: "POST",
        url: "nuevaMina.jsp",
        success: function (msg) {
            $('#output').empty();
            $('#output').html(msg);
        }
    });
}


function mostrarRegistro() {
    ocultarError();
    $.ajax({
        type: "POST",
        url: "form_registro.jsp",
        success: function (msg) {
            $('#formularios').empty();
            $('#formularios').html(msg);
        }
    });
}

function mostrarLogin() {
    ocultarError();
    $.ajax({
        type: "POST",
        url: "form_login.jsp",
        success: function (msg) {
            $('#formularios').empty();
            $('#formularios').html(msg);
        }
    });
}
function mostrarRecuperar() {
    ocultarError();
    console.log("mostrarRecuperar");
    $.ajax({
        type: "POST",
        url: "form_recuperar.jsp",
        success: function (msg) {
            $('#formularios').empty();
            $('#formularios').html(msg);
        }
    });
}

function mostrarErrorLogin(_mensaje, _tipo) {
    if (_tipo === 'reg') {
        mostrarRegistro();
    } else {
        mostrarLogin();
    }
    //codigo
    console.log("Entra a fuction");
    if (_mensaje !== null && _mensaje !== '') {
        console.log("mensaje: " + _mensaje);
        $.ajax({
            type: "POST",
            url: "error.jsp",
            data: "mensaje=" + _mensaje,
            success: function (msg) {
                $('#seccionErrores').empty();
                $('#seccionErrores').html(msg);
            }
        });
    }
}

function ocultarError() {
    $.ajax({
        type: "POST",
        url: "error.jsp",
        success: function (msg) {
            $('#seccionErrores').empty();
        }
    });
}

//function cambiaFocoNavBar(_focoPulsado) {
//    
//    document.getElementsByClassName('miitemnavbar')
//
//}

//$(document).ready(function () {
//    $('#nav_minas').click(function ()
//    {
//        console.log("nav_minas");
//            $.ajax({
//                type: "post",
//                cache: false,
//                url: "test.jsp", //this is my servlet
//                data: {
//                    input: $('#id').val(), 
//                    output: $('#op').val()
//                },
//                success: function(msg){
//                        $('#output').empty();
//                        $('#output').html(msg);
//                }
//            });
//    });
//
//});