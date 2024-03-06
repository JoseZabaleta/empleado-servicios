package com.loxasoft.empleadoservicios.Dto;

import com.loxasoft.empleadoservicios.Entity.Empleado;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseDTO {
    private Empleado empleado;
    private DepartamentoDTO departamentoDTO;

}
