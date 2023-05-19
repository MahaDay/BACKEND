package com.bezkoder.spring.login.service;


import com.bezkoder.spring.login.models.EmailDetails;

public interface EmailService {
    String sendSimpleMail(EmailDetails details);

    // Method
    // To send an email with attachment
    String sendMailWithAttachment(EmailDetails details);
}
