package tw.com.lccnet.daofactory;

import tw.com.lccnet.dao.PersonDao;
import tw.com.lccnet.daoimp.PersonDaoImp;

public class PersonDaoFactory {
	public static PersonDao getPersonDao(){
		return new PersonDaoImp();
		// PersonDao ??=new PersonDaoImp();
	}
}
