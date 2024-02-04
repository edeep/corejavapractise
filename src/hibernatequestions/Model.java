package hibernatequestions;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Model {

	@Id
	private int model_id;

	private String name;

	@ManyToOne
	@JoinColumn(name = "manufacture_id")
	private Manufactures ob;

	
}
