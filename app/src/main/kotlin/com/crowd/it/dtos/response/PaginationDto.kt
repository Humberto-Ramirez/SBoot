package com.crowd.it.dtos.response

import com.fasterxml.jackson.annotation.JsonRootName

@JsonRootName("pagination")
data class PaginationDto(
	val limit: Int,
	val offset: Int,
	val count: Int,
	val total: Int
)
