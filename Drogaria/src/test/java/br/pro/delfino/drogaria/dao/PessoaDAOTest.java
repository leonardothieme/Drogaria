package br.pro.delfino.drogaria.dao;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import br.pro.delfino.drogaria.domain.Cidade;
import br.pro.delfino.drogaria.domain.Pessoa;

public class PessoaDAOTest {

	@Ignore
	@Test
	public void salvar(){
		Long codigoCidade = 2L;
		CidadeDAO cidadeDAO = new CidadeDAO();
		
		Cidade cidade = cidadeDAO.buscar(codigoCidade);
		
		Pessoa pessoa = new Pessoa();

		
		pessoa.setNome("Leonardo");
		pessoa.setCpf("38706255892");
		pessoa.setRg("487156304");
		pessoa.setRua("Valter Rummel");
		pessoa.setNumero(new Short("139"));
		pessoa.setBairro("Teotonio Vilela");
		pessoa.setCep("03928119");
		pessoa.setComplemento("42a");
		pessoa.setTelefone("1127037038");
		pessoa.setCelular("11963830270");
		pessoa.setEmail("leonardo.thieme@bluecycle.com.br");
		
		
		PessoaDAO pessoaDAO = new PessoaDAO();
		pessoaDAO.salvar(pessoa);
		
		
		System.out.println("Registro incluso com sucesso!");

		
	} 
	
	
	@Ignore
	@Test
	public void listar(){
		PessoaDAO pessoaDAO = new PessoaDAO();
		List<Pessoa> resultado = pessoaDAO.listar();
		
		for(Pessoa pessoa : resultado){
			
			System.out.println("Nome: " + pessoa.getNome());
			System.out.println("CPF: "  + pessoa.getCpf());
			System.out.println("RG: " + pessoa.getRg());
			System.out.println("Rua: "    + pessoa.getRua());
			System.out.println("Numero: " + pessoa.getNumero());
			System.out.println("Bairro: " + pessoa.getBairro());
			System.out.println("CEP: " + pessoa.getCep());
			System.out.println("Complemento: " + pessoa.getComplemento());
			System.out.println("Telefone: " + pessoa.getTelefone());
			System.out.println("Celular: " + pessoa.getCelular());
			System.out.println("Email: " + pessoa.getEmail());
			
			System.out.println();
		
		}
		
	}
	@Ignore
	@Test
	public void buscar(){
		Long codigo = 1L;
		PessoaDAO pessoaDAO = new PessoaDAO();
		Pessoa pessoa = pessoaDAO.buscar(codigo);
		
		System.out.println("Nome: " + pessoa.getNome());
		System.out.println("CPF: "  + pessoa.getCpf());
		System.out.println("RG: " + pessoa.getRg());
		System.out.println("Rua: "    + pessoa.getRua());
		System.out.println("Numero: " + pessoa.getNumero());
		System.out.println("Bairro: " + pessoa.getBairro());
		System.out.println("CEP: " + pessoa.getCep());
		System.out.println("Complemento: " + pessoa.getComplemento());
		System.out.println("Telefone: " + pessoa.getTelefone());
		System.out.println("Celular: " + pessoa.getCelular());
		System.out.println("Email: " + pessoa.getEmail());
							
	}	
	
	@Test
	public void excluir(){
		Long codigo = 1L;
		PessoaDAO pessoaDAO = new PessoaDAO();
		Pessoa pessoa = pessoaDAO.buscar(codigo);
		
		pessoaDAO.excluir(pessoa);
		
		System.out.println("Cadastro Pessoa Excluido");

		
		System.out.println("Nome: " + pessoa.getNome());
		System.out.println("CPF: "  + pessoa.getCpf());
		System.out.println("RG: " + pessoa.getRg());
		System.out.println("Rua: "    + pessoa.getRua());
		System.out.println("Numero: " + pessoa.getNumero());
		System.out.println("Bairro: " + pessoa.getBairro());
		System.out.println("CEP: " + pessoa.getCep());
		System.out.println("Complemento: " + pessoa.getComplemento());
		System.out.println("Telefone: " + pessoa.getTelefone());
		System.out.println("Celular: " + pessoa.getCelular());
		System.out.println("Email: " + pessoa.getEmail());
		
		
	}
	
	public void editar(){
		Long codigo = 1L;
		
		PessoaDAO pessoaDAO = new PessoaDAO();
		Pessoa pessoa = pessoaDAO.buscar(codigo);
		
		pessoaDAO.editar(pessoa);
		
	}
	
		
		
		
	
}
