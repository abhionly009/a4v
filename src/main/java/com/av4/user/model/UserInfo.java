package com.av4.user.model;

public class UserInfo {
	
	private String name;
	
	private String email;
	
	private String mobile;
	
	private String address;
	
	private String company;
	
	private boolean isMobileVerified;
	
	private boolean isEmailVerified;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public boolean isMobileVerified() {
		return isMobileVerified;
	}

	public void setMobileVerified(boolean isMobileVerified) {
		this.isMobileVerified = isMobileVerified;
	}

	public boolean isEmailVerified() {
		return isEmailVerified;
	}

	public void setEmailVerified(boolean isEmailVerified) {
		this.isEmailVerified = isEmailVerified;
	}
	
	
	

}
