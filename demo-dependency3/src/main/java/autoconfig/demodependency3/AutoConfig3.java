package autoconfig.demodependency3;

import autoconfig.Component;
import demodependency3.ExclamationService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration(AutoConfig3.COMPONENT_NAME)
@ComponentScan(basePackageClasses = ExclamationService.class)
public class AutoConfig3 {

    static final String COMPONENT_NAME = "demodependency3";

    @Bean(name = "component-" + COMPONENT_NAME)
    public Component component() {
        return new Component(COMPONENT_NAME);
    }
}
