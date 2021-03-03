package biblioteca;

import java.util.List;

/**
 * La clase <code>Socio</code> incluye los atributos de un socio de la biblioteca, además de los prestamos realizados y las multas recibidas
 * @author Marcus Skelly
 * @version 1.0
 * @since 1.0
 */

public class Socio {

    /**
     * atributos de la clase Socio que incluyen su nombre, direccion, numero de socio y telefono
     */

    private int numero;
    private String nombre;
    private String direccion;
    private String telefono;

    /**
     * El numero de multas que tiene un socio
     */

    private List<Multa>numMultas;

    /**
     * Constructor con todos los atributos:
     * @param numero
     * @param nombre
     * @param direccion
     * @param telefono
     */

    public Socio(int numero, String nombre, String direccion, String telefono,List<Multa>numMultas) {
        this.numero = numero;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.numMultas = numMultas;
    }

    /**
     * Clase Prestamo alojada dentro de la clase socio con fecha de inicio y fecha fin como atributos
     */

    public class Prestamo{
        public int fechaInicio;
        public int fechaFin;
    }

    /**
     * Clase Multa detalla las multas impuestas al socio de la biblioteca
     */

    public class Multa{
        public int fechaInicio;
        public int fechaFin;
    }
}
