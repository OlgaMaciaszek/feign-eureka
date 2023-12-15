package demo.config;

import feign.Response;
import feign.codec.ErrorDecoder;

/**
 * @author Olga Maciaszek-Sharma
 */
public class CustomErrorDecoder implements ErrorDecoder {

	public Exception decode(String methodKey, Response response) {
         return new IllegalStateException("test");
	}
}
