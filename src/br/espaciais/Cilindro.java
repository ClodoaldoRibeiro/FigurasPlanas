package br.espaciais;

import br.planas.Circulo;
import br.planas.Figuras2D;
import excecoes.CRException;
import framework.Formatar;

/**
 * @see 1
 * @author Clodoaldo Ribeiro
 */
public class Cilindro extends FiguraEspacial implements Figuras3D, Figuras2D {

    // Aqui foi utilizado a Associações por Composição
    private Circulo circulo;
    private double altura;
    private double raio;

    public Cilindro() {
    }

    public Cilindro(Circulo circulo, double altura) {
        this.circulo = circulo;
        this.altura = altura;
    }

    /**
     *
     * @param altura
     * @param raio
     * @throws excecoes.CRException
     * @see 1
     * @author Clodoaldo Ribeiro
     */
    public Cilindro(double altura, double raio) throws CRException {
        this.altura = altura;
        this.raio = raio;
        try {
            this.circulo = new Circulo(raio);
        } catch (CRException ex) {
            throw new CRException(raio, "Raio tem que ser maior que zero.");
        }
    }

    public Circulo getCirculo() {
        return circulo;
    }

    public void setCirculo(Circulo circulo) {
        this.circulo = circulo;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double area() {
        return (Math.PI * this.circulo.diametro() * (this.altura + this.raio));
    }

    @Override
    public double volume() {
        return this.circulo.area() * this.altura;
    }

    @Override
    public void mostrarDados() {
        System.out.println("Figura: Cilindro");
        System.out.println("Altura: " + Formatar.format(this.altura));
        System.out.println("Raio: " + Formatar.format(this.raio));
        System.out.println("Area: " + Formatar.format(this.area()));
        System.out.println("Volume: " + Formatar.format(this.volume()));
        System.out.println("Area da Base: " + Formatar.format(this.circulo.area()));
    }

    /* Relação de Dependencia, aqui foi usado a Classe circulo para indicar qua
    a Cinlindro depende da Classe Circulo para realizar o calculo de compração 
    de area da base do Cilindro.
     */
    public boolean areaBaseIgual(Circulo circulo) {

        double areabase = circulo.area();
        boolean retorno = false;

        if (areabase == this.circulo.area()) {
            retorno = true;
        }
        return retorno;
    }

    @Override
    public double perimetro() {
        return 0;
    }

}
