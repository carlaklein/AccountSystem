package za.ac.nwu.ac.web.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import za.ac.nwu.ac.logic.config.LogicConfig;

@Import({LogicConfig.class})
@Configuration
@ComponentScan(basePackages = {
        "za.ac.nwu.ac.web.controller",
        "za.ac.nwu.ac.web.exception"})

public class WebConfig {
}