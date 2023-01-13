package Entities;

public class OutsourcedEmployeeContact extends EmployeeContact {
    private Double comission;
	
	public OutsourcedEmployeeContact() {
		super();
	}

	public OutsourcedEmployeeContact(String name, String number, String information,Double paymentPerHour, Double hours, Double comission) {
		super(name, number, information, paymentPerHour, hours);
		this.comission = comission;
	}

	public Double getComission() {
		return comission;
	}

	public void setComission(Double comission) {
		this.comission = comission;
	}
	
	@Override
	public final Double getPayment() {
		return (1.05 * comission) + super.getPayment();
	}
	
	@Override
	public final String Description() {
		return super.Description() + String.format(", Payment: %f", getPayment());
	}
}
