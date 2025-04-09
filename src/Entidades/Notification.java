package Entidades;

import lombok.Data;
import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
public class Notification {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String message;
    private LocalDateTime date;
    private boolean read;

    @ManyToOne
    @JoinColumn(name = "ticket_id")
    private Ticket ticket;
}