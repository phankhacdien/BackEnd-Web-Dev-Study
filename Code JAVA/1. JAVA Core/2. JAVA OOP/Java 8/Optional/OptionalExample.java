package Optional;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        Person person = new Person();

        person.findByID(123);
        // cách xử lý thông thường
        //if (person != null) {
        //   System.out.println(person.getName());
        //}

        // cách xử lý với Optional Class
        // dùng ofNullable vì đối số person có thể null
        Optional<Person> optionalPerson = Optional.ofNullable(person);

        // ifPresent: kiểm tra đối tượng bên trong optional có khác null không
        optionalPerson.ifPresent(System.out::println);
    }
}
