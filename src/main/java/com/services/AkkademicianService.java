/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.services;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.persistance.Akkademician;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

/**
 *
 * @author pluca
 */
@Transactional
public class AkkademicianService {
    
    @PersistenceContext
    EntityManager entityManager;
    
    public Akkademician createTodo(Akkademician akkademician){
        //Persist into db
        entityManager.persist(akkademician);
        return akkademician;
        
    }
    
    
    public Akkademician updateAkkademician(Akkademician akkademician){
    entityManager.merge(akkademician);
    return akkademician;
    }
    
    public Akkademician findAkkademicianById(Long id){
    return entityManager.find(Akkademician.class, id);
    }
    
    public List<Akkademician> getTodos(){
    return entityManager.createQuery("SELECT t from Akkademician t", Akkademician.class).getResultList();
            }
}
