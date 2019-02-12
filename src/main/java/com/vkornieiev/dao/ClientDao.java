package com.vkornieiev.dao;

import com.vkornieiev.domain.Client;

public interface ClientDao {

	/**
	 *
	 * @param client
	 * @return
	 */
	boolean saveClient(Client client);

}
