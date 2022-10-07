
package com.tienda.repository;

import com.tienda.entity.Pais;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


// quitamos el class y ponemos interface
//Notamos que utilizamos el patron decorador e indicando que este es de tipo repository
// Luego notamos que estamos diciendo que va a extender de crud repository
//El extends es herencia en java
//Las bocas del final son java yenerics <>, explicacion del profe en el min 20.08 de la clase 4
//Con control click podemos ver
//Las siguientes lineas son una varita magina, ellas van a hacer todas las consulras a la base de datos sin que nosotros movamos un solo dedo, sin excribir selects, ni updates, todo lo podemos ver con control+click, vemos que funciones podemos utilizar y cuales no, importante haber aprendido saber usar javayenerics
//Ahi < definimos el nombre y el tipo >
@Repository
public interface PaisRepository extends CrudRepository <Pais,Long>{
    
}
