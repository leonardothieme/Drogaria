
package br.pro.delfino.drogaria.dao;

import java.math.BigDecimal;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import br.pro.delfino.drogaria.domain.Fabricante;
import br.pro.delfino.drogaria.domain.Produto;

public class ProdutoDAOTest {
	@Test
	

	public void salvar() {
		FabricanteDAO fabricanteDAO = new FabricanteDAO();
		Fabricante fabricante = fabricanteDAO.buscar(new Long("1"));

		Produto produto = new Produto();
		produto.setDescricao("Cataflan 50mg com 20 Comprimidos");
		produto.setFabricante(fabricante);
		produto.setPreco(new BigDecimal("13.70"));
		produto.setQuantidade(new Short("7"));

		ProdutoDAO produtoDAO = new ProdutoDAO();
		produtoDAO.salvar(produto);

		System.out.println("Produto salvo com sucesso");
	}

	@Ignore
	@Test
	public void listar() {
		ProdutoDAO produtoDAO = new ProdutoDAO();
		List<Produto> resultado = produtoDAO.listar();

		for (Produto produto : resultado) {
			System.out.println("Codigo Produto: " + produto.getCodigo());
			System.out.println("Descricao Produto: " + produto.getDescricao());
			System.out.println("Codigo Fabricante: " + produto.getFabricante().getCodigo());
			System.out.println("Descricao do Fabricante: " + produto.getFabricante().getDescricao());
			System.out.println("Preço  Produto: " + produto.getPreco());
			System.out.println("Quantidade  Produto: " + produto.getQuantidade());

			System.out.println();
		}
	}

	@Ignore
	@Test
	public void buscar() {
		Long codigo = 2L;
		ProdutoDAO produtoDAO = new ProdutoDAO();
		Produto produto = produtoDAO.buscar(codigo);

		System.out.println("Codigo Produto: " + produto.getCodigo());
		System.out.println("Descricao Produto: " + produto.getDescricao());
		System.out.println("Codigo Fabricante: " + produto.getFabricante().getCodigo());
		System.out.println("Descricao do Fabricante: " + produto.getFabricante().getDescricao());
		System.out.println("Preço  Produto: " + produto.getPreco());
		System.out.println("Quantidade  Produto: " + produto.getQuantidade());

	}

	@Ignore
	@Test
	public void excluir() {
		Long codigo = 1L;
		ProdutoDAO produtoDAO = new ProdutoDAO();
		Produto produto = produtoDAO.buscar(codigo);

		produtoDAO.excluir(produto);

		System.out.println("Produto Removido");

		System.out.println("Codigo Produto: " + produto.getCodigo());
		System.out.println("Descricao Produto: " + produto.getDescricao());
		System.out.println("Codigo Fabricante: " + produto.getFabricante().getCodigo());
		System.out.println("Descricao do Fabricante: " + produto.getFabricante().getDescricao());
		System.out.println("Preço  Produto: " + produto.getPreco());
		System.out.println("Quantidade  Produto: " + produto.getQuantidade());

	}
	@Ignore
	@Test
	public void editar() {
		Long codigoProduto = 2L;
		Long codigoFabricante = 2L;

		ProdutoDAO produtoDAO = new ProdutoDAO();
		Produto produto = produtoDAO.buscar(codigoProduto);

		FabricanteDAO fabricanteDAO = new FabricanteDAO();
		Fabricante fabricante = fabricanteDAO.buscar(codigoFabricante);

		System.out.println("Produto a ser editado");

		System.out.println("Codigo Produto: " + produto.getCodigo());
		System.out.println("Descricao Produto: " + produto.getDescricao());
		System.out.println("Codigo Fabricante: " + produto.getFabricante().getCodigo());
		System.out.println("Descricao do Fabricante: " + produto.getFabricante().getDescricao());
		System.out.println("Preço  Produto: " + produto.getPreco());
		System.out.println("Quantidade  Produto: " + produto.getQuantidade());

		produto.setDescricao("Lactopurga");
	    produtoDAO.editar(produto);
	    produto.setFabricante(fabricante);
	    
	    System.out.println("Produto editado");

		System.out.println("Codigo Produto: " + produto.getCodigo());
		System.out.println("Descricao Produto: " + produto.getDescricao());
		System.out.println("Codigo Fabricante: " + produto.getFabricante().getCodigo());
		System.out.println("Descricao do Fabricante: " + produto.getFabricante().getDescricao());
		System.out.println("Preço  Produto: " + produto.getPreco());
		System.out.println("Quantidade  Produto: " + produto.getQuantidade());
	    
	    
		
		
		
	}

}
