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
@Table(name = CommonConstant.Table.CHARGE)
public class Charge {
	
	@Id
	@Column(name = CommonConstant.Column.ID)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column(name = CommonConstant.Column.MMYY)
	private String mmyy;
	
	@Column(name = CommonConstant.Column.CHARGE)
	private Double charge;
	
	@Column(name = CommonConstant.Column.LAST_UPDATED_TS)
	private Date lastUpdateTS;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getMmyy() {
		return mmyy;
	}
	public void setMmyy(String mmyy) {
		this.mmyy = mmyy;
	}
	public Double getCharge() {
		return charge;
	}
	public void setCharge(Double charge) {
		this.charge = charge;
	}
	public Date getLastUpdateTS() {
		return lastUpdateTS;
	}
	public void setLastUpdateTS(Date lastUpdateTS) {
		this.lastUpdateTS = lastUpdateTS;
	}
}
