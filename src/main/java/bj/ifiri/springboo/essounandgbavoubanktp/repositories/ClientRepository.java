package bj.ifiri.springboo.essounandgbavoubanktp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import bj.ifiri.springboo.essounandgbavoubanktp.models.Client;


public interface ClientRepository extends JpaRepository<Client, Long> {

	//public List<Agence> findByUniversiteId(Long universiteId);

}