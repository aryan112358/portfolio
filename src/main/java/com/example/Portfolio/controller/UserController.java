package com.example.Portfolio.controller;

import com.example.Portfolio.DTO.UserDTO;
import com.example.Portfolio.Service.userService;
import com.example.Portfolio.domain.User;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@Validated
public class UserController {

    private static final Logger logger= LoggerFactory.getLogger(UserController.class.getName());

    @Autowired
    RestTemplate restTemplate;

    @PostMapping( value = "/api/user", consumes = "application/json")
    public ResponseEntity<?> create(@RequestBody UserDTO userDTO){
        logger.debug("create Started()... ");
        logger.info("userDTO: "+userDTO);

        ResponseEntity<?> responseEntity;
        String msg = null;

        User user=new User();

        try{
            user = userService.createUser(userDTO);
        }
    }

}
