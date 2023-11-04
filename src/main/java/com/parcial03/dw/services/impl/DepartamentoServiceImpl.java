package com.parcial03.dw.services.impl;

import com.parcial03.dw.models.Departamento;
import com.parcial03.dw.repositories.IDepartamentoRepo;
import com.parcial03.dw.repositories.IGenericRepo;
import com.parcial03.dw.services.IDepartamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartamentoServiceImpl extends CRUDImpl<Departamento,Integer> implements IDepartamentoService {
    @Autowired
    private IDepartamentoRepo repo;
    @Override
    protected IGenericRepo<Departamento, Integer> getRepo() {
        return repo;
    }
}
