package bj.ifiri.springboo.essounandgbavoubanktp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

@SpringBootApplication
@EnableJpaRepositories
@EnableAutoConfiguration
public class EssounandgbavoubanktpApplication {

	public static void main(String[] args) {
		SpringApplication.run(EssounandgbavoubanktpApplication.class, args);
	}

}
