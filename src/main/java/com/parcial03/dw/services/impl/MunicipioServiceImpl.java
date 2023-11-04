package com.parcial03.dw.services.impl;

import com.parcial03.dw.models.Municipio;
import com.parcial03.dw.repositories.IGenericRepo;
import com.parcial03.dw.repositories.IMunicipioRepo;
import com.parcial03.dw.services.IMunicipioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MunicipioServiceImpl extends CRUDImpl<Municipio,Integer> implements IMunicipioService {
    @Autowired
    private IMunicipioRepo repo;
    @Override
    protected IGenericRepo<Municipio, Integer> getRepo() {
        return repo;
    }
}
