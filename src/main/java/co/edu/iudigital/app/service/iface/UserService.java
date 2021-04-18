package co.edu.iudigital.app.service.iface;

import co.edu.iudigital.app.model.entity.User;

public interface UserService {
	/**
	 * crear user
	 * @param user
	 */
	
	public void create(User user);
	
	/**
	 * Loguin usuario
	 * @param user
	 * @return
	 * @throws Exception
	 */
	public User login(User user)throws Exception;
	
}
