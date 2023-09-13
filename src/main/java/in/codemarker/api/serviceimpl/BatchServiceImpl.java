package in.codemarker.api.serviceimpl;


import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.stereotype.Service;

import in.codemarker.api.domain.Batch;
import in.codemarker.api.exception.BatchIdException;
import in.codemarker.api.repository.BatchRepository;
import in.codemarker.api.service.BatchService;


@Service
public class BatchServiceImpl implements BatchService {

@Autowired
	private BatchRepository batchRepository;
	
	@Override
	public Batch saveOrUpdate(Batch batch) {
		try {
			return batchRepository.save(batch);
		} catch (Exception e) {
			// TODO: handle rethrow exception to sent till ui layer
					throw new BatchIdException("Batch id:"+batch.getBatchIdentifire()+":already exist");
		}
		
	}

	@Override
	public Iterable<Batch> findAllBatch() {
		// TODO Auto-generated method stub
		return batchRepository.findAll();
	}

	@Override
	public void delete(String batchIdentifire) {
	Batch batch  = batchRepository.findByBatchIdentifire(batchIdentifire);
	batchRepository.delete(batch);
	}

}
