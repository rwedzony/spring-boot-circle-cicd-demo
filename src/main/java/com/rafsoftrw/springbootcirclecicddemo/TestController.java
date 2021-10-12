package com.rafsoftrw.springbootcirclecicddemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class TestController {

    DatasourceConfig datasourceConfig;

    public TestController(DatasourceConfig datasourceConfig) {
        this.datasourceConfig = datasourceConfig;
    }

    @GetMapping("/")
    public String test(){
        return datasourceConfig.setup();
    }
}
