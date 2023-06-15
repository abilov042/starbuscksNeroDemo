package starbuscksNeroDemo.mernisServiseReferense;

import java.time.LocalDate;

public class KPSPublicSoapClinet {
	public boolean checkDate(long nationalityId,String firtsName,String lastName, LocalDate dateOfYear) {
		if(dateOfYear.getYear()<2005) {
			return true;
		}
		return false;
	}
}
