package bj.ifiri.springboo.essounandgbavoubanktp.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import bj.ifiri.springboo.essounandgbavoubanktp.models.Agency;
import bj.ifiri.springboo.essounandgbavoubanktp.models.Bank;
import bj.ifiri.springboo.essounandgbavoubanktp.models.Client;


public interface ClientRepository extends JpaRepository<Client, Long> {

	public List<Client> findByAgency(Agency agency);
	
	public List<Client> findByLastnameAndFirstname(String lastname, String firstname);
	
	@Query(value="SELECT c.*, b.solde FROM clients c, bank_account b WHERE c.id = b.customer_id AND b.bank_id = ?1 b.solde < 0", nativeQuery=true)
	List<Object[]> findCustomerWithNegativeBalanceInBank(Bank bank);
	
	@Query(value="SELECT c.*, b.solde FROM clients AS c, bank_account AS b WHERE c.id = b.customer_id AND b.solde < 0", nativeQuery=true)
	List<Object[]> findCustomerWithNegativeBalance();

}