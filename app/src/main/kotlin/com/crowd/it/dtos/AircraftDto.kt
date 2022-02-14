package com.crowd.it.dtos

data class AircraftDto constructor(
	val registration: String,
	val iata: String,
	val icao: String,
	val icao24: String
)