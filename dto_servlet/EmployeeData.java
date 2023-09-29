package SpringAndServlets_dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class EmployeeData {
	@Id
	private int id;
	private String name;
	private String mail;
	private String password;
	private String dob;
	private String gender;
	private String termsAndCondition;
	private String country;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getTermsAndCondition() {
		return termsAndCondition;
	}
	public void setTermsAndCondition(String termsAndCondition) {
		this.termsAndCondition = termsAndCondition;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "EmployeeData [id=" + id + ", name=" + name + ", mail=" + mail + ", password=" + password + ", dob=" + dob
				+ ", gender=" + gender + ", termsAndCondition=" + termsAndCondition + ", country=" + country + "]";
	}
	
}
