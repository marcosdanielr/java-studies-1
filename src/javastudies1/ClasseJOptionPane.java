package aula;

import javax.swing.JOptionPane;

public class ClasseJOptionPane {
  public static void main(String[] args) {

    String valor1 = JOptionPane.showInputDialog("Digite o primeiro salário");
    String valor2 = JOptionPane.showInputDialog("Digite o segundo salário");
    String valor3 = JOptionPane.showInputDialog("Digite o terceiro salário");

    // System.out.println("A soma dos salários é:" + valor1 + valor2 + valor3);
    double salario1 = Double.parseDouble((valor1).replace(",", "."));
    double salario2 = Double.parseDouble((valor2).replace(",", "."));
    double salario3 = Double.parseDouble((valor3).replace(",", "."));

    double soma = salario1 + salario2 + salario3;

    double media = soma / 3;

    System.out.printf("A soma é: %.2f", soma);
    System.out.printf("\nA média é: %2f", media);

    JOptionPane.showMessageDialog(null, "A média é: " + media);
  }
}
