package templatedesignpattern;

import java.io.IOException;

public class Client {
	public static void main(String[] args) throws IOException {
		Order order = new Order("1001");
		order.addItem("soda", 1);
		order.addItem("cola", 3);
		order.addItem("fanta", 2);
		OrderPrinter orderPrinter = new HtmlPrinter();
		orderPrinter.print(order, "1001.txt");
	}
}