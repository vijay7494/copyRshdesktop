package com.copyrush;

import javafx.application.Application;
import javafx.fxml.FXMLLoader; // RE-ADD THIS IMPORT
import javafx.scene.Parent;    // RE-ADD THIS IMPORT
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;    // RE-ADD THIS IMPORT

public class App extends Application {

    // Removed the static scene variable if it's not needed for dynamic switching yet,
    // or you can keep it if you plan to implement switching later.
    // private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException { // Re-added 'throws IOException'
        // Load your new filesReview.fxml as the initial scene
        Parent root = loadFXML("pages/filesReview"); // Specify the path relative to resources/com/copyrush/
        Scene scene = new Scene(root, 640, 480); // You can adjust these dimensions or make it maximized later

        stage.setTitle("Files Review Application"); // Set your window title
        stage.setScene(scene);
        stage.setMaximized(true); // Example: Make the window maximized
        stage.show();
    }

    // Re-introduce the loadFXML helper method
    private static Parent loadFXML(String fxml) throws IOException {
        // The path here is relative to the 'resources' folder and your package.
        // So, "pages/filesReview" translates to "resources/com/copyrush/pages/filesReview.fxml"
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    // If you need scene switching later, you can re-implement setRoot
    // public static void setRoot(String fxml) throws IOException {
    //     // You would need 'private static Scene scene;' back if you use this
    //     scene.setRoot(loadFXML(fxml));
    // }

    public static void main(String[] args) {
        launch();
    }
}