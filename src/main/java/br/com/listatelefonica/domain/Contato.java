package br.com.listatelefonica.domain;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * 
 * 
 *@author Andrei Camargo Menin Franciscão
 *@since 1 de fev de 2021
 *
 */
@SuppressWarnings("serial")
@Entity
public class Contato extends GenericDomain {

	@Column(nullable = false, length = 130)
	private String nome;	

	@Column(nullable = false, length = 200)
	private String endereco;
	
	@Column(nullable = false, length = 13)
	private String telefone;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEndereco() {
		return endereco;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public String getTelefone() {
		return telefone;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
}
