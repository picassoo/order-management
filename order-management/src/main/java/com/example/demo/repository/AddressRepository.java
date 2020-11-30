package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.dto.AddressDto;
import com.example.demo.entity.Address;
import com.example.demo.entity.Customer;

@Repository("addressRepository")
public interface AddressRepository extends JpaRepository<Address, Integer> {
	List<AddressDto> findByCustomer(Customer customer);
	
	
}
