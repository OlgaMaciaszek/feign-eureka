package demo.clients;

import java.beans.ConstructorProperties;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * @author Olga Maciaszek-Sharma
 */
@FeignClient(value = "HelloServer")
public interface HelloClient {

	@RequestMapping(value = "/", method = GET)
	String hello();

	@GetMapping("/play-value")
	PlayResponseValue playValue();

	class PlayResponseValue {
		private final String result;

		@ConstructorProperties("result")
		public PlayResponseValue(String result) {
			this.result = result;
		}

		public String getResult() {
			return this.result;
		}
	}
}
