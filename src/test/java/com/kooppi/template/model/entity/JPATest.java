package com.kooppi.template.model.entity;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class JPATest {

	private EntityManagerFactory factory;
	private EntityManager em;
	private EntityTransaction tran;

	@Before
	public void init() {
		factory = Persistence.createEntityManagerFactory("persistenceTest");
		em = factory.createEntityManager();
		tran = em.getTransaction();
		tran.begin();
	}

	@Test
	public void testJpaEnvironment() throws ParseException {
		Member m = new Member();
		String input = "1989-09-14";
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		m.setBirthdate(formatter.parse(input));
		m.setName("Newt");
		m.setTel("123456789");
		em.persist(m);
	}

	@After
	public void destroy() {
		tran.commit();
		em.close();
		factory.close();
	}
}
