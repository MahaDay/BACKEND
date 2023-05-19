package com.bezkoder.spring.login.models;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;

@Configuration
public class MailConfig {
    @Bean
    public JavaMailSender javaMailSender() {
        JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
        mailSender.setHost("imap.gmail.com");
        mailSender.setPort(587);
        mailSender.setUsername("daymaha2020@gmail.com");
        mailSender.setPassword("fqcckguntlawxcxe");
        // Additional configuration if needed
        return mailSender;
    }
}
