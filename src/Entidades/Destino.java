package Entidades;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@Data
public class Destino {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String ciudad;

    private String pais;

    @OneToMany(mappedBy = "origen")
    private List<Viaje> viajesOrigen = new ArrayList<>();

    @OneToMany(mappedBy = "destino")
    private List<Viaje> viajesDestino = new ArrayList<>();


}
