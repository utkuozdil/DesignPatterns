package iteratordesignpattern;

public class Client {
	public static void main(String[] args) {
		Iterator<ThemeColor> iterator = ThemeColor.getIterator();
		while (iterator.hasNext()) {
			ThemeColor themeColor = iterator.next();
			System.out.println(themeColor);
		}
	}
}