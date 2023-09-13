package in.codemarker.api.service;

import java.util.List;

import in.codemarker.api.domain.Report;

public interface ReportService {
	
	Report saveOrUpdate(Report report);
	Iterable<Report> findAllReports();
	
	void delete(String reportId);

}
