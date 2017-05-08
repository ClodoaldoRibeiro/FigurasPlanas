package excecoes;

/**
 * Circulo sem Raio
 *
 * @author Clodoaldo Ribeiro
 */
public class CRException extends Exception {

    private double raio;

    /**
     * Creates a new instance of <code>CRException</code> without detail
     * message.
     */
    public CRException() {
        super("Rio invalido!");
    }

    /**
     * Constructs an instance of <code>CRException</code> with the specified
     * detail message.
     *
     * @param raio
     * @param msg the detail message.
     */
    public CRException(double raio, String msg) {
        super(msg);
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

}
