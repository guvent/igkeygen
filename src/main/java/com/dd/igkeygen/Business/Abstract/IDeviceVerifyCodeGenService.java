package com.dd.igkeygen.Business.Abstract;

import java.io.IOException;

public interface IDeviceVerifyCodeGenService {
    String generateB64(String email, String timestamp) throws IOException;
}
