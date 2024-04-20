package com.examen.RicopaLuis.Services.Implement;

import com.examen.RicopaLuis.Dao.REmpresa;
import com.examen.RicopaLuis.Entity.Empresa;
import com.examen.RicopaLuis.Services.Interface.IEmpresa;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SEmpresa implements IEmpresa {

    public final REmpresa rEmpresa;
    public SEmpresa(REmpresa rEmpresa) {
        this.rEmpresa = rEmpresa;
    }

    @Override
    public Empresa Insert(Empresa empresa) {
        return this.rEmpresa.save(empresa);
    }
    @Override
    public Empresa Update(Empresa empresa) {
        return this.rEmpresa.save(empresa);
    }

    @Override
    public Empresa Delete(Integer id){
        Optional<Empresa> empresa = this.rEmpresa.findById(id);
        if(empresa.isPresent()){
            empresa.get().setEstado(0);
            return this.rEmpresa.save(empresa.get());
        }
        return null;
    }
    @Override
    public List<Empresa> findAll(){
        return this.rEmpresa.findAll();
    }
    @Override
    public Empresa FindById(Integer id){
        return this.rEmpresa.findById(id).get();
    }


}
