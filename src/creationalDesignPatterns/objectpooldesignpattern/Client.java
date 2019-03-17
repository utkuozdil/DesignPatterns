package objectpooldesignpattern;

import java.awt.geom.Point2D;

public class Client {

	public static final ObjectPool<Bitmap> bitmapPool = new ObjectPool<>(() -> new Bitmap("Logo.bmp"), 5);

	public static void main(String[] args) {
		Bitmap bitmap1 = bitmapPool.get();
		Point2D point2d = new Point2D.Float(10, 10);
		bitmap1.setLocation(point2d);

		Bitmap bitmap2 = bitmapPool.get();
		Point2D point2d2 = new Point2D.Float(-10, 10);
		bitmap2.setLocation(point2d2);

		bitmap1.draw();
		bitmap2.draw();

		bitmapPool.release(bitmap1);
		bitmapPool.release(bitmap2);
	}
}
