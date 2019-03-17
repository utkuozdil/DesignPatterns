package adapterdesignpattern;

public class BusinessCardDesigner {
	public String designCard(Customer customer) {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(customer.getName());
		stringBuilder.append("\n");
		stringBuilder.append(customer.getDesignation());
		stringBuilder.append("\n");
		stringBuilder.append(customer.getAddress());
		return stringBuilder.toString();
	}
}

