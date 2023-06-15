package starbuscksNeroDemo.dataAccess.abstracts;

import java.util.List;

import starbuscksNeroDemo.entities.concetes.Customer;

public interface CustomerDao {
	void add(Customer customer);
	void delete(Customer customer);
	void updata(Customer customer);
	Customer getId(int id);
	List<Customer> getAll();
	
}
