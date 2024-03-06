package com.loxasoft.empleadoservicios.Controller;

import com.loxasoft.empleadoservicios.Dto.ResponseDTO;
import com.loxasoft.empleadoservicios.EmpleadoServiciosApplication;
import com.loxasoft.empleadoservicios.Entity.Empleado;
import com.loxasoft.empleadoservicios.Services.EmpleadoService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/empleados")
@AllArgsConstructor
public class EmpleadoController {


    private final EmpleadoService empleadoService;


    @PostMapping
    public Empleado saveEmpleado(@RequestBody Empleado empleado){
        return empleadoService.saveEmpleado(empleado);
    }

    @GetMapping
    public ResponseDTO getEmpleadoById(@PathVariable Integer id){
        return empleadoService.getEmpleadoById(id);
    }

}
