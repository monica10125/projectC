/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.callcenter.controlador;

import com.callcenter.entidades.CallLlamadaTel;

/**
 *
 * @author pc lenovo
 */
public interface Dispatcher {
    
    public String dispatchCall(CallLlamadaTel callLlamadaTel);    
}
