
package com.tienda.service;

import com.tienda.entity.Pais;
import java.util.List;

//no tenemos un patron decorador que nos indique que esto es un servicio, porque el verdadero servicio es el que esta sin el I, este nada mas es la interfaz, el como pueden ser accedidos nuestro metodos como tal

public interface IPaisService {
    //estoy creando uan lista de objetos de ti[po pais pero ademas es una lista de entidades de nuestra tabla pais
    public List<Pais> listCountry ();
}
