package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Address;
import com.example.demo.repository.AddressRepository;

@Service("addressService")
public class AddressService {

	@Autowired
	private AddressRepository addressRepository;

	public Address getAddress(int id) {
		return addressRepository.getOne(id);
	}
	
	public List<Address> getAllAddress() {
		return addressRepository.findAll();
	}

}
