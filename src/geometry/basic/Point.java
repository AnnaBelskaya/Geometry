package geometry.basic;

public class Point {
    private double x,y;
    public static Point ZERO = new Point(0,0);

    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double calcLength(Point otherPoint){
        return Math.sqrt(Math.pow(x - otherPoint.x, 2)
                + Math.pow(y - otherPoint.y,2));
    }

    public double calcLength(){
        return Math.sqrt(Math.pow(x, 2)
                + Math.pow(y,2));
    }

    public Point normalize(){
        return new Point(x/calcLength(),
                y/calcLength());
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}
