package com.crossPay.currencyConversion.dto;

public class CurrencyConversionDto {
	private String fromCurrency;
	private Double fromAmount;
	private String toCurrency;
	private Double toAmount;
	
	public CurrencyConversionDto() {
	}
	
	public CurrencyConversionDto(String fromCurrency, Double fromAmount, String toCurrency, Double toAmount) {
		super();
		this.fromCurrency = fromCurrency;
		this.fromAmount = fromAmount;
		this.toCurrency = toCurrency;
		this.toAmount = toAmount;
	}

	
	public String getFromCurrency() {
		return fromCurrency;
	}

	public void setFromCurrency(String fromCurrency) {
		this.fromCurrency = fromCurrency;
	}

	public Double getFromAmount() {
		return fromAmount;
	}

	public void setFromAmount(Double fromAmount) {
		this.fromAmount = fromAmount;
	}

	public String getToCurrency() {
		return toCurrency;
	}

	public void setToCurrency(String toCurrency) {
		this.toCurrency = toCurrency;
	}

	public Double getToAmount() {
		return toAmount;
	}

	public void setToAmount(Double toAmount) {
		this.toAmount = toAmount;
	}

	@Override
	public String toString() {
		return "Currency [fromCcy=" + fromCurrency + ", fromAmt=" + fromAmount + ", toCcy=" + toCurrency + ", toAmt=" + toAmount + "]";
	}
}
