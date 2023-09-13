package in.codemarker.api.service;

import in.codemarker.api.domain.Batch;


public interface BatchService {

	Batch saveOrUpdate(Batch batch);
	Iterable<Batch> findAllBatch();
	 void delete(String batchIdentifire);
	
}
