package bj.ifiri.springboo.essounandgbavoubanktp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import bj.ifiri.springboo.essounandgbavoubanktp.models.Agency;
import bj.ifiri.springboo.essounandgbavoubanktp.models.Client;
import bj.ifiri.springboo.essounandgbavoubanktp.repositories.AgencyRepository;
import bj.ifiri.springboo.essounandgbavoubanktp.repositories.ClientRepository;
import bj.ifiri.springboo.essounandgbavoubanktp.repositories.EmployeeRepository;


@Controller
@RequestMapping(value = "/")
public class ClientController {
	
	@Autowired
	private ClientRepository clientRepository;
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Autowired
	private AgencyRepository agencyRepository;
	
	public List<Client> getClientsByAgency(Agency agency) {
        return clientRepository.findByAgency(agency);
    }
	
	public List<Client> findByFirstNameAndLastName(String firstName, String lastName) {
        return clientRepository.findByLastnameAndFirstname(firstName, lastName);
    }
	
	@GetMapping("agencies/{agenceId}")
	public String listClients(@PathVariable("agenceId") Agency agenceId, Model model) {

		model.addAttribute("clients", this.getClientsByAgency(agenceId));
		return "clients";
	}
	
	@GetMapping("clients/new")
	public String showNewClientForm(Model model) {

		model.addAttribute("agencies",agencyRepository.findAll());

		model.addAttribute("advisors",employeeRepository.findAll());
		
		return "newClient";
	}
	
	
	@PostMapping("clients/store")
	public String saveStudent(@RequestParam("lastname") String lastname ) {

		System.out.println(lastname);
		//data.getAttribute("a");
		Client client = new Client();
		//client.setAddress(data.getAttribute("a"));
		//client.setFirstname(data.getFirstname());
		client.setLastname(lastname);
		//client.setAdvisor(data.getAdvisor());
		//client.setAgency(data.getAgency());
		clientRepository.save(client);

		return "redirect:/agencies";
	}
}

