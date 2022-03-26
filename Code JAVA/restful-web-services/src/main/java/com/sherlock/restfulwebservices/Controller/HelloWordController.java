package com.sherlock.restfulwebservices.Controller;

import com.sherlock.restfulwebservices.Entity.HelloWorldBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWordController {
    // using get method and hello world as URI
    /*
    URI là viết tắt của Uniform Resource Identifier – Nhận diện tài nguyên thống nhất, URI là một chuỗi ký tự
    được sử dụng để nhận diện các tài nguyên, chuỗi ký tự này có thể là một định vị tài nguyên hoặc
    một định danh tài nguyên hoặc cả hai.
    Tài nguyên ở đây là tài nguyên mạng như các siêu văn bản, file hình ảnh, file âm thanh, file video…
    */

    @RequestMapping("/hello-world")
//    @GetMapping(path = "/hello-world")
    public String helloWorld() {
        return "Hello World";
    }

    @GetMapping(path = "/hello-world-bean")
    public HelloWorldBean helloWorldBean() {
        return new HelloWorldBean("Hello World Bean");
    }
}
