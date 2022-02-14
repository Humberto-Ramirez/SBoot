package com.crowd.it.dtos

import com.fasterxml.jackson.annotation.JsonAlias
import com.fasterxml.jackson.annotation.JsonRootName

@JsonRootName("airplane")
data class AirplaneDto constructor(
	@JsonAlias("iata_type")
	val i_ata_type: String,
	@JsonAlias("airplane_id")
	val airplane_id: String,
	@JsonAlias("airline_iata_code")
	val airlineIataCode: String,
	@JsonAlias("iata_code_long")
	val iAtaCodeLong: String,
	@JsonAlias("iata_code_short")
	val iAtaCodeShort: String,
	@JsonAlias("airline_icao_code")
	val airlineIcaoCode: String?,
	@JsonAlias("construction_number")
	val constructionNumber: String,
	@JsonAlias("delivery_date")
	val deliveryDate: String,
	@JsonAlias("engines_count")
	val enginesCount: String,
	@JsonAlias("first_flight_date")
	val firstFlightDate: String,
	@JsonAlias("icao_code_hex")
	val iCaoCodeHex: String,
	@JsonAlias("line_number")
	val lineNumber: String?,
	@JsonAlias("model_code")
	val modelCode: String,
	@JsonAlias("registration_number")
	val registrationNumber: String,
	@JsonAlias("test_registration_number")
	val testRegistrationNumber: String?,
	@JsonAlias("plane_age")
	val planeAge: String,
	@JsonAlias("plane_class")
	val planeClass: String?,
	@JsonAlias("model_name")
	val modelName: String,
	@JsonAlias("plane_owner")
	val planeOwner: String?,
	@JsonAlias("plane_series")
	val planeSeries: String,
	@JsonAlias("plane_status")
	val planeStatus: String,
	@JsonAlias("production_line")
	val productionLine: String,
	@JsonAlias("registration_date")
	val registrationDate: String,
	@JsonAlias("rollout_date")
	val rolloutDate: String?
)