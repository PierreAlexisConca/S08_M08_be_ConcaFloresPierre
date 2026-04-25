package pe.edu.vallegrande.mascotas.controller;

import org.springframework.web.bind.annotation.*;
import pe.edu.vallegrande.mascotas.model.Vacuna;
import pe.edu.vallegrande.mascotas.service.VacunaService;
import java.util.List;

@RestController
@RequestMapping("/api/vacunas")
@CrossOrigin("*")
public class VacunaController {
    private final VacunaService service;
    public VacunaController(VacunaService service) { this.service = service; }

    @GetMapping
    public List<Vacuna> getAll() { return service.getAll(); }

    @GetMapping("/{id}")
    public Vacuna getById(@PathVariable Integer id) { return service.getById(id).orElse(null); }

    @PostMapping
    public Vacuna create(@RequestBody Vacuna vacuna) { return service.save(vacuna); }

    @PutMapping("/{id}")
    public Vacuna update(@PathVariable Integer id, @RequestBody Vacuna vacuna) {
        vacuna.setId(id);
        return service.save(vacuna);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) { service.delete(id); }
}
