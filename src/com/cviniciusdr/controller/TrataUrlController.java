package com.cviniciusdr.controller;

import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.core.RequestInfo;
import br.com.caelum.vraptor.http.route.ResourceNotFoundException;
import br.com.caelum.vraptor.http.route.Router;
import br.com.caelum.vraptor.ioc.Component;
import br.com.caelum.vraptor.ioc.RequestScoped;
import br.com.caelum.vraptor.resource.DefaultResourceNotFoundHandler;
import br.com.caelum.vraptor.resource.HttpMethod;
import br.com.caelum.vraptor.view.Results;

@Component
@RequestScoped
public class TrataUrlController extends DefaultResourceNotFoundHandler  {
    private final Router router;
    private final Result result;
    public TrataUrlController(Router router, Result result) {
        this.router = router;
        this.result = result;
    }

    @Override
    public void couldntFind(RequestInfo requestInfo) {
        try {
            String uri = requestInfo.getRequestedUri();
            if (uri.endsWith("/")) {
                tryMovePermanentlyTo(requestInfo, uri.substring(0, uri.length()-1));
            } else {
                tryMovePermanentlyTo(requestInfo, uri + "/");
            }
        } catch (ResourceNotFoundException ex) {
        	this.result.use(Results.logic()).redirectTo(ErroController.class).erro404();
        }
    }

    @SuppressWarnings("deprecation")
	private void tryMovePermanentlyTo(RequestInfo requestInfo, String newUri) {
        router.parse(newUri, HttpMethod.of(requestInfo.getRequest()),
            requestInfo.getRequest());
        result.use(Results.http()).movedPermanentlyTo(newUri);
    }
}