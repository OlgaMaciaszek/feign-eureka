package demo.clients;

import java.beans.ConstructorProperties;

/**
 * @author Olga Maciaszek-Sharma
 */
//@FeignClient(value = "HelloServer")
public interface HelloClient {

	//	@RequestMapping(value = "/", method = GET)
	String hello();

	//	@GetMapping("/play-value")
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
