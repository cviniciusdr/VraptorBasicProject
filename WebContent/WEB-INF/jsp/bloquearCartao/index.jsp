<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<form action="<c:url value="/bloquearCartao/adiciona" />"  method="post" class="form-horizontal">

	<fieldset>
		<legend>Bloquear Cartão</legend>

		<div class="form-group">
			<label class="col-md-4 control-label" for="textinput">Ocultar Campos Desabilitados?</label>
			<div class="col-md-4">
				 <input type="checkbox" name="checkboxDisable" value="Sim" onclick="ocultarDesabilitados(this)">
			</div>
		</div>
		
		<div class="form-group">
			<label class="col-md-4 control-label" for="textinput">Sucesso</label>
			<div class="col-md-4">
				<input id="textinput" name="bloquearCartao.sucesso" type="text" value="${bloquearCartao.sucesso}" class="form-control input-md">
			</div>
		</div>
		
		<div class="form-group">
		  <label class="col-md-4 control-label" for="textinput"></label>
		  <div class="col-md-4">
		    <button id="cadastrar" name="submit" class="btn btn-primary">Cadastrar</button>
		  </div>
		</div>
	</fieldset>
</form>
