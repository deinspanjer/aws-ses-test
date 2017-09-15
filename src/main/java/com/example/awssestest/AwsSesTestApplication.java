package com.example.awssestest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.mail.MailSender;

@SpringBootApplication
public class AwsSesTestApplication {

	private final MailSender mailSender;

	@Autowired public AwsSesTestApplication(MailSender mailSender) {
		this.mailSender = mailSender;
	}
	public static void main(String[] args) {
		SpringApplication.run(AwsSesTestApplication.class, args);
	}
}
