package com.java.customer;
import java.util.HashSet;
import java.util.Iterator;


public class CustomerOperations {
	 private HashSet<Customer> customers;

	    // Initialize the collection with five customers
	    public CustomerOperations() {
	        customers = new HashSet<>();

	        customers.add(new Customer(101, "Rahul", "Sharma", 'M'));
	        customers.add(new Customer(102, "Priya", "Reddy", 'F'));
	        customers.add(new Customer(103, "Arjun", "Kumar", 'M'));
	        customers.add(new Customer(104, "Sneha", "Rao", 'F'));
	        customers.add(new Customer(105, "Kiran", "Patel", 'M'));
	    }

	    // Method 1: Add a customer
	    public boolean addCustomer(int id, String firstname,
	                               String lastname, char gender) {

	        Customer customer =
	                new Customer(id, firstname, lastname, gender);

	        return customers.add(customer);
	    }

	    // Method 2: Update customer details
	    public boolean updateCustomer(int customerId, String firstname,
	                                  String lastname, char gender) {

	        Iterator<Customer> iterator = customers.iterator();

	        while (iterator.hasNext()) {
	            Customer customer = iterator.next();

	            if (customer.getId() == customerId) {

	                // Remove before modifying fields used by hashCode()
	                iterator.remove();

	                customer.setFirstName(firstname);
	                customer.setLastName(lastname);
	                customer.setGender(gender);

	                customers.add(customer);

	                return true;
	            }
	        }

	        return false;
	    }

	    // Method 3: Delete a customer
	    public boolean deleteCustomer(int customerId) {

	        Iterator<Customer> iterator = customers.iterator();

	        while (iterator.hasNext()) {
	            Customer customer = iterator.next();

	            if (customer.getId() == customerId) {
	                iterator.remove();
	                return true;
	            }
	        }

	        return false;
	    }

	    // Method 4: Retrieve all customers
	    public HashSet<Customer> getCustomers() {
	        return customers;
	    }

	    // Method 5: Find a customer by ID
	    public Customer findCustomerById(int customerId) {

	        for (Customer customer : customers) {
	            if (customer.getId() == customerId) {
	                return customer;
	            }
	        }

	        return null;
	    }

	    // Method 6: Find a customer by first name
	    public Customer findCustomerByFirstname(String firstname) {

	        for (Customer customer : customers) {
	            if (customer.getFirstName().equals(firstname)) {
	                return customer;
	            }
	        }

	        return null;
	    }
	}


