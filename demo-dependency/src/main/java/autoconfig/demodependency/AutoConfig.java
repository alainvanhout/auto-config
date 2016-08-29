package autoconfig.demodependency;

import demodependency.Config;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(value = Config.class)
public class AutoConfig {
}
