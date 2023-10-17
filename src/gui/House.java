package gui;

public class House {
	
	private String surname;
	private int bedrooms, bathrooms;
	
	public House() {
		this.surname = null;
		this.bedrooms = 0;
		this.bathrooms = 0;
	}
	
	public House(String surname, int bedrooms, int bathrooms) {
		this.surname = surname;
		this.bedrooms = bedrooms;
		this.bathrooms = bathrooms;
	}
	
	public String getSurname() {
		return this.surname;
	}
	
	public int getBedrooms() {
		return this.bedrooms;
	}
	
	public int getBathrooms() {
		return this.bathrooms;
	}
	
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	public void setBedrooms(int bedrooms) {
		this.bedrooms = bedrooms;
	}
	
	public void setBathrooms(int bathrooms) {
		this.bathrooms = bathrooms;
	}
	
	public void printDetails() {
		System.out.println("Owner: " + this.surname + " | Number of Bedrooms: " + this.bedrooms + " | Number of bathrooms: " + this.bathrooms);
	}

	public static void main(String[] args) {
		House h1 = new House("Smith", 5, 1);
		House h2 = new House("Jones", 3, 1);
		House h3 = new House();
		
		h3.setSurname("Burke");
		h3.setBedrooms(5);
		h3.setBathrooms(2);
		
		h1.printDetails();
		h2.printDetails();
		h3.printDetails();
	}
}
