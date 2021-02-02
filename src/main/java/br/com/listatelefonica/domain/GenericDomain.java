package br.com.listatelefonica.domain;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 * 
 * 
 *@author Andrei Camargo Menin Franciscão
 *@since 1 de fev de 2021
 *
 */
@SuppressWarnings("serial")
@MappedSuperclass //anotação para dizer que essa classe não será usada como tabela, mas sim para ser usada para gerar outras tabelas
public class GenericDomain implements Serializable{

	@GeneratedValue(strategy = GenerationType.AUTO) //auto-increment
	@Id //chave primária
	private Long codigo;
	
	public Long getCodigo() {
		return codigo;
	}
	
	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}	
	
	@Override //método para mapear o objeto no selectOneMenu
	public String toString() {
	    return String.format("%s[codigo=%d]", getClass().getSimpleName(), getCodigo());
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GenericDomain other = (GenericDomain) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}
	
	
	
	
	
	
	
}
