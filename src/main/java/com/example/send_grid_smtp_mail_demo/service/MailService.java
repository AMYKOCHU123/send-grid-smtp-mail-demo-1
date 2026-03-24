package com.example.send_grid_smtp_mail_demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class MailService {

    @Autowired
    private JavaMailSender mailSender;

    public void sendDummyMail() {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("amal.chempazhanthy@gmail.com");
        message.setTo("j.r.n.9899@gmail.com");
        message.setSubject("Test Mail from Spring Boot using SendGrid SMTP");
        message.setText("Hello, this is a dummy email sent from Spring Boot using SendGrid SMTP.");

        mailSender.send(message);
    }
}