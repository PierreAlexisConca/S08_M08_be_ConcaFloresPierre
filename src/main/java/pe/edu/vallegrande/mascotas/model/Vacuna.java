package pe.edu.vallegrande.mascotas.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Vacunas")
public class Vacuna {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer mascota_id;
    private String nombre;
    private LocalDate fecha_aplicacion;
    private Integer veterinario_id;

    // Getters y Setters
    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }
    public Integer getMascota_id() { return mascota_id; }
    public void setMascota_id(Integer mascota_id) { this.mascota_id = mascota_id; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public LocalDate getFecha_aplicacion() { return fecha_aplicacion; }
    public void setFecha_aplicacion(LocalDate fecha_aplicacion) { this.fecha_aplicacion = fecha_aplicacion; }
    public Integer getVeterinario_id() { return veterinario_id; }
    public void setVeterinario_id(Integer veterinario_id) { this.veterinario_id = veterinario_id; }
}
