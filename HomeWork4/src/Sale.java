
public class Sale {
	int id;
	String name;
	int percentage;
	
	
	public Sale(int id, String name, int percentage) {
		super();
		this.id = id;
		this.name = name;
		this.percentage = percentage;
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
	public int getPercentage() {
		return percentage;
	}
	public void setPercentage(int percentage) {
		this.percentage = percentage;
	}

}
