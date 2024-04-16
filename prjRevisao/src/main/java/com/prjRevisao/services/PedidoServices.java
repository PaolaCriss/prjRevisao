package com.prjRevisao.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.prjRevisao.entities.Pedido;
import com.prjRevisao.repositories.PedidoRepositories;

@Service
public class PedidoServices {

	private final PedidoRepositories pedidoRepositories;
	//construtor que recebe a dependencia
		@Autowired
		public PedidoServices (PedidoRepositories pedidoRepositories) { 
			this.pedidoRepositories = pedidoRepositories;
		}
		public Pedido savePedido (Pedido pedido) {
			return pedidoRepositories.save(pedido);
		}
		
		public Pedido getPedidoById (Long id) {
			return pedidoRepositories.findById(id).orElse (null);
		}
		public List<Pedido> getAllPedido () {
			return pedidoRepositories.findAll();
		}
		public void deletePedido (Long id) { 
			pedidoRepositories.deleteById(id);
		}
	
}
