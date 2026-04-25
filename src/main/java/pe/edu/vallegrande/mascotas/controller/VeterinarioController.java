package pe.edu.vallegrande.mascotas.controller;

import org.springframework.web.bind.annotation.*;
import pe.edu.vallegrande.mascotas.model.Veterinario;
import pe.edu.vallegrande.mascotas.service.VeterinarioService;
import java.util.List;

@RestController
@RequestMapping("/api/veterinarios")
@CrossOrigin("*")
public class VeterinarioController {
    private final VeterinarioService service;
    public VeterinarioController(VeterinarioService service) { this.service = service; }

    @GetMapping
    public List<Veterinario> getAll() { return service.getAll(); }

    @GetMapping("/{id}")
    public Veterinario getById(@PathVariable Integer id) { return service.getById(id).orElse(null); }

    @PostMapping
    public Veterinario create(@RequestBody Veterinario veterinario) { return service.save(veterinario); }

    @PutMapping("/{id}")
    public Veterinario update(@PathVariable Integer id, @RequestBody Veterinario veterinario) {
        veterinario.setId(id);
        return service.save(veterinario);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) { service.delete(id); }
}
