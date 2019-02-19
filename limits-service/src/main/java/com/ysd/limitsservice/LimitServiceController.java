package com.ysd.limitsservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ysd.limitsservice.bean.LimitService;

@RestController
public class LimitServiceController {

	@Value("${spring.application.name}")
	private String appName;
	
	@Autowired
	private Configuration conf;

	@GetMapping("/limits")
	public LimitService getLimits() {

		System.out.println(appName);
		return new LimitService(conf.getMinimum(), conf.getMaximum());
	}
}
