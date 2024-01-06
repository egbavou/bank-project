package bj.ifiri.springboo.essounandgbavoubanktp.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "employees")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Employe {

	@Id
	@GeneratedValue
	private String numero;
	
	@Column
	private String nom;
	
	@Column
	private String prenom;
	
	@Column
	private Float salaire;
	
	@Column
	private int numINSEE;
	
	@ManyToOne()
	@JoinColumn(name = "nomBanque")
	private Banque nomBanque;
}
