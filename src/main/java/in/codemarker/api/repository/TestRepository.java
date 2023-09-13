package in.codemarker.api.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import in.codemarker.api.domain.Test;

@Repository
public interface TestRepository extends CrudRepository<Test, Long>{

	Test findByTestIdentifier(String testId);
	
}
