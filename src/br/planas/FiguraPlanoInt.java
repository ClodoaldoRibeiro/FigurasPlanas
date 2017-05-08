package br.planas;

/**
 * Todas figuras planas possue esse comportamentos
 *
 * @see 1 Versão
 * @author Clodoalod Ribeiro
 */
public interface FiguraPlanoInt {

    /**
     * @return area da figura
     * @see 1 Versão
     * @author Clodoalod Ribeiro
     */
    public double area();

    /**
     * @return perimetro da figura
     * @see 1 Versão
     * @author Clodoalod Ribeiro
     */
    public double perimetro();

    /**
     * Mostra todos os dados da figura
     *
     * @return 
     * @see 1 Versão
     * @author Clodoalod Ribeiro
     */
    public String mostrarDados();
}
