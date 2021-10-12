package com.rafsoftrw.springbootcirclecicddemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootCircleCicdDemoApplication {

    private final DatasourceConfig datasourceConfig;

    public SpringBootCircleCicdDemoApplication(DatasourceConfig datasourceConfig) {
        this.datasourceConfig = datasourceConfig;
    }

    @RequestMapping("/")
    public String home(){
        return datasourceConfig.setup();
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringBootCircleCicdDemoApplication.class, args);
    }

}
