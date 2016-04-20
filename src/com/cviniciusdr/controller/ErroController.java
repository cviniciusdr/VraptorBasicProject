package com.cviniciusdr.controller;

import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Resource;

@Resource
public class ErroController {

	
	public ErroController() {
	}
	
	@Get("/erro404")
	public void erro404(){}
}
