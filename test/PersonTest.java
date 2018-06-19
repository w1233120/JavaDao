package tw.com.lccnet.test;

import tw.com.lccnet.dao.PersonDao;
import tw.com.lccnet.daofactory.PersonDaoFactory;
import tw.com.lccnet.pojo.Person;

public class PersonTest {

	public static void main(String[] args) {
		PersonDao pado=PersonDaoFactory.getPersonDao();
		
		Person d1=new Person();
		d1.setName("eric");
		d1.setAge("30");
		d1.setSex("M");
		pado.addPerson(d1);

	}

}
