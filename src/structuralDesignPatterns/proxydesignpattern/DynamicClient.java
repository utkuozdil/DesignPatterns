package proxydesignpattern;

import javafx.geometry.Point2D;

public class DynamicClient {

	public static void main(String[] args) {
		Image img = ImageFactory.getImage("MyPic.bmp");
		img.setLocation(new Point2D(10, 10));
		System.out.println("Image Location: "+img.getLocation());
		System.out.println("Starting render...");
		img.render();
	}
}
