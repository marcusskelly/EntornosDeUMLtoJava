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

    /**
     * Constructor con todos los atributos:
     * @param titulo
     * @param editorial
     * @param year
     * @param tipo
     */

    public Libro(String titulo, String editorial, int year, Genero tipo) {
        this.titulo = titulo;
        this.editorial = editorial;
        this.year = year;
        this.tipo = tipo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Genero getTipo() {
        return tipo;
    }

    public void setTipo(Genero tipo) {
        this.tipo = tipo;
    }
}
