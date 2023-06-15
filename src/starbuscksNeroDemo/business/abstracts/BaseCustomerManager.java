package starbuscksNeroDemo.business.abstracts;

import starbuscksNeroDemo.entities.concetes.Customer;

public abstract class BaseCustomerManager implements CustomerService {
	@Override
	public void seve(Customer customer) {
		System.out.println("eklendi "+customer.getFirstName());
		
	}
		
}
