package com.guzichenko.dao.impl;

import com.guzichenko.dao.ClientDao;
import com.guzichenko.domain.Client;

public class ClientDaoImpl implements ClientDao {

	@Override
	public boolean saveClient(Client client) {
		System.out.println("Saving.... Please wait");
		return true;
	}
}
