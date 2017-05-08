package br.espaciais;

/**
 * @see 1
 * @author Clodoaldo Ribeiro
 */
public abstract class FiguraEspacial implements FiguraEspacialInt {

    public FiguraEspacial() {
    }

    @Override
    public double area() {
        throw new UnsupportedOperationException("Metado são desenvolvido!");
    }

    @Override
    public double volume() {
        throw new UnsupportedOperationException("Metado são desenvolvido!");
    }

    @Override
    public void mostrarDados() {
        throw new UnsupportedOperationException("Metado são desenvolvido!");
    }

}
