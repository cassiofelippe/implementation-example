package io.github.cassio.parameter.implementation.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class Controller {

	@GetMapping("/ping")
    public ResponseEntity<String> ping() {
        return ResponseEntity.ok("pong!");
    }
	
}
