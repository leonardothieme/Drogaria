package br.pro.delfino.drogaria.dao;

import java.text.ParseException;
import java.util.Date;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import br.pro.delfino.drogaria.domain.Cliente;
import br.pro.delfino.drogaria.domain.Pessoa;
public class ClienteDAOTest {

	
	@Test
	@Ignore
	
	public void salvar() throws ParseException{
		Long codigoPessoa = 2L;
		PessoaDAO pessoaDAO = new PessoaDAO();
		
		Pessoa pessoa = pessoaDAO.buscar(codigoPessoa);
		
		Cliente cliente = new Cliente();
		cliente.setDataCadastro(new Date());
		cliente.setLiberado(true);
		cliente.setPessoa(pessoa);
			
		ClienteDAO clienteDAO =new ClienteDAO();
		clienteDAO.salvar(cliente);
		
		System.out.println("Cliente Salvo com Sucesso!");
	}

	@Ignore
	@Test
	public void listar(){
		ClienteDAO clienteDAO = new ClienteDAO();
		List<Cliente> resultado = clienteDAO.listar();
		
	for(Cliente cliente : resultado){
		System.out.println(cliente.getCodigo());
		System.out.println(cliente.getDataCadastro());
		System.out.println(cliente.getLiberado());
		System.out.println(cliente.getPessoa().getNome());
		
		System.out.println();
	}	
		
 }
	@Test
	@Ignore
   public void buscar(){
	   Long codigo = 2L;
	   
	   ClienteDAO clienteDAO = new ClienteDAO();
	   Cliente cliente 	     = clienteDAO.buscar(codigo);
	   
	   System.out.println(cliente.getCodigo());
		System.out.println(cliente.getDataCadastro());
		System.out.println(cliente.getLiberado());
		System.out.println(cliente.getPessoa().getNome());
		
		System.out.println();
	   
   }
	@Ignore
	@Test
	public void excluir(){
	 Long codigo = 1L;
	 
	 ClienteDAO clienteDAO = new ClienteDAO();
	 Cliente cliente = clienteDAO.buscar(codigo);
	 
	 clienteDAO.excluir(cliente);
	 
		System.out.println("Excluido com sucesso!");
		
		
	}

	@Ignore
    @Test
	public void editar(){
		Long codigoCliente = 4L;
		Long codigoPessoa = 3L;
		
		PessoaDAO pessoaDAO = new PessoaDAO();
		Pessoa pessoa = pessoaDAO.buscar(codigoPessoa);
		
		ClienteDAO clienteDAO = new ClienteDAO();
		Cliente cliente = clienteDAO.buscar(codigoPessoa);
		
		cliente.setDataCadastro(new Date());
		clienteDAO.editar(cliente);
		cliente.setPessoa(pessoa);
		
		System.out.println("Alterado com sucesso!");
		
		
	}


}
