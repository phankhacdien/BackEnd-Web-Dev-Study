package Exercise11;

public class Main {
    public static void main(String[] args) {
        Complex A = new Complex(2,1);
        Complex B = new Complex(3,-2);
        A.showComplex();

        Complex C;
        C = Complex.add(A,B);
        C.showComplex();
    }
}
