package facadedesignpattern.email;

public class StationaryFactory {
	public static Stationary createStationary() {
		return new HalloweenStationary();
	}
}
