package com.example.service;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;

import org.apache.commons.io.IOUtils;
import org.springframework.stereotype.Component;

import com.example.model.Example;
import com.example.model.RequestData;
import com.fasterxml.jackson.databind.ObjectMapper;

@Component
public class DemoService {

	public Example getData(RequestData requestBody) throws Exception {
		InputStream is = this.getClass().getResourceAsStream("/data.json");
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		IOUtils.copy(is, baos);
		String exampleText = new String(baos.toByteArray());
		ObjectMapper mapper = new ObjectMapper();
		Example example = mapper.readValue(exampleText, Example.class);
		return example;
	}

	public String getRandomData() {
		int number = (int) (Math.random() * 100);
		System.out.println("Number===>" + number);
		String output = "";
		if (number % 2 == 0) {
			output = getEvenData();
		} else {
			output = getOddData();
		}
		return output;
	}

	public String getEvenData() {
		return "even record found";
	}

	public String getOddData() {
		return "odd record found";
	}

}
