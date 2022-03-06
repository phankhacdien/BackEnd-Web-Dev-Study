import java.util.*;

public class FibonacciExamples
{
    static int n1 = 0, n2 = 1, n3;
    static int i = 2;

    static void Fibonacci(int fib_max_length)
    {
        if(i < fib_max_length)
        {
            n3 = n1 + n2;
            System.out.println(n3);
            n1 = n2;
            n2 = n3;
            i++;
            Fibonacci(fib_max_length);
        }
    }

    public static void main(String[] args)
    {
        System.out.print("Enter the maximum number of Fibonacci you wanna see: ");
        Scanner scanner = new Scanner(System.in);
        int fib_max_length = Integer.valueOf(scanner.nextLine());

        System.out.println(n1 + "\n" + n2);
        Fibonacci(fib_max_length);
    }
}
