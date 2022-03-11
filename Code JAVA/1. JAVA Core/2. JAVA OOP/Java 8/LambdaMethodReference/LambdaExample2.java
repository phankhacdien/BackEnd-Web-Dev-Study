package LambdaMethodReference;

import org.jetbrains.annotations.NotNull;

public class LambdaExample2 {
    @FunctionalInterface
    interface FuncInter1 {
        int operation(int a, int b);
    }

    @FunctionalInterface
    interface FuncInter2 {
        void sayMessage(String msg);
    }

    private int operate(int a, int b, @NotNull FuncInter1 fobj) {
        return fobj.operation(a, b);
    }

    public static void main(String[] args) {
        FuncInter1 add = (int x, int y)-> {
            return (x + y);
        };

        FuncInter1 multiply = (int x, int y) -> {
            return (x * y);
        };

        LambdaExample2 tobj = new LambdaExample2();

        System.out.println("Addition is "+ tobj.operate(1,2,add));
        System.out.println("Multiplication is "+ tobj.operate(1,2,multiply));

        FuncInter2 fobj = msg -> System.out.println("Hello " + msg);
        fobj.sayMessage("Dien");
    }
}
