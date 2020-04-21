package com.av4.user.model;

public class BankInfo {
	
	private String name;
	private String branchName;
	private String IfscCode;
	private String address;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBranchName() {
		return branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	public String getIfscCode() {
		return IfscCode;
	}
	public void setIfscCode(String ifscCode) {
		IfscCode = ifscCode;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public BankInfo(String name, String branchName, String ifscCode, String address) {
		super();
		this.name = name;
		this.branchName = branchName;
		IfscCode = ifscCode;
		this.address = address;
	}
	public BankInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

}
