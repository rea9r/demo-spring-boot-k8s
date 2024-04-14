package org.example.demospringbootk8s;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoSpringBootK8sApplication {

    @GetMapping("/hello")
    public String home() {
        return "Hello";
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoSpringBootK8sApplication.class, args);
    }

}
