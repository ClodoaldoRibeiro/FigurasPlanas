package excecoes;

/**
 *
 * @author Clodoaldo Ribeiro
 */
public class QDException extends Exception {

    private double lado;

    /**
     * Creates a new instance of <code>QDException</code> without detail
     * message.
     */
    public QDException() {
        super("Lado do quadrado inválido!");
    }

    /**
     * Constructs an instance of <code>QDException</code> with the specified
     * detail message.
     *
     * @param lado
     * @param msg the detail message.
     */
    public QDException(double lado, String msg) {
        super(msg);
        this.lado = lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

}
