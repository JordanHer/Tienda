package com.tienda.service;

import com.tienda.entity.Pais;
import com.tienda.repository.PaisRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class PaisService implements IPaisService {

    //ocupamos el repositorio porque es el que hace las consultas a la BD y es el 
    //que puede extraer toda la info que vamos a almacenar en una lista de entidades
    //AutoWired, permite dos objetos de diferente decorador pueden unirse uno con el otro
    @Autowired
    private PaisRepository paisRepository;

    @Override
    public List<Pais> listCountry() {
        return (List<Pais>) paisRepository.findAll();
    }

}
