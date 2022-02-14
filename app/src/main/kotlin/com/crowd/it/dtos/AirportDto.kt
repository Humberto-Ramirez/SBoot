package com.crowd.it.dtos

import com.fasterxml.jackson.annotation.JsonAlias
import com.fasterxml.jackson.annotation.JsonRootName

@JsonRootName("airport")
data class AirportDto constructor(
	val gmt: String?,
	@JsonAlias("airport_id")
	val airportId: String,
	@JsonAlias("iata_code")
	val iAtaCode: String,
	@JsonAlias("city_iata_code")
	val cityIAtaCode: String,
	@JsonAlias("icao_code")
	val iCaoCode: String,
	@JsonAlias("country_iso2")
	val countryIso2: String,
	@JsonAlias("geoname_id")
	val geonameId: String,
	val latitude: String,
	val longitude: String,
	@JsonAlias("airport_name")
	val airportName: String,
	@JsonAlias("country_name")
	val countryName: String?,
	@JsonAlias("phone_number")
	val phoneNumber: String?,
	val timezone: String?
)