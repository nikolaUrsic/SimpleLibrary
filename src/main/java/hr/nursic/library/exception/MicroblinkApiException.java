package hr.nursic.library.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
public class MicroblinkApiException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2119344192281295744L;

	public MicroblinkApiException() {
		super();
	}

	public MicroblinkApiException(String message) {
		super(message);
	}

	public MicroblinkApiException(String message, Throwable cause) {
		super(message, cause);
	}
}
