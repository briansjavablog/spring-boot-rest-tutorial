package com.blog.samples.boot.rest.data;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.joda.time.DateTime;
import org.springframework.stereotype.Component;

import com.blog.samples.boot.rest.model.Address;
import com.blog.samples.boot.rest.model.Customer;

@Component
public class DataBuilder {
	
	public List<Customer> createCustomers() {

		Customer customer1 = new Customer("Joe", "Smith", LocalDate.of(1982, 1, 10)/*DateTime.parse("1982-01-10").toDate()*/,
				new Address("High Street", "Belfast", "Down", "BT893PY"));

		Customer customer2 = new Customer("Paul", "Jones", LocalDate.of(1973, 1, 3)/*DateTime.parse("1973-01-03").toDate()*/,
				new Address("Main Street", "Lurgan", "Armagh", "BT283FG"));

		Customer customer3 = new Customer("Steve", "Toale", LocalDate.of(1979, 3, 8) /*DateTime.parse("1979-03-08").toDate()*/,
				new Address("Main Street", "Newry", "Down", "BT359JK"));
		
		return Arrays.asList(customer1, customer2, customer3);
	}
}