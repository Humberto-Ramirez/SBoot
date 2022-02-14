package com.crowd.it.controllers

import com.crowd.it.clients.AviationClient
import com.crowd.it.dtos.*
import com.crowd.it.dtos.response.PaginatedDto
import com.crowd.it.services.AviationService
import org.springframework.web.bind.annotation.RestController

@RestController
class AviationController(val aviationClient: AviationClient) : AviationService {

	override fun getCountries(limit: Int, offset: Int): PaginatedDto<CountryDto> {
		return aviationClient.getCountries(limit, offset)
	}

	override fun getCities(limit: Int, offset: Int): PaginatedDto<CityDto> {
		return aviationClient.getCities(limit, offset)
	}

	override fun getAirlines(limit: Int, offset: Int): PaginatedDto<AirlineDto> {
		return aviationClient.getAirlines(limit, offset)
	}

	override fun getAirports(limit: Int, offset: Int): PaginatedDto<AirportDto> {
		return aviationClient.getAirports(limit, offset)
	}

	override fun getAirplanes(limit: Int, offset: Int): PaginatedDto<AirplaneDto> {
		return aviationClient.getAirplanes(limit, offset)
	}

	override fun getAircraftTypes(limit: Int, offset: Int): PaginatedDto<AircraftTypeDto> {
		return aviationClient.getAircraftTypes(limit, offset)
	}

	override fun getTaxes(limit: Int, offset: Int): PaginatedDto<AviationTaxDto> {
		return aviationClient.getTaxes(limit, offset)
	}
}