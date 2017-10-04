package br.pro.delfino.drogaria.bean;

import javax.faces.event.ActionEvent;
import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.omnifaces.util.Messages;

import br.pro.delfino.drogaria.dao.FabricanteDAO;
import br.pro.delfino.drogaria.domain.Fabricante;

@SuppressWarnings("serial")
@ManagedBean
@ViewScoped
public class FabricanteBean implements Serializable {

	private Fabricante fabricante;
	private List<Fabricante> fabricantes;

	public Fabricante getFabricante() {
		return fabricante;
	}

	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}

	// get e set List Fabricante
	public void setFabricantes(List<Fabricante> fabricantes) {
		this.fabricantes = fabricantes;
	}

	public List<Fabricante> getFabricantes() {
		return fabricantes;
	}

	// Iniciando o Fabricante
	public void novo() {
		fabricante = new Fabricante();
	}

	@PostConstruct
	// metodo listar
	public void listar() {
		try {
			FabricanteDAO fabricanteDAO = new FabricanteDAO();
			fabricantes = fabricanteDAO.listar();

		} catch (RuntimeException erro) {
			Messages.addGlobalError("Ocorreu um erro ao tentar listar todos os fabricantes");
			erro.printStackTrace();
		}
	}

	public void salvar() {
		try {
			FabricanteDAO fabricanteDAO = new FabricanteDAO();
			fabricanteDAO.merge(fabricante);
			fabricante = new Fabricante();
			fabricantes = fabricanteDAO.listar();
			novo();

			Messages.addGlobalInfo("Fabricante salvo com sucesso!");

		} catch (RuntimeException erro) {
			Messages.addGlobalError("Ocorreu um erro ao tentar salvar o estado");
			erro.printStackTrace();

		}

	}
	public void excluir(ActionEvent evento) {
		try{
			fabricante = (Fabricante) evento.getComponent() .getAttributes().get("fabricanteSelecionado");
			FabricanteDAO fabricanteDAO = new FabricanteDAO();
			fabricanteDAO.excluir(fabricante);
			
			fabricantes = fabricanteDAO.listar();
			
			Messages.addFlashGlobalInfo("Fabricante removido com sucesso");
			
		}catch(RuntimeException erro){
			Messages.addGlobalError("Ocorreu um erro ao tentar remover o fabricante");
			erro.printStackTrace();

		
	}

}
	
	public void editar (ActionEvent evento ){
		
		try{
			
			fabricante = (Fabricante) evento.getComponent() .getAttributes().get("fabricanteSelecionado");
			
			
		} catch (RuntimeException erro) {
			Messages.addGlobalError("Ocorreu um erro ao tentar remover o estado");
			erro.printStackTrace();
		
		}
	}
}