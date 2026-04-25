package pe.edu.vallegrande.mascotas.service;

import org.springframework.stereotype.Service;
import pe.edu.vallegrande.mascotas.model.Vacuna;
import pe.edu.vallegrande.mascotas.repository.VacunaRepository;

import java.util.List;
import java.util.Optional;

@Service
public class VacunaService {
    private final VacunaRepository repository;

    public VacunaService(VacunaRepository repository) {
        this.repository = repository;
    }

    public List<Vacuna> getAll() {
        return repository.findAll();
    }

    public Optional<Vacuna> getById(Integer id) {
        return repository.findById(id);
    }

    public Vacuna save(Vacuna vacuna) {
        return repository.save(vacuna);
    }

    public void delete(Integer id) {
        repository.deleteById(id);
    }
}
