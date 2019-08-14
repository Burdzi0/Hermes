package org.burdzi0.hermes.config.mail;

import org.burdzi0.hermes.mail.MailProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;

@Configuration
public class MailConfig {

	private MailProperties properties;

	public MailConfig(MailProperties properties) {
		this.properties = properties;
	}

	@Bean
	public JavaMailSender sender() {
		JavaMailSenderImpl sender = new JavaMailSenderImpl();

		sender.setHost(properties.getHost());
		sender.setPort(properties.getPort());
		sender.setPassword(properties.getPassword());
		sender.setUsername(properties.getUsername());

		return sender;
	}
}
