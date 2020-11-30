package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Address;
import com.example.demo.request.IdRequeest;
import com.example.demo.service.AddressService;

@RestController
@RequestMapping("/address/v1")
public class AddressController {

	@Autowired
	private AddressService addressService;
	
	@GetMapping("/getAll")
	public List<Address> all() {
		return addressService.getAllAddress();
	}

	@PostMapping(value = "/getAddress", consumes = { MediaType.APPLICATION_JSON_VALUE }, produces = {
			MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<Address> getAddress(@RequestBody IdRequeest customerVO) {
		Address address = addressService.getAddress(customerVO.getId());
		return ResponseEntity.ok().body(address);
	}

}
