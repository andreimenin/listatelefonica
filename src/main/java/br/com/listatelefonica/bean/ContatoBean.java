package br.com.listatelefonica.bean;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.event.ActionEvent;

import org.omnifaces.util.Messages;

import br.com.listatelefonica.dao.ContatoDAO;
import br.com.listatelefonica.domain.Contato;

/**
 * 
 * 
 *@author Andrei Camargo Menin Franciscão
 *@since 1 de fev de 2021
 *
 */
//classe java com modelo e controle

@SuppressWarnings("serial")
@ViewScoped // TIPO DO TEMPO DE VIDA DOS OBJETOS DESSA CLASSE NA VIEW
@ManagedBean // diz para o Tomcat que essa classe é o controle modelo dessa classe na
				// aplicação
public class ContatoBean implements Serializable {

	private Contato contato;

	private List<Contato> contatos;

	

	@PostConstruct // como se fosse um construtor, será automaticamente chamado o método listar
	public void listar() {
		try {

			ContatoDAO contatoDAO = new ContatoDAO();
			contatos = contatoDAO.listar();

		} catch (RuntimeException erro) {
			Messages.addGlobalError("Erro ao tentar listar.");
			erro.printStackTrace();
		}
	}

	public void salvar() {
		try {
			ContatoDAO contatoDAO = new ContatoDAO();
			contatoDAO.merge(contato);

			Messages.addGlobalInfo("Contato salvo com sucesso: " + contato.getNome() + " - " + contato.getTelefone());// substituindo
																												// as
																												// linhas
																												// anteriores
																												// com o
																												// OmniFaces
			contato = new Contato();
			contatos = contatoDAO.listar();// atualizando a listagem após uma inclusão
			
			novo();
		} catch (RuntimeException erro) {
			Messages.addGlobalError("Ocorreu um erro ao tentar salvar um estado.");
			erro.printStackTrace();
		}

	}

	public void novo() {
		contato = new Contato();
	}

	public void excluir(ActionEvent evento) throws Exception {

		try {
			contato = (Contato) evento.getComponent().getAttributes().get("contatoSelecionado");
			
			ContatoDAO contatoDAO = new ContatoDAO();
			contatoDAO.excluir(contato);
			Messages.addGlobalInfo("Estado removido: " + contato.getNome());	
			contatos = contatoDAO.listar();			
			
		}		
		
		catch (RuntimeException erro) {
			Messages.addGlobalError("Erro ao tentar excluir um contato.");
			erro.printStackTrace();
		}

	}

	public void editar(ActionEvent evento) {

		try {
			contato = (Contato) evento.getComponent().getAttributes().get("contatoSelecionado");

			ContatoDAO contatoDAO = new ContatoDAO();			
		
			Messages.addGlobalInfo("Contato editado:" + contato.getNome());

			contatos = contatoDAO.listar();

		} catch (RuntimeException erro) {
			Messages.addGlobalError("Erro ao tentar editar um contato.");
			erro.printStackTrace();
		}

	}

	public Contato getContato() {
		return contato;
	}

	public void setContato(Contato contato) {
		this.contato = contato;
	}

	public List<Contato> getContatos() {
		return contatos;
	}

	public void setContatos(List<Contato> contatos) {
		this.contatos = contatos;
	}	
}
