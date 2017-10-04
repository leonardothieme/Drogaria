package br.pro.delfino.drogaria.dao;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import br.pro.delfino.drogaria.domain.Cidade;
import br.pro.delfino.drogaria.domain.Estado;

public class CidadeDAOTest {
	@Ignore
	@Test
	public void salvar() {
		Long codigoEstado = 1L;
		EstadoDAO estadoDAO = new EstadoDAO();
		
		

		Estado estado = estadoDAO.buscar(codigoEstado);

		if (estado == null) {
			System.out.println("Nenhum registro encontrado");
		} else {

			Cidade cidade = new Cidade();
			cidade.setNome("Itajai");
			cidade.setEstado(estado);

			CidadeDAO cidadeDAO = new CidadeDAO();
			cidadeDAO.salvar(cidade);

		}
	}

	@Ignore
	@Test
	public void listar() {
		CidadeDAO cidadeDAO = new CidadeDAO();
		List<Cidade> resultado = cidadeDAO.listar();

		for (Cidade cidade : resultado) {
			System.out.println("Codigo da Cidade: " + cidade.getCodigo());
			System.out.println("Nome da Cidade: " + cidade.getNome());
			System.out.println("Codigo do Estado: " + cidade.getEstado().getCodigo());
			System.out.println("Codigo do Estado: " + cidade.getEstado().getSigla());
			System.out.println("Codigo do Estado: " + cidade.getEstado().getNome());

			System.out.println();

		}
	}

	@Ignore
	@Test
	public void buscar() {
		Long codigo = 1L;
		CidadeDAO cidadeDAO = new CidadeDAO();
		Cidade cidade = cidadeDAO.buscar(codigo);

		System.out.println("Codigo da Cidade: " + cidade.getCodigo());
		System.out.println("Nome da Cidade: " + cidade.getNome());
		System.out.println("Codigo do Estado: " + cidade.getEstado().getCodigo());
		System.out.println("Codigo do Estado: " + cidade.getEstado().getSigla());
		System.out.println("Codigo do Estado: " + cidade.getEstado().getNome());
	}
	@Ignore
	@Test
	public void excluir() {
		Long codigo = 1L;
		CidadeDAO cidadeDAO = new CidadeDAO();
		Cidade cidade = cidadeDAO.buscar(codigo);

		cidadeDAO.excluir(cidade);
		
		
		System.out.println("Cidade Removida");
		System.out.println("Codigo da Cidade: " + cidade.getCodigo());
		System.out.println("Nome da Cidade: " + cidade.getNome());
		System.out.println("Codigo do Estado: " + cidade.getEstado().getCodigo());
		System.out.println("Codigo do Estado: " + cidade.getEstado().getSigla());
		System.out.println("Codigo do Estado: " + cidade.getEstado().getNome());

	}

	@Test
	public void editar(){
		Long codigoCidade = 1L;
		Long codigoEstado = 1L;
	
		
		EstadoDAO estadoDAO = new EstadoDAO();
		Estado estado = estadoDAO.buscar(codigoEstado);
		
		CidadeDAO cidadeDAO = new CidadeDAO();
		Cidade cidade = cidadeDAO.buscar(codigoCidade);
		
		System.out.println("Codigo do Estado: " + estado.getCodigo());
		System.out.println("Codigo do Estado: " + estado.getSigla());
		System.out.println("Codigo do Estado: " + estado.getNome());
		
		
 
		System.out.println("Cidade a ser Editada");
		System.out.println("Codigo da Cidade: " + cidade.getCodigo());
		System.out.println("Nome da Cidade: " + cidade.getNome());
		System.out.println("Codigo do Estado: " + cidade.getEstado().getCodigo());
		System.out.println("Codigo do Estado: " + cidade.getEstado().getSigla());
		System.out.println("Codigo do Estado: " + cidade.getEstado().getNome());
		
		cidade.setNome("teotonio favela");
		cidadeDAO.editar(cidade);
		cidade.setEstado(estado);
		
		System.out.println("Cidade  Editada");
		System.out.println("Codigo da Cidade: " + cidade.getCodigo());
		System.out.println("Nome da Cidade: " + cidade.getNome());
		System.out.println("Codigo do Estado: " + cidade.getEstado().getCodigo());
		System.out.println("Codigo do Estado: " + cidade.getEstado().getSigla());
		System.out.println("Codigo do Estado: " + cidade.getEstado().getNome());
		

		
		
	}
}
