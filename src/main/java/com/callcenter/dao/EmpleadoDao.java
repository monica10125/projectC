/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.callcenter.dao;

import com.callcenter.entidades.CallEmpleado;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author pc lenovo
 */
@Stateless
public class EmpleadoDao extends AbstractFacade<CallEmpleado> {

    @PersistenceContext(unitName = "com_callCenter_unidadPersistencia")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public EmpleadoDao() {
        super(CallEmpleado.class);
    }
    
}
