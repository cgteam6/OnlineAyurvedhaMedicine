package com.cg.repository;

public interface CustomerRepository {
	public Customer addCustomer(Customer Customer);
	public Customer updateCustomer(Customer Customer) throws CustomerNotFoundException;
	public Customer viewCustomer(Customer Customer) throws CustomerNotFoundException;
	public Customer deleteCustomer(int Customerid) throws CustomerNotFoundException;
	public List<Customer> showAllCustomers();

}
