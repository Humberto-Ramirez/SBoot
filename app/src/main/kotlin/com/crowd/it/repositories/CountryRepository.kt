package com.crowd.it.repositories

import com.crowd.it.entities.CountryEntity
import org.springframework.data.repository.CrudRepository
import java.util.*

interface CountryRepository : CrudRepository<CountryEntity, Long> {
	fun findByCountryName(countryName: String): Optional<CountryEntity>

	fun findAllByOrderByCreateAtDesc(): ArrayList<CountryEntity>

	fun findByCountryId(id: String): Optional<CountryEntity>
}
