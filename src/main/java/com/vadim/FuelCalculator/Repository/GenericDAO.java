package com.vadim.FuelCalculator.Repository;

import com.vadim.FuelCalculator.Entity.GasStation;
import lombok.Getter;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;
import java.util.Optional;

@Repository
public abstract class GenericDAO<T,K> {
    @Getter
    private  final EntityManager entityManager;
    public abstract Class<T> getEntityClass();

    GenericDAO(){
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("persistence");
        entityManager = entityManagerFactory.createEntityManager();
    }

    public void save(T entity) {
        EntityManager em = getEntityManager();
        em.getTransaction().begin();
        em.persist(entity);
        em.getTransaction().commit();
        em.close();
    }

    public void update(T entity, K id) {
        EntityManager em = getEntityManager();
        em.getTransaction().begin();
        T entityFromDB = em.find(getEntityClass(), id);
        em.merge(entity);
        em.persist(entityFromDB);
        em.getTransaction().commit();
        em.close();
    }

    public void saveOrUpdate(T entity){
    EntityManager em = getEntityManager();
    em.getTransaction().begin();
    Session session = em.unwrap(Session.class);
    session.saveOrUpdate(entity);
    em.getTransaction().commit();
    em.close();
    }

    public void delete(K id) {
        EntityManager em = getEntityManager();
        em.getTransaction().begin();
        T entityFromDB = em.find(getEntityClass(),id);
        em.remove(entityFromDB);
        em.getTransaction().commit();
        em.close();
    }

    public Optional<T> findById(K id) {
        EntityManager em = getEntityManager();
        T entityFromDB = em.find(getEntityClass(), id);
        em.close();
        return Optional.ofNullable(entityFromDB);
    }

    public List<T> findAll() {
        EntityManager em = getEntityManager();
        List<T> entityList = em.createQuery("FROM " + getEntityClass().getSimpleName()).getResultList();
        em.close();
        return entityList;
    }
}
