module com.copyrush {
    requires javafx.controls;
    requires javafx.fxml;

    // Export your main package (where App.java resides)
    exports com.copyrush;
    // Export your pages package so other modules can use its public types
    exports com.copyrush.pages;

    // Open your main package to javafx.fxml for FXML access
    opens com.copyrush to javafx.fxml;
    // Open your pages package to javafx.fxml for FXML access (THIS IS CRUCIAL FOR YOUR ERROR)
    opens com.copyrush.pages to javafx.fxml;
}