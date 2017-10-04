package br.pro.delfino.drogaria.dao;

import java.util.Date;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import br.pro.delfino.drogaria.domain.Funcionario;
import br.pro.delfino.drogaria.domain.Pessoa;

public class FuncionarioDAOTest {

	@Test
	@Ignore

	public void salvar() {

		Long codigoPessoa = 2L;

		PessoaDAO pessoaDAO = new PessoaDAO();
		Pessoa pessoa = pessoaDAO.buscar(codigoPessoa);

		Funcionario funcionario = new Funcionario();

		funcionario.setCarteiraTrabalho("9191919");
		funcionario.setDataAdmissao(new Date());
		funcionario.setPessoa(pessoa);

		FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
		funcionarioDAO.salvar(funcionario);

		System.out.println("Cadastrado com sucesso!");

	}

	@Test
	@Ignore
	public void listar() {
		FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
		List<Funcionario> resultado = funcionarioDAO.listar();

		for (Funcionario funcionario : resultado) {

			System.out.println();
			System.out.println("Codigo:" + funcionario.getCodigo());
			System.out.println("Carteira de trabalho:" + funcionario.getCarteiraTrabalho());
			System.out.println("Data Admissao:" + funcionario.getDataAdmissao());
			System.out.println("Nome :" + funcionario.getPessoa().getNome());

		}

	}

	@Ignore
	@Test
	public void buscar() {
		Long codigo = 1L;

		FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
		Funcionario funcionario = funcionarioDAO.buscar(codigo);

		System.out.println();
		System.out.println("Codigo:" + funcionario.getCodigo());
		System.out.println("Carteira de trabalho:" + funcionario.getCarteiraTrabalho());
		System.out.println("Data Admissao:" + funcionario.getDataAdmissao());
		System.out.println("Nome :" + funcionario.getPessoa().getNome());

	}
	@Ignore
	@Test
	public void excluir() {
		Long codigo = 4L;

		FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
		Funcionario funcionario = funcionarioDAO.buscar(codigo);

		funcionarioDAO.excluir(funcionario);

		System.out.println("Funcionario excluido: ");
		System.out.println("Codigo:" + funcionario.getCodigo());
		System.out.println("Carteira de trabalho:" + funcionario.getCarteiraTrabalho());
		System.out.println("Data Admissao:" + funcionario.getDataAdmissao());
		System.out.println("Nome :" + funcionario.getPessoa().getNome());

	}
	
	@Test
	public void editar(){
		Long codigoFuncionario = 3L;
		Long codigoPessoa      = 3L;
		

		FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
		Funcionario funcionario = funcionarioDAO.buscar(codigoFuncionario);
		
		PessoaDAO pessoaDAO = new PessoaDAO();
		Pessoa pessoa 	    = pessoaDAO.buscar(codigoPessoa);
		
		funcionario.setCarteiraTrabalho("242424");
		funcionario.setPessoa(pessoa);

		funcionarioDAO.editar(funcionario);
		
		
		System.out.println("Atualizado com Sucesso para: ");
		
		System.out.println("Codigo:" + funcionario.getCodigo());
		System.out.println("Carteira de trabalho:" + funcionario.getCarteiraTrabalho());
		System.out.println("Data Admissao:" + funcionario.getDataAdmissao());
		System.out.println("Nome :" + funcionario.getPessoa().getNome());
	}

}
