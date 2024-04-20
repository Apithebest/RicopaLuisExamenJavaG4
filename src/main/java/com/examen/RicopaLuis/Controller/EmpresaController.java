package com.examen.RicopaLuis.Controller;
import com.examen.RicopaLuis.Entity.Empresa;
import com.examen.RicopaLuis.Request.RQEmpresa;
import com.examen.RicopaLuis.Services.Interface.IEmpresa;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/empresa")
@Tag(name = "ApiEmpresa",description = "Permite hacer un crud de la empresa")
public class EmpresaController {

    public final IEmpresa iEmpresa;
    public EmpresaController(IEmpresa _iEmpresa) {
        this.iEmpresa = _iEmpresa;
    }


    @PostMapping("/Insert")
    @Operation(summary = "RegistroEmpresa",description = "Permite Registrar los Datos de la Empresa")
    public ResponseEntity<Empresa> Insert(@RequestBody RQEmpresa value) {
        var empresa = new Empresa();
        empresa.setRazon_social(value.getRazon_social());
        empresa.setTipo_documento(value.getTipo_documento());
        empresa.setNumero_documento(value.getNumero_documento());
        empresa.setCondicion(value.getCondicion());
        empresa.setDireccion(value.getDireccion());
        empresa.setDistrito(value.getDistrito());
        empresa.setProvincia(value.getProvincia());
        empresa.setDepartamento(value.getDepartamento());
        empresa.setEs_agente_retencion(value.getEs_agente_retencion());
        var obj = this.iEmpresa.Insert(empresa);
        return ResponseEntity.ok(obj);
    }

    @PutMapping("/Update")
    @Operation(summary = "ActualizacionEmpresa",description = "Permite Actualizar los Datos de la Empresa")
    public ResponseEntity<Empresa> Update(@RequestBody RQEmpresa value) {
        var empresa = new Empresa();
        empresa.setId(value.getId());
        empresa.setRazon_social(value.getRazon_social());
        empresa.setTipo_documento(value.getTipo_documento());
        empresa.setNumero_documento(value.getNumero_documento());
        empresa.setCondicion(value.getCondicion());
        empresa.setDireccion(value.getDireccion());
        empresa.setDistrito(value.getDistrito());
        empresa.setProvincia(value.getProvincia());
        empresa.setDepartamento(value.getDepartamento());
        empresa.setEs_agente_retencion(value.getEs_agente_retencion());
        var obj = this.iEmpresa.Update(empresa);
        return ResponseEntity.ok(obj);
    }

    @DeleteMapping("/Delete/{id}")
    @Operation(summary = "DeleteEmpresa",description = "Permite Cambiar el estado de la Empresa")
    public ResponseEntity<Empresa> Delete(@PathVariable Integer id) {
        var empresa = this.iEmpresa.Delete(id);
        return ResponseEntity.ok(empresa);
    }

    @GetMapping("/GetAll")
    @Operation(summary = "ListarEmpresa",description = "Permite listar todas las Empresas registradas")
    public ResponseEntity<List<Empresa>> GetAll() {
        var data = this.iEmpresa.findAll();
        return ResponseEntity.ok(data);
    }

    @GetMapping("/GetById/{id}")
    @Operation(summary = "BuscarId", description = "Permite mostrar la Empresa registrada")
    public ResponseEntity<Empresa> GetById(@PathVariable Integer id) {
        var empresa = this.iEmpresa.FindById(id);
        return ResponseEntity.ok(empresa);
    }



}
