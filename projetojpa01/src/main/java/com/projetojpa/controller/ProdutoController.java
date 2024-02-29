	package com.projetojpa.controller;
	import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projetojpa.entities.Produto;
import com.projetojpa.services.ProdutoServices;
	@RestController
	@RequestMapping("/produtos")
	public class ProdutoController {
	private final ProdutoServices produtoservices;
	@Autowired
	public ProdutoController (ProdutoServices produtoservices) {
	this.produtoservices = produtoservices;
	}
	@PostMapping
	public Produto createProduct (@RequestBody Produto produto) {
		return produtoservices.saveProduto (produto);
	}
	@GetMapping("/{id}")
	public Produto getProduto (@PathVariable Long id) {
	return produtoservices.getProdutoById(id);
	}
	@GetMapping
	public List<Produto> getAllProdutos () {
	return produtoservices.getAllProdutos ();
	}
	@DeleteMapping("/{id}")
	public void deleteProduto (@PathVariable Long id) {
	produtoservices.deleteProduto(id);
	}
}