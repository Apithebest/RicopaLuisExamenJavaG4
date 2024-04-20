package com.examen.RicopaLuis.Services.Interface;

import com.examen.RicopaLuis.Entity.Empresa;

import java.util.List;

public interface IEmpresa {
    Empresa Insert(Empresa empresa);
    Empresa Update(Empresa empresa);
    Empresa Delete(Integer id);
    List<Empresa> findAll();
    Empresa FindById(Integer id);
}
