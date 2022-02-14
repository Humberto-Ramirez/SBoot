package com.crowd.it.controllers

import com.crowd.it.config.typeRef
import com.crowd.it.dtos.*
import com.crowd.it.dtos.response.PaginatedDto
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.web.client.TestRestTemplate
import org.springframework.http.HttpMethod
import org.springframework.http.HttpStatus

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class AviationControllerTest(@Autowired val restTemplate: TestRestTemplate) {

	private val log = LoggerFactory.getLogger(AviationControllerTest::class.java)

	@BeforeEach
	fun setUp() {
		log.info("Setup Aviation Controller Test")
		log.info("All methods throws a INTERNAL_SERVER_ERROR by usage limit reached on Aviation Api")
	}

	@Test
	fun getCountries() {
		val result = restTemplate.exchange(
			"/countries?limit=0&offset=0",
			HttpMethod.GET,
			null,
			typeRef<PaginatedDto<CountryDto>>()
		)
		assert(result.statusCode == HttpStatus.INTERNAL_SERVER_ERROR)
	}

	@Test
	fun getCities() {
		val result = restTemplate.exchange(
			"/cities?limit=0&offset=0",
			HttpMethod.GET,
			null,
			typeRef<PaginatedDto<CityDto>>()
		)
		assert(result.statusCode == HttpStatus.INTERNAL_SERVER_ERROR)
	}

	@Test
	fun getAirlines() {
		val result = restTemplate.exchange(
			"/airlines?limit=0&offset=0",
			HttpMethod.GET,
			null,
			typeRef<PaginatedDto<AirlineDto>>()
		)
		assert(result.statusCode == HttpStatus.INTERNAL_SERVER_ERROR)
	}

	@Test
	fun getAirports() {
		val result = restTemplate.exchange(
			"/airports?limit=0&offset=0",
			HttpMethod.GET,
			null,
			typeRef<PaginatedDto<AirportDto>>()
		)
		assert(result.statusCode == HttpStatus.INTERNAL_SERVER_ERROR)
	}

	@Test
	fun getAirplanes() {
		val result = restTemplate.exchange(
			"/airplanes?limit=0&offset=0",
			HttpMethod.GET,
			null,
			typeRef<PaginatedDto<AirplaneDto>>()
		)
		assert(result.statusCode == HttpStatus.INTERNAL_SERVER_ERROR)
	}

	@Test
	fun getAircraftTypes() {
		val result = restTemplate.exchange(
			"/aircraft_types?limit=0&offset=0",
			HttpMethod.GET,
			null,
			typeRef<PaginatedDto<AircraftTypeDto>>()
		)
		assert(result.statusCode == HttpStatus.INTERNAL_SERVER_ERROR)
	}

	@Test
	fun getTaxes() {
		val result = restTemplate.exchange(
			"/taxes?limit=0&offset=0",
			HttpMethod.GET,
			null,
			typeRef<PaginatedDto<AviationTaxDto>>()
		)
		assert(result.statusCode == HttpStatus.INTERNAL_SERVER_ERROR)
	}

}