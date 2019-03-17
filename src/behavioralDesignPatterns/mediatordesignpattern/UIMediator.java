package mediatordesignpattern;

import java.util.ArrayList;
import java.util.List;

public class UIMediator {
	List<UIControl> colleagues = new ArrayList<>();

	public void register(UIControl uiControl) {
		colleagues.add(uiControl);
	}

	public void valueChanged(UIControl uiControl) {
		colleagues.stream().filter(x -> x != uiControl).forEach(x -> x.controlChanged(uiControl));
	}
}
