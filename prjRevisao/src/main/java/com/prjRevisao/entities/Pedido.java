package com.prjRevisao.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "Pedido")
public class Pedido {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id_pedido;
	@Column (name = "Item")
	private String item;
		
	public Long getId_pedido() {
		return id_pedido;
	}
	public void setId_pedido(Long id_pedido) {
		this.id_pedido = id_pedido;
	}
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
		
	}
}
