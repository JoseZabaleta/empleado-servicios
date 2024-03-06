package com.loxasoft.empleadoservicios.Repository;

import com.loxasoft.empleadoservicios.Entity.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpleadoRepositoy extends JpaRepository<Empleado, Integer> {

}
