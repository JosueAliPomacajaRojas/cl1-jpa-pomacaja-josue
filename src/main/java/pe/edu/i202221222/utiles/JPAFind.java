package pe.edu.i202221222.utiles;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import pe.edu.i202221222.domain.City;

public class JPAFind {

    public static void main(String[] args) {
        //
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("world");
        EntityManager em = emf.createEntityManager();


        //obtener country

        City city = em.find(City.class, 2);
        System.out.println(city.toString());

    }
}
