package com.jsp.person.pan;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Test {
public static void main(String[] args) {
EntityManagerFactory emf=Persistence.createEntityManagerFactory("aanchal");
EntityManager em=emf.createEntityManager();
EntityTransaction et=em.getTransaction();
Person person=new Person();
Pan pan=new Pan();

person.setEmail("nj@gmail.com");
person.setName("neha");

pan.setGst_number("qwer248452");
pan.setPerson(person);
et.begin();
em.persist(pan);
em.persist(person);
et.commit();
}
}
