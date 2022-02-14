package com.crowd.it.config

import feign.RequestInterceptor
import feign.RequestTemplate
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Component


@Component
class AviationInterceptor : RequestInterceptor {

	@Value("\${clients.aviation.apikey}")
	private val apiKey = ""

	override fun apply(template: RequestTemplate) {
		val client = template.feignTarget()
		if (client.name().equals("Aviation")) {
			val queryParams: MutableMap<String, Collection<String>> = template.queries().toMutableMap()
			queryParams["access_key"] = mutableListOf(apiKey)
			template.queries(queryParams)
		}
	}
}