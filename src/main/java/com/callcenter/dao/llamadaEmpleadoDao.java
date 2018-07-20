/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.callcenter.dao;

import com.callcenter.entidades.CallLlamadatEmpleado;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author pc lenovo
 */
@Stateless
public class llamadaEmpleadoDao extends AbstractFacade<CallLlamadatEmpleado> {

    @PersistenceContext(unitName = "com_callCenter_unidadPersistencia")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public llamadaEmpleadoDao() {
        super(CallLlamadatEmpleado.class);
    }
    
}
