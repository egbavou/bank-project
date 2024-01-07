package bj.ifiri.springboo.essounandgbavoubanktp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import bj.ifiri.springboo.essounandgbavoubanktp.models.BankAccount;


public interface BankAccountRepository extends JpaRepository<BankAccount, Long> {

	//public List<Agence> findByUniversiteId(Long universiteId);

}