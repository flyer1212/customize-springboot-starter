package com.demo.starter.config;

import com.demo.starter.properties.DemoDBProperties;
import com.demo.starter.service.DemoDBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(DemoDBProperties.class)
// 这个注解让我们在yml里面配置文件中控制这个配置是否生效
@ConditionalOnProperty(prefix = "mydb", name = "isopen", havingValue = "true")
public class DemoDBConfig {

    @Autowired
    private DemoDBProperties dbp;

    @Bean(name = "demo")
    public DemoDBService demoDBService() {
        return new DemoDBService(dbp.getUrl(), dbp.getName(), dbp.getPassword());
    }
}
