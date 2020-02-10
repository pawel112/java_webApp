package pl.pawel112.webapp;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public class UserDAO {

	List<User> user_list = new ArrayList<User>();
	
	public void addUser(User user)
	{
		user_list.add(user);
	}
	
	public List<User> getUser()
	{
		return user_list;
	}
	
	public User getUserbyId(Integer id)
	{
		if (id<user_list.size())
		{
			return user_list.get(id);
		}
		else
		{
			return null;
		}
	}
	
}