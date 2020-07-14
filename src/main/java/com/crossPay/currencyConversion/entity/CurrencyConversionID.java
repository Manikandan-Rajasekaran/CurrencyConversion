package com.crossPay.currencyConversion.entity;

import java.io.Serializable;

public class CurrencyConversionID implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2299461160073923086L;
	private String fromCurrency;
	private String toCurrency;
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

}
