package com.example.Spring_JPA.Hibernet.Course.JPA;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class BookJPARepository {

    @PersistenceContext
    EntityManager entityManager;

    public void insert(Book book) {
        entityManager.merge(book);
    }

    public Book findById(int id) {
        return entityManager.find(Book.class, id);
    }

    public void deleteById(int id) {
        Book book = entityManager.find(Book.class, id);
        entityManager.remove(book);
    }
}
