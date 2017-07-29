package graphicinterface;

import geometry.basic.Point;
import geometry.figures.Fractal;
import geometry.figures.Triangle;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;

public class GUI {
    private final double WIDTH, HEIGHT;
    private Pane root = new Pane();

    private TextFields setDepth = new TextFields(root,60,10,100);
    private TextFields setPercents = new TextFields(root, 60,40,100);

    private Fractal fractal;

    private Triangle triangle = new Triangle(
            new Point(200, 200),
            new Point(100, 300),
            new Point(300, 300));

    public GUI(double width, double height) {
        WIDTH = width;
        HEIGHT = height;
    }

    public Pane createInterface() {
        Elements elements = new Elements(root);
        elements.addSeparator((HEIGHT / 3 - 50));
        elements.addSeparator(HEIGHT * (3.0 / 4.0));
        elements.addLabels();
        drawFractalButton();
        removeFractalsButton();
        return root;
    }

    private void drawFractalButton() {
        Button drawFractalButton = new Elements(root).addButton(
                "Draw fractal",60,80,100,10);
        drawFractalButton.setOnMouseClicked(event -> {
            try {
                if (fractal != null){
                    try {
                        fractal.clear();
                    } catch (NullPointerException e){ }
                    fractal = null;
                }
                fractal = setFractal();
                fractal.draw(root);
            } catch (NumberFormatException e) { }
        });
    }

    private void removeFractalsButton() {
        Button removeFractals = new Elements(root)
                .addButton("Clear screen",60,120,
                        100,10);
        removeFractals.setOnMouseClicked(event -> {
            try {
                fractal.clear();
            } catch (NullPointerException e){ }
        });
    }

    private Fractal setFractal(){
        return new Fractal(root, Integer.parseInt(setDepth.getInput()),
                Float.parseFloat(setPercents.getInput()), triangle);
    }
}