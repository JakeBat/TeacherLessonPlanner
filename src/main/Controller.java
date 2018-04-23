package main;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.RowConstraints;

public class Controller {

  public GridPane root;

  public void initialize() {
    setUp();
  }

  public void setUp() {
    RowConstraints rc = new RowConstraints();
    rc.setFillHeight(true);
    rc.setPercentHeight(100.0/7.0);
    ColumnConstraints cc = new ColumnConstraints();
    cc.setFillWidth(true);
    cc.setPercentWidth(100.0/5.0);
    root.setGridLinesVisible(true);
    for (int i = 0; i < 7; i++) {
      root.getRowConstraints().add(i, rc);
      for (int j = 0; j < 5; j++) {
        if (i == 0) {
          root.getColumnConstraints().add(j, cc);
        }
        GridPane temp = new GridPane();
        TextField test = new TextField();
        test.setText("Test");
        temp.add(test, 0, 0);
        root.add(temp, j, i);
      }
    }
  }
}
