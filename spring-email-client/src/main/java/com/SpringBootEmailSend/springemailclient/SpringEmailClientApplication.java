package com.SpringBootEmailSend.springemailclient;

import jakarta.mail.MessagingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class SpringEmailClientApplication {

    @Autowired
    private EmailSenderService emailSenderService;

    public static void main(String[] args) {
        SpringApplication.run(SpringEmailClientApplication.class, args);
    }

//    @EventListener(ApplicationReadyEvent.class)
//    public void triggerMail() {
//        emailSenderService.sendSimpleEmail("emailspring0@gmail.com",
//                "this is the Body of Email Plz Check !!!!!!!",
//                "springLinkSender");
//    }
@EventListener(ApplicationReadyEvent.class)
	public void triggerMail() throws MessagingException {
		emailSenderService.sendEmailWithAttachment("emailspring0@gmail.com",
				"this is the Body of Email Plz Check also check attachment !!!!!!!",
				"MailWithAttachment",
				"C:\\Users\\unix\\Pictures\\123.jpg");
	}

}
