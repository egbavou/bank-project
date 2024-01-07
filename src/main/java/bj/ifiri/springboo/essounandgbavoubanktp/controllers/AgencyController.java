package bj.ifiri.springboo.essounandgbavoubanktp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

import bj.ifiri.springboo.essounandgbavoubanktp.models.Agency;
import org.springframework.ui.Model;

import bj.ifiri.springboo.essounandgbavoubanktp.repositories.AgencyRepository;

@Controller
@RequestMapping(value = "/")
public class AgencyController {

	@Autowired
	private AgencyRepository agenceRepository;
	
	@GetMapping("agencies")
	public String listAgences(Model model) {

		model.addAttribute("agencies", agenceRepository.findAll());
		return "agencies";
	}
}

