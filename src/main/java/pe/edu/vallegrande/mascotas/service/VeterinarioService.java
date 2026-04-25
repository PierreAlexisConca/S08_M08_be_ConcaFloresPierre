package pe.edu.vallegrande.mascotas.service;

import org.springframework.stereotype.Service;
import pe.edu.vallegrande.mascotas.model.Veterinario;
import pe.edu.vallegrande.mascotas.repository.VeterinarioRepository;

import java.util.List;
import java.util.Optional;

@Service
public class VeterinarioService {
    private final VeterinarioRepository repository;

    public VeterinarioService(VeterinarioRepository repository) {
        this.repository = repository;
    }

    public List<Veterinario> getAll() {
        return repository.findAll();
    }

    public Optional<Veterinario> getById(Integer id) {
        return repository.findById(id);
    }

    public Veterinario save(Veterinario veterinario) {
        return repository.save(veterinario);
    }

    public void delete(Integer id) {
        repository.deleteById(id);
    }
}
