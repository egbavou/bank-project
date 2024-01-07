package bj.ifiri.springboo.essounandgbavoubanktp.models;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "banks")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Bank {

	@Id
	@GeneratedValue
	private Long number;
	
	@Column
	private Float capital;
	
	@Column
	private String headOfficeAddress;
	
	@Column
	private int numEmployees;
	
	public Float getCapital() {
		return capital;
	}

	public void setCapital(Float capital) {
		this.capital = capital;
	}

	public String getHeadOfficeAddress() {
		return headOfficeAddress;
	}

	public void setHeadOfficeAddress(String headOfficeAddress) {
		this.headOfficeAddress = headOfficeAddress;
	}

	public int getNumEmployees() {
		return numEmployees;
	}

	public void setNumEmployees(int numEmployees) {
		this.numEmployees = numEmployees;
	}

	public String getCityAgencies() {
		return cityAgencies;
	}

	public void setCityAgencies(String cityAgencies) {
		this.cityAgencies = cityAgencies;
	}

	@Column
	private String cityAgencies;
	
	@OneToMany(cascade = CascadeType.DETACH, fetch = FetchType.EAGER, mappedBy = "bank")
	private List<Agency> agencies = new ArrayList<Agency>();
	    

}
