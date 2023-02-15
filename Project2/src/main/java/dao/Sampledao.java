package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import dto.Sample;

public class Sampledao {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("dev");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	public void insert(Sample sample) {
		// TODO Auto-generated method stub
		entityTransaction.begin();
		entityManager.persist(sample);
		entityTransaction.commit();
	}
	
	
}
