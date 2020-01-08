/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package testapp;

import java.awt.Color;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author Projectpc-16
 */
public class TestApp extends Application {
        
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        
        Button btn = new Button("Click here.");
        
        GridPane gridPane = new GridPane();
        gridPane.setAlignment(Pos.CENTER);
        
        Text username = new Text();
        username.setText("Username ");
        gridPane.add(username, 0, 0);
        
        final TextField usernameField = new TextField();
        gridPane.add(usernameField, 1, 0);
        
        Text password = new Text();
        password.setText("Password ");
        gridPane.add(password, 0, 1);
        
        final TextField passwordField = new TextField();
        gridPane.add(passwordField, 1, 1);
        
        final TextArea area = new TextArea();
        gridPane.add(area, 1, 5);
        
        
        btn.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent t) {
                System.out.println(usernameField.getText() + "\n" + passwordField.getText());
                area.setText(usernameField.getText() + "\n" + passwordField.getText());
            }
        });
        
        gridPane.add(btn, 1, 3);
        
        
        Scene scene = new Scene(gridPane);
        stage.setScene(scene);
        stage.setMinHeight(1000);
        stage.setMinWidth(1000);
        stage.show();
    }    
}
