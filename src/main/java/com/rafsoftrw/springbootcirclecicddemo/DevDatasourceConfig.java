package com.rafsoftrw.springbootcirclecicddemo;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("dev")
public class DevDatasourceConfig implements DatasourceConfig {
    @Override
    public String setup() {
        return "Setting datasource for dev environment";
    }
}
