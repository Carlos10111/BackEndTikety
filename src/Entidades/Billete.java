package Entidades;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;


@Entity
@Data
public class Billete {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String codigo; // Ej: BIL-20250404-001

    private LocalDate fechaCompra;

    private double precio;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "viaje_id")
    private Viaje viaje;
}
