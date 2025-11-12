package by.pirog.controller;

import by.pirog.service.HelloService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/hello")
@RequiredArgsConstructor
public class HelloController {


    private final HelloService helloService;

    @GetMapping
    public String sayHello(@RequestParam(required = false) String name) {
        return helloService.sayHello(name);
    }
}
