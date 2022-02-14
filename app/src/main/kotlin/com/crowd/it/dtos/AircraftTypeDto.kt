package com.crowd.it.dtos

import com.fasterxml.jackson.annotation.JsonAlias
import com.fasterxml.jackson.annotation.JsonRootName

@JsonRootName("aircraftType")
data class AircraftTypeDto constructor(
	@JsonAlias("iata_code")
	val iAtaCode: String,
	@JsonAlias("aircraft_name")
	val aircraftName: String,
	@JsonAlias("plane_type_id")
	val planeTypeId: String
)
