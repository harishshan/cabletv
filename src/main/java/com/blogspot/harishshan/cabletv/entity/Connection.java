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
@Table(name = CommonConstant.Table.CONNECTION)
public class Connection {

	@Id
	@Column(name = CommonConstant.Column.ID)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column(name = CommonConstant.Column.CUSTOMER_ID)
	private Integer customerId;
	
	@Column(name = CommonConstant.Column.OPENING_DATE)
	private Date openingDate;
	
	@Column(name = CommonConstant.Column.DEPOSITE_AMOUNT)
	private Double depositeAmount;
	
	@JoinColumn(name = CommonConstant.Column.CREATED_BY)
	@ManyToOne(fetch = FetchType.LAZY)
	private Employee createdBy;
	
	@Column(name = CommonConstant.Column.CLOSING_DATE)
	private Date closingDate;
	
	@Column(name = CommonConstant.Column.DEPOSITE_REFUND_AMOUND)
	private Double depositeRefundAmound;
	
	@JoinColumn(name = CommonConstant.Column.CLOSED_BY)
	@ManyToOne(fetch = FetchType.LAZY)
	private Employee closedBy;
	
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
	public Date getOpeningDate() {
		return openingDate;
	}
	public void setOpeningDate(Date openingDate) {
		this.openingDate = openingDate;
	}
	public Double getDepositeAmount() {
		return depositeAmount;
	}
	public void setDepositeAmount(Double depositeAmount) {
		this.depositeAmount = depositeAmount;
	}
	public Employee getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(Employee createdBy) {
		this.createdBy = createdBy;
	}
	public Date getClosingDate() {
		return closingDate;
	}
	public void setClosingDate(Date closingDate) {
		this.closingDate = closingDate;
	}
	public Double getDepositeRefundAmound() {
		return depositeRefundAmound;
	}
	public void setDepositeRefundAmound(Double depositeRefundAmound) {
		this.depositeRefundAmound = depositeRefundAmound;
	}
	public Employee getClosedBy() {
		return closedBy;
	}
	public void setClosedBy(Employee closedBy) {
		this.closedBy = closedBy;
	}
	public Date getLastUpdateTS() {
		return lastUpdateTS;
	}
	public void setLastUpdateTS(Date lastUpdateTS) {
		this.lastUpdateTS = lastUpdateTS;
	}
}
