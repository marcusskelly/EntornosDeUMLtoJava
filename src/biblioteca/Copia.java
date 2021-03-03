package biblioteca;

/**
 * La clase <codeCopia</code> define un tipo de <code>Libro</code>
 * @author Marcus Skelly
 * @see Libro
 * @version 1.0
 * @since 1.0
 */

public class Copia extends Libro{

    /**
     * Clase copia cuenta con atributos estado (recogidos en clase enum EstadoCopia) y con referencia
     * Adicionalmente, cuenta con todos los atributos de libro, ya que hereda de este.
     */
    private int referencia;
    private EstadoCopia estado;

    public class Prestamo{
        public int fechaInicio;
        public int fechaFin;
    }
}
