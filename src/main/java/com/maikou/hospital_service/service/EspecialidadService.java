package com.maikou.hospital_service.service;

import java.util.List;
import java.util.Optional;

import com.maikou.hospital_service.dto.request.EspecialidadRequest;
import com.maikou.hospital_service.dto.response.EspecialidadResponse;
import com.maikou.hospital_service.entity.Especialidad;

public interface EspecialidadService {
    List<EspecialidadResponse> findAllEspecialidades();
    EspecialidadResponse findEspecialidadById(Short id);
    EspecialidadResponse createEspecialidad(EspecialidadRequest especialidad);
    EspecialidadResponse updateEspecialidad(Short id, EspecialidadRequest especialidad);
    void deleteEspecialidadById(Short id);

}
