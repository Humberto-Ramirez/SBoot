package com.crowd.it.clients

import com.crowd.it.dtos.CountryDto
import com.crowd.it.dtos.response.PaginatedDto
import com.crowd.it.services.AviationService
import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam

@FeignClient(
	name = "Aviation",
	qualifier = "aviation",
	url = "\${clients.aviation.url}"
)
interface AviationClient : AviationService {

	@GetMapping(value = ["/countries"])
	override fun getCountries(
		@RequestParam(value = "limit") limit: Int,
		@RequestParam(value = "offset") offset: Int
	): PaginatedDto<CountryDto>
}