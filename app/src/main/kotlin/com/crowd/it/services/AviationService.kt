package com.crowd.it.services

import com.crowd.it.dtos.CityDto
import com.crowd.it.dtos.CountryDto
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
}