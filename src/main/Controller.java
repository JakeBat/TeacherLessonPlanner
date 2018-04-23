package main;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Border;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.RowConstraints;

public class Controller {

  public GridPane gridLayout;
  public GridPane root;
  private Border border;

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
      gridLayout.getRowConstraints().add(i, rc);
      for (int j = 0; j < 5; j++) {
        if (i == 0) {
          gridLayout.getColumnConstraints().add(j, cc);
        }
        GridPane temp = new GridPane();
        TextField test = new TextField();
        test.setText("Test");
        temp.add(test, 0, 0);
        gridLayout.add(temp, j, i);
      }
    }
    gridLayout.setGridLinesVisible(true);
    rc = new RowConstraints();
    rc.setFillHeight(true);
    rc.setPercentHeight(100);
    cc = new ColumnConstraints();
    cc.setFillWidth(true);
    cc.setPercentWidth(10);
    root.getRowConstraints().add(0, rc);
    root.getColumnConstraints().add(0, cc);
    ColumnConstraints eighty = new ColumnConstraints();
    eighty.setPercentWidth(90);
    eighty.setFillWidth(true);
    root.getColumnConstraints().add(1, eighty);
  }
}
