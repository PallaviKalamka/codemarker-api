package in.codemarker.api.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class TechnologyIdException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * this will create TechnologyIdException without error msg.
	 */
	public TechnologyIdException() {
		super();
	}
	/**
	 * this will create TechnologyIdException with error msg.
	 */
	public TechnologyIdException(String errMsg) {
		super(errMsg);
	}
}

