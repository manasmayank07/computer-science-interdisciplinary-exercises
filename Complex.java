public class Complex {
    private final double re;   // Real part
    private final double im;   // Imaginary part

    public Complex(double real, double imag) {
        this.re = real;
        this.im = imag;
    }

    public Complex plus(Complex b) {
        return new Complex(this.re + b.re, this.im + b.im);
    }

    public Complex minus(Complex b) {
        return new Complex(this.re - b.re, this.im - b.im);
    }

    public Complex times(Complex b) {
        double real = this.re * b.re - this.im * b.im;
        double imag = this.re * b.im + this.im * b.re;
        return new Complex(real, imag);
    }

    public Complex dividedBy(Complex b) {
        double denom = b.re * b.re + b.im * b.im;
        return this.times(new Complex(b.re, -b.im)).scale(1 / denom);
    }

    public Complex scale(double alpha) {
        return new Complex(alpha * re, alpha * im);
    }

    public Complex pow(int n) {
        Complex z = this;
        Complex result = new Complex(1, 0);
        for (int i = 0; i < n; i++) {
            result = result.times(z);
        }
        return result;
    }

    public double abs() {
        return Math.hypot(re, im);
    }

    public String toString() {
        return re + " + " + im + "i";
    }
}
