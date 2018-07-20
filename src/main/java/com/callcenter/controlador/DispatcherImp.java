/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.callcenter.controlador;

import com.callcenter.dao.EmpleadoDao;
import com.callcenter.dao.LlamadaTelDao;
import com.callcenter.entidades.CallEmpleado;
import com.callcenter.entidades.CallLlamadaTel;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;

/**
 *
 * @author pc lenovo
 */
public class DispatcherImp implements Dispatcher{

    @EJB
    private LlamadaTelDao llamadaTelDao; 
    private List<CallEmpleado> empleadosDisponibles;
    @Override
    public String dispatchCall(CallLlamadaTel callLlamadaTel) {
        
        try {
            InsertarLlamada(callLlamadaTel);
            
        } catch (Exception ex) {
            
        }
        
    }
    
    /**
     * Este metodo inserta la llamada en la base de datos
     * @param callLlamadaTel datos de la llamada entrante  
     * @throws Exception 
     */
    public void InsertarLlamada(CallLlamadaTel callLlamadaTel) throws Exception {
        try {
            llamadaTelDao.create(callLlamadaTel);
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }
    
    public List<CallEmpleado> obtenerEmpleadosDisponibles(){
    
    
    }
   
}
