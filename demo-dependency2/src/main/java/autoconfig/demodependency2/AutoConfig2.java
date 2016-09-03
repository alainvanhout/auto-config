package autoconfig.demodependency2;

import autoconfig.Component;
import demodependency2.WorldService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration(AutoConfig2.COMPONENT_NAME)
@ComponentScan(basePackageClasses = WorldService.class)
public class AutoConfig2 {

    static final String COMPONENT_NAME = "demodependency2";

    @Bean(name = "component-" + COMPONENT_NAME)
    public Component component() {
        return new Component(COMPONENT_NAME);
    }
}
