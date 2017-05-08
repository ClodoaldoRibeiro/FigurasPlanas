package framework;

import java.text.DecimalFormat;

/**
 * API para formatação de números...
 *
 * @author Clodoaldo Ribeiro
 */
public abstract class Formatar {

    /**
     * Metado Estatico
     *
     * @author Clodoaldo Ribeiro
     * @param object
     * @return Objeto formatado como uma String.
     */
    public static String format(Object object) {
        String formato = "##0.00";
        DecimalFormat d = new DecimalFormat(formato);
        return d.format(object);
    }

    // Aqui foi usada a SobreEscrita de metado.
    public static String format(double number) {
        String formato = "##0.00";
        DecimalFormat d = new DecimalFormat(formato);
        return d.format(number);
    }
}
