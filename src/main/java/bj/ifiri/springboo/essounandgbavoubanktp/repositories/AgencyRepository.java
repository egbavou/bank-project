package bj.ifiri.springboo.essounandgbavoubanktp.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import bj.ifiri.springboo.essounandgbavoubanktp.models.Client;

import bj.ifiri.springboo.essounandgbavoubanktp.models.Agency;


public interface AgencyRepository extends JpaRepository<Agency, Long> {

	//public List<Client> listClient(Long agenceId);
}