package com.schooladmission.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="AddedAcademy")
public class Academy {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String AcademyName;
    private String ContactNumber;
    @Column(length = 3000)
    private String ImageUrl;
    private String Email;
    private String Location;
    @Column(length = 5000)
    private String Description;
    
    public Academy(){
    	
    }
    
    
	public Academy(int id, String academyName, String contactNumber, String imageUrl, String email, String location,
			String description) {
		super();
		this.id = id;
		AcademyName = academyName;
		ContactNumber = contactNumber;
		ImageUrl = imageUrl;
		Email = email;
		Location = location;
		Description = description;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAcademyName() {
		return AcademyName;
	}
	public void setAcademyName(String academyName) {
		AcademyName = academyName;
	}
	public String getContactNumber() {
		return ContactNumber;
	}
	public void setContactNumber(String contactNumber) {
		ContactNumber = contactNumber;
	}
	public String getImageUrl() {
		return ImageUrl;
	}
	public void setImageUrl(String imageUrl) {
		ImageUrl = imageUrl;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getLocation() {
		return Location;
	}
	public void setLocation(String location) {
		Location = location;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	

}
