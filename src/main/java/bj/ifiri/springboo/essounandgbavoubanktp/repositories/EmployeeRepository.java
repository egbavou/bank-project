package bj.ifiri.springboo.essounandgbavoubanktp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import bj.ifiri.springboo.essounandgbavoubanktp.models.Employee;


public interface EmployeeRepository extends JpaRepository<Employee, Long> {

	//public List<Agence> findByUniversiteId(Long universiteId);

}