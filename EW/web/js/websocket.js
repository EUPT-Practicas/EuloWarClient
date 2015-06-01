/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

var wsURI = "ws://localhost:8080/EW/recursosendpoint";
var websocket = new WebSocket(wsURI);

websocket.onerror = function(evt) { onError(evt); };

function onError(evt) {
    console.log(evt.data);
    //riteToScreen('<span style="color: red;">ERROR:</span> ' + evt.data);
}

websocket.onmessage = function(evt) { onMessage(evt); };

function sendText(email) {
    
    waitForSocketConnection(websocket, function(){
        console.log("message sent!!!");
        console.log("sending text: " + email);
        console.log(wsURI);
        websocket.send(email);
    });
}
                
function onMessage(evt) {
    console.log("received: " + evt.data);
    $('#cantidadRecursos').html(evt.data);
//    console.log("awakinonsansainuoooo");
//    var unidades = document.getElementById("cantidadRecursos");
//    console.log("UNIDADES: " + unidades.getAttribute("cantidadRecursos"));
//    
//    unidades = evt.data;
    //DIBUJAR LOS VALORES EN SU SITIO HIERRO: ....
}

// Make the function wait until the connection is made...
function waitForSocketConnection(socket, callback){
    setTimeout(
        function () {
            if (socket.readyState === 1) {
                console.log("Connection is made");
                if(callback !== null){
                    callback();
                }
                return;

            } else {
                console.log("wait for connection...");
                waitForSocketConnection(socket, callback);
            }

        }, 5); // wait 5 milisecond for the connection...
}


