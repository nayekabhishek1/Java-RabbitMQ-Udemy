package com.nayek.rabbitmq.producer;

import com.nayek.rabbitmq.producer.service.HelloRabbitProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.util.concurrent.ThreadLocalRandom;

@EnableScheduling
@SpringBootApplication
public class Application implements CommandLineRunner {

	@Autowired
	private HelloRabbitProducer helloRabbitProducer;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		helloRabbitProducer.sendHello(String.valueOf(ThreadLocalRandom.current().nextInt()));
	}
}
