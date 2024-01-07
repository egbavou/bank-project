package bj.ifiri.springboo.essounandgbavoubanktp.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;

import bj.ifiri.springboo.essounandgbavoubanktp.repositories.AgencyRepository;

@Controller
@RequestMapping(value = "/")
public class AgencyController {

	@Autowired
	private AgencyRepository agencyRepository;
	
	@GetMapping("agencies")
	public String listAgences(Model model) {

		model.addAttribute("agencies", agencyRepository.findAll());
		return "agencies";
	}
	
}

