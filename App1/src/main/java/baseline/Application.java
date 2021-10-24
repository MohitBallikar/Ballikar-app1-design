/*
 *  UCF COP3330 Fall 2021 Application Assignment 1 Solution
 *  Copyright 2021 Mohit Ballikar
 */
package baseline;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;



public class Application extends javafx.application.Application {
@Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("Application.fxml"));

        Scene scene  = new Scene(root);
        stage.setTitle("To Do List");
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }



}


/*
Call helper functions
Define the list of 256 unique items
Title of List must be at least 3 characters long
Need to allow for the user to expand and create a new to do list
Edits need to be possible
Filtration of the list must also be there
 */