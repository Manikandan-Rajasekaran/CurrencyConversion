package com.crossPay.currencyConversion.entity;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity(name = "CPCURRENCYCONVERSION")
@Table(name = "CPCURRENCYCONVERSION")
@IdClass(CurrencyConversionID.class)
public class CurrencyConversionEntity {
	
	/*
	 * CPCURRENCYCONVERSION - Table will be created in rate schema.
	 * Primary key for this table is fromCurrency and toCurrency
	 * 
	 */
	@Id
	private String fromCurrency;
	@Id
	private String toCurrency;
	private double rate;
	public String getFromCurrency() {
		return fromCurrency;
	}
	public void setFromCurrency(String fromCurrency) {
		this.fromCurrency = fromCurrency;
	}
	public String getToCurrency() {
		return toCurrency;
	}
	public void setToCurrency(String toCurrency) {
		this.toCurrency = toCurrency;
	}
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
	
	@Override
	public String toString() {
		return "CurrencyEntity [fromCurrency=" + fromCurrency + ", toCurrency=" + toCurrency + ", rate="
				+ rate + "]";
	}

}
