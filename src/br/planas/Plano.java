package br.planas;

import framework.Formatar;

/**
 * Associações por Agregação, aqui foi reunido tadas as classes do pacote de
 * figuras planas. Essa composição nos dá a difinição de um plano, que podemos
 * obter dados.
 *
 * @author Clodoaldo Ribeiro
 */
public class Plano extends FiguraPlana implements PlanoInt {

    private Circulo circulo;
    private Quadrado quadrado;
    private Retangulo retangulo;
    private Triangulo triangulo;

    public Plano(Circulo circulo, Quadrado quadrado, Retangulo retangulo, Triangulo triangulo) {
        this.circulo = circulo;
        this.quadrado = quadrado;
        this.retangulo = retangulo;
        this.triangulo = triangulo;
    }

    @Override
    public double area() {
        double totalarea = 0;

        if (circulo != null) {
            totalarea = totalarea + circulo.area();
        }

        if (quadrado != null) {
            totalarea = totalarea + quadrado.area();
        }

        if (retangulo != null) {
            totalarea = totalarea + retangulo.area();
        }

        if (triangulo != null) {
            totalarea = totalarea + triangulo.area();
        }
        return totalarea;
    }

    @Override
    public double perimetro() {

        double totalPerimetro = 0;

        if (circulo != null) {
            totalPerimetro = totalPerimetro + circulo.perimetro();
        }

        if (quadrado != null) {
            totalPerimetro = totalPerimetro + quadrado.perimetro();
        }

        if (retangulo != null) {
            totalPerimetro = totalPerimetro + retangulo.perimetro();
        }

        if (triangulo != null) {
            totalPerimetro = totalPerimetro + triangulo.perimetro();
        }
        return totalPerimetro;
    }

    @Override
    public int qtdFiguras() {

        int totalFiguras = 0;

        if (circulo != null) {
            totalFiguras = totalFiguras + 1;
        }

        if (quadrado != null) {
            totalFiguras = totalFiguras + 1;
        }

        if (retangulo != null) {
            totalFiguras = totalFiguras + 1;
        }

        if (triangulo != null) {
            totalFiguras = totalFiguras + 1;
        }
        return totalFiguras;
    }

    @Override
    public String mostrarDados() {
        String msg = "";

        msg = msg + "\n Area do Plano: " + Formatar.format(this.area());
        msg = msg + "\n Perimetro do Plano: " + Formatar.format(this.perimetro());
        msg = msg + "\n Quantidade de Figuras no Plano: " + Formatar.format(this.qtdFiguras()) + "\n";

        if (circulo != null) {
            msg = msg + circulo.mostrarDados() + "\n";
        }

        if (quadrado != null) {
            msg = msg + quadrado.mostrarDados() + "\n";
        }

        if (retangulo != null) {
            msg = msg + retangulo.mostrarDados() + "\n";
        }

        if (triangulo != null) {
            msg = msg + triangulo.mostrarDados() + "\n";
        }

        return msg;
    }

    public Circulo getCirculo() {
        return circulo;
    }

    public void setCirculo(Circulo circulo) {
        this.circulo = circulo;
    }

    public Quadrado getQuadrado() {
        return quadrado;
    }

    public void setQuadrado(Quadrado quadrado) {
        this.quadrado = quadrado;
    }

    public Retangulo getRetangulo() {
        return retangulo;
    }

    public void setRetangulo(Retangulo retangulo) {
        this.retangulo = retangulo;
    }

    public Triangulo getTriangulo() {
        return triangulo;
    }

    public void setTriangulo(Triangulo triangulo) {
        this.triangulo = triangulo;
    }

}
