package roselo.model;

import roselo.framework.Accion;

import javax.swing.*;


public class AccionTres implements Accion {
    @Override
    public void ejecutar() {
        System.out.println("Ejecutando AccionTres...");
        int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Coloque un numero: "));
        String msj = (num % 2 == 0) ? "es par" : "es impar";
        JOptionPane.showMessageDialog(null, STR."El numero \{num} \{msj}");
    }

    @Override
    public String nombreItemMenu() {
        return "Accion 3";
    }

    @Override
    public String descripcionItemMenu() {
        return "Valida si es numero par";
    }
}
