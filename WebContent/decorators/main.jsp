<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator" prefix="decorator" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Projeto Base</title>
<!-- 	<link href="http://bootswatch.com/cerulean/bootstrap.css" rel="stylesheet"> -->
<!-- 	<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.4/jquery.min.js"></script> -->
<!-- 	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script> -->
	
	<link href="./css/bootstrap-3.3.6.css" rel="stylesheet">
	<link href="./css/custom.css" rel="stylesheet">
	<script src="./javascript/jquery-2.1.4.min.js"></script>
	<script src="./javascript/bootstrap-3.3.6.min.js"></script>
	<script src="./javascript/jquery.mask-1.7.7.min.js"></script>
	<script src="./javascript/jquery-3.51.0.form.js"></script>
	<script src="./javascript/funcoesCustomizadas.js"></script>
	
	
<%-- 	<decorator:head></decorator:head> --%>
</head>
<body>
<!-- 	<sitemesh:write property='body'/> -->
	<nav class="navbar navbar-inverse">
	<div class="container-fluid">
		<div class="navbar-header">
			<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-2">
				<span class="sr-only">Toggle navigation</span> 
				<span class="icon-bar"></span> <span class="icon-bar"></span> 
				<span class="icon-bar"></span>
			</button>
			<a class="navbar-brand" href="./">Projeto Base</a>
		</div>

		<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
			<ul class="nav navbar-nav">
				<li class="dropdown">
		          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">Serviços <span class="caret"></span></a>
		          <ul class="dropdown-menu" role="menu">
					<li><a href="${linkTo[BloquearCartaoController].index}"> Bloquear Cartao</a></li>
		          </ul>
		        </li>
			</ul>
			
		</div>
	</div>
	</nav>
	
	<div class="main">
    	<decorator:body/>
    </div>
	
	<!-- ------------------------------------------ MODAL -------------------- ---------------------------------- -->
	
	<div id="alertModal" class="modal fade">
	    <div class="modal-dialog">
	        <div class="modal-content">
	            <div class="modal-header">
	                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
	                <h4 class="modal-title">Atenção</h4>
	            </div>
	            <div class="modal-body">
	                <p>Alterações efetivadas com sucesso! </p>
	            </div>
	            <div class="modal-footer">
	                <button id="btModal" type="button" class="btn btn-primary" data-dismiss="modal">OK</button>
	            </div>
	        </div>
	    </div>
	</div>
	
	<div id="removeModal" class="modal fade">
	    <div class="modal-dialog">
	        <div class="modal-content">
	            <div class="modal-header">
	                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
	                <h4 class="modal-title">Atenção</h4>
	            </div>
	            <div class="modal-body">
	                <p>Removido! </p>
	            </div>
	            <div class="modal-footer">
	                <button id="btModal" type="button" class="btn btn-primary" data-dismiss="modal">OK</button>
	            </div>
	        </div>
	    </div>
	</div>
	
	<div id="genericModal" class="modal fade">
	    <div class="modal-dialog">
	        <div class="modal-content">
	            <div class="modal-header">
	                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
	                <h4 class="modal-title" id="genericModalTitle"></h4>
	            </div>
	            <div class="modal-body">
	                <p id="genericModalBody"></p>
	            </div>
	            <div class="modal-footer">
	                <button id="btModal" type="button" class="btn btn-primary" data-dismiss="modal">OK</button>
	            </div>
	        </div>
	    </div>
	</div>
	
	<!------------------------------------------- FIM MODAL------------------------------------------------------ --> 	       
</body>
<script>

	function changeGenericModal(title, body){
		$("#genericModalTitle").html(title);
		$("#genericModalBody").html(body);
	}
$(document).ready(function (){
	var confirmacao = "${alterado}";
	if(confirmacao == "alterado"){
		$("#alertModal").modal('show');
	}
    /*
	$('.date').mask('99/99/9999');
	$('#vencimento').mask("99/99/9999");
	$('#saldoDevedorNestaData').mask("99/99/9999");
	$('#dataCotacao').mask("99/99/9999");
	$('#ultimoPagamentoData').mask("99/99/9999");
	$('#ultimoPagamentoValor').mask("99/99/9999");
	$('#vencimentoFatura').mask("99/99/9999");
	$('#data').mask("99/99/9999");
	*/

	

});

</script>
</html>