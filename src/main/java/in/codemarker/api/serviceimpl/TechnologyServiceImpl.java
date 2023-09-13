package in.codemarker.api.serviceimpl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.codemarker.api.domain.Technology;
import in.codemarker.api.exception.TechnologyIdException;
import in.codemarker.api.repository.TechnologyRepository;
import in.codemarker.api.service.TechnologyService;


@Service
public class TechnologyServiceImpl implements TechnologyService {

@Autowired
	private TechnologyRepository technologyRepository;
	
	@Override
	public Technology saveOrUpdate(Technology technology) {
		
		try {
			return technologyRepository.save(technology);
	}catch(Exception ex){
		throw new TechnologyIdException("Technology Id :"+technology.getTechnologyIdentifire()+"already exists");
		}
	}

	@Override
	public Iterable<Technology> findALlTechnologies() {
		
		return technologyRepository.findAll();
	}

	@Override
	public void delete(String technologyID) {
	Technology technology = technologyRepository.findByTechnologyIdentifire(technologyID);
	
	technologyRepository.delete(technology);
	}

	
}
