package in.codemarker.api.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.codemarker.api.domain.Test;
import in.codemarker.api.exception.TestIdException;
import in.codemarker.api.repository.TestRepository;
import in.codemarker.api.service.TestService;

@Service
public class TestServiceImpl implements TestService{
	
	@Autowired
	private TestRepository testrepsitory;

	@Override
	public Test saveOrUpdate(Test test) {
	
		try {
			return testrepsitory.save(test);
		} catch (Exception e) {
			//handling logic
			throw new TestIdException("Test Id : "+test.getTestIdentifier()+" already exits");
			
		}
	}

	@Override
	public Iterable<Test> findAllTests() {
		
		return testrepsitory.findAll();
	}

	@Override
	public void delete(String testId) {
	Test test = testrepsitory.findByTestIdentifier(testId);
		
	}

}
