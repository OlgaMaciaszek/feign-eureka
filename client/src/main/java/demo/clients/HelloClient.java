package demo.clients;

import demo.config.CustomConfig;
import demo.dto.InputDto;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * @author Olga Maciaszek-Sharma
 */
@FeignClient(value = "HelloServer", configuration = CustomConfig.class)
public interface HelloClient {

	@RequestMapping(value = "/", method = GET)
	String hello();

	@PostMapping("/date")
	ResponseEntity<InputDto> date(@RequestBody InputDto searchDto);

}
