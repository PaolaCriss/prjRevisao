package com.projetojpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetojpa.entities.Produto;

public interface ProdutoRepositorio extends JpaRepository<Produto, Long>{

}
