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
@Table(name = CommonConstant.Table.CONNECTION_CHARGE_TRANSACTION)
public class ConnectionChargeTransaction {
	
	@Id
	@Column(name = CommonConstant.Column.ID)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@JoinColumn(name = CommonConstant.Column.CONNECTION_ID)
	@ManyToOne(fetch = FetchType.LAZY)
	private Connection connectionId;
	
	@JoinColumn(name = CommonConstant.Column.CHARGE_ID)
	@ManyToOne(fetch = FetchType.LAZY)
	private Charge chargeId;
	
	@JoinColumn(name = CommonConstant.Column.TRANSACTION_ID)
	@ManyToOne(fetch = FetchType.LAZY)
	private Transaction transactionId;
	
	@Column(name = CommonConstant.Column.PAID_AMOUNT)
	private Double paidAmount;
	
	@Column(name = CommonConstant.Column.LAST_UPDATED_TS)
	private Date lastUpdateTS;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Connection getConnectionId() {
		return connectionId;
	}
	public void setConnectionId(Connection connectionId) {
		this.connectionId = connectionId;
	}
	public Charge getChargeId() {
		return chargeId;
	}
	public void setChargeId(Charge chargeId) {
		this.chargeId = chargeId;
	}
	public Transaction getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(Transaction transactionId) {
		this.transactionId = transactionId;
	}
	public Double getPaidAmount() {
		return paidAmount;
	}
	public void setPaidAmount(Double paidAmount) {
		this.paidAmount = paidAmount;
	}
	public Date getLastUpdateTS() {
		return lastUpdateTS;
	}
	public void setLastUpdateTS(Date lastUpdateTS) {
		this.lastUpdateTS = lastUpdateTS;
	}
}
