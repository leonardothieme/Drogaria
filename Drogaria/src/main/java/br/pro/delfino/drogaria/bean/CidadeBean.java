package br.pro.delfino.drogaria.bean;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.event.ActionEvent;

import org.omnifaces.util.Messages;

import br.pro.delfino.drogaria.dao.CidadeDAO;
import br.pro.delfino.drogaria.dao.EstadoDAO;
import br.pro.delfino.drogaria.domain.Cidade;
import br.pro.delfino.drogaria.domain.Estado;

@SuppressWarnings("serial")
@ManagedBean
@ViewScoped
public class CidadeBean implements Serializable {

	private List<Cidade> cidades;
	private Cidade cidade;
	private List<Estado> estados;

	public List<Estado> getEstados() {
		return estados;
	}

	public void setEstados(List<Estado> estados) {
		this.estados = estados;
	}

	public Cidade getCidade() {
		return cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}

	public List<Cidade> getCidades() {
		return cidades;
	}

	public void setCidades(List<Cidade> cidades) {
		this.cidades = cidades;
	}

	public void salvar() {
		
		try {
			CidadeDAO cidadeDAO = new CidadeDAO();
			cidadeDAO.merge(cidade);
			Messages.addGlobalInfo("Cidade salva com sucesso"); 
			
			cidade = new Cidade();
			
			EstadoDAO estadoDAO = new EstadoDAO();
			estados = estadoDAO.listar();
			cidades = cidadeDAO.listar();
			
			
		}catch(RuntimeException erro) {
			Messages.addFlashGlobalError("Ocorreu um erro o ao tentar salvar uma nova cidade");
			erro.printStackTrace();
		
		}
		}
		
	@PostConstruct
	public void listar() {
		try {
			CidadeDAO cidadeDAO = new CidadeDAO();
			cidades = cidadeDAO.listar();

		} catch (RuntimeException erro) {
			Messages.addFlashGlobalError("Ocorreu um erro ao tentar listar as cidades");
			erro.printStackTrace();
		}

	}

	public void novo() {
		
		try {
			cidade = new Cidade();
		EstadoDAO estadoDAO = new EstadoDAO();
		estados = estadoDAO.listar("nome"); 
		
	} catch (RuntimeException erro) {
		Messages.addFlashGlobalError("Ocorreu um erro ao tentar gerar uma nova cidade");
		erro.printStackTrace();
	}
		
	}
	
	
	public void excluir(ActionEvent evento) {
		try {
			cidade = (Cidade) evento.getComponent().getAttributes().get("cidadeSelecionada");
			
			CidadeDAO cidadeDAO = new CidadeDAO();
			cidadeDAO.excluir(cidade);
			
			cidades = cidadeDAO.listar();
			
			Messages.addFlashGlobalInfo("Cidade removido com sucesso!");
			
			} catch (RuntimeException erro) {
				Messages.addGlobalError("Ocorreu um erro ao tentar remover a cidade");
				erro.printStackTrace();

			}
		
			
		}
		
		public void editar(ActionEvent evento) {
			try {
			cidade = (Cidade) evento.getComponent().getAttributes().get("cidadeSelecionada");

			EstadoDAO estadoDAO = new EstadoDAO();
			estados = estadoDAO.listar(); 
			
		} catch (RuntimeException erro) {
			Messages.addFlashGlobalError("Ocorreu um erro ao tentar editar uma cidade");
			erro.printStackTrace();
		}
			
	
	}
}
	

