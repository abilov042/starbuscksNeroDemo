package starbuscksNeroDemo.dataAccess.abstracts;

import java.util.List;

import starbuscksNeroDemo.entities.concetes.Custummer;

public interface CustummerDao {
	void add(Custummer custummer);
	void delete(Custummer custummer);
	void updata(Custummer custummer);
	Custummer getId(int id);
	List<Custummer> getAll();
	
}
