package starbuscksNeroDemo;

import starbuscksNeroDemo.business.abstracts.CustomerService;
import starbuscksNeroDemo.business.concretes.StarbucksCustomerManager;
import starbuscksNeroDemo.core.concretes.KPSPublicCheckReferenseAdapter;
import starbuscksNeroDemo.entities.concetes.Customer;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		Customer customer = new Customer(1, 12344, "Shamil", "Abilov", LocalDate.of(2004,11, 8));
		CustomerService customerService = new StarbucksCustomerManager(new KPSPublicCheckReferenseAdapter());
		customerService.seve(customer);
	}

}
