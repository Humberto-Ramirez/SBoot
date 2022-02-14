package com.crowd.it.dtos

import com.fasterxml.jackson.annotation.JsonAlias
import com.fasterxml.jackson.annotation.JsonRootName

@JsonRootName("aviationTax")
data class AviationTaxDto constructor(
	val id: String,
	@JsonAlias("tax_id")
	val taxId: String,
	@JsonAlias("tax_name")
	val taxName: String,
	@JsonAlias("iata_code")
	val iAtaCode: String
)
