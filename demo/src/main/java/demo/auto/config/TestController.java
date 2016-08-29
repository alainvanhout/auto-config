package demo.auto.config;

import demodependency.DemoDependencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private DemoDependencyService demoDependencyService;

    @RequestMapping("hello")
    public String hello() {
        return demoDependencyService.world();
    }
}
