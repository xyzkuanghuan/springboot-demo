package com.xyz.spring.boot.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wordnik.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = "/")
public class IndexController {
	
	@ApiOperation(value = "首页", httpMethod = "GET", notes = "获取首页数据", response = Map.class)
	@GetMapping(value = "/index")
	public Map<String, Object> index() {
		Map<String, Object> retMap = new HashMap<String, Object>();
		retMap.put("key1", 1);
		retMap.put("key2", "value2");
		retMap.put("key3", null);
		return retMap;
	}
	
	@GetMapping(value = "/token")
	public String token() {
		return "Hello spring boot token";
	}

}
