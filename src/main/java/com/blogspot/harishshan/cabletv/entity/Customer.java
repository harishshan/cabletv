package com.blogspot.harishshan.cabletv.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.blogspot.harishshan.cabletv.constant.CommonConstant;

@Entity
@Table(name = CommonConstant.Table.CUSTOMER)
public class Customer{

	@Id
	@Column(name = CommonConstant.Column.ID)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column(name = CommonConstant.Column.NAME)
	private String name;
	
	@Column(name = CommonConstant.Column.PHONE_NUMBER)
	private String phoneNumber;
	
	@Column(name = CommonConstant.Column.EMAIL_ID)
	private String emailId;
	
	@Column(name = CommonConstant.Column.ADDRESS)	
	private String address;
	
	@Column(name = CommonConstant.Column.LAST_UPDATED_TS)
	private Date lastUpdateTS;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getLastUpdateTS() {
		return lastUpdateTS;
	}

	public void setLastUpdateTS(Date lastUpdateTS) {
		this.lastUpdateTS = lastUpdateTS;
	}
	
}
