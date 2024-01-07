package bj.ifiri.springboo.essounandgbavoubanktp.models;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
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
	@GeneratedValue
	private Long number;
	
	@Column
	private String lastname;
	
	@Column
	private String firstname;
	
	@Column
	private String address;
	
	@ManyToOne()
	@JoinColumn(name = "employeeNumber")
	private Employee advisor;
	
	@OneToMany(cascade = CascadeType.DETACH, fetch = FetchType.EAGER, mappedBy = "client")
	private List<BankAccount> compteBancaireSansInterets = new ArrayList<BankAccount>();
	
	@OneToMany(cascade = CascadeType.DETACH, fetch = FetchType.EAGER, mappedBy = "client")
	private List<AccountWithInteret> compteBancaireAvecInterets = new ArrayList<AccountWithInteret>();
	
	
}
