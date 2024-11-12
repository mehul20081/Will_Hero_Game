package com.example.helloapplication;

import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

public class gameoverwindow {
    @FXML
    private Pane gameover;

    @FXML
    private Button quitbutton;

    @FXML
    private Button finalexit;

    @FXML
    private Button restart1;

    @FXML
    private Button quitno;

    @FXML
    private Pane quitpane;

    @FXML
    private Button load;

    @FXML
    private ImageView goimg;

    @FXML
    private ImageView goimg1;

    public gameoverwindow(Scene scene){
        gameover = (Pane) scene.lookup("#gameover");
        quitpane = (Pane) scene.lookup("#quitpane");
        quitbutton = (Button) scene.lookup("#quitbutton");
        restart1 = (Button) scene.lookup("#restart1");
        quitno = (Button) scene.lookup("#quitno");
        finalexit = (Button) scene.lookup("#finalexit");
        load = (Button) scene.lookup("#load");
        goimg = (ImageView) scene.lookup("#goimg");
        goimg1 = (ImageView) scene.lookup("#goimg1");
    }

    public Pane getGameover() {
        return gameover;
    }
    public ImageView getGoimg(){
        return goimg;
    }
    public ImageView getGoimg1(){
        return goimg1;
    }

    public Button getQuitbutton() {
        return quitbutton;
    }

    public Button getRestart1() {
        return restart1;
    }

    public Button getLoad() {
        return load;
    }

    public Button getQuitno() {
        return quitno;
    }

    public Button getFinalexit() {
        return finalexit;
    }

    public Pane getQuitpane() {
        return quitpane;
    }
    public void quitpanevisible(){
        quitpane.setVisible(true);
    }


    public void quitpaneinvisible(){
        quitpane.setVisible(false);
    }
    public void gameoverpanevisible(){
        gameover.setVisible(true);
    }
    public void gameoverpaneinvisible(){
        gameover.setVisible(false);
    }
}