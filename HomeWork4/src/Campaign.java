
public class Campaign {
	int id;
	String name;
	String details;
	
	public Campaign(int id, String name, String details) {
		super();
		this.id = id;
		this.name = name;
		this.details = details;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	
	
}
