package geometry.figures;

import geometry.basic.Line;
import geometry.basic.Point;
import javafx.scene.layout.Pane;

public class Fractal {
    Pane root;
    private int depth;
    private double percent;
    private Triangle[] fractal;
    private Point p1, p2, p3;

    public Fractal(Pane root, int depth, float percent,
                   Triangle triangle){
        this.root = root;
        setDepth(depth);
        fractal[0] = triangle;
        this.percent = percent;
        this.p1 = triangle.getP1();
        this.p2 = triangle.getP2();
        this.p3 = triangle.getP3();
    }

    public void draw(Pane root){
        draw();
        for (int i = 0; i < depth; i++){
            fractal[i].draw(root);
        }
    }
    private void draw(){
        for (int i = 1; i < depth; i++) {
            Point mP1 = new Line(p1, p2).getPointOnLine(percent);
            Point mP2 = new Line(p2, p3).getPointOnLine(percent);
            Point mP3 = new Line(p3, p1).getPointOnLine(percent);
            p1 = mP1;
            p2 = mP2;
            p3 = mP3;
            fractal[i] = new Triangle(p1, p2, p3);
        }
    }

    public void clear(){
        for (int i = 0; i < depth; i++){
            fractal[i].clear(root);
        }
    }

    private void setDepth(int depth){
        this.depth = depth;
        fractal = new Triangle[depth];
    }
}
