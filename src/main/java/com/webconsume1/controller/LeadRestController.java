package com.webconsume1.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.webconsume1.dto.LeadDto;

@RestController
public class LeadRestController {
	
	public LeadDto getOneLead(long id) {
		RestTemplate rest = new RestTemplate();
		LeadDto lead = rest.getForObject("http://localhost:8080/getid/"+id, LeadDto.class);
		return lead; 
	}
}
