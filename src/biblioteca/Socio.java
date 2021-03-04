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

    private List<Prestamo>numPrestamos;

    /**
     * Constructor con todos los atributos:
     * @param numero
     * @param nombre
     * @param direccion
     * @param telefono
     */

    public Socio(int numero, String nombre, String direccion, String telefono,List<Multa>numMultas,List<Prestamo>numPrestamos) {
        this.numero = numero;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.numMultas = numMultas;
        this.numPrestamos = numPrestamos;
    }




}
