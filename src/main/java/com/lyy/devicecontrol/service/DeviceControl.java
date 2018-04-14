package com.lyy.devicecontrol.service;

public interface DeviceControl {
    public String sendCMD(String cmds);

    public String sendCMS(String cms,String deviceId);
}
