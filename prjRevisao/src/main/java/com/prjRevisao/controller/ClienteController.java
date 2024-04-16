package com.prjRevisao.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prjRevisao.entities.Cliente;
import com.prjRevisao.services.ClienteServices;

@RestController
@RequestMapping("/cliente")
public class ClienteController {
	private final ClienteServices clienteServices;
	
	@Autowired
	public ClienteController (ClienteServices clienteServices) {
	this.clienteServices = clienteServices;
	}
	@PostMapping
	public Cliente createProduct (@RequestBody Cliente cliente) {
	return clienteServices.saveProduto(cliente);
	}
	@GetMapping("/{id}")
	public Cliente getCliente (@PathVariable Long id) {
	return clienteServices.getClienteById(id);
	}
	@GetMapping
	public List<Cliente> getAllCliente () {
	return clienteServices.getAllCliente();
	}
	@DeleteMapping("/(id)")
	public void deleteCliente (@PathVariable Long id) {
	clienteServices.deleteCliente (id);
	}
}
