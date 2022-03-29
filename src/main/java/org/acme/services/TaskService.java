package org.acme.services;

import org.acme.entity.Task;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

@ApplicationScoped
public class TaskService {
    @Inject
    EntityManager em;

    @Transactional
    public List<Task> listar() {
        return em.createQuery("from TASKS t").getResultList();
    }
}
