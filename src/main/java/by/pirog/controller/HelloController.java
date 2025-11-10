package by.pirog.controller;

import by.pirog.service.HelloService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController("api/hello")
@RequiredArgsConstructor
public class HelloController {


    private final HelloService helloService;

    @GetMapping("{username}")
    public String sayHello(@PathVariable String username) {
        return helloService.sayHello(username);
    }
}
