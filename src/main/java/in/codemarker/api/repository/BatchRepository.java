package in.codemarker.api.repository;


import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;

import in.codemarker.api.domain.Batch;


@Repository
public interface BatchRepository extends CrudRepository<Batch, Long> {
	
 Batch findByBatchIdentifire(String batchIdentifire);

}
