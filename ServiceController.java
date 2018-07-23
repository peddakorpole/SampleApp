package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.model.Example;
import com.example.model.RequestData;
import com.example.service.DemoService;

@Controller
public class ServiceController {

	@Autowired
	private DemoService demoService;

	@RequestMapping(value = "/v1/demoService/{id}", consumes = { "application/json" }, method = RequestMethod.POST)
	ResponseEntity<Example> createLoan(@RequestBody RequestData requestBody) throws Exception {

		Example example = demoService.getData(requestBody);

		ResponseEntity<Example> re = new ResponseEntity<>(example, null, HttpStatus.OK);
		return re;
	}

	@RequestMapping(value = "/v1/getRandomDara", consumes = { "application/json" }, method = RequestMethod.GET)
	ResponseEntity<String> getLoanDetailsForCity() throws Exception {

		String str = demoService.getRandomData();

		ResponseEntity<String> re = new ResponseEntity<>(str, null, HttpStatus.OK);
		return re;
	}

}
