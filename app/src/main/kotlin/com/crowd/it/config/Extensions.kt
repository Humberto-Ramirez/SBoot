package com.crowd.it.config

import org.springframework.core.ParameterizedTypeReference
import java.time.LocalDateTime
import java.time.format.DateTimeFormatterBuilder
import java.time.temporal.ChronoField
import java.util.*

fun LocalDateTime.format(): String = this.format(dateFormatter)

private fun getMonth(n: Int) = when (n) {
	1 -> "Enero"
	2 -> "Febrero"
	3 -> "Marzo"
	4 -> "Abril"
	5 -> "Mayo"
	6 -> "Junio"
	7 -> "Julio"
	8 -> "Agosto"
	9 -> "Septiembre"
	10 -> "Octubre"
	11 -> "Noviembre"
	12 -> "Diciembre"
	else -> "unknown"
}

private val monthsLookup = (1..12).associate { it.toLong() to getMonth(it) }

private val dateFormatter = DateTimeFormatterBuilder()
	.appendText(ChronoField.MONTH_OF_YEAR, monthsLookup)
	.appendLiteral(" ")
	.appendPattern("dd")
	.appendLiteral(", ")
	.appendPattern("yyyy")
	.toFormatter(Locale.ENGLISH)

inline fun <reified T : Any> typeRef(): ParameterizedTypeReference<T> = object : ParameterizedTypeReference<T>() {}
