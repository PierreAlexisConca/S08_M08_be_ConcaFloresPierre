package pe.edu.vallegrande.mascotas.service;

import org.springframework.stereotype.Service;
import pe.edu.vallegrande.mascotas.model.Dueno;
import pe.edu.vallegrande.mascotas.repository.DuenoRepository;

import java.util.List;
import java.util.Optional;

@Service
public class DuenoService {
    private final DuenoRepository repository;

    public DuenoService(DuenoRepository repository) {
        this.repository = repository;
    }

    public List<Dueno> getAll() {
        return repository.findAll();
    }

    public Optional<Dueno> getById(Integer id) {
        return repository.findById(id);
    }

    public Dueno save(Dueno dueno) {
        return repository.save(dueno);
    }

    public void delete(Integer id) {
        repository.deleteById(id);
    }
}
