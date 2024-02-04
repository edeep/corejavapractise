package hibernatequestions;
import javax.persistence.*;
import java.util.List;

@Entity
public class Manufactures {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	// One manufactures can produces 
	// multiple models of the bike
	private String manufactures_name;

	@OneToMany(mappedBy ="ob")
	private List<Model>models;

	public Manufactures(int id, String manufactures_name) {
		this.id = id;
		this.manufactures_name = manufactures_name;
	}



}

