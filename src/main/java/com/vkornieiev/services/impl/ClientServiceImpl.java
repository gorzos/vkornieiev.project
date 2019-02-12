package com.vkornieiev.services.impl;

import com.vkornieiev.dao.ClientDao;
import com.vkornieiev.dao.impl.ClientDaoImpl;
import com.vkornieiev.domain.Client;
import com.vkornieiev.services.ClientService;

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
