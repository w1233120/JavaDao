package tw.com.lccnet.dao;

import java.util.List;

import tw.com.lccnet.pojo.Person;

public interface PersonDao {
	public abstract void addPerson(Person person);
	
	public Person findId(int id);
	public List<Person> findName(String name);
	public List<Person> findAge(int age);
	public List<Person> findSex(String sex);
}
