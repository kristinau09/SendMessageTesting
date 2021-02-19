package com.example.sendMessageTesting;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.jms.core.JmsTemplate;

@SpringBootApplication
public class SendMessageTestingApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(SendMessageTestingApplication.class, args);
		
		JmsTemplate jms = ctx.getBean(JmsTemplate.class);
		jms.convertAndSend("MyQueue", "Sending text message to the messsage broker from the MessageTestingApplication.java, congrats!!!!!");
	}

}
