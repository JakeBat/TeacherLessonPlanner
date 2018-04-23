package main;

import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;

public class Controller {

  public GridPane root;

  public void initialize() {
    setUp();
  }

  public void setUp() {
    for (int i = 0; i < 7; i++) {
      for (int j = 0; j < 5; j++) {
        GridPane temp = new GridPane();
        Button test = new Button();
        test.setText("Test");
        temp.add(test, 0, 0);
        root.add(temp, j, i);
      }
    }
  }
}
