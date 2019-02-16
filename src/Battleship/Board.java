package Battleship;

import javafx.scene.canvas.Canvas;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

class Board extends Pane {

    private Canvas canvas;

    public Board() {

        this.canvas = new Canvas(Integer.parseInt(Settings.getInstance().GetSize()[0]), Integer.parseInt(Settings.getInstance().GetSize()[1]));
        this.getChildren().add(this.canvas);
        // Set the background image
        this.setStyle(Settings.getInstance().backGround);
        //Calls BoardBuilder to populate the board
        new BoardBuilder(this);

    }

    public int getH(){return (int)this.canvas.getHeight(); }

    public int getW(){return (int)this.canvas.getWidth(); }

    }
