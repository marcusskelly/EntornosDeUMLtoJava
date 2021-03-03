package biblioteca;

/**
 * La clase <code>Libro</code> alberga los atributos de Libro del paquete biblioteca.
 * de ella pueden heredar otras clases
 * @author Marcus Skelly
 * @version 1.0
 * @since 1.0
 */
public class Libro {

    /**
     * atributos de la clase libro que incluyen un private como acceso a estos atributos
     * esto implica a que a la hora de acceder a ellos mediante otras clases,necesitemos getters y setters
     * finalmente, se incluye el atributo tipo de la clase Genero, que nos indica el tipo de libro
     */
    private String titulo;
    private String editorial;
    private int year;
    private Genero tipo;
}
