package com.ty.pan;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DeletePan 
{
public static void main(String[] args) 
{
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();
	
	  Customer customer =entityManager.find(Customer.class, 1);
	  if(customer!=null)
	  {
		  Pan pan= entityManager.find(Pan.class,1);
		  entityTransaction.begin();
		  entityManager.remove(customer);
		  entityManager.remove(pan);
		  entityTransaction.commit();
	  }
	  else
	  {
		  System.out.println("Customer is not found");
	  }
}
}
