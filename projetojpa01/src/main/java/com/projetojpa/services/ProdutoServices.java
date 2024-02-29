	package com.projetojpa.services;
	import java.util.List;
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Service;
	import com.projetojpa.entities.Produto;
	import com.projetojpa.repository.ProdutoRepositorio;

	@Service
	public class ProdutoServices {
	private final ProdutoRepositorio produtoRepositorio;
	//construtor que recebe a dependencia
	@Autowired
	public ProdutoServices (ProdutoRepositorio produtoRepositorio) {
		this.produtoRepositorio = produtoRepositorio;
	}
	public Produto saveProduto (Produto produto) { 
		return produtoRepositorio.save (produto);
	}
	public Produto getProdutoById(Long id) {
		return produtoRepositorio.findById(id).orElse (null);
	}
	public List<Produto> getAllProdutos () {
		return produtoRepositorio.findAll(); 
	}
	public void deleteProduto (Long id) {
		produtoRepositorio.deleteById(id);
	}
}