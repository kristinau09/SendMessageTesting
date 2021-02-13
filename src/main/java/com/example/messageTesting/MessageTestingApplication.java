package com.example.messageTesting;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.jms.core.JmsTemplate;

@SpringBootApplication
public class MessageTestingApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(MessageTestingApplication.class, args);
		
		JmsTemplate jms = ctx.getBean(JmsTemplate.class);
		jms.convertAndSend("MyQueue", "My first text message to the messsage broker");
	}

}
