package com.crowd.it.clients

import com.crowd.it.services.AviationService
import org.springframework.cloud.openfeign.FeignClient

@FeignClient(
	name = "Aviation",
	qualifier = "aviation",
	url = "\${clients.aviation.url}"
)
interface AviationClient : AviationService