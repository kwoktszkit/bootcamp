package com.hkjava.demo.controller;

import java.time.LocalDate;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import com.hkjava.demo.model.Customer;

public interface CustomerOperation {

  @PostMapping(value = "/customer") // noun, No verb
  Customer create(@RequestParam String name, //
      @RequestParam String email, //
      @RequestParam LocalDate dob);
  // @GetMapping(value = "/customer/{id}") // noun, No verb
  // Customer create(@PathVariable(name = "id") String customerId);

  @GetMapping(value = "/customer/{id}")
  Customer find(@PathVariable(name = "id") String customerId);

  @PostMapping(value = "/customer")
  Customer createCustomer(@RequestBody Customer customer);

  @DeleteMapping(value = "/customer/{id}")
  Customer move(@PathVariable(name = "id") String customerId);

  @PutMapping(value = "/customer/{id}")
  Customer update(@PathVariable String id, @RequestBody Customer customerId);

  @PatchMapping(value = "/customer/id/{id}/email/{email}")
  Customer patchEmail(@PathVariable String email);

  @PatchMapping(value = "/customer/id/{id}/name/{name}")
  Customer patchName(@PathVariable String name);

}