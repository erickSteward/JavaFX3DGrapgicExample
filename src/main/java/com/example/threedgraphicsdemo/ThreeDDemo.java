package com.example.threedgraphicsdemo;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.PerspectiveCamera;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.Box;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;

public class ThreeDDemo extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Box box = new Box(100, 100, 100);
        PhongMaterial material = new PhongMaterial();
        material.setDiffuseColor(Color.BLUE);
        box.setMaterial(material);

        Group root = new Group(box);
        Scene scene = new Scene(root, 300, 300, true);

        PerspectiveCamera camera = new PerspectiveCamera(true);
        camera.setTranslateZ(-400);
        scene.setCamera(camera);

        Rotate rotateX = new Rotate(30, Rotate.X_AXIS);
        Rotate rotateY = new Rotate(30, Rotate.Y_AXIS);
        box.getTransforms().addAll(rotateX, rotateY);

        stage.setTitle("3D Demo Example");
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
