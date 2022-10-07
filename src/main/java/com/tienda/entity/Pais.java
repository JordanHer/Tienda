package com.tienda.entity;

//Todo esto tenemos que importarlo para que no de errores
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "paises")
//Patron decorador: lo que hace es modificar la funcionalidad de un objeto en tiempo de ejecucion, osea
//definir que es un ENTITY, el en tiempo de ejecucion el va a comprender que cuando yo haga una clase de tipo pais implica
//que esa clase es una entidad y viene de una BD
//Y ahara de esa BD de cual tabla hacemos referencia, para eso es el Table(name = "paises") 

//Serializable es basicamente para cuando agregamos un id del objeto como tal el objeto se guarda en memoria, 
//ese espacio dememoria tiene un valor hexadecimal entonces eso es para serializar todo ese espacio de memoria 
//y demas de los ID cuando venga la BD
public class Pais implements Serializable {

    
    @Id // le decimos que este atributo va a ser nuestro ID
    @GeneratedValue(strategy = GenerationType.IDENTITY) // lo que hace es que cuando nosotros agregemos un paise desde nuestra app
                                                        // cuando le damos guardar por debajo usa esta propiedad y hace que no tengamos que generar el ID
    private long id;
    private String pais;

    public long getId() {
        return id;
    }

    public String getPais() {
        return pais;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

}
