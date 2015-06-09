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

function funcionEstupida(_idMina) {
    alert("Funcion estupida!!");
    $.ajax({
        type: "POST",
        url: "MejorarMina",
        data: "IdMina=" + _idMina,
        success: function (msg) {
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

function mejorarMina(_idMina) {
    console.log("MEJORAR MINA");
    $.ajax({
        type: "POST",
        url: "MejorarMina",
        data: "IdMina=" + _idMina,
        success: function (msg) {
        }
    });
}

function comprarTropasOfensivas(_tipoTropa) {
    console.log("COMPRAR TROPAS OFENSIVAS: " + document.getElementById("numTropasSpinner").value);
    $.ajax({
        type: "POST",
        url: "ComprarTropasAtaque",
        data: "tipoTropa=" + _tipoTropa + "&numTropas=" + document.getElementById("numTropasSpinner").value,
        success: function (msg) {
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
    } else if (_tipo === 'pass') {
        mostrarRecuperar();
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

function mostrarErrorRecursos(_mensaje) {
    if (_mensaje !== null && _mensaje !== '') {
        alert(_mensaje);
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

//Funcion para el spinner
//http://bootsnipp.com/snippets/featured/bootstrap-number-spinner-on-click-hold
$(function () {
    var action;
    $(".number-spinner button").mousedown(function () {
        btn = $(this);
        input = btn.closest('.number-spinner').find('input');
        btn.closest('.number-spinner').find('button').prop("disabled", false);

        if (btn.attr('data-dir') == 'up') {
            action = setInterval(function () {
                if (input.attr('max') == undefined || parseInt(input.val()) < parseInt(input.attr('max'))) {
                    input.val(parseInt(input.val()) + 1);
                } else {
                    btn.prop("disabled", true);
                    clearInterval(action);
                }
            }, 50);
        } else {
            action = setInterval(function () {
                if (input.attr('min') == undefined || parseInt(input.val()) > parseInt(input.attr('min'))) {
                    input.val(parseInt(input.val()) - 1);
                } else {
                    btn.prop("disabled", true);
                    clearInterval(action);
                }
            }, 50);
        }
    }).mouseup(function () {
        clearInterval(action);
    });
});

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