package main;

import java.util.ResourceBundle;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main extends Application {

  private static final String RESOURCES_BUNDLE_PATH = "resources/strings";
  private static final String LAYOUT_PATH = "resources/main.fxml";
  private static final String ICON_PATH = "resources/icon.png";
  private static final String WINDOW_TITLE_KEY = "windowTitle";

  @Override
  public void start(Stage stage) throws Exception {
    ClassLoader loader = getClass().getClassLoader();
    ResourceBundle bundle = ResourceBundle.getBundle(RESOURCES_BUNDLE_PATH);
    FXMLLoader fxmlLoader = new FXMLLoader(loader.getResource(LAYOUT_PATH), bundle);

    Parent root = fxmlLoader.load();
    Controller controller = fxmlLoader.getController();
    Scene scene = new Scene(root);
    stage.setTitle(bundle.getString(WINDOW_TITLE_KEY));
    stage.getIcons().add(new Image(loader.getResourceAsStream(ICON_PATH)));
    stage.setResizable(true);
    stage.setScene(scene);
    stage.show();
    stage.setMaxWidth(root.maxWidth(-1));
    stage.setMaxHeight(root.maxHeight(-1));
  }

  public static void main(String[] args) {
    launch(args);
  }

}
