package br.pro.delfino.drogaria.dao;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import br.pro.delfino.drogaria.domain.Pessoa;
import br.pro.delfino.drogaria.domain.Usuario;

public class UsuarioDAOTest {
	@Ignore
	@Test
	public void salvar(){
		Long codigoPessoa = 2L;
		
		PessoaDAO pessoaDAO = new PessoaDAO();
		Pessoa pessoa = pessoaDAO.buscar(codigoPessoa);	
		
		
		Usuario usuario = new Usuario();
		usuario.setAtivo(true);
		usuario.setSenha("14");
		usuario.setTipo('G');
		usuario.setPessoa(pessoa);
		
		
		UsuarioDAO usuarioDAO = new UsuarioDAO();
		usuarioDAO.salvar(usuario);
		
		System.out.println("Salvo com sucesso");
		}
	
@Ignore
@Test
	public void listar(){
		UsuarioDAO usuarioDAO = new UsuarioDAO();
		
		List<Usuario> resultado = usuarioDAO.listar();
			
		for(Usuario usuario : resultado ){
			System.out.println("Codigo: " + usuario.getCodigo());
			System.out.println("Ativo: " + usuario.getAtivo());
			System.out.println("Senha: " + usuario.getSenha());
			System.out.println("Tipo: "  + usuario.getTipo());
			System.out.println("Pessoa: " + usuario.getPessoa().getNome());
			
		}
				
	}


@Ignore
@Test
	public void buscar(){
		Long codigo = 2L;
		
		UsuarioDAO usuarioDAO = new UsuarioDAO();
		Usuario usuario = usuarioDAO.buscar(codigo);

		System.out.println("Codigo: " + usuario.getCodigo());
		System.out.println("Ativo: " + usuario.getAtivo());
		System.out.println("Senha: " + usuario.getSenha());
		System.out.println("Tipo: "  + usuario.getTipo());
		System.out.println("Pessoa: " + usuario.getPessoa().getNome());
		
	}
@Ignore
@Test	
public void excluir (){
	Long codigo = 2L;
	
	UsuarioDAO usuarioDAO = new UsuarioDAO();
	Usuario usuario = usuarioDAO.buscar(codigo);

	
	usuarioDAO.excluir(usuario);
	
	
	System.out.println("Codigo: " + usuario.getCodigo());
	System.out.println("Ativo: " + usuario.getAtivo());
	System.out.println("Senha: " + usuario.getSenha());
	System.out.println("Tipo: "  + usuario.getTipo());
	System.out.println("Pessoa: " + usuario.getPessoa().getNome());
	
	
	System.out.println("Excluido com sucesso!");
}
@Ignore

@Test
public void editar(){
	
	Long codigoUsuario = 1L;
	Long codigoPessoa = 2L;
	
	PessoaDAO pessoaDAO = new PessoaDAO();
	Pessoa pessoa = pessoaDAO.buscar(codigoPessoa);
	
	UsuarioDAO usuarioDAO = new UsuarioDAO();
	Usuario usuario = usuarioDAO.buscar(codigoUsuario);
	
	usuario.setSenha("ASKD");
	
	usuario.setPessoa(pessoa);
	usuarioDAO.editar(usuario);
	System.out.println("editado com sucesso");
	
	
	
}



}
