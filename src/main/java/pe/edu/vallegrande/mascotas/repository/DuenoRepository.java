package pe.edu.vallegrande.mascotas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.vallegrande.mascotas.model.Dueno;

public interface DuenoRepository extends JpaRepository<Dueno, Integer> {}
