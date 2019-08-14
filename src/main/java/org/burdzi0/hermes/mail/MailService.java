package org.burdzi0.hermes.mail;

import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class MailService {

	private JavaMailSender config;

	public MailService(JavaMailSender config) {
		this.config = config;
	}

	// TODO send mail to recipent
}
