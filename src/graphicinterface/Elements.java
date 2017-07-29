package graphicinterface;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
import javafx.scene.layout.Pane;

public class Elements {
    private Pane root;

    public Elements(Pane root){
        this.root = root;
    }

    public void addLabels(){
        Label label = new Label("Depth:");
        label.setTranslateX(10);
        label.setTranslateY(10);
        label.setMinWidth(40);
        Label label2 = new Label("Percent:");
        label2.setTranslateX(10);
        label2.setTranslateY(40);
        label2.setMinWidth(40);
        root.getChildren().addAll(label, label2);
    }

    public void addSeparator(double x) {
        Separator separator = new Separator();
        separator.setMinWidth(100);
        separator.setTranslateY(x);
        root.getChildren().add(separator);
    }

    public Button addButton(String text, double x, double y,
                          double minW, double minH){
        Button button = new Button(text);
        button.setTranslateX(x);
        button.setTranslateY(y);
        button.setMinWidth(minW);
        button.setMinHeight(minH);
        root.getChildren().add(button);
        return button;
    }
}
