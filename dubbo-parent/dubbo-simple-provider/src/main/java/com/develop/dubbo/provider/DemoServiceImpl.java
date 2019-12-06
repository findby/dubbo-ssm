package com.develop.dubbo.provider;

import org.springframework.stereotype.Service;

import com.develop.dubbo.api.DemoService;
@Service
public class DemoServiceImpl implements DemoService{

	public String sayHello(String name) {
		return "Hello "+ name;
	}

}
