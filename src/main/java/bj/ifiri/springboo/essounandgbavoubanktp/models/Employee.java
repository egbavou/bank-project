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
@Table(name = "employees")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

	@Id
	@GeneratedValue
	private Long number;
	
	@Column
	private String lastname;
	
	@Column
	private String firstname;
	
	@Column
	private Float salary;
	
	@Column
	private int numINSEE;
	
	@ManyToOne()
	@JoinColumn(name = "agencyNumber")
	private Agency agency;
	
	@OneToMany(cascade = CascadeType.DETACH, fetch = FetchType.EAGER, mappedBy = "advisor")
	private List<Client> clients = new ArrayList<Client>();
}
