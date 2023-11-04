package com.parcial03.dw.services.impl;

import com.parcial03.dw.models.Empleado;
import com.parcial03.dw.repositories.IEmpleadoRepo;
import com.parcial03.dw.repositories.IGenericRepo;
import com.parcial03.dw.services.IEmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpleadoServiceImpl extends CRUDImpl<Empleado, Integer> implements IEmpleadoService {
    @Autowired
    private IEmpleadoRepo repo;

    @Override
    protected IGenericRepo<Empleado,Integer> getRepo(){return repo;}
}
