package io.github.cassio.parameter.implementation.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.cassio.parameter.implementation.ParameterImplementationApplication;

@RestController
@RequestMapping("/complete")
public class CompleteImplementationController {

	private String parameter = null;
	
	public CompleteImplementationController() {
		parameter = getParameter();
	}
    
    @GetMapping
    public ResponseEntity<String> parameter() {
    	return ResponseEntity.ok(getParameter());
    }
    
    protected String getParameter() {
    	try {
            final ClassLoader loader = this.getClass().getClassLoader();
            final String path = "parameter.json";

            final String raw = ParameterImplementationApplication.readFile(path, loader);
            
            parameter = raw;
    	} catch (final Exception e) {
    		e.printStackTrace();
    	}
    	
    	return parameter;
    }
}
