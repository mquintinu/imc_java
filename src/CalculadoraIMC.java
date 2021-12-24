import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class CalculadoraIMC {
    public static void main(String args[]) {

        double altura, peso, imc;

        altura = Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura: "));
        peso = Double.parseDouble(JOptionPane.showInputDialog("Digite seu peso: "));

        imc = peso / (altura * altura);

        DecimalFormat decimal = new DecimalFormat("0.00");
        String vlrFormatado = decimal.format(imc);

        if (imc >= 18.5 && imc <= 24.9) {
            JOptionPane.showMessageDialog(null, "IMC = " + vlrFormatado + " - Peso normal.");
        } else if (imc >= 25 && imc <= 29.9) {
            JOptionPane.showMessageDialog(null, "IMC = " + vlrFormatado + " - Sobrepeso.");
        } else if (imc >= 30 && imc <= 34.9) {
            JOptionPane.showMessageDialog(null, "IMC = " + vlrFormatado + " - Obesidade Grau 1.");
        } else if (imc >= 35 && imc <= 39.9) {
            JOptionPane.showMessageDialog(null, "IMC = " + vlrFormatado + " - Obesidade Grau 2.");
        } else if (imc >= 40) {
            JOptionPane.showMessageDialog(null, "IMC = " + vlrFormatado + " - Obesidade Grau 3.");
        } else {
            JOptionPane.showMessageDialog(null, "IMC = " + vlrFormatado + " - Peso abaixo.");
        }
    }
}
