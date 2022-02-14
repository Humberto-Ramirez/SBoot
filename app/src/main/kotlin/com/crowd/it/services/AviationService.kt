package com.crowd.it.services

import com.crowd.it.dtos.*
import com.crowd.it.dtos.response.PaginatedDto
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam

interface AviationService {

	@GetMapping("/countries")
	fun getCountries(
		@RequestParam(value = "limit") limit: Int,
		@RequestParam(value = "offset") offset: Int
	): PaginatedDto<CountryDto>

	@GetMapping("/cities")
	fun getCities(
		@RequestParam(value = "limit") limit: Int,
		@RequestParam(value = "offset") offset: Int
	): PaginatedDto<CityDto>

	@GetMapping("/airlines")
	fun getAirlines(
		@RequestParam(value = "limit") limit: Int,
		@RequestParam(value = "offset") offset: Int
	): PaginatedDto<AirlineDto>

	@GetMapping("/airports")
	fun getAirports(
		@RequestParam(value = "limit") limit: Int,
		@RequestParam(value = "offset") offset: Int
	): PaginatedDto<AirportDto>

	@GetMapping("/airplanes")
	fun getAirplanes(
		@RequestParam(value = "limit") limit: Int,
		@RequestParam(value = "offset") offset: Int
	): PaginatedDto<AirplaneDto>

	@GetMapping("/aircraft_types")
	fun getAircraftTypes(
		@RequestParam(value = "limit") limit: Int,
		@RequestParam(value = "offset") offset: Int
	): PaginatedDto<AircraftTypeDto>


	@GetMapping("/taxes")
	fun getTaxes(
		@RequestParam(value = "limit") limit: Int,
		@RequestParam(value = "offset") offset: Int
	): PaginatedDto<AviationTaxDto>


}