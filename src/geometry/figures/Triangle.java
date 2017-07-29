package geometry.figures;

import geometry.basic.Line;
import geometry.basic.Point;
import javafx.scene.layout.Pane;

public class Triangle {
    private Point p1, p2, p3;
    private Line l1;
    private Line l2;
    private Line l3;

    public Triangle(Point p1, Point p2, Point p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public void draw(Pane root) {
        try {
            if (l1 == null || l2 == null || l3 == null) {
                l1 = new Line(p1, p2);
                l2 = new Line(p2, p3);
                l3 = new Line(p3, p1);
            }
            l1.draw(root);
            l2.draw(root);
            l3.draw(root);
        } catch (IllegalArgumentException e) {
        }
    }

    public void clear(Pane root) {
        try {
            l1.clear(root);
            l2.clear(root);
            l3.clear(root);
            l1 = null;
            l2 = null;
            l3 = null;
        } catch (NullPointerException e) {
        }
    }

    public Point getP1() {
        return p1;
    }

    public Point getP2() {
        return p2;
    }

    public Point getP3() {
        return p3;
    }
}
