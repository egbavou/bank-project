package bj.ifiri.springboo.essounandgbavoubanktp.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "clients")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Client {

	@Id
	private String numero;
	
	@Column
	private String nom;
	
	@Column
	private String prenom;
	
	@Column
	private String adresse;
	
	@ManyToOne()
	@JoinColumn(name = "employee_id")
	private Employe conseiller;
}
