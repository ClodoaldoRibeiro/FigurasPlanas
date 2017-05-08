package br.planas;

public final class Triangulo1 extends FiguraPlana implements Figuras2D {

    private float lado1;
    private float lado2;
    private float lado3;
    private int hipotenusa;
    //private String tipo;
    private String tipoAngulo;

    private enum TipoTriangulo {
        Equilatero, Escaleno, Isoceles
    };
    
    TipoTriangulo TipoT;

    public TipoTriangulo getTipoT() {
        return TipoT;
    }

    public Triangulo1(float x, float y, float z) {
        tipoTriangulo(x, y, z);
        definirLado(x, y, z);
        tipoAngulo();
    }

    public String getTipoAngulo() {
        return tipoAngulo;
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

    public float getLado1() {
        return lado1;
    }

    public void setLado1(float lado1) {
        this.lado1 = lado1;
    }

    public float getLado2() {
        return lado2;
    }

    public void setLado2(float lado2) {
        this.lado2 = lado2;
    }

    public double getHipotenusa() {
        return hipotenusa;
    }

    public float getLado3() {
        return lado3;
    }

    public void setLado3(float lado3) {
        this.lado3 = lado3;
    }

    /*public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }*/
    private void definirLado(float x, float y, float z) {
        if (getTipoT() == TipoTriangulo.Equilatero) {
            this.lado1 = x;
            this.lado2 = y;
            this.lado3 = z;
        } else if (getTipoT() == TipoTriangulo.Escaleno) {
            if (x > y && x > z && y > z) {
                this.lado1 = x;
                this.lado2 = y;
                this.lado3 = z;
            } else if (x > y && x > z && z > y) {
                this.lado1 = x;
                this.lado2 = z;
                this.lado3 = y;
            } else if (y > x && y > z && x > z) {
                this.lado1 = y;
                this.lado2 = x;
                this.lado3 = z;
            } else if (y > x && y > z && z > x) {
                this.lado1 = y;
                this.lado2 = z;
                this.lado3 = x;
            } else if (z > x && z > y && x > y) {
                this.lado1 = z;
                this.lado2 = x;
                this.lado3 = y;
            } else if (z > x && z > y && y > x) {
                this.lado1 = z;
                this.lado2 = y;
                this.lado3 = x;
            }
        } else if (getTipoT() == TipoTriangulo.Isoceles) {
            if (x == y && x != z) {
                this.lado1 = z;
                this.lado2 = x;
                this.lado3 = y;
            } else if (x == z && x != y) {
                this.lado1 = y;
                this.lado2 = x;
                this.lado3 = z;
            } else if (y == z && y != x) {
                this.lado1 = x;
                this.lado2 = y;
                this.lado3 = z;
            }
        }
    }

    @Override
    public String mostrarDados() {
        super.mostrarDados();
        System.out.println("Lados do Triangulo: " + this.lado1 + ", " + this.lado2 + ", " + this.lado3);
        System.out.println("Tipo: " + getTipoT() + " e " + this.tipoAngulo);
        return "";
    }

    @Override
    public double area() {
        if (getTipoT() == TipoTriangulo.Equilatero) {
            return ((Math.pow(lado1, 2) * Math.sqrt(3) / 4));
        } else if ("Retângulo".equals(this.tipoAngulo)) {
            return ((this.lado2 * this.lado3) / 2);
        } else if (getTipoT() == TipoTriangulo.Escaleno && this.tipoAngulo != "Retângulo") {
            float s;
            s = (lado1 + lado2 + lado3) / 2;
            return (Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3)));
        } else if (getTipoT() == TipoTriangulo.Isoceles && this.tipoAngulo != "Retângulo") {
            return (lado1 * Math.sqrt(Math.pow(lado2, 2) - (Math.pow(lado1, 2) / 4)) / 2);
        }

        return 0;
    }

    @Override
    public double perimetro() {
        return this.lado1 + this.lado2 + this.lado3;
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
        if (this.lado1 == Math.sqrt(Math.pow(this.lado2, 2) + Math.pow(this.lado3, 2))) {
            this.tipoAngulo = "Retângulo";
            //CAST EXPLÌCITO
            this.hipotenusa = (int) Math.sqrt(Math.pow(this.lado2, 2) + Math.pow(this.lado3, 2));
        } else if (this.lado1 < Math.sqrt(Math.pow(this.lado2, 2) + Math.pow(this.lado3, 2))) {
            this.tipoAngulo = "Ocutângulo";
        } else {
            this.tipoAngulo = "Obtusângulo";
        }
    }

}
