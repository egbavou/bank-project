package bj.ifiri.springboo.essounandgbavoubanktp.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "banques")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Banque {

	@Id
	private String numero;
	
	@Column
	private Float capital;
	
	@Column
	private String adresseSiege;
	
	@Column
	private int[] numSalaries;
	
	@Column
	private String[] villesAgences;
}
