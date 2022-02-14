package com.crowd.it.controllers

import com.crowd.it.clients.AviationClient
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class CountryController(val aviationClient: AviationClient) {

	@GetMapping("/countries")
	fun getCountries() = aviationClient.getCountries(100, 0, "978e6ce10f72b50aa9b16bda8794dc9f")


}