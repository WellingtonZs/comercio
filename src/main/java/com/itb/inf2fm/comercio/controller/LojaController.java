package com.itb.inf2fm.comercio.controller;

import java.util.ArrayList;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.itb.inf2fm.comercio.model.Produto;

@Controller
@RequestMapping("/comercio/produtos")
public class LojaController {

	List<Produto> listaDeProdutos = new ArrayList<Produto>();
	
	@GetMapping("/listar")
	public String listarProdutos(Model model) {
		
		Produto p1 = new Produto();
		p1.setId (20l);
		p1.setNome("Maquina de Lavar Brastemp 15L");
		p1.setCodigobarras("213KASDK131233OWE");
		p1.setDescricao("Produto Linha Branca com painel digital");
		p1.setPreco(3215.89);
		p1.setStatus(false);
		
		Produto p2 = new Produto();
		p2.setId (21l);
		p2.setNome("Televisão 70 Polegadas");
		p2.setCodigobarras("213KASDK1ASD13OWE");
		p2.setDescricao("Televisor 70 Polegadas Tela Plana LED Samsung");
		p2.setPreco(6326.12);
		p2.setStatus(true);
		
		Produto p3 = new Produto();
		p3.setId (22l);
		p3.setNome("Honda Civic Si");
		p3.setCodigobarras("213K12312JQW13OWE");
		p3.setDescricao("Honda Civic Si 2007");
		p3.setPreco(63265.62);
		p3.setStatus(true);
		
		// Adicionando os produtos à lista
		
		listaDeProdutos.add(p1);
		listaDeProdutos.add(p2);
		listaDeProdutos.add(p3);
		
		model.addAttribute("listaDeProdutos", listaDeProdutos);
		return "produtos";
		}
		@GetMapping("/novo-produto")
		public String novoProduto(Produto produto,Model model) {
			model.addAttribute("produto", produto);
			
			return "novo-prod";}
		}
		
