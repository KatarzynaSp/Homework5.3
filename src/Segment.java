class Segment {
    Point pointA;
    Point pointB;
    double lenght;

    Segment(Point A, Point B) {
        pointA = A;
        pointB = B;
    }

    double getLenght() {
        lenght = Math.sqrt((pointA.x - pointB.x) * (pointA.x - pointB.x) + (pointA.y - pointB.y) * (pointA.y - pointB.y));
        return lenght;
    }
}