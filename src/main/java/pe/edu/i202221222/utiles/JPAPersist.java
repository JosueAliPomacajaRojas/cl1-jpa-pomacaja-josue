package pe.edu.i202221222.utiles;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import pe.edu.i202221222.domain.City;
import pe.edu.i202221222.domain.Country;
import pe.edu.i202221222.domain.CountryLanguage;

public class JPAPersist {


    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("world");
        EntityManager em = emf.createEntityManager();

        // Crear el país

        em.getTransaction().begin();
        em.persist(new City(123, "SMP", "LIM", "Lima", 1));
        em.getTransaction().commit();


    }
}
