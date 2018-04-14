package com.lyy.devicecontrol.service.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.lyy.devicecontrol.service.DeviceControl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CMSController {
    @Reference
    DeviceControl deviceControl;

    @RequestMapping("/cms")
    public String testCMS(){
        return deviceControl.sendCMD("dubbo");
    }
}
