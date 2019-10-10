class Point {
    double x;
    double y;

    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    boolean isQuarter1() {
        return x > 0 && y > 0;
    }

    boolean isQuarter2() {
        return x < 0 && y > 0;
    }

    boolean isQuarter3() {
        return x < 0 && y < 0;
    }

    boolean isQuarter4() {
        return x > 0 && y < 0;
    }

    boolean isAxisX() {
        return y == 0;
    }

    boolean isAxisY() {
        return x == 0;
    }

    boolean isAZero() {
        return x == 0 && y == 0;
    }
}