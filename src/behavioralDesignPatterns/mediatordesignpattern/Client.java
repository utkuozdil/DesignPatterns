package mediatordesignpattern;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Client extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		UIMediator mediator = new UIMediator();
		Slider slider = new Slider(mediator);
		TextBox box = new TextBox(mediator);
		Label label = new Label(mediator);

		GridPane grid = new GridPane();
		grid.setAlignment(Pos.CENTER);
		grid.setVgap(20);
		grid.setPadding(new Insets(25, 25, 25, 25));
		grid.add(label, 0, 0);
		grid.add(slider, 0, 1);
		grid.add(box, 0, 2);
		Scene scene = new Scene(grid, 500, 500);
		primaryStage.setTitle("Mediator Pattern");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

	public boolean isMultiplier(int[] array, final int product) {
		final Map<Integer, Long> map = Arrays.stream(array).boxed()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		return Arrays.stream(array).boxed().distinct().anyMatch(x -> (product % x == 0
				&& ((product / x == x && map.get(product / x) > 1) || (map.containsKey(product / x)))));
	}
}
