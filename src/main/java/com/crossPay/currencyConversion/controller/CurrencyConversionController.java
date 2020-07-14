package com.crossPay.currencyConversion.controller;

import org.springframework.web.bind.annotation.RestController;
import com.crossPay.currencyConversion.service.CurrencyConversionService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.crossPay.currencyConversion.dto.CurrencyConversionDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController

public class CurrencyConversionController {

	@Autowired
	private CurrencyConversionService currencyConversionService;
	
	/*
	 * Method to post input values namely fromcurrency, toCurrency and fromAmount
	 * Based on the exchange rate mapped in DB we will retrieving the exchange rate.
	 * Then we will be multiplying the exchange rate with FromAmount and we will be getting the ToAmount
	 */
	@RequestMapping(method = RequestMethod.POST, value = "/convert")
	public CurrencyConversionDto getRates(@RequestBody CurrencyConversionDto c) {
		return currencyConversionService.convert(c);
	}
	
}
