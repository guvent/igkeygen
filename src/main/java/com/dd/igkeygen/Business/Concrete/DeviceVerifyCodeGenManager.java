package com.dd.igkeygen.Business.Concrete;

import com.dd.igkeygen.Business.Abstract.IDeviceVerifyCodeGenService;
import org.springframework.stereotype.Service;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.Base64;


@Service
public class DeviceVerifyCodeGenManager implements IDeviceVerifyCodeGenService {

    @Override
    public String generateB64(String email, String timestamp) throws IOException {
        byte[] r2 = new byte[24];
        StringBuilder r3 = new StringBuilder();
        SecureRandom secureRandom = new SecureRandom();

        r3.append(email);
        r3.append("|");
        r3.append(timestamp);
        r3.append("|");

        secureRandom.nextBytes(r2);

        ByteArrayOutputStream r1 = new ByteArrayOutputStream();
        r1.write(r3.toString().getBytes());
        r1.write(r2);

        byte[] out = r1.toByteArray();

        return Base64.getEncoder().encodeToString(out);
    }
}
