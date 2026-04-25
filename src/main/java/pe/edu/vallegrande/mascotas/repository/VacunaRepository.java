package pe.edu.vallegrande.mascotas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.vallegrande.mascotas.model.Vacuna;

public interface VacunaRepository extends JpaRepository<Vacuna, Integer> {}
