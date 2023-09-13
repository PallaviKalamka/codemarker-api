package in.codemarker.api.domain;

import java.util.Date;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
@Entity(name = "batches")
public class Batch {
	@Id                         ///to make id as primary key we take @Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) //Id autogenerate using this annotation
	private Long id;
	@NotBlank(message = "batch name is not empty")
	private String batchName;
	@NotBlank(message = "batch identifier is not empty")
	@Size(min = 4, max = 5 , message = "batch identifier must be in the range of 4 to 5")
	@Column(updatable = false,unique = true)
	private String batchIdentifire;
	@NotBlank(message = "batch description is not empty")
	private String description;
	private Date start_date;
	private Date end_date;
	private Date created_At;
	private Date updated_At;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getBatchName() {
		return batchName;
	}
	public void setBatchName(String testName) {
		this.batchName = testName;
	}
	
	public String getBatchIdentifire() {
		return batchIdentifire;
	}
	public void setBatchIdentifire(String batchIdentifire) {
		this.batchIdentifire = batchIdentifire;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getStart_date() {
		return start_date;
	}
	public void setStart_date(Date start_date) {
		this.start_date = start_date;
	}
	public Date getEnd_date() {
		return end_date;
	}
	public void setEnd_date(Date end_date) {
		this.end_date = end_date;
	}
	public Date getCreated_At() {
		return created_At;
	}
	public void setCreated_At(Date created_At) {
		this.created_At = created_At;
	}
	public Date getUpdated_At() {
		return updated_At;
	}
	public void setUpdated_At(Date updated_At) {
		this.updated_At = updated_At;
	}
	@PrePersist   //before create operation condition this perticular method will run by using this annotation
	 public void onCreate() {
		 this.created_At=new Date(); //new date is current (parent) date which is created
	 }
		@PreUpdate   //before update operation condition this perticular method will run by using this annotation
	 public void onUpdate() {
		 this.updated_At=new Date();//new date is the current (child) date which updated later on
	 }
}