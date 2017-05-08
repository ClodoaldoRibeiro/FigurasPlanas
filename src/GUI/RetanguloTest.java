package GUI;

import br.planas.*;
import excecoes.QDException;
import framework.Formatar;
import javax.swing.JOptionPane;

/**
 *
 * @author Clodoaldo Ribeiro
 */
public class RetanguloTest {

    /**
     * Nesta Classe foi Aplicada os conceitos de Polimofismo
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Ficou faltando 
        // Criando uma lista de Objetos:
        //List<Object> lstObject = new List<Object>();

        double lado;
        lado = Double.parseDouble(JOptionPane.showInputDialog("Informe um lado maior que 0 para o quaudrado: "));

        try {
            // Polimorfismo Inclusão
            FiguraPlanoInt figuraPlanoInt = new Quadrado(lado);
            // Polimorfismo SobrCarga
            JOptionPane.showMessageDialog(null, "" + figuraPlanoInt.mostrarDados());

        } catch (QDException ex) {
            JOptionPane.showMessageDialog(null, "Lado do quadrado " + Formatar.format(ex.getLado())
                    + "\n" + ex.getMessage());
        }

    }

}
