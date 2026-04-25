package pe.edu.vallegrande.mascotas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.vallegrande.mascotas.model.Veterinario;

public interface VeterinarioRepository extends JpaRepository<Veterinario, Integer> {}
