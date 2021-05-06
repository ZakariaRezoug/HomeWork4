
public class Member {
	int id;
	String firsName;
	String lastName;
	int birthYear;
	long nationaltyId;
	
	
	public Member(int id, String firsName, String lastName, int birthYear, long nationaltyId) {
		super();
		this.id = id;
		this.firsName = firsName;
		this.lastName = lastName;
		this.birthYear = birthYear;
		this.nationaltyId = nationaltyId;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirsName() {
		return firsName;
	}
	public void setFirsName(String firsName) {
		this.firsName = firsName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getBirthYear() {
		return birthYear;
	}
	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
	public double getNationaltyId() {
		return nationaltyId;
	}
	public void setNationaltyId(long nationaltyId) {
		this.nationaltyId = nationaltyId;
	}
}
