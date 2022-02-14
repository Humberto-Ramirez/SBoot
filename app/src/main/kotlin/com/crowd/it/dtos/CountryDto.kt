package com.crowd.it.dtos

import com.fasterxml.jackson.annotation.JsonAlias
import com.fasterxml.jackson.annotation.JsonRootName

@JsonRootName("Country")
data class CountryDto constructor(
	val id: String,
	@JsonAlias("country_id")
	val countryId: String,
	@JsonAlias("country_name")
	val countryName: String,
	@JsonAlias("country_iso2")
	val countryIso2: String,
	@JsonAlias("country_iso3")
	val countryIso3: String,
	@JsonAlias("country_iso_numeric")
	val countryIsoNumeric: String,
	val population: String?,
	val capital: String?,
	val continent: String,
	@JsonAlias("currency_name")
	val currencyName: String?,
	@JsonAlias("currency_code")
	val currencyCode: String?,
	@JsonAlias("fips_code")
	val fipsCode: String?,
	@JsonAlias("phone_prefix")
	val phonePrefix: String?
)
