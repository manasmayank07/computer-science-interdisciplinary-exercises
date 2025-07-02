import java.awt.Color;

public class NewtonChaos {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        Picture pic = new Picture(n, n);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                double re = 2.0 * i / n - 1.0; // from -1 to 1
                double im = 2.0 * j / n - 1.0; // from -1 to 1

                Complex z = new Complex(re, im);
                int iterations = 0;
                int maxIterations = 100;

                while (iterations < maxIterations) {
                    Complex f = z.pow(4).minus(new Complex(1, 0));
                    Complex fp = z.pow(3).scale(4);
                    if (fp.abs() == 0) break;

                    z = z.minus(f.dividedBy(fp));

                    if (isRoot(z, new Complex(1, 0))) break;
                    if (isRoot(z, new Complex(-1, 0))) break;
                    if (isRoot(z, new Complex(0, 1))) break;
                    if (isRoot(z, new Complex(0, -1))) break;

                    iterations++;
                }

                Color color = Color.BLACK;
                if (isRoot(z, new Complex(1, 0))) color = Color.WHITE;
                else if (isRoot(z, new Complex(-1, 0))) color = Color.RED;
                else if (isRoot(z, new Complex(0, 1))) color = Color.GREEN;
                else if (isRoot(z, new Complex(0, -1))) color = Color.BLUE;

                pic.set(i, n - 1 - j, color);
            }
        }

        pic.show();
    }

    private static boolean isRoot(Complex z, Complex root) {
        return z.minus(root).abs() < 0.001;
    }
}
