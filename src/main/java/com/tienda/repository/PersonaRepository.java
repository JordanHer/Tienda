
package com.tienda.repository;

import com.tienda.entity.Personas;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PersonaRepository extends CrudRepository <Personas,Long>{
    
}
