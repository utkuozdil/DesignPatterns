package prototypedesignpattern;

import java.awt.geom.Point2D;

public abstract class GameUnit implements Cloneable {

	private Point2D position;

	public GameUnit() {
		position = new Point2D.Float(0, 0);
	}

	@Override
	public GameUnit clone() throws CloneNotSupportedException {
		GameUnit gameUnit = (GameUnit) super.clone();
		gameUnit.initialize();
		return gameUnit;
	}

	protected void initialize() {
		position = new Point2D.Float(0, 0);
		reset();
	}

	protected abstract void reset();

	public GameUnit(float x, float y) {
		position = new Point2D.Float(x, y);
	}

	public void move(Point2D direction, float distance) {
		direction.setLocation(direction.getX() + distance, direction.getY() + distance);
		position.setLocation(direction);
	}

	public Point2D getPosition() {
		return position;
	}
}
