package com.open.free.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lcssx on 8/29/2017.
 */
@RestController
@RefreshScope
public class SampleController {

    @Value("${config.test}")
    private String configValue;

    @RequestMapping("/conf")
    public String getConfigValue(){
        return configValue;
    }
}
