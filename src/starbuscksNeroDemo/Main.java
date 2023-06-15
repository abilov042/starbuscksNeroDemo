package starbuscksNeroDemo;

import starbuscksNeroDemo.business.abstracts.CustummerService;
import starbuscksNeroDemo.business.concretes.StarbucksCustummerManager;
import starbuscksNeroDemo.core.concretes.KPSPublicCheckReferenseAdapter;
import starbuscksNeroDemo.entities.concetes.Custummer;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		Custummer custummer = new Custummer(1, 12344, "Shamil", "Abilov", LocalDate.of(2004,11, 8));
		CustummerService custummerService = new StarbucksCustummerManager(new KPSPublicCheckReferenseAdapter());
		custummerService.seve(custummer);
	}

}
