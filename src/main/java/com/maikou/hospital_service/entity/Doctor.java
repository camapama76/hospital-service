package com.maikou.hospital_service.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name = "doctor", schema = "administracion")
@Getter
@Setter
public class Doctor {
    @Id
   // @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name="doc_id") 
   private Short docId;
    @Column(name="doc_nombre")
    private String docNombre;
    @Column(name="doc_apellidos")
    private String docApellidos;
    @Column(name="doc_rs")
    private Short docRs;
    
    @ManyToOne
    @JoinColumn(name = "especialidad_id",referencedColumnName = "esp_id")
    private Especialidad especialidad;

    /*@OneToMany(mappedBy = "doctor")
    private List<Reservacion> reservaciones;
    
    @OneToMany(mappedBy = "doctor")
    private List<Horario> horarios;*/
}
