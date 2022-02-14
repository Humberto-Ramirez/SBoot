package com.crowd.it.dtos.response

data class PaginatedDto<T> constructor(val data: List<T>?) {
	var pagination: PaginationDto = PaginationDto(0, 0, 0, 0)
}
