package instalacionesDeportivas;

import java.time.LocalDate;


/**
 * La clase <code>Reserva</code> alberga las siguientes instalaciones que contiene un polideportivo
 * @author Marcus Skelly
 * @version 1.0
 * @since 1.0
 * @see Socio
 * @see Polideportivo
 */

public class Reserva {

    /**
     * atributos de la clase Reserva, los cuales indican la fecha que ha sido realizada la reserva, inicio y fin de la actividad, y finalmente material extra que se haya alquilado para la actividad
     */

    private LocalDate fecha;
    private int horaInicio;
    private int horaFin;
    private Material extras;


    /**
     * Constructor con todos los atributos:
     * @param fecha
     * @param horaInicio
     * @param horaFin
     * @param extras
     */

    public Reserva(LocalDate fecha, int horaInicio, int horaFin, Material extras) {
        this.fecha = fecha;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.extras = extras;
    }
}
