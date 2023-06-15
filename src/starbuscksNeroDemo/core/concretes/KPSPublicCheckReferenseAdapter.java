package starbuscksNeroDemo.core.concretes;

import starbuscksNeroDemo.core.abstracts.CustomerCheckService;
import starbuscksNeroDemo.entities.concetes.Customer;
import starbuscksNeroDemo.mernisServiseReferense.KPSPublicSoapClinet;

public class KPSPublicCheckReferenseAdapter implements CustomerCheckService {

	@Override
	public boolean CheckDate(Customer customer) {
		
		KPSPublicSoapClinet client  = new KPSPublicSoapClinet();
		
		return client.checkDate(customer.getNationalityId(), customer.getFirstName(), customer.getLastName(), customer.getDateOfYear() );
	}

	

}
