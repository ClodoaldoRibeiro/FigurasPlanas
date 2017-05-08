package GUI;

import br.planas.Circulo;
import br.planas.Plano;
import br.planas.Quadrado;
import br.planas.Triangulo;
import excecoes.CRException;
import excecoes.QDException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class FigurasPlanas {

    public static void main(String args[]) {
        Triangulo t1 = new Triangulo(3f, 4f, 6f);
        t1.mostrarDados();
       /* Triangulo t2 = new Triangulo(3f, 4f, 5f);
        Triangulo t3 = new Triangulo(3f, 4f, 5f);
        

        System.out.println("USANDO ARGUMENTOS VARIADOS " + Triangulo.calcularAreas(t1.area(), t2.area(), t3.area()));
        

        try {
            Plano plano = new Plano(new Circulo(2), new Quadrado(3), null, new Triangulo(1, 2, 3));
            JOptionPane.showMessageDialog(null, "" + plano.mostrarDados());
        } catch (CRException ex) {
            Logger.getLogger(FigurasPlanas.class.getName()).log(Level.SEVERE, null, ex);
        } catch (QDException ex) {
            Logger.getLogger(FigurasPlanas.class.getName()).log(Level.SEVERE, null, ex);
        }*/
       
    }

}
