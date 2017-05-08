package br.planas;

public abstract class FiguraPlana implements FiguraPlanoInt {

    private String tipo;
    final float PI = (float) 3.14;

    public FiguraPlana() {
    }

    @Override
    public abstract double area();

    @Override
    public abstract double perimetro();

    @Override
    public String mostrarDados() {
        String msg = "";
        msg = msg + "\n Figura : " + this.tipo;
        msg = msg + "\n Area: " + this.area();
        msg = msg = "\n Perimetro: " + this.perimetro();
        
        return msg;
    }
}
