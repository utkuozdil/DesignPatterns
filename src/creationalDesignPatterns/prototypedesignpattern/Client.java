package prototypedesignpattern;

import java.awt.geom.Point2D;

public class Client {
	public static void main(String[] args) throws CloneNotSupportedException {
		Swordsman swordsman = new Swordsman();
		swordsman.move(new Point2D.Float(5, 3), 1);
		swordsman.attack();
		System.out.println(swordsman);

		Swordsman swordsman2 = (Swordsman) swordsman.clone();
		System.out.println("Cloned Swordsman " + swordsman2);
	}
}
