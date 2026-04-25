package pe.edu.vallegrande.mascotas.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Adopciones")
public class Adopcion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer mascota_id;
    private Integer dueno_id;
    private LocalDate fecha_adopcion;

    // Getters y Setters
    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }
    public Integer getMascota_id() { return mascota_id; }
    public void setMascota_id(Integer mascota_id) { this.mascota_id = mascota_id; }
    public Integer getDueno_id() { return dueno_id; }
    public void setDueno_id(Integer dueno_id) { this.dueno_id = dueno_id; }
    public LocalDate getFecha_adopcion() { return fecha_adopcion; }
    public void setFecha_adopcion(LocalDate fecha_adopcion) { this.fecha_adopcion = fecha_adopcion; }
}
