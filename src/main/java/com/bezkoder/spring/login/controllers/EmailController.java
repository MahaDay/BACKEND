package com.bezkoder.spring.login.controllers;

import com.bezkoder.spring.login.models.EmailDetails;
import com.bezkoder.spring.login.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class EmailController {

    @Autowired
    private EmailService emailService;

    // Sending a simple Email
    @PostMapping("/sendMail")
    public String
    sendMail(@RequestBody EmailDetails details)
    {
        String status
                = emailService.sendSimpleMail(details);

        return status;
    }

    // Sending email with attachment

}
