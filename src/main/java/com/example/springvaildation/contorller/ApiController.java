package com.example.springvaildation.contorller;

import com.example.springvaildation.dto.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/api")
public class ApiController {

    @PostMapping("/user")
    public ResponseEntity user(@Valid @RequestBody User user){
        System.out.println("user = " + user);

        return ResponseEntity.ok(user);
        //return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(user);
    }
}
