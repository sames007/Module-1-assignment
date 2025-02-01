package org.example.csc311_assignment01_gettingstarted;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class AppController {
    @FXML
    private Label welcomeText;

    // ToDo 01: add two text fields to the GUI so that the user can find the sum
    @FXML
    private TextField field1, field2;

    // ToDo 02: when the button is clicked show the output on the screen
    // ToDo 03: you should accept only the numeric values
    protected void calculateButtonClicked() {
        try {
            // Convert the text inputs to numbers
            double number1 = Double.parseDouble(field1.getText());
            double number2 = Double.parseDouble(field2.getText());

            // Calculate the sum and display the results
            double sum = number1 + number2;
            welcomeText.setText("Sum: " + sum);
        }
        catch (NumberFormatException e) {
            // To show error if the inputs are not numbers
            welcomeText.setText("Error: Numbers Only!");
        }
    }

    // ToDo 04: modify the CSS file to make the background of the application Lightblue and the button color red
    .body{
        background-color: lightblue;  // App background color
    }
    .button{
        background-color: red;        // Button color
    }

    // ToDo 05: commit changes and push back to the same repo


    @FXML
    protected void onCalculateButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}