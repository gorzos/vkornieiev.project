package com.vkornieiev.dao.impl;

import com.vkornieiev.dao.ClientDao;
import com.vkornieiev.domain.Client;

public class ClientDaoImpl implements ClientDao {

	@Override
	public boolean saveClient(Client client) {
		System.out.println("Saving.... Please wait");
		return true;
	}
}
