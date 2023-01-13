package Entities;

public class EmployeeContact extends Contact {
	private Double paymentPerHour;
	private Double hours;
	
	public EmployeeContact() {
		super();
	}

	public EmployeeContact(String name, String number, String information,Double paymentPerHour, Double hours) {
		super(name, number, information);
		this.paymentPerHour = paymentPerHour;
		this.hours = hours;
	}

	public Double getPaymentPerHour() {
		return paymentPerHour;
	}

	public void setPaymentPerHour(Double paymentPerHour) {
		this.paymentPerHour = paymentPerHour;
	}

	public Double getHours() {
		return hours;
	}

	public void setHours(Double hours) {
		this.hours = hours;
	}

	public Double getPayment() {
		return hours * paymentPerHour;
	}
	
	@Override
	public String Description() {
		return super.Description() + String.format(", Payment: %f", getPayment());
	}
}
