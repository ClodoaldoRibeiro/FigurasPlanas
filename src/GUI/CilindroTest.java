package GUI;


import br.espaciais.Cilindro;
import br.planas.Circulo;
import excecoes.CRException;
import framework.Formatar;
import javax.swing.JOptionPane;

/**
 *
 * @author Clodoaldo Ribeiro
 */
public class CilindroTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try {

            double altura;
            altura = Double.parseDouble(JOptionPane.showInputDialog("Informa uma altura maior que zero "));

            double raio;
            raio = Double.parseDouble(JOptionPane.showInputDialog("Informa um raio maior que zero "));

            Cilindro cilindro = new Cilindro(altura, raio);

            cilindro.mostrarDados();
            System.out.println("" + cilindro.areaBaseIgual(new Circulo(2)));

        } catch (CRException ex) {
            JOptionPane.showMessageDialog(null, "Raio " + Formatar.format(ex.getRaio())
                    + "\n" + ex.getMessage());
        }
    }

}
