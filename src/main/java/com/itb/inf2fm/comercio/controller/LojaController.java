package com.itb.inf2fm.comercio.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.itb.inf2fm.comercio.model.Produto;

@Controller
@RequestMapping("/comercio/produtos")
public class LojaController {

	List<Produto> listaDeProdutos = new ArrayList<Produto>();
	
	@GetMapping("/listar")
	public String listarProdutos() {
		
		Produto p1 = new Produto();
		p1.setId (20l);
		p1.setNome("Maquina de Lavar Brastemp 15L");
		p1.setCodigobarras("213KASDK131233OWE");
		p1.setDescricao("Produto Linha Branca com painel digital");
		p1.setPreco(3215.89);
		
		Produto p2 = new Produto();
		p1.setId (20l);
		p1.setNome("Televisão 70 Polegadas");
		p1.setCodigobarras("213KASDK1ASD13OWE");
		p1.setDescricao("Televisor 70 Polegadas Tela Plana LED Samsung");
		p1.setPreco(6326.12);
		
		Produto p3 = new Produto();
		p1.setId (20l);
		p1.setNome("Honda Civic Si");
		p1.setCodigobarras("213K12312JQW13OWE");
		p1.setDescricao("Honda Civic Si 2007");
		p1.setPreco(63265.62);
		
		
		// Adicionando os produtos à lista
		
		listaDeProdutos.add(p1);
		listaDeProdutos.add(p2);
		listaDeProdutos.add(p3);
		
		return "produtos";
	}
}
