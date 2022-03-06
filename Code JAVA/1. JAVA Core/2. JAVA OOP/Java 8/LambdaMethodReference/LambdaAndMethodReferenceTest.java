package LambdaMethodReference;
import java.util.*;

@FunctionalInterface
interface Message {
    public void getInfo(String message);
}

public class LambdaAndMethodReferenceTest {
    public static void main(String[] args) {
        // Lambda expression
        Message lamb_msg = (String message) -> {
            System.out.println(message);
        };
        lamb_msg.getInfo("Result from lambda expression");

        // Method reference
        Message method_ref_msg = System.out::println;
        method_ref_msg.getInfo("Result from Method reference");

        List<Integer> arrL = new ArrayList<Integer>();
        arrL.add(1);
        arrL.add(2);
        arrL.add(3);
        arrL.add(4);

        arrL.forEach(n -> System.out.println(n));

    }
}
