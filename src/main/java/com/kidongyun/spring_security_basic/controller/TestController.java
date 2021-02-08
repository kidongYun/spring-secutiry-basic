package com.kidongyun.spring_security_basic.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/test1")
    public ResponseEntity<?> test1() {
        try {
            /* test1 API 관련된 비즈니스 로직 구현 */
            return ResponseEntity.status(HttpStatus.OK).body(HttpStatus.OK.getReasonPhrase());
        } catch(Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(HttpStatus.INTERNAL_SERVER_ERROR.getReasonPhrase());
        }
    }

    @GetMapping("/test2")
    public ResponseEntity<?> test2() {
        try {
            /* test2 API 관련된 비즈니스 로직 구현 */
            return ResponseEntity.status(HttpStatus.OK).body(HttpStatus.OK.getReasonPhrase());
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(HttpStatus.INTERNAL_SERVER_ERROR.getReasonPhrase());
        }
    }

    @GetMapping("/test3")
    public ResponseEntity<?> test3() {
        try {
            /* test3 API 관련된 비즈니스 로직 구현 */
            return ResponseEntity.status(HttpStatus.OK).body(HttpStatus.OK.getReasonPhrase());
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(HttpStatus.INTERNAL_SERVER_ERROR.getReasonPhrase());
        }
    }
}
