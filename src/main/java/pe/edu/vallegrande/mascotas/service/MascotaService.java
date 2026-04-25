package pe.edu.vallegrande.mascotas.service;

import org.springframework.stereotype.Service;
import pe.edu.vallegrande.mascotas.model.Mascota;
import pe.edu.vallegrande.mascotas.repository.MascotaRepository;

import java.util.List;
import java.util.Optional;

@Service
public class MascotaService {
    private final MascotaRepository repository;

    public MascotaService(MascotaRepository repository) {
        this.repository = repository;
    }

    public List<Mascota> getAll() {
        return repository.findAll();
    }

    public Optional<Mascota> getById(Integer id) {
        return repository.findById(id);
    }

    public Mascota save(Mascota mascota) {
        return repository.save(mascota);
    }

    public void delete(Integer id) {
        repository.deleteById(id);
    }
}
