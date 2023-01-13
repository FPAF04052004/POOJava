package Entities;

public class Contact implements ContactDescription{
	private String name;
	private String number;
	private String information;
	
	public Contact() {
	}

	public Contact(String name, String number, String information) {
		this.name = name;
		this.number = number;
		this.information = information;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getInformation() {
		return information;
	}

	public void setInformation(String information) {
		this.information = information;
	}

	@Override
	public String Description() {
		return String.format("Name: %s, Number: %s, Information: %s", name, number, information);
	}
}
