package com.evolve.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CandidateController {


	@RequestMapping(value="/sysout", method = RequestMethod.GET)
	private String sysout() {
		
		return "hello from sysout test";
	}

	
	
}
