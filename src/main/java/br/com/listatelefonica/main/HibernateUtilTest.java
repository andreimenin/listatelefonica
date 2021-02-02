package br.com.listatelefonica.main;

import org.hibernate.Session;

import br.com.listatelefonica.util.HibernateUtil;

public class HibernateUtilTest {

	
	public static void main(String[] args) {
		Session sessao = HibernateUtil.getFabricaDeSessoes().openSession();
		sessao.close(); //fechando a sessão
		HibernateUtil.getFabricaDeSessoes().close(); //destruindo a fábrica de sessões
	}
	
}
