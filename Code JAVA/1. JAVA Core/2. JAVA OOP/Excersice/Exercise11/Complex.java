package Exercise11;

import org.jetbrains.annotations.NotNull;

public class Complex {
    private double real;
    private double imaginary;

    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    static public Complex add(@NotNull Complex A, @NotNull Complex B) {
        Complex rs = new Complex(0,0);
        rs.real = A.real + B.real;
        rs.imaginary = A.imaginary + B.imaginary;
        return rs;
    }

    static public Complex multiply(@NotNull Complex A, @NotNull Complex B) {
        Complex rs = new Complex(0,0);
        rs.real = (A.real * B.real - A.imaginary * B.imaginary);
        rs.imaginary = (A.real * B.imaginary + A.imaginary * B.real);
        return rs;
    }

    public void showComplex() {
        System.out.println(this.real+" + "+this.imaginary+"i");
    }
}
