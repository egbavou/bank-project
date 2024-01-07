package bj.ifiri.springboo.essounandgbavoubanktp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import bj.ifiri.springboo.essounandgbavoubanktp.models.AccountWithInteret;


public interface AccountWithInteretRepository extends JpaRepository< AccountWithInteret, Long> {

	//public List<Agence> findByUniversiteId(Long universiteId);

}