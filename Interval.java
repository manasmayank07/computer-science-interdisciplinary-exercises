public class Interval {
    private final double left;
    private final double right;

    public Interval(double left, double right) {
        this.left = left;
        this.right = right;
    }

    public boolean contains(double x) {
        return (x >= left) && (x <= right);
    }

    public boolean intersects(Interval b) {
        return this.right >= b.left && b.right >= this.left;
    }

    public String toString() {
        return "[" + left + ", " + right + "]";
    }

    public static void main(String[] args) {
        double x = Double.parseDouble(args[0]);
        while (!StdIn.isEmpty()) {
            double left = StdIn.readDouble();
            double right = StdIn.readDouble();
            Interval interval = new Interval(left, right);
            if (interval.contains(x)) {
                StdOut.println(interval);
            }
        }
    }
}
