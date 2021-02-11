package com.kidongyun.spring_security_basic.controller;

import com.kidongyun.spring_security_basic.dto.SignIn;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sign")
public class SignController {
    @PostMapping("in")
    public ResponseEntity<?> signIn(@RequestBody SignIn in) throws Exception {
        return ResponseEntity.status(HttpStatus.OK).body(HttpStatus.OK.getReasonPhrase());
    }
}
