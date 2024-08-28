package numero2;

import numero1.Retangulo;
import javax.swing.*;

public class AppQuestao2Ui {

    public static void main(String[] args) {

        int altura = Integer.parseInt(JOptionPane.showInputDialog("Qual a altura do retangulo?"));
        int comprimento = Integer.parseInt(JOptionPane.showInputDialog("Qual o comprimento do retangulo?"));

        Retangulo r = new Retangulo(altura,comprimento);

        int area = r.calcularArea();
        int perimetro = r.calcularPerimetro();

        JOptionPane.showMessageDialog(null, "A area do retangulo é " + area);
        JOptionPane.showMessageDialog(null, "O perimetro do retangulo é " + perimetro);
    }



}
