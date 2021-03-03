package biblioteca;

import java.util.List;

/**
 * La clase <code>Autor</code> alberga los atributos del autor de un libro alojado en la biblioteca
 * @author Marcus Skelly
 * @version 1.0
 * @since 1.0
 */

public class Autor {
    /**
     * atributos de la clase Autor que incluyen su nombre, nacionalidad y fecha de nacimiento
     */
    private String nombre;
    private String nacionalidad;
    private int fechaNacimiento;

    /**
     * Todos los libros que ha escrito un autor
     */

    private List<Libro>escritos;


    /**
     * Constructor con todos los atributos:
     * @param nombre
     * @param nacionalidad
     * @param fechaNacimiento
     */

    public Autor(String nombre, String nacionalidad, int fechaNacimiento,List<Libro>escritos) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.fechaNacimiento = fechaNacimiento;
        this.escritos = escritos;
    }
}
