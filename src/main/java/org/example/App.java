package org.example;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("default");
        EntityManager em=emf.createEntityManager();
        EntityTransaction t=em.getTransaction();
        t.begin();
        Users user=new Users();
        user.setName("mateusz");
        user.setLastName("semklo");
        em.persist(user);
        t.commit();
        em.close();
    }
}
