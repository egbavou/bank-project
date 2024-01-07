package bj.ifiri.springboo.essounandgbavoubanktp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import bj.ifiri.springboo.essounandgbavoubanktp.models.Bank;

public interface BankRepository extends JpaRepository<Bank, Long> {

}