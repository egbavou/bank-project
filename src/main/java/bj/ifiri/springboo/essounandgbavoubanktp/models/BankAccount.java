package bj.ifiri.springboo.essounandgbavoubanktp.models;

import java.util.Date;

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
@Table(name = "bank_accounts")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BankAccount {

	@Id
	@GeneratedValue
	private Long number;
	
	@Column
	private Float balance;
	
	@Column
	private Date dateOpening;
	
	@ManyToOne()
	@JoinColumn(name = "clientNumber")
	private Client client;
	
	@ManyToOne()
	@JoinColumn(name = "agencyNumber")
	private Agency agency;
	
	@ManyToOne()
	@JoinColumn(name = "bankNumber")
	private Bank bank;
	
}
