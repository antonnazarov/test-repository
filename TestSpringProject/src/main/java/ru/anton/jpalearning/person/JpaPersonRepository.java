package ru.anton.jpalearning.person;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import javax.transaction.Transactional;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class JpaPersonRepository {

    @PersistenceUnit
    private EntityManagerFactory emf;

    public void addPerson(Person person) {
        EntityManager em = emf.createEntityManager();
        em.persist(em);
    }
}
