package br.espaciais;

/**
 * @see 1
 * @author Clodoaldo RIbeiro
 */
public class Cubo extends FiguraEspacial implements Figuras3D {

    private double aresta;

    public Cubo(double aresta) {
        this.aresta = aresta;
    }

    public double getAresta() {
        return aresta;
    }

    public void setAresta(double aresta) {
        this.aresta = aresta;
    }

    @Override
    public void mostrarDados() {
        System.out.println("Figura: Cubo");
        System.out.println("Area: " + this.area());
        System.out.println("Volume: " + this.volume());

    }

}
