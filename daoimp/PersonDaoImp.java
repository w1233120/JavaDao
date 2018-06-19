package tw.com.lccnet.daoimp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import tw.com.lccnet.dao.PersonDao;
import tw.com.lccnet.jdbc.DataBaseManger;
import tw.com.lccnet.pojo.Person;

public class PersonDaoImp implements PersonDao {

	@Override
	public void addPerson(Person person) {
		Connection conn=DataBaseManger.getConnection();
		String sql="inster into person(name,age,sex)value(?,?,?)";
		PreparedStatement ps=null;
		
		try {
			ps=conn.prepareStatement(sql);
			
			ps.setString(1, person.getName());
			ps.setString(2, person.getAge());
			ps.setString(3, person.getSex());
			
			ps.execute();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			DataBaseManger.close(ps);
			DataBaseManger.close(conn);
		}
	}

	@Override
	public Person findId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Person> findName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Person> findAge(int age) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Person> findSex(String sex) {
		// TODO Auto-generated method stub
		return null;
	}

}
