package com.blog.samples.boot.rest.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.blog.samples.boot.rest.repository.CustomerRepository;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class DataLoader implements ApplicationListener<ContextRefreshedEvent>{

	@Autowired
	private DataBuilder dataBuilder;
	
	@Autowired
	private CustomerRepository customerRepository;

	@Override
	public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {

		log.debug("Loading test data...");
		dataBuilder.createCustomers().forEach(customer -> customerRepository.save(customer));
		log.debug("Test data loaded...");
	}
}