package starbuscksNeroDemo.business.concretes;

import starbuscksNeroDemo.business.abstracts.BaseCustummerManager;
import starbuscksNeroDemo.core.abstracts.CustummerCheckService;
import starbuscksNeroDemo.entities.concetes.Custummer;

public class StarbucksCustummerManager extends BaseCustummerManager {
		private CustummerCheckService custummerCheckService;
		
	public StarbucksCustummerManager(CustummerCheckService custummerCheckService) {
			super();
			this.custummerCheckService = custummerCheckService;
		}

	@Override
	public void seve(Custummer custummer) {
		if(custummerCheckService.CheckDate(custummer)) {
			super.seve(custummer);
		}
		else {
			System.out.println("Eklenemedi");
		}
		
		
	}

}
