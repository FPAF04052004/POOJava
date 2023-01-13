package Entities;

public class PersonalContact extends Contact{
	private Relationship relationship;

	public PersonalContact() {
		super();
	}
	
	public PersonalContact(String name, String number, String information) {
		super(name, number, information);
	}

	public PersonalContact(String name, String number, String information, Relationship relationship) {
		super(name, number, information);
		this.relationship = relationship;
	}

	public Relationship getRelationship() {
		return relationship;
	}

	public void setRelationship(Relationship relationship) {
		this.relationship = relationship;
	}
	
	@Override
	public String Description() {
		return super.Description() + String.format(", Relationship: %s", relationship);
	}
}
