/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.callcenter.dao;

import com.callcenter.entidades.CallLlamadaTel;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

/**
 *
 * @author pc lenovo
 */
@Stateless
public class LlamadaTelDao extends AbstractFacade<CallLlamadaTel> {

    @PersistenceContext(unitName = "com_callCenter_unidadPersistencia")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public LlamadaTelDao() {
        super(CallLlamadaTel.class);
    }

    
}
