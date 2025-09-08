import javax.swing.JOptionPane;

public class ConversaoNumero {
    public static void main(String[] args) {
        String valor1 = JOptionPane.showInputDialog("Digite o primeiro número");
        String valor2 = JOptionPane.showInputDialog("Digite o segundo número");
        String valor3 = JOptionPane.showInputDialog("Digite o terceiro número");

        double numero1 = Double.parseDouble(valor1);
        double numero2 = Double.parseDouble(valor2);
        double numero3 = Double.parseDouble(valor3);

        double media = (numero1 + numero2 + numero3) / 3;

        System.out.println("A média dos números é: " + media);
    }
}

