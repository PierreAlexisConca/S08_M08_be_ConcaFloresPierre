package pe.edu.vallegrande.mascotas.controller;

import org.springframework.web.bind.annotation.*;
import pe.edu.vallegrande.mascotas.model.Adopcion;
import pe.edu.vallegrande.mascotas.service.AdopcionService;
import java.util.List;

@RestController
@RequestMapping("/api/adopciones")
@CrossOrigin("*")
public class AdopcionController {
    private final AdopcionService service;
    public AdopcionController(AdopcionService service) { this.service = service; }

    @GetMapping
    public List<Adopcion> getAll() { return service.getAll(); }

    @GetMapping("/{id}")
    public Adopcion getById(@PathVariable Integer id) { return service.getById(id).orElse(null); }

    @PostMapping
    public Adopcion create(@RequestBody Adopcion adopcion) { return service.save(adopcion); }

    @PutMapping("/{id}")
    public Adopcion update(@PathVariable Integer id, @RequestBody Adopcion adopcion) {
        adopcion.setId(id);
        return service.save(adopcion);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) { service.delete(id); }
}
