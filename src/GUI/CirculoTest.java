package GUI;

import br.planas.Circulo;
import excecoes.CRException;
import framework.Formatar;
import javax.swing.JOptionPane;

/**
 *
 * @author Clodoaldo
 */
public class CirculoTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double raio;
        raio = Double.parseDouble(JOptionPane.showInputDialog("Informe um raio maior que 0 para o circulo: "));

        try {
            Circulo circulo = new Circulo(raio);
            JOptionPane.showMessageDialog(null, "" + circulo.mostrarDados());
        } catch (CRException ex) {
            JOptionPane.showMessageDialog(null, "Raio " + Formatar.format(ex.getRaio())
                    + "\n" + ex.getMessage());
        }
        
        
        
        
    }

}
