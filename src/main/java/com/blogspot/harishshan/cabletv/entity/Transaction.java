package com.blogspot.harishshan.cabletv.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.blogspot.harishshan.cabletv.constant.CommonConstant;

@Entity
@Table(name = CommonConstant.Table.TRANSACTION)
public class Transaction {
	
	@Id
	@Column(name = CommonConstant.Column.ID)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column(name = CommonConstant.Column.CUSTOMER_ID)
	private Integer customerId;
	
	@Column(name = CommonConstant.Column.AMOUNT)
	private Double amount;
	
	@JoinColumn(name = CommonConstant.Column.RECEIVED_BY)
	@ManyToOne(fetch = FetchType.LAZY)
	private Employee receivedBy;
	
	@Column(name = CommonConstant.Column.RECEVIED_FROM)
	private String receivedFrom;
	
	@Column(name = CommonConstant.Column.LAST_UPDATED_TS)
	private Date lastUpdateTS;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public Employee getReceivedBy() {
		return receivedBy;
	}
	public void setReceivedBy(Employee receivedBy) {
		this.receivedBy = receivedBy;
	}
	public String getReceivedFrom() {
		return receivedFrom;
	}
	public void setReceivedFrom(String receivedFrom) {
		this.receivedFrom = receivedFrom;
	}
	public Date getLastUpdateTS() {
		return lastUpdateTS;
	}
	public void setLastUpdateTS(Date lastUpdateTS) {
		this.lastUpdateTS = lastUpdateTS;
	}
}
