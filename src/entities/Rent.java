package entities;

public class Rent {
	
	public int id;
	public String name;
	public String email;
	public int room;
	
	
	public String toString() {
		return room + " " + name + ", " + email;
				
	}

}
