public class Point {
    private final double x;
    private final double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distanceTo(Point q) {
        double dx = this.x - q.x;
        double dy = this.y - q.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    public static void main(String[] args) {
        Point p = new Point(0.0, 0.0);
        Point q = new Point(3.0, 4.0);
        StdOut.println("Distance: " + p.distanceTo(q));
    }
}
