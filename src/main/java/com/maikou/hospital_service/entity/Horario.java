package com.maikou.hospital_service.entity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDateTime;
import java.time.LocalTime;


@Entity
@Table(name = "horario", schema = "administracion")
@Getter
@Setter
public class Horario {
    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="hor_id")
    private Integer horId;
    @Column(name="hor_fecha")
    private LocalDateTime horFecha;
    @Column(name="hor_hora_inicio")
    private LocalTime horHoraInicio;
    @Column(name="hor_hora_fin")
    private LocalTime horHoraFin;
    @Column(name="hor_disponible")
    private Boolean horDisponible;
    
    @ManyToOne
    @JoinColumn(name = "doctor_id",referencedColumnName = "doc_id")
    private Doctor doctor;
}

