package com.itb.inf2fm.comercio.model;

public class Produto {

	private Long id;
	private String nome;
	private String descricao;
	private String codigobarras;
	private double preco;
	private boolean status;
	
	// puclic: acesso liberado para todas as classes
		// private: permitido apenas para os membros da mesma classe
		///setter ou getter: atribuir e recuperar dados do atributo respectivamente
		
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getCodigobarras() {
		return codigobarras;
	}
	public void setCodigobarras(String codigobarras) {
		this.codigobarras = codigobarras;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public boolean getStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}

	
	
	
	}


