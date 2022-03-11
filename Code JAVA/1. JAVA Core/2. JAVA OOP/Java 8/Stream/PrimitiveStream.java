package Stream;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class PrimitiveStream {
    public static void main(String[] args) {
        /*
        Stream API chỉ làm việc với các object. Vì vậy để tạo Stream cho các dữ liệu
        nguyên thủy ta cần sử dụng các Stream cụ thể cho từng dữ liệu cụ thể như:
        - IntStream
        - DoubleStream
        - LongStream
        - ...
        */

        IntStream.range(1, 4).forEach(System.out::println);
        DoubleStream.of(1,2,3).forEach(System.out::println);
    }
}
