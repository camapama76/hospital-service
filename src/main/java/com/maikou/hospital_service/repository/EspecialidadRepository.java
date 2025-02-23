package com.maikou.hospital_service.repository;

import java.util.List;

import org.springframework.data.repository.ListCrudRepository;

import com.maikou.hospital_service.entity.Especialidad;
                                                                                // tipo del id
public interface EspecialidadRepository extends ListCrudRepository<Especialidad,Short>{
    // Define custom query
    //List<Especialidad> findAllByEspNombreContaining(String nombre);

}
