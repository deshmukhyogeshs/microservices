package com.rabbitmq;

import org.springframework.amqp.core.Exchange;
import org.springframework.amqp.core.ExchangeBuilder;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
public class RabbitMQExchangeConfiguration {

	@Bean
	Exchange exampleExchange() {
		return new TopicExchange("ExampleExchange");
	}

	@Bean
	Exchange example2Exchange() {
		return ExchangeBuilder.directExchange("Example2Exchange").autoDelete().internal().build();
	}

	@Bean
	Exchange newExcahnge() {
		return ExchangeBuilder.topicExchange("TopicExchange").autoDelete().internal().durable(true).build();
	}

	@Bean
	Exchange fanOutExchange() {
		return ExchangeBuilder.fanoutExchange("FanOutExchange").autoDelete().durable(true).build();
	}

	@Bean
	Exchange headerExchange() {
		return ExchangeBuilder.headersExchange("HeaderExcahnge").autoDelete().durable(true).build();
	}
}
