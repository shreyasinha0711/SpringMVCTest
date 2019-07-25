package com.risk.model;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

import com.risk.validator.IsValidPhoneNumber;

public class User {
	@NotEmpty
	@Pattern(regexp="[^0-9]+")
	@Size(max=40, min=6)
	private String name;
	
	@NotEmpty
	private String country;
	
	@NotEmpty
	@Email
	private String email;
	
	@NotNull
	@Max(value=102)
	@Min(value=12)
	private Integer age;
	
	@IsValidPhoneNumber
	private String phone;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public User(String name, String country, String email, int age, String phone) {
		super();
		this.name = name;
		this.country = country;
		this.email = email;
		this.age = age;
		this.phone = phone;
	}
	
	public User() {}

}
