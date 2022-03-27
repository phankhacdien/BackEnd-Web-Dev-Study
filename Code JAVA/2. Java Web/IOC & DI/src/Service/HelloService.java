package Service;

import Entity.HelloWorld;
import Entity.StructHelloWorld;

public class HelloService {
    private HelloWorld helloWorld;

    public HelloService(HelloWorld helloWorld) {
        this.helloWorld = new StructHelloWorld();
    }
}
