package demo.config;

import org.springframework.context.annotation.Bean;

/**
 * @author Olga Maciaszek-Sharma
 */
public class CustomConfig {

	@Bean
	CustomErrorDecoder errorDecoder(){
		return new CustomErrorDecoder();
	}
}
