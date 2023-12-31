package in.codemarker.api.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class BatchIdException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	/**
	 * This will create BatchIdException Object Without error msg
	 */
	public BatchIdException() {
		super();
	}
	/**
	 * This will create BatchIdException Object Without error msg
	 */
	
	public BatchIdException(String errMsg) {
		super(errMsg);
	}
	
}
