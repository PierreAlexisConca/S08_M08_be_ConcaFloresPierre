package pe.edu.vallegrande.mascotas.controller;

import org.springframework.web.bind.annotation.*;
import pe.edu.vallegrande.mascotas.model.Dueno;
import pe.edu.vallegrande.mascotas.service.DuenoService;
import java.util.List;

@RestController
@RequestMapping("/api/duenos")
@CrossOrigin("*")
public class DuenoController {
    private final DuenoService service;
    public DuenoController(DuenoService service) { this.service = service; }

    @GetMapping
    public List<Dueno> getAll() { return service.getAll(); }

    @GetMapping("/{id}")
    public Dueno getById(@PathVariable Integer id) { return service.getById(id).orElse(null); }

    @PostMapping
    public Dueno create(@RequestBody Dueno dueno) { return service.save(dueno); }

    @PutMapping("/{id}")
    public Dueno update(@PathVariable Integer id, @RequestBody Dueno dueno) {
        dueno.setId(id);
        return service.save(dueno);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) { service.delete(id); }
}
