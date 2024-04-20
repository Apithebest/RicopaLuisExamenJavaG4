package com.examen.RicopaLuis.Request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RQEmpresa {
    private Integer id;
    private String razon_social;
    private String tipo_documento;
    private String numero_documento;
    private String condicion;
    private String direccion;
    private String distrito;
    private String provincia;
    private String departamento;
    private Boolean es_agente_retencion;
}
