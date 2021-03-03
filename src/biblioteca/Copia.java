package biblioteca;

import java.util.List;

/**
 * La clase <code>Copia</code> define un tipo de <code>Libro</code>
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

    /**
     * Constructor con todos los atributos:
     *
     * @param titulo
     * @param editorial
     * @param year
     * @param tipo
     * @param referencia
     * @param estado
     */
    public Copia(String titulo, String editorial, int year, Genero tipo, int referencia, EstadoCopia estado, List<Copia> numCopias) {
        /**
         * Mediante la palabra clave super, accedemos a los atributos de libro de la clase madre
         */
        super(titulo, editorial, year, tipo,numCopias);// como copia hereda de libro, me pide el array list
        this.referencia = referencia;
        this.estado = estado;
    }


    /**
     * Clase Prestamo alojada en copia, detalla las fechas de un prestamo realizado por un socio de la biblioteca a una copia especifica
     */


}
