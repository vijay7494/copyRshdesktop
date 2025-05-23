package com.copyrush.pages; // Ensure this matches your folder structure

import javafx.event.ActionEvent; // Import for handling button clicks
import javafx.fxml.FXML;         // Import for FXML annotations

// This class controls the 'filesReview.fxml' user interface
public class FilesReviewController {

    // This method is called when the "Print" button is clicked
    @FXML // Indicates that this method is linked to an FXML element's action
    private void handlePrintButtonAction(ActionEvent event) {
        System.out.println("Print button clicked!");
        // Add your printing logic here
        // For now, it just prints to the console
    }

    // You can add an initialize() method here if you need to do something
    // when the FXML is loaded and the controller is initialized.
    // @FXML
    // private void initialize() {
    //     System.out.println("FilesReviewController initialized!");
    // }
}