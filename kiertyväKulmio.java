package com.example.javafx_testi;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;


public class kiertyväKulmio extends Application {
    @Override
    public void start(Stage stage) {
        BorderPane paneeli = new BorderPane();
        HBox nappiboksi = new HBox();
        Rectangle rectangle = new Rectangle(100, 150, 200, 100);
        rectangle.setFill(Color.WHITE);
        rectangle.setStroke(Color.BLACK);
        paneeli.getChildren().add(rectangle);

        Button nappi = new Button();
        nappi.setText("Kierrä");
        nappiboksi.getChildren().add(nappi);
        nappiboksi.setStyle("-fx-border-color: green");
        nappiboksi.setAlignment(Pos.CENTER);
        nappi.setLayoutX(175);
        nappi.setLayoutY(370);

        paneeli.setBottom(nappiboksi);
        Rotate rotate = new Rotate();
        rotate.setAngle(0);
        rotate.setPivotX(200);
        rotate.setPivotY(150);
        rectangle.getTransforms().add(rotate);

        nappi.setOnAction(event -> rotate.setAngle(rotate.getAngle()+ 15));
        Scene scene = new Scene(paneeli, 400, 400);
        stage.setTitle("Kierrä suorakulmiota");
        stage.setScene(scene);
        stage.show();
    }

}
