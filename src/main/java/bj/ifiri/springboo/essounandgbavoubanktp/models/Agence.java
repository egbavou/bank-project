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
@Table(name = "agences")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Agence {

	@Id
	@GeneratedValue
	private String numero;
	
	@Column
	private String nom;
	
	@Column
	private String adresse;
	
	@Column
	private String ville;
	
	@Column
	private String codePostal;
	
	@Column
	private String nomDirecteur;
	
	@ManyToOne()
	@JoinColumn(name = "number")
	private Banque nomBanque;

}
