package com.incyyte.cloud.miawebclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class MiawebClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(MiawebClientApplication.class, args);
	}
}




@RefreshScope
@RestController
class MessageRestController {
	@Value("${message:eeeee}")
	private String message;

	@RequestMapping("/message")
	String getMessage() {
		return this.message;
	}

}