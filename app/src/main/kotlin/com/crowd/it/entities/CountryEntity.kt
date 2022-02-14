package com.crowd.it.entities

import com.crowd.it.config.format
import java.time.LocalDateTime
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
class CountryEntity(
	private val countryId: String,
	val countryName: String,
	val countryIso2: String,
	val countryIso3: String,
	val countryIsoNumeric: String,
	var population: String?,
	val capital: String?,
	val continent: String,
	val currencyName: String?,
	val currencyCode: String?,
	val fipsCode: String?,
	val phonePrefix: String?,
	override var createdBy: String,
	override val createAt: LocalDateTime = LocalDateTime.now(),
	override var updatedBy: String? = null,
	override var updatedAt: LocalDateTime? = null,
	@Id @GeneratedValue
	val id: Long? = null,
) : Auditable {
	override fun toString(): String {
		return "( id=" + id +
				", countryId= " + countryId +
				", countryName= " + countryName +
				", countryIso2= " + countryIso2 +
				", countryIso3= " + countryIso3 +
				", countryIsoNumeric= " + countryIsoNumeric +
				", population= " + population +
				", capital= " + capital +
				", continent= " + continent +
				", currencyName= " + currencyName +
				", currencyCode= " + currencyCode +
				", fipsCode= " + fipsCode +
				", phonePrefix= " + phonePrefix +
				", addedAt= " + createAt.format() +
				", addedBy= " + createdBy +
				", updatedAt= " + (updatedAt?.format() ?: "") +
				", updatedBy= " + updatedBy +
				" )"
	}
}