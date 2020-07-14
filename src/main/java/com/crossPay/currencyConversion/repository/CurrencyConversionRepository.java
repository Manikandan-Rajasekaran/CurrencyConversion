package com.crossPay.currencyConversion.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.crossPay.currencyConversion.entity.CurrencyConversionEntity;
@Repository
public interface CurrencyConversionRepository extends JpaRepository<CurrencyConversionEntity, Integer> {
	/*
	 * Select query to retrieve the exchange rate, we will be extracting the exchange rate value in CurrencyConversionService.
	 * From the object returned here.
	 */
	@Query("SELECT currencycon from CPCURRENCYCONVERSION currencycon WHERE currencycon.fromCurrency=:fromCurrency AND currencycon.toCurrency=:toCurrency")
	CurrencyConversionEntity findByCurrency(@Param("fromCurrency") String fromCurrency, @Param("toCurrency") String toCurrency);

}
