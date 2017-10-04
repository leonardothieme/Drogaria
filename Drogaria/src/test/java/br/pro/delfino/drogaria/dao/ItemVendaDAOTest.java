package br.pro.delfino.drogaria.dao;

import java.math.BigDecimal;

import org.junit.Test;

import br.pro.delfino.drogaria.domain.ItemVenda;
import br.pro.delfino.drogaria.domain.Produto;

public class ItemVendaDAOTest {
	
	
	@Test
	public void salvar(){
		 
		Long codigoProduto = 3L;
		
		
		ProdutoDAO produtoDAO = new ProdutoDAO();
		Produto produto 	  = produtoDAO.buscar(codigoProduto);
		
		
		
		
		
		ItemVenda itemVenda = new ItemVenda();
		itemVenda.setQuantidade(new Short("10"));
		itemVenda.setPrecoParcial(new BigDecimal("10.90"));
		
		
	
		
		
		
	}

}
