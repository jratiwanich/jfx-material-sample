package org.dolosplus.example.material;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MainLauncher extends Application{

    public static void main(String[] args){
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/view/desktop.fxml"));
            Scene scene = new Scene(root);
            scene.getStylesheets().add(MainLauncher.class.getResource("/css/jfoenix-components.css").toExternalForm());
            scene.getStylesheets().add(MainLauncher.class.getResource("/css/jfoenix-main-demo.css").toExternalForm());
            stage.setScene(scene);

            stage.show();
        }catch(IOException e){
            System.out.println("ERROR:"+ e.getMessage());
        }
    }

}
