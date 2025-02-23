package com.maikou.hospital_service.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RestController;

import com.maikou.hospital_service.dto.request.EspecialidadRequest;
import com.maikou.hospital_service.dto.response.EspecialidadResponse;
import com.maikou.hospital_service.entity.Especialidad;
import com.maikou.hospital_service.service.EspecialidadService;

import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/especialidad")
public class EspecialidadController {

    private final EspecialidadService especialidadService;

    public EspecialidadController(EspecialidadService especialidadService) {
        this.especialidadService = especialidadService;
    }

    @GetMapping
    public List<EspecialidadResponse> findAllEspecialidades() {
        return especialidadService.findAllEspecialidades();
    }

    @GetMapping("/{id}")
    public EspecialidadResponse findEspecialidadById(@PathVariable Short id) {
        return especialidadService.findEspecialidadById(id);
    }
    @PostMapping
    public EspecialidadResponse createEspecialidad(@RequestBody @Valid EspecialidadRequest especialidad) {
              
        return especialidadService.createEspecialidad(especialidad);
    }

    @PutMapping("/{id}")
    public EspecialidadResponse updateEspecialidad(@PathVariable short id, @RequestBody @Valid EspecialidadRequest especialidad) {
              
        return especialidadService.updateEspecialidad(id, especialidad);
    }
    @DeleteMapping("/{id}")
    public void deleteEspecialidad(@PathVariable Short id){
        especialidadService.deleteEspecialidadById(id);
    }


}
