package autoconfig.demodependency;

import autoconfig.Component;
import demodependency.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration(AutoConfig.COMPONENT_NAME)
@ComponentScan(basePackageClasses = HelloService.class)
public class AutoConfig {

    public static final String COMPONENT_NAME = "demodependency";

    @Bean(name = "component-" + COMPONENT_NAME)
    public Component component() {
        return new Component(COMPONENT_NAME);
    }
}
