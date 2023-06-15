package starbuscksNeroDemo.business.abstracts;

import starbuscksNeroDemo.entities.concetes.Custummer;

public abstract class BaseCustummerManager implements CustummerService {
	@Override
	public void seve(Custummer custummer) {
		System.out.println("eklendi "+custummer.getFirstName());
		
	}
		
}
