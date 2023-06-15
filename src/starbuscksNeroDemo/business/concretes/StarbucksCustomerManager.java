package starbuscksNeroDemo.business.concretes;

import starbuscksNeroDemo.business.abstracts.BaseCustomerManager;
import starbuscksNeroDemo.core.abstracts.CustomerCheckService;
import starbuscksNeroDemo.entities.concetes.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {
		private CustomerCheckService customerCheckService;
		
	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
			super();
			this.customerCheckService = customerCheckService;
		}

	@Override
	public void seve(Customer customer) {
		if(customerCheckService.CheckDate(customer)) {
			super.seve(customer);
		}
		else {
			System.out.println("Eklenemedi");
		}
		
		
	}

}
