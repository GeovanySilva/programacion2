package interfaz;

import javax.swing.JOptionPane;

// Entrada por ventanas: respeta la restricción de no usar Scanner del documento base.
public class Entrada {
    public static String texto(String mensaje) {
        String valor = JOptionPane.showInputDialog(null, mensaje);
        if (valor == null) return null;
        while (valor.trim().isEmpty()) {
            aviso("El dato no puede estar vacío.");
            valor = JOptionPane.showInputDialog(null, mensaje);
            if (valor == null) return null;
        }
        return valor.trim();
    }
    public static int entero(String mensaje, int minimo, int maximo) {
        while (true) {
            String valor = texto(mensaje);
            if (valor == null) return -1;
            try {
                int numero = Integer.parseInt(valor);
                if (numero >= minimo && numero <= maximo) return numero;
            } catch (NumberFormatException ex) { /* Se solicita de nuevo. */ }
            aviso("Ingrese un entero entre " + minimo + " y " + maximo + ".");
        }
    }
    public static Double decimal(String mensaje) {
        while (true) {
            String valor = texto(mensaje);
            if (valor == null) return null;
            try {
                double numero = Double.parseDouble(valor);
                if (Double.isFinite(numero)) return numero;
            } catch (NumberFormatException ex) { /* Se solicita de nuevo. */ }
            aviso("Ingrese un número válido, por ejemplo 24.5.");
        }
    }
    public static void aviso(String mensaje) { JOptionPane.showMessageDialog(null, mensaje); }
}
