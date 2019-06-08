package com.vinod.limit.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vinod.limit.config.Configuration;
import com.vinod.limit.model.LimitsConfiguration;

@RestController
public class LimitsConfigurationController {

	@Autowired
	private Configuration configuration;
	@GetMapping("/limits")
	public LimitsConfiguration retrievveLimistsFromConfiguration() {
		return new LimitsConfiguration(configuration.getMinimum(),configuration.getMaximum());
	}
}
