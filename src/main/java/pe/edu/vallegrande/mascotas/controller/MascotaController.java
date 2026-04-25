package pe.edu.vallegrande.mascotas.controller;

import org.springframework.web.bind.annotation.*;
import pe.edu.vallegrande.mascotas.model.Mascota;
import pe.edu.vallegrande.mascotas.service.MascotaService;
import java.util.List;

@RestController
@RequestMapping("/api/mascotas")
@CrossOrigin("*")
public class MascotaController {
    private final MascotaService service;
    public MascotaController(MascotaService service) { this.service = service; }

    @GetMapping
    public List<Mascota> getAll() { return service.getAll(); }

    @GetMapping("/{id}")
    public Mascota getById(@PathVariable Integer id) { return service.getById(id).orElse(null); }

    @PostMapping
    public Mascota create(@RequestBody Mascota mascota) { return service.save(mascota); }

    @PutMapping("/{id}")
    public Mascota update(@PathVariable Integer id, @RequestBody Mascota mascota) {
        mascota.setId(id);
        return service.save(mascota);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) { service.delete(id); }
}
