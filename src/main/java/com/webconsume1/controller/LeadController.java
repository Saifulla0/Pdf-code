package com.webconsume1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.webconsume1.dto.LeadDto;

@Controller
public class LeadController {
	
	@Autowired
	private LeadRestController leadRest;
	@RequestMapping("search")
	public String search() {
		return "search_lead";
	}
	
	@RequestMapping("/searchLead")
	public String getTheLead(@RequestParam long id,ModelMap model) {
		LeadDto lead = leadRest.getOneLead(id);
		model.addAttribute("lead", lead);
		return "Lead";
	}
}
