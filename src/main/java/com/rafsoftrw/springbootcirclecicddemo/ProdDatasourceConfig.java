package com.rafsoftrw.springbootcirclecicddemo;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("prod")
public class ProdDatasourceConfig implements DatasourceConfig{

    @Override
    public String setup() {
        return "Setting datasource for prod environment";
    }
}
