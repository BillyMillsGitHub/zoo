package com.example.application.Controller;

import org.springframework.http.HttpStatus;

public class ResponseStatusExcpetion extends Throwable {
    public ResponseStatusExcpetion(HttpStatus httpStatus, String s) {
    }
}
