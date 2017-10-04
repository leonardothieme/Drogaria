package br.pro.delfino.drogaria.dao;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import br.pro.delfino.drogaria.domain.Cliente;
import br.pro.delfino.drogaria.domain.Funcionario;
import br.pro.delfino.drogaria.domain.Venda;

public class VendaDAOTest {

	@Ignore
	@Test
	public void salvar(){
		
		Long codigoCliente = 4L;
		Long codigoFuncionario =  3L;
		
		FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
		ClienteDAO clienteDAO 		  = new ClienteDAO();
		
		Cliente cliente 	      = clienteDAO.buscar(codigoCliente);
		Funcionario  funcionario  = funcionarioDAO.buscar(codigoFuncionario);
		
		Venda venda = new Venda();
		venda.setHorario(new Date());
		venda.setPrecoTotal(new BigDecimal("100.00"));
		venda.setFuncionario(funcionario);
		venda.setCliente(cliente);
		
		VendaDAO vendaDAO = new VendaDAO();
		vendaDAO.salvar(venda);
		
		
		System.out.println("Salvo com sucesso!");
		
		
	}
	
	@Ignore
	@Test
	public void listar(){
		
		
		VendaDAO vendaDAO = new VendaDAO();
		
		List<Venda> resultado = vendaDAO.listar();
		
		for(Venda venda : resultado){
			System.out.println();
			System.out.println("Horario:" + venda.getHorario());
			System.out.println("Valor Total: "+ venda.getPrecoTotal());
			System.out.println("Cliente: " + venda.getCliente().getPessoa().getNome());
			System.out.println("Funcionario: " + venda.getFuncionario().getPessoa().getNome());
		}
		
	}
	
	@Ignore
@Test
	public void buscar(){
		Long codigo = 2L;
		
		VendaDAO vendaDAO = new VendaDAO();
		Venda venda = vendaDAO.buscar(codigo);
		
		System.out.println();
		System.out.println("Horario:" + venda.getHorario());
		System.out.println("Valor Total: "+ venda.getPrecoTotal());
		System.out.println("Cliente: " + venda.getCliente().getPessoa().getNome());
		System.out.println("Funcionario: " + venda.getFuncionario().getPessoa().getNome());
		
		
	}
	
	
	@Ignore
@Test
	public void excluir(){
		Long codigo = 2L;
		
		VendaDAO vendaDAO = new VendaDAO();
		Venda venda = vendaDAO.buscar(codigo);
		
		vendaDAO.excluir(venda);
		System.out.println("Excluido com sucesso!");
		System.out.println("Horario:" + venda.getHorario());
		System.out.println("Valor Total: "+ venda.getPrecoTotal());
		System.out.println("Cliente: " + venda.getCliente().getPessoa().getNome());
		System.out.println("Funcionario: " + venda.getFuncionario().getPessoa().getNome());
		
		
	}
	@Test
	@Ignore
	
	public void editar(){
		Long codigoCliente = 3L;
		Long codigoFuncionario = 2L;
		Long codigoVenda       = 1L;
		

		FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
		ClienteDAO clienteDAO 		  = new ClienteDAO();
		
		Cliente cliente 	      = clienteDAO.buscar(codigoCliente);
		Funcionario  funcionario  = funcionarioDAO.buscar(codigoFuncionario);
		
		VendaDAO vendaDAO = new VendaDAO();
		Venda venda = vendaDAO.buscar(codigoVenda);
		
		venda.setHorario(new Date());
		venda.setCliente(cliente);
		venda.setFuncionario(funcionario);
		vendaDAO.editar(venda);
		
		
	}
	
	
	
}
