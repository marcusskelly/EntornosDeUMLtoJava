package instalacionesDeportivas;

import java.util.List;


/**
 * La clase <code>Socio</code> contiene tanto los atributos de un socio, como una lista de las reservas que ha realizado
 * @author Marcus Skelly
 * @version 1.0
 * @since 1.0
 */

public class Socio {

    /**
     * atributos de la clase Socio. Incluye un nombre,direccion,ciudad,provincia,telefono,cuota, y una lista con las reservas realizadas
     */

    private String nombre;
    private String direccion;
    private String ciudad;
    private String provincia;
    private int telefono;
    private int cuota;

    private List<Reserva>numReservas;


    /**
     * Constructor con todos los atributos:
     * @param nombre
     * @param direccion
     * @param ciudad
     * @param provincia
     * @param telefono
     * @param cuota
     * @param numReservas
     */

    public Socio(String nombre, String direccion, String ciudad, String provincia, int telefono, int cuota, List<Reserva> numReservas) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.provincia = provincia;
        this.telefono = telefono;
        this.cuota = cuota;
        this.numReservas = numReservas;
    }
}
