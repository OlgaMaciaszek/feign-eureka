package demo;

import java.util.Date;

import demo.clients.HelloClient;
import demo.dto.InputDto;
import jakarta.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Spencer Gibb
 */
@SpringBootApplication
@EnableDiscoveryClient
@RestController
@EnableFeignClients
public class HelloClientApplication {

	@Autowired
	HelloClient client;

	@RequestMapping("/")
	public String hello() {
		return client.hello("Test");
	}

	@GetMapping("/date")
	public ResponseEntity<InputDto> date() {
		return client.date(new InputDto(new Date(), new Date()));
	}

	public static void main(String[] args) {
		SpringApplication.run(HelloClientApplication.class, args);
	}

}
