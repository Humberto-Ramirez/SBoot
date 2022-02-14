package com.crowd.it.entities

import java.time.LocalDateTime


interface Auditable {
	var createdBy: String
	val createAt: LocalDateTime
	var updatedBy: String?
	var updatedAt: LocalDateTime?
}