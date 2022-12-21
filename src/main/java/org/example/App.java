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

        City city=new City(3456,"USA","Waszytgton");
        Adress adress=new Adress("Rosvelta",city);
        user.setAdress(adress);

        City city2=new City(3456,"USA","Waszytgton");
        Adress adress2=new Adress("Rosvelta",city2);
        user.setBillingAdress(adress2);

        em.persist(user);

        t.commit();
        em.close();
    }
}
