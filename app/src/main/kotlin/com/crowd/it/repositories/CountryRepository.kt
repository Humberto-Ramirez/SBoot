package com.crowd.it.repositories

import com.crowd.it.entities.CountryEntity
import org.springframework.data.repository.CrudRepository
import java.util.*
import kotlin.collections.ArrayList

interface CountryRepository : CrudRepository<CountryEntity, Long> {
	fun findByCountryName(countryName: String): Optional<CountryEntity>

	// findAllByOrderByAddedAtDesc
	fun findAllByOrderByAddedAtDesc(): ArrayList<CountryEntity>
}
