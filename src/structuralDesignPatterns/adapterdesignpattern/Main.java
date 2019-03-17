package adapterdesignpattern;

public class Main {

	public static void main(String[] args) {
		EmployeeClassAdapter employeeClassAdapter = new EmployeeClassAdapter();
		populateEmployeeData(employeeClassAdapter);
		BusinessCardDesigner businessCardDesigner = new BusinessCardDesigner();
		System.out.println(businessCardDesigner.designCard(employeeClassAdapter));

		System.out.println();

		Employee employee = new Employee();
		populateEmployeeData(employee);
		EmployeeObjectAdapter employeeObjectAdapter = new EmployeeObjectAdapter(employee);
		System.out.println(businessCardDesigner.designCard(employeeObjectAdapter));

	}

	private static void populateEmployeeData(Employee employee) {
		employee.setFullName("Elliot Alderson");
		employee.setJobTitle("Security Engineer");
		employee.setOfficeLocation("Allsafe Cybersecurity, New York City, New York");
	}
}
