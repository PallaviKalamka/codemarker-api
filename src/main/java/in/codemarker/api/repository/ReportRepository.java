package in.codemarker.api.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import in.codemarker.api.domain.Report;

@Repository
public interface ReportRepository extends CrudRepository<Report, Long>{
	
 Report findByReportIdentifier(String reportId);
}
