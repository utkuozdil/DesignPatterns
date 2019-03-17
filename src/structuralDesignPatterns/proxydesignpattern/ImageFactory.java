package proxydesignpattern;

public class ImageFactory {
	public static Image getImage(String name) {
		return new ImageProxy(name);
	}
}

