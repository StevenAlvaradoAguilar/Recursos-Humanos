package Proyecto.Recursos.Humanos.Repositorio;

import Proyecto.Recursos.Humanos.Modelo.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpleadoRepositorio extends JpaRepository<Empleado, Integer> {
}
