package proxydesignpattern.dynamic;

import javafx.geometry.Point2D;
import proxydesignpattern.Image;

public class Client {

	public static void main(String[] args) {
		Image image = ImageFactory.getImage("a.bmp");
		image.setLocation(new Point2D(-10, 0));
		System.out.println(image.getLocation());
		System.out.println("rendering...");
		image.render();
	}
}
