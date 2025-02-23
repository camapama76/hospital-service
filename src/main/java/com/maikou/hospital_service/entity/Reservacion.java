package com.maikou.hospital_service.entity;
import java.time.Instant;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name = "reservacion", schema = "administracion")
@Getter
@Setter
public class Reservacion {
    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="res_id")
    private Integer resId;
    
    @Column(name="res_estado")
    private Short resEstado;
    
    @Column(name="res_fecha_reserva")
    private Instant resFechaReserva;
    
    @ManyToOne
    @JoinColumn(name = "paciente_id",referencedColumnName = "pac_id")
    private Paciente paciente;
    
    @ManyToOne
    @JoinColumn(name = "doctor_id",referencedColumnName = "doc_id")
    private Doctor doctor;
    
    @ManyToOne
    @JoinColumn(name = "horario_id",referencedColumnName = "hor_id")
    private Horario horario;
}