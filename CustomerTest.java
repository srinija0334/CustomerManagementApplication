package com.java.customer;

public class CustomerTest {

	public static void main(String[] args) {
		 CustomerOperations operations = new CustomerOperations();

	        // 1. Display all initial customers
	        System.out.println("Initial Customers:");
	        for (Customer customer : operations.getCustomers()) {
	            System.out.println(customer);
	        }

	        // 2. Add a new customer
	        System.out.println("Adding Customer:");
	        boolean added = operations.addCustomer(
	                106, "Ananya", "Verma", 'F');

	        System.out.println("Customer added: " + added);

	        // 3. Attempt to add the same customer again
	        System.out.println("Adding Duplicate Customer:");
	        boolean duplicate = operations.addCustomer(
	                106, "Ananya", "Verma", 'F');

	        System.out.println("Customer added: " + duplicate);

	        // 4. Update customer with ID 103
	        System.out.println("Updating Customer ID 103:");
	        boolean updated = operations.updateCustomer(
	                103, "Arjun", "Reddy", 'M');

	        System.out.println("Customer updated: " + updated);
	        System.out.println(operations.findCustomerById(103));

	        // 5. Delete customer with ID 104
	        System.out.println("Deleting Customer ID 104:");
	        boolean deleted = operations.deleteCustomer(104);

	        System.out.println("Customer deleted: " + deleted);

	        // 6. Find customer with ID 102
	        System.out.println("Finding Customer ID 102:");
	        Customer customerById = operations.findCustomerById(102);

	        if (customerById != null) {
	            System.out.println(customerById);
	        } else {
	            System.out.println("Customer not found");
	        }

	        // 7. Find customer by first name Kiran
	        System.out.println("Finding Customer by First Name Kiran:");
	        Customer customerByName =
	                operations.findCustomerByFirstname("Kiran");

	        if (customerByName != null) {
	            System.out.println(customerByName);
	        } else {
	            System.out.println("Customer not found");
	        }

	        // 8. Find a nonexistent customer
	        System.out.println("Finding Customer ID 999:");
	        Customer missingCustomer = operations.findCustomerById(999);

	        if (missingCustomer != null) {
	            System.out.println(missingCustomer);
	        } else {
	            System.out.println("Customer with ID 999 not found");
	        }

	        // 9. Display all customers after operations
	        System.out.println("Final Customer List:");
	        for (Customer customer : operations.getCustomers()) {
	            System.out.println(customer);
	        }
	    }
		

	}


