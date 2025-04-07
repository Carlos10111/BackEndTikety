package Entidades;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Viaje {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate fechaSalida;

    private LocalDate fechaLlegada;

    @ManyToOne
    private Transporte transporte;

    @ManyToOne
    private Destino origen;

    @ManyToOne
    private Destino destino;

    @OneToMany(mappedBy = "viaje")
    private List<Billete> billetes = new ArrayList<>();

}
