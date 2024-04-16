package com.prjRevisao.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import com.prjRevisao.entities.Cliente;

public interface ClienteRepositories extends JpaRepository<Cliente, Long>{

	
}
