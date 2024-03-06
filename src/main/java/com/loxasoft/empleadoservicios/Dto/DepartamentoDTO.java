package com.loxasoft.empleadoservicios.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DepartamentoDTO {

    private Integer id;
    private String nombre;
    private String codigo;

}
