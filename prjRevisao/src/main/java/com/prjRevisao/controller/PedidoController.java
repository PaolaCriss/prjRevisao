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

import com.prjRevisao.entities.Pedido;
import com.prjRevisao.services.PedidoServices;

@RestController
@RequestMapping("/pedido")
public class PedidoController {

		private final PedidoServices pedidoServices;
		
		@Autowired
		public PedidoController (PedidoServices pedidoServices) {
		this.pedidoServices = pedidoServices;
		}
		@PostMapping
		public Pedido createProduct (@RequestBody Pedido pedido) {
		return pedidoServices.savePedido(pedido);
		}
		@GetMapping("/{id}")
		public Pedido getPedido (@PathVariable Long id) {
		return pedidoServices.getPedidoById(id);
		}
		@GetMapping
		public List<Pedido> getAllPedido () {
		return pedidoServices.getAllPedido();
		}
		@DeleteMapping("/(id)")
		public void deletePedido (@PathVariable Long id) {
		pedidoServices.deletePedido (id);
		}
	}

