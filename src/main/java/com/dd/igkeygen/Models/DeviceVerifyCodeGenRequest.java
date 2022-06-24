package com.dd.igkeygen.Models;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DeviceVerifyCodeGenRequest {
    private String email;
    private String time;
}
