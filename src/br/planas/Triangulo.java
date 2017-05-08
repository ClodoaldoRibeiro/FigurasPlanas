package br.planas;

public class Triangulo extends FiguraPlana implements Figuras2D {

    private int hipotenusa;
    final int tamanho = 3;
    private String tipoAngulo;
    float[] lados = new float[tamanho];
    TipoTriangulo TipoT;

    private enum TipoTriangulo {
        Equilatero, Escaleno, Isoceles
    }    

    public TipoTriangulo getTipoT() {
        return TipoT;
    }
    
    public Triangulo(float x, float y, float z) {
        tipoTriangulo(x, y, z);        
        definirLado(x, y, z);
        tipoAngulo();
    }

    public String getTipoAngulo() {
        return tipoAngulo;
    }
    
    public float getLado1() {
        return lados[0];
    }
    public float getLado2() {
        return lados[1];
    }
    public float getLado3() {
        return lados[2];
    }
    

    public static double calcularAreas(double... numeros) {
        //O parâmetro 'numeros' tem que ser tratado como um 'array'
        Integer tamanhoDoArray = numeros.length; //pega o tamanho do array
        double soma = 0.0;  //variável que irá somar todas as ocorrências de números dentro do 'array'	//variável de retorno
        if (tamanhoDoArray > 0) { //se o 'array' possuir mais do que 0 números, significa que ele não está vazio
            for (int i = 0; i < tamanhoDoArray; i++) { // percorre o array pegando todos os seus números e somando
                soma += numeros[i];
            }
        }
        return soma;  // retorna a soma
    }

    public void setTipoAngulo(String tipoAngulo) {
        this.tipoAngulo = tipoAngulo;
    }
    
    public double getHipotenusa() {
        return hipotenusa;
    }
    //método para inserir valores dos lados
    public void setLados(float lado1, float lado2, float lado3) {
        tipoTriangulo(lado1, lado2, lado3);
        definirLado(lado1, lado2, lado3);
        tipoAngulo();
    }
    //Método para definir os lados do triangulo
    private void definirLado(float x, float y, float z) {
        if (getTipoT() == TipoTriangulo.Equilatero) {
           lados[0] = x;
           lados[1] = y;
           lados[2] = z;
        } else if (getTipoT() == TipoTriangulo.Escaleno) {
            if (x > y && x > z && y > z) {
                lados[0] = x;
                lados[1] = y;
                lados[2] = z;
            } else if (x > y && x > z && z > y) {
                lados[0] = x;
                lados[1] = z;
                lados[2] = y;
            } else if (y > x && y > z && x > z) {
                lados[0] = y;
                lados[1] = x;
                lados[2] = z;
            } else if (y > x && y > z && z > x) {
                lados[0] = y;
                lados[1] = z;
                lados[2] = x;
            } else if (z > x && z > y && x > y) {
                lados[0] = z;
                lados[1] = x;
                lados[3] = y;
            } else if (z > x && z > y && y > x) {
                lados[0] = z;
                lados[1] = y;
                lados[2] = x;
            }
        } else if (getTipoT() == TipoTriangulo.Isoceles) {
            if (x == y && x != z) {
                lados[0] = z;
                lados[1] = x;
                lados[2] = y;
            } else if (x == z && x != y) {
                lados[0] = y;
                lados[0] = x;
                lados[0] = z;
            } else if (y == z && y != x) {
                lados[0] = x;
                lados[1] = y;
                lados[2] = z;
            }
        }
    }

    @Override
    public String mostrarDados() {
        super.mostrarDados();
        System.out.println("Lados do Triangulo: " + this.lados[0] + ", " + this.lados[1] + ", " + this.lados[2]);
        System.out.println("Tipo: " + getTipoT() + " e " + this.tipoAngulo);
        return "";
    }

    @Override
    public double area() {
        if (getTipoT() == TipoTriangulo.Equilatero) {
            return ((Math.pow(lados[0], 2) * Math.sqrt(3) / 4));
        } else if ("Retângulo".equals(this.tipoAngulo)) {
            return ((lados[1] * lados[2]) / 2);
        } else if (getTipoT() == TipoTriangulo.Escaleno && this.tipoAngulo != "Retângulo") {
            float s;
            s = (lados[0] + lados[1] + lados[2]) / 2;
            return (Math.sqrt(s * (s - lados[0]) * (s - lados[1]) * (s - lados[2])));
        } else if (getTipoT() == TipoTriangulo.Isoceles && this.tipoAngulo != "Retângulo") {
            return (lados[0] * Math.sqrt(Math.pow(lados[1], 2) - (Math.pow(lados[0], 2) / 4)) / 2);
        }

        return 0;
    }

    @Override
    public double perimetro() {
        return this.lados[0] + this.lados[1] + this.lados[2];
    }

    public void tipoTriangulo(float x, float y, float z) {
        if ((y == z) && (x == y)) {
            this.TipoT = TipoTriangulo.Equilatero;
            //this.tipo = "Equilatero";

        } else {
            if ((x != y) && (x != z) && (y != z)) {
                this.TipoT = TipoTriangulo.Escaleno;
                //this.tipo = "Escaleno";
            } else {
                this.TipoT = TipoTriangulo.Isoceles;
                //this.tipo = "Isoceles";
            }
        }
    }

    private void tipoAngulo() {
        if (this.lados[0] == Math.sqrt(Math.pow(this.lados[1], 2) + Math.pow(this.lados[2], 2))) {
            this.tipoAngulo = "Retângulo";
            this.hipotenusa = (int) Math.sqrt(Math.pow(this.lados[1], 2) + Math.pow(this.lados[2], 2));
        } else if (this.lados[0] < Math.sqrt(Math.pow(this.lados[1], 2) + Math.pow(this.lados[2], 2))) {
            this.tipoAngulo = "Ocutângulo";
        } else {
            this.tipoAngulo = "Obtusângulo";
        }
    }

}
