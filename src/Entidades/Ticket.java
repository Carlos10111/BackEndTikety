package Entidades;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    private String airline;
    private String origin;
    private String destination;

    private LocalDateTime departureDate;
    private String departureTime;
    private String flightNumber;
    private String bookingCode;
    private String status;

    @OneToMany(mappedBy = "ticket", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Notification> notifications;
}

