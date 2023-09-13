package in.codemarker.api.service;

import java.util.List;

import in.codemarker.api.domain.Test;

public interface TestService {
	
	 Test saveOrUpdate(Test test);
	 Iterable<Test> findAllTests();
	 
	 void delete(String testId);

}
