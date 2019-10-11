class Triangle {

    double getLenght2(Segment segment) {
        return Math.sqrt((segment.getPointA().getX() - segment.getPointB().getX())
                * (segment.getPointA().getX() - segment.getPointB().getX())
                + (segment.getPointA().getY() - segment.getPointB().getY())
                * (segment.getPointA().getY() - segment.getPointB().getY()));
    }

    boolean triangle(Point point1, Point point2, Point point3) {
        if ((point1.getY() - point2.getY()) * (point3.getX() - point2.getX())
                - (point3.getY() - point2.getY()) * (point1.getX() - point2.getX()) == 0) {
            return false;
        } else {
            return true;
        }
    }
}