package com.crowd.it.dtos

import com.fasterxml.jackson.annotation.JsonAlias
import com.fasterxml.jackson.annotation.JsonRootName

@JsonRootName("airline")
data class AirlineDto constructor(
	@JsonAlias("airline_name")
	val airlineName: String,
	@JsonAlias("iata_code")
	val iAtaCode: String,
	@JsonAlias("iata_prefix_account")
	val iAtaPrefixAccount: String?,
	@JsonAlias("icao_code")
	val iCaoCode: String?,
	val callsign: String,
	val type: String?,
	val status: String,
	@JsonAlias("fleet_size")
	val fleetSize: String,
	@JsonAlias("fleet_average_age")
	val fleetAverageAge: String,
	@JsonAlias("date_founded")
	val dateFounded: String?,
	@JsonAlias("hub_code")
	val hubCode: String?,
	@JsonAlias("country_name")
	val countryName: String,
	@JsonAlias("country_iso2")
	val countryIso2: String,
)