package org.acme.services;

import org.acme.entity.User;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

@ApplicationScoped
public class UserService {
    @Inject
    EntityManager em;

    @Transactional
    public List<User> listar() {
        return em.createQuery("from USERS p").getResultList();
    }
}
