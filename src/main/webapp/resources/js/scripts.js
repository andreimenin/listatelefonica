PrimeFaces.locales['pt_BR'] = {
	closeText : 'Fechar',
	prevText : 'Anterior',
	nextText : 'Próximo',
	currentText : 'Começo',
	monthNames : [ 'Janeiro', 'Fevereiro', 'Março', 'Abril', 'Maio', 'Junho',
			'Julho', 'Agosto', 'Setembro', 'Outubro', 'Novembro', 'Dezembro' ],
	monthNamesShort : [ 'Jan', 'Fev', 'Mar', 'Abr', 'Mai', 'Jun', 'Jul', 'Ago',
			'Set', 'Out', 'Nov', 'Dez' ],
	dayNames : [ 'Domingo', 'Segunda', 'Terça', 'Quarta', 'Quinta', 'Sexta',
			'Sábado' ],
	dayNamesShort : [ 'Dom', 'Seg', 'Ter', 'Qua', 'Qui', 'Sex', 'Sáb' ],
	dayNamesMin : [ 'D', 'S', 'T', 'Q', 'Q', 'S', 'S' ],
	weekHeader : 'Semana',
	firstDay : 0,
	isRTL : false,
	showMonthAfterYear : false,
	yearSuffix : '',
	timeOnlyTitle : 'Só Horas',
	timeText : 'Tempo',
	hourText : 'Hora',
	minuteText : 'Minuto',
	secondText : 'Segundo',
	ampm : false,
	month : 'Mês',
	week : 'Semana',
	day : 'Dia',
	allDayText : 'Todo o Dia'
};



function keyFilterNumber(evt) {
	  var theEvent = evt || window.event;

	  // Handle paste
	  if (theEvent.type === 'paste') {
	      key = event.clipboardData.getData('text/plain');
	  } else {
	  // Handle key press
	      var key = theEvent.keyCode || theEvent.which;
	      key = String.fromCharCode(key);
	  }
	  var regex = /[0-9]|\./;
	  if( !regex.test(key) ) {
	    theEvent.returnValue = false;
	    if(theEvent.preventDefault) theEvent.preventDefault();
	  }
	  return theEvent;
}



function maskTelefone(value){
	var telefone = $(value).val();
	telefone = telefone.replace(/\D/g,"");
	telefone = telefone.replace(/(\d{0})(\d)/,"$1($2");
	telefone = telefone.replace(/(\d{2})(\d)/,"$1) $2");
	telefone = telefone.replace(/(\d{3})(\d{1,4})$/,"$1-$2"); 
	$(value).val(telefone);
}

function soLetrasMI(v){
	v=v.toLowerCase() //Minusculas
	return v.replace(/\d/g,"") //Remove tudo o que não é Letra ->minusculas
	}




