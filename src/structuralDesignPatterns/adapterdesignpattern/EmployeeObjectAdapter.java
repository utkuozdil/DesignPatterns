package adapterdesignpattern;

public class EmployeeObjectAdapter implements Customer {

	public EmployeeObjectAdapter(Employee adaptee) {
		this.adaptee = adaptee;
	}

	private Employee adaptee;

	@Override
	public String getName() {
		return adaptee.getFullName();
	}

	@Override
	public String getDesignation() {
		return adaptee.getJobTitle();
	}

	@Override
	public String getAddress() {
		return adaptee.getOfficeLocation();
	}
}
