package com.maikou.hospital_service.dto.response;

import com.maikou.hospital_service.entity.Especialidad;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class EspecialidadResponse {    
    
    private Short espId;
    
    private String espNombre;
    
    private String espDescripcion;

    public static EspecialidadResponse fromEntity(Especialidad especialidad){

        return EspecialidadResponse.builder()
        .espId(especialidad.getEspId())
        .espNombre(especialidad.getEspNombre())
        .espDescripcion(especialidad.getEspDescripcion())        
        .build();
    }
}