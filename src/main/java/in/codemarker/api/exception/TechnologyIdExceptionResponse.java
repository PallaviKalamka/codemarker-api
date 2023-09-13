package in.codemarker.api.exception;

public class TechnologyIdExceptionResponse {

	private String technologyIdentifire;

	public TechnologyIdExceptionResponse(String technologyIdentifire) {
		super();
		this.technologyIdentifire = technologyIdentifire;
	}

	public String getTechnologyIdentifire() {
		return technologyIdentifire;
	}

	public void setTechnologyIdentifire(String technologyIdentifire) {
		this.technologyIdentifire = technologyIdentifire;
	}
}
