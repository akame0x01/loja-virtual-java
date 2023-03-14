package br.com.alura.jdbc.controller;

import java.sql.Connection;
import java.util.List;

import br.com.alura.jdbc.dao.ProdutoDAO;
import br.com.alura.jdbc.factory.ConnectionFactory;
import br.com.alura.jdbc.modelo.Produto;

public class ProdutoController {

	private ProdutoDAO produtodao;
	
	public ProdutoController() {
		Connection connection = new ConnectionFactory().recuperarConexao();
		
		this.produtodao = new ProdutoDAO(connection);
	}
	
	
	public void deletar(Integer id) {
		System.out.println("Deletando produto");
		this.produtodao.deletar(id);
	}

	public void salvar(Produto produto) {
		System.out.println("Salvando produto");
		this.produtodao.salvar(produto);
	}

	public List<Produto> listar() {	
		return this.produtodao.listar();
	}

	public void alterar(String nome, String descricao, Integer id) {
		System.out.println("Alterando produto");
		this.produtodao.alterar(nome, descricao, id);
	}
}
