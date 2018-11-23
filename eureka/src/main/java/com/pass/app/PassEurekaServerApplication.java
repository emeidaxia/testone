package com.pass.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@SpringBootApplication
@EnableEurekaServer
public class PassEurekaServerApplication {
//	private static Logger log = LogManager.getLogger("kafkaLog");

	public static void main(String[] args) {
		//log.info(m.hello());
	//	log.info("the number"+String.valueOf(666));
		SpringApplication.run(PassEurekaServerApplication.class, args);
	}
}
