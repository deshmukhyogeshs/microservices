package com.rabbitmq;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class RabbitMqApplication implements CommandLineRunner {

	@Autowired
	private RabbitTemplate rabbitTemplate;

	@Autowired
	SimpleMessage message;

	@Bean
	MessageConverter messageConverter() {
		return new Jackson2JsonMessageConverter();
	}

	public static void main(String[] args) {
		SpringApplication.run(RabbitMqApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		message.setCity("Pune");
		message.setName("YSD");

		// rabbitTemplate.convertAndSend("TestExchange", "testRouting", message);
		rabbitTemplate.convertAndSend("MyTopicExchange", "topic", message);
	}

}
