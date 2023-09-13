package in.codemarker.api.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import in.codemarker.api.domain.Technology;




@Repository
public interface TechnologyRepository extends CrudRepository<Technology, Long> {
	
	Technology findByTechnologyIdentifire(String technologyId);
	
}