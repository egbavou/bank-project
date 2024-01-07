package bj.ifiri.springboo.essounandgbavoubanktp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import bj.ifiri.springboo.essounandgbavoubanktp.repositories.AgencyRepository;


@Controller
@RequestMapping(value = "/")
public class ClientController {

	@Autowired
	private AgencyRepository agenceRepository;
	
	@GetMapping("clients")
	public String listAgences(Model model) {

		model.addAttribute("agences", agenceRepository.findAll());
		return "agences";
	}
}

