package ro.mta.facc.selab.tema2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import ro.mta.facc.selab.tema2.controller.MeteoController;

import java.io.IOException;

public class Main extends Application {
    public static void main(String[] args){
        launch(args);
    }

    @Override
    public void start(Stage primaryStage){
        FXMLLoader loader = new FXMLLoader();
        try{
            loader.setLocation(this.getClass().getResource("/View/MeteoView.fxml"));
            primaryStage.setScene(new Scene(loader.load()));
            primaryStage.show();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}