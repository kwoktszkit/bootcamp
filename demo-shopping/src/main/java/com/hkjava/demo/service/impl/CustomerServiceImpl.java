package com.hkjava.demo.service.impl;

import java.time.LocalDate;
import java.util.Optional;
import org.springframework.stereotype.Service;
import com.hkjava.demo.CustomerDatabase;
import com.hkjava.demo.model.Customer;
import com.hkjava.demo.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {

  @Override
  public Customer create(String name, String email, LocalDate dob) {
    Customer customer = Customer.builder() //
        .name(name).email(email).dob(dob).build();
    CustomerDatabase.add(customer);
    return customer;
  }

  @Override
  public Optional<Customer> find(long id) {
    return CustomerDatabase.find(id);
  }

  @Override
  public Customer create(Customer customer) {
    CustomerDatabase.add(customer);
    return customer;
  }

  @Override
  public Customer remove(long id) {
    return CustomerDatabase.remove(id);
  }

  @Override
  public Customer update(long id, Customer customer) {
    return CustomerDatabase.update(id, customer);
  }

  @Override
  public Customer patchEmail(long id, String email) {
    return CustomerDatabase.patchEmail(id, email);
  }

  @Override
  public Customer patchName(long id, String name) {
    return CustomerDatabase.patchName(id, name);
  }

}
