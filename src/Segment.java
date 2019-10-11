class Segment {

    private Point pointA;
    private Point pointB;
    private double lenght;

    public Point getPointA() {
        return pointA;
    }

    public void setPointA(Point pointA) {
        this.pointA = pointA;
    }

    public Point getPointB() {
        return pointB;
    }

    public void setPointB(Point pointB) {
        this.pointB = pointB;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }

    Segment(Point A, Point B) {
        pointA = A;
        pointB = B;
    }

    double getLenght() {
        return Math.sqrt(((pointA.getX() - pointB.getX()) * (pointA.getX() - pointB.getX()) +
                (pointA.getY() - pointB.getY()) * (pointA.getY() - pointB.getY())));
    }
}