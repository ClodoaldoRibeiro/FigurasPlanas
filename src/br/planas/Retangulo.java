package br.planas;

public class Retangulo extends FiguraPlana implements Figuras2D {

    private double largura;
    private double altura;
    public static float somaTotal;

    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
        somaTotal = (float)area() + somaTotal;//CAST EXPLICITO + ATRIBUTO STATIC
    }

    public double getLargura() {
        return largura;
    }
        
    public void setLargura(double largura) {
        this.largura = largura;
    }
    
    public static float getSomaTotal() {
        return somaTotal;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double area() {
        return this.largura * this.altura;
    }

    @Override
    public double perimetro() {
        return 2 * (this.largura + this.altura);
    }

    public void mostraDados() {
        System.out.println("Retangulo com lados " + this.largura + " e " + this.altura);
        mostrarDados();
    }
}
