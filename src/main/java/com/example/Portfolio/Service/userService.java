package com.example.Portfolio.Service;

import com.example.Portfolio.DTO.UserDTO;
import com.example.Portfolio.controller.UserController;
import com.example.Portfolio.domain.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class userService {

    private static final Logger logger= LoggerFactory.getLogger(UserController.class.getName());

    public static User createUser(UserDTO userDTO) {
        logger.info("starting createUser()...");
        User user=new User();

        if(user!=null){
            user.setName(userDTO.getName());
            user.setContact(userDTO.getContact()!=null?userDTO.getContact():null);
            user.setDOB(userDTO.getDOB()!=null?userDTO.getDOB():null);
            user.setEducation(userDTO.getEducation()!=null?userDTO.getEducation():null);
            user.setProjects(userDTO.getProjects()!=null?userDTO.getProjects():null);
        }
        return user;
    }
}
