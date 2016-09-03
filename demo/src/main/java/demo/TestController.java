package demo;

import autoconfig.Component;
import demodependency.HelloService;
import demodependency2.WorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
public class TestController {

    @Autowired
    private HelloService helloService;

    @Autowired
    private WorldService worldService;

    @Autowired(required = false)
    private List<Component> components = Collections.emptyList();

    @RequestMapping
    public String hello() {
        return helloService.hello() + worldService.world();
    }

    @RequestMapping("components")
    public List<Component> components() {
        return components;
    }
}
