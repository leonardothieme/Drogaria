package br.pro.delfino.main;

import org.hibernate.Session;
import org.junit.Test;

import br.pro.delfino.drogaria.util.HibernateUtil;


public class HibernateUtilTest {
	public static void main(String[] args) {
		Session sessao = HibernateUtil.getFabricaDeSessoes().openSession();
		sessao.close();
		HibernateUtil.getFabricaDeSessoes().close();
	}
}