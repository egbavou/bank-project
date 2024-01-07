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
@Table(name = "agencies")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Agency {

	@Id
	@GeneratedValue
	private Long number;
	
	@Column
	private String name;
	
	@Column
	private String address;
	
	@Column
	private String city;
	
	@Column
	private String zipCode;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public Employee getManager() {
		return manager;
	}

	public void setManager(Employee manager) {
		this.manager = manager;
	}

	public Bank getBank() {
		return bank;
	}

	public void setBank(Bank bank) {
		this.bank = bank;
	}

	public List<Employee> getEmployes() {
		return employes;
	}

	public void setEmployes(List<Employee> employes) {
		this.employes = employes;
	}

	@ManyToOne()
	@JoinColumn(name = "managerName")
	private Employee manager;
	
	@ManyToOne()
	@JoinColumn(name = "bankNumber")
	private Bank bank;
	
	@OneToMany(cascade = CascadeType.DETACH, fetch = FetchType.EAGER, mappedBy = "agency")
	private List<Employee> employes = new ArrayList<Employee>();
	
	
	@OneToMany(cascade = CascadeType.DETACH, fetch = FetchType.EAGER, mappedBy = "agency")
	private List<BankAccount> compteBancaireSansInterets = new ArrayList<BankAccount>();
	
	@OneToMany(cascade = CascadeType.DETACH, fetch = FetchType.EAGER, mappedBy = "agency")
	private List<AccountWithInteret> compteBancaireAvecInterets = new ArrayList<AccountWithInteret>();
	
}
