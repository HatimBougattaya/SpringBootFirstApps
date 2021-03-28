package ma.enset.tpjpa.entities;

import java.util.Date;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name="PATIENTS")
@Data @NoArgsConstructor @AllArgsConstructor @ToString
public class Patient {
		@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
		@Column(name="NOM",length=25)
	private String name;
		@Temporal(TemporalType.DATE)
	private Date datNaissance;
	private int score;
	private boolean malade;
	
}