package biblioteca;

public class Copia extends Libro{

    /**
     * Clase copia cuenta con atributos estado (recogidos en clase enum EstadoCopia) y con referencia
     * Adicionalmente, cuenta con todos los atributos de libro, ya que hereda de este.
     */
    private int referencia;
    private EstadoCopia estado;
}
