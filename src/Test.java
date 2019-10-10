class Test {
    public static void main(String[] args) {
        Point point1 = new Point(1.1, 0.7);
        Point point2 = new Point(2.3, 0.7);
        Point point3 = new Point(3, 0.7);

        Segment segment = new Segment(point1, point2);
        segment.getLenght();
        System.out.println(segment.lenght);

        Triangle triangle = new Triangle();
        triangle.getLenght2(segment);
        System.out.println(segment.lenght);

        boolean a = triangle.triangle(point1, point2, point3);
        System.out.println(a);
    }
}