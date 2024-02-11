package org.example;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;


public class Main {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
        EntityManager em = emf.createEntityManager();
        // Students s =  em.find(Students.class, 1);
        Students s = new Students();
        s.setId(8);
        s.setName("Chanakya");
        em.getTransaction().begin();
        em.persist(s);
        em.getTransaction().commit();
        System.out.println(s);
    }
}