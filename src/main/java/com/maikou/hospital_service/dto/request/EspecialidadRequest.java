package com.maikou.hospital_service.dto.request;

import org.hibernate.validator.constraints.Length;

import com.maikou.hospital_service.entity.Especialidad;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
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
public class EspecialidadRequest {
    @NotEmpty(message = "El texto no puede ser vacio")
    @NotNull(message = "El nombre no puede ser nulo")
    @Length(max = 100)
    private String espNombre;
    
    @NotEmpty(message = "Validation.notempty")
    @NotNull(message = "validation.notnull")
    @Length(max = 200)
    private String espDescripcion;

    public static Especialidad toEntity(EspecialidadRequest especialidadRequest){

        return Especialidad.builder()
        .espNombre(especialidadRequest.getEspNombre())
        .espDescripcion(especialidadRequest.getEspDescripcion())        
        .build();
    }
}
