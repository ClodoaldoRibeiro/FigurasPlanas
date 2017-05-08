package br.planas;

import excecoes.CRException;
import framework.Formatar;

public class Circulo extends FiguraPlana implements Figuras2D {

    private double raio;

    public Circulo(double raio) throws CRException {
        this.setRaio(raio);
    }

    // Exeção utilizada por que não pode existir circulo se não ouver raio.
    public void setRaio(double raio) throws CRException {

        if (raio > 0) {
            this.raio = raio;
        } else {
            CRException crException = new CRException(raio, "Raio tem que ser maior que zero!");
            throw crException;
        }
    }

    public double getRaio() {
        return (this.raio);
    }

    public double diametro() {
        return raio * 2;
    }

    @Override
    public double area() {
        return PI * Math.pow(this.raio, 2);
    }

    @Override
    public double perimetro() {
        return (this.comprimento());
    }

    public double comprimento() {
        return 2 * PI * this.raio;
    }

    /**
     * MostrarDados e uma sobreescrita de matado.
     *
     * @return
     * @see 1 Verão
     * @author Caio
     */
    @Override
    public String mostrarDados() {
        String msg = "";
        msg = msg + "\n Figura: Circulo";
        msg = msg + "\n Raio: " + Formatar.format(this.raio);
        msg = msg + "\n Area: " + Formatar.format(this.area());
        msg = msg + "\n Diametro: " + Formatar.format(this.diametro());
        msg = msg + "\n Perimetro: " + Formatar.format(this.perimetro());
        msg = msg + "\n Comprimento: " + Formatar.format(this.comprimento());

        return msg;
    }

}
