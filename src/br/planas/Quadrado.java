package br.planas;

import excecoes.QDException;
import framework.Formatar;

/**
 *
 * @author Clodoaldo Ribeiro
 */
public class Quadrado extends FiguraPlana implements Figuras2D {

    private double lado;

    public Quadrado(double lado) throws QDException {
        this.setLado(lado);
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) throws QDException {

        if (lado > 0) {
            this.lado = lado;
        } else {
            throw new QDException(lado, "O valor do lado tem que ser maior que zero!");
        }

    }

    /**
     *
     * @see 1 Verão
     * @return area do quadrado
     * @author Clodoaldo Ribeiro
     */
    @Override
    public double area() {
        return Math.pow(lado, 2);
    }

    /**
     * perimetro do quadrado
     *
     * @return perimetro do quadrado
     * @see 1 Verão
     * @author Clodoaldo Ribeiro
     */
    @Override
    public double perimetro() {
        return 4 * lado;
    }

    /**
     * Mostra os dados do quadrado
     *
     * @return
     * @see 1 Verão
     * @author Clodoaldo Ribeiro
     */
   
}
