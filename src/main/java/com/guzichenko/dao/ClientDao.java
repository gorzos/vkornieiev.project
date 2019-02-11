package com.guzichenko.dao;

import com.guzichenko.domain.Client;

public interface ClientDao {

	/**
	 *
	 * @param client
	 * @return
	 */
	boolean saveClient(Client client);

}
