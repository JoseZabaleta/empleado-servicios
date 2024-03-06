package com.loxasoft.empleadoservicios.Services;


import com.loxasoft.empleadoservicios.Dto.DepartamentoDTO;
import com.loxasoft.empleadoservicios.Dto.ResponseDTO;
import com.loxasoft.empleadoservicios.Entity.Empleado;
import com.loxasoft.empleadoservicios.Repository.EmpleadoRepositoy;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
@AllArgsConstructor
public class EmpleadoService {
    private final EmpleadoRepositoy empleadoRepositoy;
    private final RestTemplate restTemplate;



    public Empleado saveEmpleado(Empleado empleado){
        return empleadoRepositoy.save(empleado);
    }
    public ResponseDTO getEmpleadoById(Integer id){
        ResponseDTO responseDTO = new ResponseDTO();
        Empleado empleado = new Empleado();
        empleado = empleadoRepositoy.findById(id).get();

        ResponseEntity<DepartamentoDTO> responseEntity =restTemplate.getForEntity("http://localhost:8080/api/departaments" +empleado.getDepartamentoId(),
            DepartamentoDTO.class );

        DepartamentoDTO departamentoDTO = responseEntity.getBody();

        responseDTO.setEmpleado(empleado);
        responseDTO.setDepartamentoDTO(departamentoDTO);
        return  responseDTO;
    }

}
