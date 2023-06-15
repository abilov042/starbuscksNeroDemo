package starbuscksNeroDemo.core.concretes;

import starbuscksNeroDemo.core.abstracts.CustummerCheckService;
import starbuscksNeroDemo.entities.concetes.Custummer;
import starbuscksNeroDemo.mernisServiseReferense.KPSPublicSoapClinet;

public class KPSPublicCheckReferenseAdapter implements CustummerCheckService {

	@Override
	public boolean CheckDate(Custummer custummer) {
		
		KPSPublicSoapClinet client  = new KPSPublicSoapClinet();
		
		return client.checkDate(custummer.getNationalityId(), custummer.getFirstName(), custummer.getLastName(), custummer.getDateOfYear() );
	}

	

}
