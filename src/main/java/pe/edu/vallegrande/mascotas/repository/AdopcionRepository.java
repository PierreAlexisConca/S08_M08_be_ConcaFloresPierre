package pe.edu.vallegrande.mascotas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.vallegrande.mascotas.model.Adopcion;

public interface AdopcionRepository extends JpaRepository<Adopcion, Integer> {}
