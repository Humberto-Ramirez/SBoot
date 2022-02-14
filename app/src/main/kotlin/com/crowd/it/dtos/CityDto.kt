package com.crowd.it.dtos

import com.fasterxml.jackson.annotation.JsonAlias
import com.fasterxml.jackson.annotation.JsonRootName

@JsonRootName("city")
data class CityDto constructor(
	@JsonAlias("city_name")
	val cityName: String,
	@JsonAlias("iata_code")
	val iAtaCode: String,
	@JsonAlias("country_iso2")
	val countryIso2: String,
	val latitude: String,
	val longitude: String,
	val timezone: String,
	val gmt: String?,
	@JsonAlias("geoname_id")
	val geonameId: String?
)
