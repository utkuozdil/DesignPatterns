package proxydesignpattern;

import javafx.geometry.Point2D;

public class ImageProxy implements Image {

	private BitmapImage bitmapImage;

	private String name;

	private Point2D location;

	public ImageProxy(String name) {
		this.name = name;
	}

	@Override
	public void setLocation(Point2D point2d) {
		if (bitmapImage != null)
			bitmapImage.setLocation(point2d);
		else
			location = point2d;
	}

	@Override
	public Point2D getLocation() {
		if (bitmapImage != null)
			return bitmapImage.getLocation();
		else
			return location;
	}

	@Override
	public void render() {
		if (bitmapImage == null) {
			bitmapImage = new BitmapImage(name);
			if (location != null)
				bitmapImage.setLocation(location);
		}
		bitmapImage.render();
	}
}