package bj.ifiri.springboo.essounandgbavoubanktp.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
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
public class CompteAvecInterets extends CompteBancaire {

	@Column
	private Float taux;
}
