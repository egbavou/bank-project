package bj.ifiri.springboo.essounandgbavoubanktp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;

import bj.ifiri.springboo.essounandgbavoubanktp.repositories.AgencyRepository;

@Controller
@RequestMapping(value = "/")
public class HomeController {

	@Autowired
	private AgencyRepository agenceRepository;
	
	@GetMapping("dashboard")
	public String home(Model model) {
		
		int totalAgencies  =  (int)agenceRepository.count();

		model.addAttribute("totalAgencies", totalAgencies);
		return "index";
	}
}

