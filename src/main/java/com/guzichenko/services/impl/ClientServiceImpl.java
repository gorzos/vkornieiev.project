package com.guzichenko.services.impl;

import com.guzichenko.dao.ClientDao;
import com.guzichenko.dao.impl.ClientDaoImpl;
import com.guzichenko.domain.Client;
import com.guzichenko.services.ClientService;

public class ClientServiceImpl implements ClientService {

	private ClientDao clientDao = new ClientDaoImpl();

	@Override
	public void createClient(String name, String surname, String phone) {
		Client client = new Client(name, surname, phone);
		boolean result = clientDao.saveClient(client);
		if (result) {
			System.out.println("Client Saved: " + client);
		}
	}

	@Override
	public void deleteClient() {

	}
}
