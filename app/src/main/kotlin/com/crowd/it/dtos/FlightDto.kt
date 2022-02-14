package com.crowd.it.dtos

import com.fasterxml.jackson.annotation.JsonAlias

data class FlightDto constructor(
	@JsonAlias("flight_date")
	val flightDate: String,
	@JsonAlias("flight_status")
	val flightStatus: String,
	val departure: DepartureDto,
	val arrival: ArrivalDto,
	val airline: FlightAirlineDto,
	val flight: CodedFlightDto,
	val aircraft: AircraftDto,
	val live: LiveInfoDto
)
/*
            "flight_date": "2022-02-14",
            "flight_status": "scheduled",
            "departure": {},
            "arrival": {},
            "airline": {},
            "flight": {},
            "aircraft":
             {
               "registration": "N160AN",
               "iata": "A321",
               "icao": "A321",
               "icao24": "A0F1BB"
            }
            "live": {
                "updated": "2019-12-12T10:00:00+00:00",
                "latitude": 36.28560000,
                "longitude": -106.80700000,
                "altitude": 8846.820,
                "direction": 114.340,
                "speed_horizontal": 894.348,
                "speed_vertical": 1.188,
                "is_ground": false
            }
 */