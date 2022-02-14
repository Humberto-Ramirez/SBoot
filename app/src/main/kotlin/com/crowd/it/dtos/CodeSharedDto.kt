package com.crowd.it.dtos

import com.fasterxml.jackson.annotation.JsonAlias

data class CodeSharedDto constructor(
	@JsonAlias("airline_name")
	val airlineName: String,
	@JsonAlias("airline_iata")
	val airlineIata: String,
	@JsonAlias("airline_icao")
	val airlineIcao: String,
	@JsonAlias("flight_number")
	val flightNumber: String,
	@JsonAlias("flight_iata")
	val flightIata: String,
	@JsonAlias("flight_icao")
	val flightIcao: String,
)
