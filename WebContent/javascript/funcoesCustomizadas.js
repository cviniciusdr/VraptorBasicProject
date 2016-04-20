function imagemAletoria404(){
	
	imagem = new Array(4);
	imagem[0] = "<img src='img/404-1.png'>";
	imagem[1] = "<img src='img/404-2.png'>";
	imagem[2] = "<img src='img/404-3.png'>";
	imagem[3] = "<img src='img/404-4.png'>";
	index = Math.floor(Math.random() * imagem.length);
	document.write(imagem[index]);

}

function ocultarDesabilitados(e){
	if(e.checked) {
		$( "input:disabled" ).closest(".form-group").hide();
	}else{
		$( "input:disabled" ).closest(".form-group").show();
	}
}

