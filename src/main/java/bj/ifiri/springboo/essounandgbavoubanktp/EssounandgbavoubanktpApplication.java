package bj.ifiri.springboo.essounandgbavoubanktp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import bj.ifiri.springboo.essounandgbavoubanktp.models.Bank;
import bj.ifiri.springboo.essounandgbavoubanktp.repositories.BankRepository;
import bj.ifiri.springboo.essounandgbavoubanktp.models.Agency;
import bj.ifiri.springboo.essounandgbavoubanktp.repositories.AgencyRepository;

@SpringBootApplication
@EnableJpaRepositories
@EnableAutoConfiguration
public class EssounandgbavoubanktpApplication {
	
	@Autowired
	private BankRepository bankRepo;
	
	@Autowired
	private AgencyRepository agencyRepo;
	
	public static void main(String[] args) {
		SpringApplication.run(EssounandgbavoubanktpApplication.class, args);
	}
	
	/**
	 * Fonction de test temporaire
	 * 
	 * @param ctx
	 * @return
	 */
	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
		return args -> {
			
			/*Bank bank = new Bank();
			bank.setCapital(1000000000.00f);
			bank.setHeadOfficeAddress("AGLA HLAZOUNTO");
			bank.setNumEmployees(0);
			bankRepo.save(bank);
			
			Agency agency1 = new Agency();
			agency1.setAddress("Fidjrosse");
			agency1.setBank(bank);
			agency1.setName("AGENCE FIDJROSSE");
			agency1.setCity("Cotonou");
			agencyRepo.save(agency1);
			
			Agency agency2 = new Agency();
			agency2.setAddress("Cadjehoun");
			agency2.setBank(bank);
			agency2.setName("AGENCE CADJEHOUN");
			agency2.setCity("Cotonou");
			agencyRepo.save(agency2);
			
			Agency agency3 = new Agency();
			agency3.setAddress("Sainte Rita");
			agency3.setBank(bank);
			agency3.setName("AGENCE SAINTE RITA");
			agency3.setCity("Cotonou");
			agencyRepo.save(agency3); */

		};
	}
}
