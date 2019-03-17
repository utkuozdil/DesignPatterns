package proxydesignpattern;

import javafx.geometry.Point2D;

public class Client {
	public static void main(String[] args) {
		Image image = ImageFactory.getImage("a1.bmp");
		image.setLocation(new Point2D(10, 10));
		System.out.println("location: " + image.getLocation());
		System.out.println("rendering...");
		image.render();
	}
}