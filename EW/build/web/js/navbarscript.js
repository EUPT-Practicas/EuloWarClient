/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
$(function() {

	//highlight the current nav
	$("#v_general a:contains('Vista general')").parent().addClass('active');
	$("#v_minas a:contains('Minas')").parent().addClass('active');
        $("#v_defensa a:contains('Defensa')").parent().addClass('active');
        $("#v_ataque a:contains('Ataque')").parent().addClass('active');
        $("#v_campamentos a:contains('Campamentos')").parent().addClass('active');
	
}); //jQuery is loaded

