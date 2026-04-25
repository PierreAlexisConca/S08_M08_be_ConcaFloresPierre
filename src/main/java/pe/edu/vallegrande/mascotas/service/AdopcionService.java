package pe.edu.vallegrande.mascotas.service;

import org.springframework.stereotype.Service;
import pe.edu.vallegrande.mascotas.model.Adopcion;
import pe.edu.vallegrande.mascotas.repository.AdopcionRepository;

import java.util.List;
import java.util.Optional;

@Service
public class AdopcionService {
    private final AdopcionRepository repository;

    public AdopcionService(AdopcionRepository repository) {
        this.repository = repository;
    }

    public List<Adopcion> getAll() {
        return repository.findAll();
    }

    public Optional<Adopcion> getById(Integer id) {
        return repository.findById(id);
    }

    public Adopcion save(Adopcion adopcion) {
        return repository.save(adopcion);
    }

    public void delete(Integer id) {
        repository.deleteById(id);
    }
}
