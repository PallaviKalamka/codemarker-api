package in.codemarker.api.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class ReportIdException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * This will create ReportIdException object without error message
	 */
	public ReportIdException()
	{
		super();	
	}
	/**
	 * This will create ReportIdException object with error message
	 */
	public ReportIdException(String errMsg)
	{
		super(errMsg);
	}

}
