package com.kidongyun.spring_security_basic.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class SignIn {
    private String email;
    private String password;
}
