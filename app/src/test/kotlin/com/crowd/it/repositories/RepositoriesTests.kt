package com.crowd.it.repositories

import com.crowd.it.config.format
import com.crowd.it.entities.CountryEntity
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager
import java.time.LocalDateTime


@DataJpaTest
class RepositoriesTests @Autowired constructor(
	val entityManager: TestEntityManager,
	val countryRepository: CountryRepository
) {

	private val log = LoggerFactory.getLogger(RepositoriesTests::class.java)

	@BeforeAll
	fun setupBefore() {
		val countries = mutableListOf<CountryEntity>()
		countries.add(
			CountryEntity(
				"159",
				"Mexico",
				"MX",
				"MEX",
				"484",
				"112468855",
				"Mexico City",
				"NA",
				"Peso",
				"MXN",
				"MX",
				"52",
				LocalDateTime.now()
			)
		)
		countries.add(
			CountryEntity(
				"235",
				"United States",
				"US",
				"USA",
				"840",
				"310232863",
				"Washington",
				"NA",
				"Dollar",
				"USD",
				"US",
				"1",
				LocalDateTime.now()
			)
		)
		val savedCounties = countryRepository.saveAll(countries)
		savedCounties.forEach { log.info("Saved : $it") }
	}

	@Test
	fun testSavingCountry() {
		val country = CountryEntity(
			"2",
			"United Arab Emirates",
			"AE",
			"ARE",
			"784",
			"4975593",
			"Abu Dhabi",
			"AS",
			"Dirham",
			"AED",
			"AE",
			"971",
			LocalDateTime.now()
		)
		entityManager.persist(country)
		entityManager.flush()
		val found = countryRepository.findByCountryName(country.countryName)
		assert(found.isPresent)
	}

	@Test
	fun testGetCountriesSaved() {
		val result = countryRepository.findAllByOrderByAddedAtDesc()
		result.forEach { log.info("\t Country '${it.countryName}' saved at ${it.addedAt.format()}") }
		assert(result.size == 2)
	}
}