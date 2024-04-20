package com.examen.RicopaLuis.Entity;

import jakarta.persistence.*;
import jdk.jfr.Timespan;
import jdk.jfr.Timestamp;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.util.Date;

@Entity
@Table(name = "empresa")
@Getter
@Setter
public class Empresa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
    private Integer estado=1;
    private String usua_crea="lricopa";
    private Date date_create;
    private String usua_modif="lricopa";;
    private Date date_modif;
    private String usua_delet="lricopa";;
    private Date date_delet;
}
