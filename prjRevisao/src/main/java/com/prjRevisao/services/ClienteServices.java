package com.prjRevisao.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prjRevisao.entities.Cliente;
import com.prjRevisao.repositories.ClienteRepositories;

@Service
public class ClienteServices {
	
	private final ClienteRepositories clienteRepositories;
	//construtor que recebe a dependencia
	@Autowired
	public ClienteServices (ClienteRepositories clienteRepositories) { 
		this.clienteRepositories = clienteRepositories;
	}
	public Cliente saveProduto (Cliente cliente) {
		return clienteRepositories.save(cliente);
	}
	
	public Cliente getClienteById (Long id) {
		return clienteRepositories.findById(id).orElse (null);
	}
	public List<Cliente> getAllCliente () {
		return clienteRepositories.findAll();
	}
	public void deleteCliente (Long id) { clienteRepositories.deleteById(id);
	}
}
