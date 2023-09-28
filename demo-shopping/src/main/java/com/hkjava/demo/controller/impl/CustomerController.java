package com.hkjava.demo.controller.impl;

import java.time.LocalDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.hkjava.demo.controller.CustomerOperation;
import com.hkjava.demo.model.Customer;
import com.hkjava.demo.service.CustomerService;

@RestController
@RequestMapping(value = "/api/v1")
public class CustomerController implements CustomerOperation {

  @Autowired
  CustomerService customerService;

  @Override

  @Override
  public Customer create(String name, String email, LocalDate dob) {
    return customerService.create(name, email, dob);
  }

  @Override
  public Customer find(String customerId) {
    if (!customerId.isBlank()) {
      try {
        long id = Integer.valueOf(customerId);
        return customerService.find(id).orElse(null);
      } catch (NumberFormatException e) {
        return null;
      }
    }
    return null;
  }

  @Override
  public Customer createCustomer(Customer customer) {
    return null;
  }

  @Override
  public Customer remove(String customerId) {
    return null;
  }

  @Override
  public Customer update(String id, Customer customer) {
    return null;
  }

  @Override
  public Customer patchEmail(String id, String email) {
    return null;
  }

  @Override
  public Customer patchName(String id, String name) {
    return null;
  }

  @Override
  public Customer patchName(String customerId, String name)
}