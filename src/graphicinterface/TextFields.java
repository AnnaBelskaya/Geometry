package graphicinterface;

import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;


public class TextFields {
    private Pane root;
    double x, y, maxW;
    TextField tf = new TextField();

    public TextFields(Pane root, double x, double y, double maxW){
        this.x = x;
        this.y = y;
        this.maxW = maxW;
        this.root = root;
        createTextField();
    }

    public void createTextField(){
        tf.setTranslateX(x);
        tf.setTranslateY(y);
        tf.setMaxWidth(maxW);
        root.getChildren().add(tf);
    }

    public String getInput(){
        return tf.getText();
    }
}
