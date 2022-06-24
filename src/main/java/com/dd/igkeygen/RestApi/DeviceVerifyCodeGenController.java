package com.dd.igkeygen.RestApi;

import com.dd.igkeygen.Business.Abstract.IDeviceVerifyCodeGenService;
import com.dd.igkeygen.Models.DeviceVerifyCodeGenRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("/verify")
public class DeviceVerifyCodeGenController {
    private final IDeviceVerifyCodeGenService iDeviceVerifyCodeGenService;

    @Autowired
    public DeviceVerifyCodeGenController(IDeviceVerifyCodeGenService iDeviceVerifyCodeGenService) {
        this.iDeviceVerifyCodeGenService = iDeviceVerifyCodeGenService;
    }

    @PostMapping
    public String generateB64(@RequestBody DeviceVerifyCodeGenRequest request) throws IOException {
        return this.iDeviceVerifyCodeGenService.generateB64(request.getEmail(), request.getTime());
    }
}
