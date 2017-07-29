package geometry.basic;

import javafx.scene.layout.Pane;

public class Line {
    private Point p1, p2;
    private javafx.scene.shape.Line lineFx;

    public Line(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }
    public double calcLength(){
        return new Point(p1.getX(),p1.getY())
                .calcLength(p2);
    }

    public Point getPointOnLine(double percent){
        double xM = (p1.getX() + percent*p2.getX())/
                (1+percent);
        double yM = (p1.getY() + percent*p2.getY())/
                (1+percent);
        return new Point(xM,yM);
    }


    public javafx.scene.shape.Line draw(Pane root){
        if (lineFx == null){
            lineFx = new javafx.scene.shape.Line();
        }
        lineFx.setStartX(p1.getX());
        lineFx.setStartY(p1.getY());
        lineFx.setEndX(p2.getX());
        lineFx.setEndY(p2.getY());
        root.getChildren().add(lineFx);
        return lineFx;
    }

    public void clear(Pane root) {
        root.getChildren().remove(lineFx);
        lineFx = null;
    }
}
