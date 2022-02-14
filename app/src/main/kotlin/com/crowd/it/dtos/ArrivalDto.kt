package com.crowd.it.dtos

import com.fasterxml.jackson.annotation.JsonAlias
import com.fasterxml.jackson.annotation.JsonRootName

@JsonRootName("arrival")
data class ArrivalDto constructor(
	val airport: String,
	val timezone: String,
	val iata: String,
	val icao: String,
	val terminal: String,
	val gate: String,
	val baggage: String,
	val delay: String,
	val scheduled: String,
	val estimated: String,
	val actual: String,
	@JsonAlias("estimated_runway")
	val estimatedRunway: String,
	@JsonAlias("actual_runway")
	val actualRunway: String,
)
