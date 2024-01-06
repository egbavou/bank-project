package bj.ifiri.springboo.essounandgbavoubanktp.models;

import java.util.Date;

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
@Table(name = "compte_bancaires")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CompteBancaire {

	@Id
	private String numero;
	
	@Column
	private Float solde;
	
	@Column
	private Date dateOuverture;
	
	@Column
	private String nomClient;
	
	@Column 
	private String prenomClient;
	
	@ManyToOne()
	@JoinColumn(name = "numero_agence")
	private Agence numeroAgence;
	
	@ManyToOne()
	@JoinColumn(name = "numero_banque")
	private Banque numeroBanque;
	
}
