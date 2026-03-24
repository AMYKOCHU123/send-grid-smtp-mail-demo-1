package com.example.send_grid_smtp_mail_demo.controller;

import com.example.send_grid_smtp_mail_demo.service.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MailController {

    @Autowired
    private MailService mailService;

    @GetMapping("/send-mail")
    public String sendMail() {
        mailService.sendDummyMail();
        return "Dummy mail sent successfully";
    }
}