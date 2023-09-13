package in.codemarker.api.domain;


import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.validation.constraints.NotBlank;
@Entity(name="technologies")
public class Technology {
	@Id                         ///to make id as primary key we take @Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) //Id autogenerate using this annotation
	private Long id;
	@NotBlank(message="Technology name can not be empty")
	private String technologyName;
	@NotBlank(message="Technology identifire can not be empty")
	private String technologyIdentifire;
	@NotBlank(message="Description can not be empty")
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
	public String getTechnologyName() {
		return technologyName;
	}
	public void setTechnologyName(String testName) {
		this. technologyName = testName;
	}
	public String getTechnologyIdentifire() {
		return  technologyIdentifire;
	}
	public void setTechnologyIdentifire(String  technologyIdentifire) {
		this. technologyIdentifire =  technologyIdentifire;
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