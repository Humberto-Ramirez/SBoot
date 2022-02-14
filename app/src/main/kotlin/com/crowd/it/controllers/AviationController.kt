package com.crowd.it.controllers

import com.crowd.it.clients.AviationClient
import com.crowd.it.dtos.CountryDto
import com.crowd.it.dtos.response.PaginatedDto
import com.crowd.it.services.AviationService
import org.springframework.web.bind.annotation.RestController

@RestController
class AviationController(val aviationClient: AviationClient) : AviationService {

	override fun getCountries(limit: Int, offset: Int): PaginatedDto<CountryDto> {
		return aviationClient.getCountries(limit, offset)
	}

}