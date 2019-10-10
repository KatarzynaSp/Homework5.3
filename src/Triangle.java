class Triangle {
    double tolerance = 0.01;

    double getLenght2(Segment segment) {
        return Math.sqrt((segment.pointA.x - segment.pointB.x) * (segment.pointA.x - segment.pointB.x)
                + (segment.pointA.y - segment.pointB.y) * (segment.pointA.y - segment.pointB.y));
    }

    boolean triangle(Point point1, Point point2, Point point3) {
        if (Math.abs((point1.y - point2.y) * (point3.x - point2.x) - (point3.y - point2.y) * (point1.x - point2.x)) < tolerance) {
            return false;
        } else {
            return true;
        }
    }
}