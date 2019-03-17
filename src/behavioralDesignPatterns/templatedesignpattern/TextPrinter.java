package templatedesignpattern;

import java.util.Map;

public class TextPrinter extends OrderPrinter {

	@Override
	protected String start() {
		return "order details";
	}

	@Override
	protected String formatOrderNumber(Order order) {
		return "#" + order.getId();
	}

	@Override
	protected String formatItems(Order order) {
		StringBuilder stringBuilder = new StringBuilder("items\n");
		for (Map.Entry<String, Double> entry : order.getItems().entrySet())
			stringBuilder.append(entry.getKey() + " " + entry.getValue() + "\n");
		return stringBuilder.toString();
	}

	@Override
	protected String formatTotal(Order order) {
		return String.valueOf(order.getTotal());
	}

	@Override
	protected String end() {
		return "";
	}
}