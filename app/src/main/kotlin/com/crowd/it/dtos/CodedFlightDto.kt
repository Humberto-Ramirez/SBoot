package com.crowd.it.dtos

data class CodedFlightDto constructor(
	val number: String,
	val iata: String,
	val icao: String,
	val codeshared: CodeSharedDto?
)
