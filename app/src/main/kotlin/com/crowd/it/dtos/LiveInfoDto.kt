package com.crowd.it.dtos

data class LiveInfoDto constructor(
	val updated: String,
	val latitude: String,
	val longitude: String,
	val altitude: String,
	val direction: String,
	val speed_horizontal: String,
	val speed_vertical: String,
	val is_ground: String,
)