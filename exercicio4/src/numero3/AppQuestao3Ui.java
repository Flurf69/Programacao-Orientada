package numero3;

import numero1.Retangulo;
import javax.swing.*;

public class AppQuestao3Ui {

    public static void main(String[] args) {

        int altura2 = Integer.parseInt(JOptionPane.showInputDialog("Qual a altura do retangulo?"));
        int comprimento2 = Integer.parseInt(JOptionPane.showInputDialog("Qual o comprimento do retangulo?"));

        Retangulo r = new Retangulo();

        r.setAltura(altura2);
        r.setComprimento(comprimento2);

        int area = r.calcularArea();
        int perimetro = r.calcularPerimetro();

        JOptionPane.showMessageDialog(null, "A area do retangulo é " + area);
        JOptionPane.showMessageDialog(null, "O perimetro do retangulo é " + perimetro);
    }
}
