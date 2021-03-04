package instalacionesDeportivas;

import java.util.List;


/**
 * La clase <code>Polideportivo</code> Contiene los atributos de un polideportivo, además de una lista de los socios que usan el mismo
 * @author Marcus Skelly
 * @version 1.0
 * @since 1.0
 */

public class Polideportivo {


    /**
     * atributos de la clase Polideportivo que incluyen su nombre, tipo de instalacion y una lista de socios que tiene abonados
     */

    private String nombre;
    private Instalacion tipo;
    private List<Socio> asociados;


    /**
     * Constructor con todos los atributos:
     * @param nombre
     * @param tipo
     * @param asociados
     */

    public Polideportivo(String nombre, Instalacion tipo, List<Socio> asociados) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.asociados = asociados;
    }
}
