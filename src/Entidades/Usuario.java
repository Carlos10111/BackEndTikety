package Entidades;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    private String email;

    private String telefono;

    @OneToMany(mappedBy = "usuario")
    private List<Billete> billetes = new ArrayList<>();

}
