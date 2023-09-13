package in.codemarker.api.service;

import in.codemarker.api.domain.Technology;


public interface TechnologyService {

	 Technology saveOrUpdate(Technology technology);
	Iterable<Technology> findALlTechnologies();
	

void delete(String technologyID);
}