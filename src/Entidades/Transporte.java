package Entidades;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Transporte {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String tipo; // avión, tren, bus, etc.

    private String nombre; // Nombre de la compañía o vehículo

    @OneToMany(mappedBy = "transporte")
    private List<Viaje> viajes = new ArrayList<>();


}
