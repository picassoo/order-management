package com.example.demo;

import java.time.LocalDate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.example.demo.entity.Order;

@SpringBootApplication
public class OrderManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderManagementApplication.class, args);

		LocalDate date = LocalDate.of(2020, 10, 10);

		Order order = new Order();
		order.setId(0);
		order.setReceivedDate(date);
		order.setTotalAmount(20);

		System.out.println(order);

	}

}
