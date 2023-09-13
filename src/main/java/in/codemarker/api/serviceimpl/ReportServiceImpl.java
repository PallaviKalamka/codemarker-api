package in.codemarker.api.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.codemarker.api.domain.Report;
import in.codemarker.api.exception.ReportIdException;
import in.codemarker.api.repository.ReportRepository;
import in.codemarker.api.service.ReportService;

@Service
public class ReportServiceImpl implements ReportService{
	
	@Autowired
	private ReportRepository reportRepository;

	@Override
	public Report saveOrUpdate(Report report) {
		try {
		return reportRepository.save(report);
		}
		catch(Exception ex) {
			throw new ReportIdException("Report Id:"+report.getReportIdentifier()+" already exists");
		}
	}

	@Override
	public Iterable<Report> findAllReports() {
		
		return reportRepository.findAll();
	}

	@Override
	public void delete(String reportId) {
		Report report=reportRepository.findByReportIdentifier(reportId);
		
		reportRepository.delete(report);
		
	}

}
