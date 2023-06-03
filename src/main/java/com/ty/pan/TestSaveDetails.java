package com.ty.pan;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSaveDetails 
{
public static void main(String[] args)
{
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
    EntityManager entityManager = entityManagerFactory.createEntityManager();
    EntityTransaction entityTransaction = entityManager.getTransaction();
    
    
    Customer customer = new Customer();
    customer.setName("Alexa");
    customer.setAge(25);
    customer.setPhno(9535172949l);
    customer.setSal(260000.00);
    
    Customer customer1 = new Customer();
    customer1.setName("dora");
    customer1.setAge(25);
    customer1.setPhno(9535172349l);
    customer1.setSal(270000.00);
    
    Pan pan = new Pan();
    pan.setPanno("uan1234564");
    pan.setState("Karnataka");
    pan.setCountry("Inadia");
    pan.setAddress("Raichur");
    
    Pan pan1 = new Pan();
    pan1.setPanno("uan1234565");
    pan1.setState("Karnataka");
    pan1.setCountry("Inadia");
    pan1.setAddress("Chikkamagalur");
    
    customer.setPans(pan);
    customer1.setPans(pan1);
    
    entityTransaction.begin();
    entityManager.persist(customer);
    entityManager.persist(customer1);
    entityManager.persist(pan);
    entityManager.persist(pan1);
    entityTransaction.commit();
}
}
